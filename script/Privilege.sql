﻿USE QLDH
GO


--------------------------------------------------------------

CREATE LOGIN DOITAC WITH PASSWORD = '12345';
CREATE LOGIN KHACHHANG WITH PASSWORD = '12345';
CREATE LOGIN NHANVIEN WITH PASSWORD = '12345';
CREATE LOGIN TAIXE WITH PASSWORD = '12345';
CREATE LOGIN TAIXE1 WITH PASSWORD = '12345';
CREATE LOGIN QUANTRIVIEN WITH PASSWORD = '12345';

------USER
CREATE USER DT FOR LOGIN DOITAC;
CREATE USER KH FOR LOGIN KHACHHANG;
CREATE USER NV FOR LOGIN NHANVIEN;
CREATE USER TX FOR LOGIN TAIXE;
CREATE USER TX1 FOR LOGIN TAIXE1;
CREATE USER QTV FOR LOGIN QUANTRIVIEN;
CREATE USER QTV1 FOR LOGIN QUANTRIVIEN1;

------ ROLE
EXEC sp_addrole 'DOITAC'
EXEC sp_addrole 'KHACHHANG'
EXEC sp_addrole 'NHANVIEN'
EXEC sp_addrole 'TAIXE'
EXEC sp_addrole 'QUANTRIVIEN', 'dbo'

EXEC sp_addrolemember 'DOITAC','DT'
EXEC sp_addrolemember 'KHACHHANG','KH'
EXEC sp_addrolemember 'NHANVIEN','NV'
EXEC sp_addrolemember 'TAIXE','TX'
EXEC sp_addrolemember 'QUANTRIVIEN','QTV'
EXEC sp_addrolemember 'QUANTRIVIEN','QTV1'
EXEC sp_addrolemember 'TAIXE','TX1'

GO
------ PRIVILEGE

--- 1.Tạo view để KH chỉ được truy cập trên dữ liệu của mình
CREATE VIEW UV_THONGTINKH 
AS
SELECT KH.MAKH, KH.TENKH
FROM KHACHHANG KH JOIN TAIKHOAN TK ON KH.MAKH = TK.MATK
WHERE TK.TENDANGNHAP = CURRENT_USER 
--CURRETUSER LÀ TÀI KHOẢN ĐANG ĐĂNG NHẬP 
-- Gán quyền truy cập đến thông tin cá nhân
GO
GRANT SELECT,UPDATE ON UV_THONGTINKH TO KH

GO
--- 2.Tạo view để TX chỉ được truy cập trên dữ liệu của mình
CREATE VIEW UV_THONGTINTX
AS
SELECT TX.MATX, TX.TENTX
FROM TAIXE TX JOIN TAIKHOAN TK ON TX.MATX = TK.MATK
WHERE TK.TENDANGNHAP = CURRENT_USER 
--CURRETUSER LÀ TÀI KHOẢN ĐANG ĐĂNG NHẬP 
GO
-- Gán quyền truy cập đến thông tin cá nhân
GRANT SELECT,UPDATE ON UV_THONGTINTX TO TX

GO
--- 3.Tạo view để DT chỉ được truy cập trên dữ liệu của mình
CREATE VIEW UV_THONGTINDT
AS
SELECT DT.MADT, DT.TENDT
FROM DOITAC DT JOIN TAIKHOAN TK ON DT.MADT = TK.MATK
WHERE TK.TENDANGNHAP = CURRENT_USER 
--CURRETUSER LÀ TÀI KHOẢN ĐANG ĐĂNG NHẬP 
GO
-- Gán quyền truy cập đến thông tin cá nhân
GRANT SELECT,UPDATE ON UV_THONGTINDT TO DT

GO
--- 4.Tạo view để NV chỉ được truy cập trên dữ liệu của mình
CREATE VIEW UV_THONGTINNV
AS
SELECT NV.MANV, NV.TENNV
FROM NHANVIEN NV JOIN TAIKHOAN TK ON NV.MANV = TK.MATK
WHERE TK.TENDANGNHAP = CURRENT_USER
GO
-- Gán quyền truy cập đến thông tin cá nhân
GRANT SELECT,UPDATE ON UV_THONGTINNV TO NV

GO
--- 5.Tạo view để QTV chỉ được truy cập trên dữ liệu của mình
CREATE VIEW UV_THONGTINQTV
AS
SELECT QTV.MAQTV, QTV.TENQTV
FROM QUANTRIVIEN QTV JOIN TAIKHOAN TK ON QTV.MAQTV = TK.MATK
WHERE TK.TENDANGNHAP = CURRENT_USER
GO
-- Gán quyền truy cập đến thông tin cá nhân
GRANT SELECT, UPDATE ON UV_THONGTINQTV TO QTV


GO
---Cho phép đối tác thêm – xóa - sửa thông tin sản phẩm và chi nhánh có cung cấp sản phẩm này
GRANT SELECT, UPDATE, INSERT, DELETE
ON [dbo].[SANPHAM]  
TO DOITAC

GO
GRANT SELECT, UPDATE, INSERT, SELECT
ON [dbo].[CHINHANH_SANPHAM]
TO DOITAC 
	
GO
-- Đối tác xem thông tin đơn hàng và cập nhật tình trạng của đơn hàng.
GRANT SELECT 
ON [dbo].[DONHANG]
TO DOITAC 

GO
GRANT SELECT 
ON [dbo].[CHINHANH_SANPHAM]
TO DOITAC 

GO
GRANT UPDATE
ON DONHANG(TINHTRANGDH)
TO DOITAC 

GO
--Cho phép khách hàng theo dõi quá trình vận chuyển đơn hàng do đối tác và tài xế cập nhật.
GRANT SELECT 
ON [dbo].[DONHANG]
TO KHACHHANG

GO
--Khách hàng xem danh sách đối tác
GRANT SELECT
ON [dbo].[DOITAC]
TO KHACHHANG

GO
--Khách hàng xem danh sách sản phẩm
GRANT SELECT
ON [dbo].[SANPHAM]
TO KHACHHANG

GO
--Tài xế xem đơn hàng
GRANT SELECT
ON DONHANG
TO TAIXE

GO
--Tài xế cập nhật tình trạng đơn hàng
GRANT UPDATE 
ON DONHANG(TINHTRANGDH)
TO TAIXE

GO
--Nhân viên xem danh sách hợp đồng của đối tác
GRANT SELECT
ON [dbo].[HOPDONG]
TO NHANVIEN

GO
--Nhân viên xem duyệt hợp đồng
GRANT UPDATE
ON HOPDONG(TINHTRANGHD)
TO NHANVIEN

GO
-- Quản trị viên cập nhật thông tin tài khoản
GRANT SELECT, UPDATE, INSERT, DELETE
ON [dbo].[QUANTRIVIEN]
TO QUANTRIVIEN

GO
GRANT SELECT, UPDATE, INSERT, DELETE
ON [dbo].[NHANVIEN]
TO QUANTRIVIEN

GO
GRANT SELECT, UPDATE, INSERT, DELETE
ON [dbo].[TAIKHOAN]
TO QUANTRIVIEN

GO
GRANT SELECT, UPDATE
ON [dbo].[DOITAC]
TO QUANTRIVIEN

GO
GRANT SELECT, UPDATE
ON [dbo].[KHACHHANG]
TO QUANTRIVIEN

GO
GRANT SELECT, UPDATE
ON [dbo].[TAIXE]
TO QUANTRIVIEN


GO
GRANT EXECUTE ON OBJECT::SP_XULYDH TO TAIXE

GO
GRANT EXECUTE ON OBJECT::SP_CAPNHATTHONGTINNHANVIEN TO QUANTRIVIEN


UPDATE TAIKHOAN 
SET MATKHAU = '12345', TINHTRANG = 1
WHERE MATK = 'NV0001'
SELECT * FROM TAIKHOAN