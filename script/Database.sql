﻿CREATE DATABASE QLDH
GO
USE QLDH
GO
----------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------
CREATE TABLE TAIKHOAN
(
	MATK char(10) NOT NULL, 
	MATKHAU varchar(16) NOT NULL,
	LOAIND int NOT NULL,
	TINHTRANG int NOT NULL,
	PRIMARY KEY (MATK),
	CONSTRAINT C_TAIKHOAN_LOAIND CHECK(LOAIND IN(0, 1, 2, 3, 4))
)

CREATE TABLE QUANTRIVIEN
(
	MAQTV char(10) NOT NULL,
	TENQTV nvarchar(40) NOT NULL DEFAULT N'Chưa nhập tên', 
	PRIMARY KEY (MAQTV)
)

CREATE TABLE NHANVIEN 
(
	MANV char(10) NOT NULL, 
	TENNV nvarchar(40) NOT NULL DEFAULT N'Chưa nhập tên',
	PRIMARY KEY (MANV)
)

CREATE TABLE DOITAC 
(
	MADT char(10) NOT NULL,
	MAST varchar(13) NOT NULL, 
	TENDT nvarchar(40),
	NGUOIDAIDIEN nvarchar(40),
	SOCN int NOT NULL DEFAULT 0,
	SOLUONGDH int NOT NULL DEFAULT 0,
	LOAIHANGVC nvarchar(40),
	DIACHIKD nvarchar(100),
	SDT char(10),
	EMAIL varchar(40),
	PRIMARY KEY (MADT),
	CONSTRAINT U_DOITAC_MAST UNIQUE(MAST)
)

CREATE TABLE KHACHHANG 
(
	MAKH char(10) NOT NULL, 
	TENKH nvarchar(40) NOT NULL DEFAULT N'Chưa nhập tên',
	CMND char(10),
	SDT char(10),
	DIACHI nvarchar(100),
	EMAIL varchar(40),
	PRIMARY KEY (MAKH),
	CONSTRAINT U_KHACHHANG_CMND UNIQUE(CMND)
)

CREATE TABLE TAIXE 
(
	MATX char(10), 
	TENTX nvarchar(40) NOT NULL DEFAULT N'Chưa nhập tên',
	CMND char(10) NOT NULL,
	SDT char(10),
	DIACHI nvarchar(100),
	BIENSOXE char(10) NOT NULL,
	KHUVUCHD nvarchar(40),
	EMAIL varchar(40),
	THONGTINTKNH char(20),
	PRIMARY KEY (MATX),
	CONSTRAINT U_TAIXE_CMND UNIQUE(CMND),
	CONSTRAINT U_TAIXE_BIENSOXE UNIQUE(BIENSOXE)
)

CREATE TABLE CHINHANH 
(
	MACTY char(10) NOT NULL, 
	MACN char(10) NOT NULL,
	TENCN nvarchar(40) NOT NULL DEFAULT N'Chưa nhập tên',
	SDT char(10),
	QUAN nvarchar(20),
	THANHPHO nvarchar(20),
	EMAIL varchar(40),
	PRIMARY KEY (MACTY, MACN)
)


CREATE TABLE SANPHAM 
(
	MASP char(10) NOT NULL, 
	TENSP nvarchar(40) NOT NULL DEFAULT N'Chưa nhập tên',
	GIA int NOT NULL,
	PRIMARY KEY (MASP)
)


CREATE TABLE CHINHANH_SANPHAM
(
	MADT char(10),
	MACN char(10) NOT NULL,
	MASP char(10) NOT NULL,
	SOLUONGTON int NOT NULL DEFAULT 0,
	PRIMARY KEY (MADT, MACN, MASP)
)

CREATE TABLE DONHANG 
(
	MADH char(10),
	MADT char(10),
	MAKH char(10),
	MATX char(10) NOT NULL,
	TENDH nvarchar(40) NOT NULL DEFAULT N'Chưa nhập tên',
	-- 0: nguoi ban dang chuan bi don hang
	-- 1: tai xe dang giao hang
	-- 2: giao hang thanh cong
	-- 3: giao hang khong thanh cong
	-- 4: don hang da bi huy
	TINHTRANGDH INT NOT NULL DEFAULT 0,
	PHIVANCHUYEN int NOT NULL DEFAULT 0,
	DIACHIGIAO nvarchar(100),
	HINHTHUCTT char(10),
	PRIMARY KEY (MADH)
)


CREATE TABLE CTDONHANG 
(
	MADH char(10) NOT NULL, 
	MASP char(10) NOT NULL,
	SOLUONG int,
	PHISANPHAM int NOT NULL DEFAULT 0,
	PRIMARY KEY (MADH, MASP)
)

CREATE TABLE HOPDONG 
(
	MAHD char(10) NOT NULL,
	MADT char(10) NOT NULL,
	MAST char(13) NOT NULL,
	NGUOIDAIDIEN nvarchar(40),
	SOCHINHANHDK int,
	DIACHICN nvarchar(100),
	NGAYDK datetime,
	THOIGIANHIEULUC datetime,
	PHIKICHHOAT int NOT NULL DEFAULT 0,
	TINHTRANGHD nvarchar(100) NOT NULL DEFAULT N'Chưa có hiệu lực',
	PRIMARY KEY (MAHD),
	CONSTRAINT U_HOPDONG_MAST UNIQUE(MAST)
)
GO
ALTER TABLE QUANTRIVIEN ADD
	CONSTRAINT FK_QUANTRIVIEN_TAIKHOAN FOREIGN KEY (MAQTV) REFERENCES TAIKHOAN (MATK)
GO
ALTER TABLE NHANVIEN ADD
	CONSTRAINT FK_NHANVIEN_TAIKHOAN FOREIGN KEY (MANV) REFERENCES TAIKHOAN (MATK)
GO
ALTER TABLE DOITAC ADD
	CONSTRAINT FK_DOITAC_TAIKHOAN FOREIGN KEY (MADT) REFERENCES TAIKHOAN (MATK)
GO
ALTER TABLE TAIXE ADD
	CONSTRAINT FK_TAIXE_TAIKHOAN FOREIGN KEY (MATX) REFERENCES TAIKHOAN (MATK)
GO
ALTER TABLE KHACHHANG ADD
	CONSTRAINT FK_KHACHHANG_TAIKHOAN FOREIGN KEY (MAKH) REFERENCES TAIKHOAN (MATK)
GO

ALTER TABLE CHINHANH ADD
	CONSTRAINT FK_CHINHANH_DOITAC FOREIGN KEY (MACTY) REFERENCES DOITAC (MADT)
GO
ALTER TABLE DONHANG ADD 
	CONSTRAINT FK_DONHANG_DOITAC FOREIGN KEY (MADT) REFERENCES DOITAC (MADT),
	CONSTRAINT FK_DONHANG_TAIXE FOREIGN KEY (MATX) REFERENCES TAIXE (MATX),
	CONSTRAINT FK_DONHANG_KHACHHANG FOREIGN KEY (MAKH) REFERENCES KHACHHANG (MAKH)

	
GO
ALTER TABLE CTDONHANG ADD
	CONSTRAINT FK_CTDONHANG_DONHANG FOREIGN KEY (MADH) REFERENCES DONHANG (MADH),
	CONSTRAINT FK_CTDONHANG_SANPHAM FOREIGN KEY (MASP) REFERENCES SANPHAM (MASP)
GO
ALTER TABLE HOPDONG ADD
	CONSTRAINT FK_HOPDONG_DOITAC FOREIGN KEY (MADT) REFERENCES DOITAC (MADT)
GO
ALTER TABLE CHINHANH_SANPHAM ADD
	CONSTRAINT FK_CHINHANH_SANPHAM_CHINHANH FOREIGN KEY (MADT, MACN) REFERENCES CHINHANH (MACTY, MACN),
	CONSTRAINT FK_CHINHANH_SANPHAM_SANPHAM FOREIGN KEY (MASP) REFERENCES SANPHAM (MASP)
GO

-- QUAN TRI VIEN
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('QTV0001', '0', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('QTV0002', '0', '12345', '1')

GO
INSERT INTO QUANTRIVIEN(MAQTV, TENQTV) 
VALUES ('QTV0001', 'QTV1')
INSERT INTO QUANTRIVIEN(MAQTV, TENQTV) 
VALUES ('QTV0002', 'QTV2')

-- NHAN VIEN
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('NV0001', '1', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('NV0002', '1', '12345', '1')

GO
INSERT INTO NHANVIEN(MANV, TENNV) 
VALUES ('NV0001', 'NHANVIEN1')
INSERT INTO NHANVIEN(MANV, TENNV) 
VALUES ('NV0002', 'NHANVIEN2')

-- DOI TAC
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('DT0001', '2', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('DT0002', '2', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('DT0003', '2', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('DT0004', '2', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('DT0005', '2', '12345', '1')
GO
INSERT INTO DOITAC (MADT, MAST, TENDT, NGUOIDAIDIEN, SOCN, SOLUONGDH, LOAIHANGVC, DIACHIKD, SDT, EMAIL)
VALUES ('DT0001', '987654321', 'TGDD', N'NGUYỄN VĂN AN', 2, 1000, 'DIEN TU', 'TP. HCM', '987654321', 'tgdd@tgdd.com.vn')
INSERT INTO DOITAC (MADT, MAST, TENDT, NGUOIDAIDIEN, SOCN, SOLUONGDH, LOAIHANGVC, DIACHIKD, SDT, EMAIL)
VALUES ('DT0002', '987654322', 'FPT', N'NGUYỄN VĂN BÉ', 1, 800, 'DIEN TU', 'TP. HCM', '987654322', 'fpt@fpt.com.vn')
INSERT INTO DOITAC (MADT, MAST, TENDT, NGUOIDAIDIEN, SOCN, SOLUONGDH, LOAIHANGVC, DIACHIKD, SDT, EMAIL)
VALUES ('DT0003', '987654323', 'CELLPHONES', N'NGUYỄN VĂN CÓ', 1, 850, 'DIEN TU', 'TP. HCM', '987654323', 'cellphones@cellphones.com.vn')
INSERT INTO DOITAC (MADT, MAST, TENDT, NGUOIDAIDIEN, SOCN, SOLUONGDH, LOAIHANGVC, DIACHIKD, SDT, EMAIL)
VALUES ('DT0004', '987654324', 'HOANGHA', N'NGUYỄN VĂN HOÀNG', 1, 500, 'DIEN TU', 'TP. HCM', '987654324', 'hoangha@hoangha.com.vn')
INSERT INTO DOITAC(MADT, MAST, TENDT, NGUOIDAIDIEN, SOCN, SOLUONGDH, LOAIHANGVC, DIACHIKD, SDT, EMAIL) 
VALUES ('DT0005', 'ST1254', 'DUCKLADY', N'PHẠM TẤN F', 2, 100, 'SUA', 'TP HCM', '0335460332', 'DUCKLADY@GMAIL.COM')

-- TAI XE
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('TX0000', '3', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('TX0001', '3', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('TX0002', '3', '12345', '1')
GO
INSERT INTO TAIXE(MATX, TENTX, CMND, SDT, DIACHI, BIENSOXE, KHUVUCHD, EMAIL, THONGTINTKNH) 
VALUES ('TX0000', '', '', '', '', '', '', '', '')
INSERT INTO TAIXE(MATX, TENTX, CMND, SDT, DIACHI, BIENSOXE, KHUVUCHD, EMAIL, THONGTINTKNH) 
VALUES ('TX0001', 'TRINH VAN I', '211860935', '0347585514', 'TP HCM', 'AB000001', 'QUAN 10', 'TVI@GMAIL.COM', '6192000001471')
INSERT INTO TAIXE(MATX, TENTX, CMND, SDT, DIACHI, BIENSOXE, KHUVUCHD, EMAIL, THONGTINTKNH) 
VALUES ('TX0002', 'TRINH VAN VAN', '211420965', '0347231516', 'TP HCM', '68AB04525', 'QUAN 10', 'TVV@GMAIL.COM', '6183080504479')


-- KHACH HANG
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('KH0001', '4', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('KH0002', '4', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('KH0003', '4', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG)  
VALUES ('KH0004', '4', '12345', '1')
INSERT INTO TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) 
VALUES ('KH0005', '4', '12345', '1')
GO
INSERT INTO KHACHHANG(MAKH, TENKH, CMND, SDT, DIACHI, EMAIL) 
VALUES ('KH0001', N'NGUYỄN VĂN A', '212860789', '0345897883', 'TP HCM', 'NVA@GMAIL.COM')
INSERT INTO KHACHHANG(MAKH, TENKH, CMND, SDT, DIACHI, EMAIL) 
VALUES ('KH0002', N'NGUYỄN VĂN B', '212889589', '0345872591', 'QUANG NGAI', 'NVB@GMAIL.COM')
INSERT INTO KHACHHANG(MAKH, TENKH, CMND, SDT, DIACHI, EMAIL) 
VALUES ('KH0003', N'LÊ VĂN C', '214560789', '0345716335', 'DA NANG', 'LVC@GMAIL.COM')
INSERT INTO KHACHHANG(MAKH, TENKH, CMND, SDT, DIACHI, EMAIL) 
VALUES ('KH0004', N'NGUYỄN THỊ D', '212811189', '0945214861', 'TPHCM', 'NTD@GMAIL.COM')
INSERT INTO KHACHHANG(MAKH, TENKH, CMND, SDT, DIACHI, EMAIL) 
VALUES ('KH0005', N'TRẦN THỊ E', '212556789', '0956897178', 'AN GIANG', 'TTE@GMAIL.COM')


-- DON HANG
INSERT INTO DONHANG(MADH, MADT, MAKH, MATX, TENDH, TINHTRANGDH, PHIVANCHUYEN, DIACHIGIAO, HINHTHUCTT) 
VALUES ('DH0001', 'DT0001', 'KH0001', 'TX0000', 'KCN SONG THAN', 0, 100, 'QUAN 5', 'COD')
INSERT INTO DONHANG(MADH, MADT, MAKH, MATX, TENDH, TINHTRANGDH, PHIVANCHUYEN, DIACHIGIAO, HINHTHUCTT) 
VALUES ('DH0002', 'DT0002', 'KH0002', 'TX0000', 'SMARTPHONE', 0, 50, 'QUAN 6', 'MOMO')
INSERT INTO DONHANG(MADH, MADT, MAKH, MATX, TENDH, TINHTRANGDH, PHIVANCHUYEN, DIACHIGIAO, HINHTHUCTT) 
VALUES ('DH0003', 'DT0002','KH0005', 'TX0000', 'KCN SENKA', 0, 17, 'QUAN 10', 'MOMO')

-- CHI NHANH - SAN PHAM
INSERT INTO CHINHANH(MACTY, MACN, TENCN, SDT, QUAN, THANHPHO, EMAIL) VALUES ('DT0001', 'CN0001', 'DUCKLADY1', '0332458666', 'QUAN 10', 'TP.HCM', 'DL1@GMAIL.COM')
INSERT INTO CHINHANH(MACTY, MACN, TENCN, SDT, QUAN, THANHPHO, EMAIL) VALUES ('DT0001', 'CN0002', 'DUCKLADY2', '0334850778', 'QUAN 5', 'TP.HCM', 'DL2@GMAIL.COM')
INSERT INTO CHINHANH(MACTY, MACN, TENCN, SDT, QUAN, THANHPHO, EMAIL) VALUES ('DT0002', 'CN0001', 'ALPHA1', '0332458612', 'QUAN 9', 'TP.HCM', 'ALPHA1@GMAIL.COM')
INSERT INTO CHINHANH(MACTY, MACN, TENCN, SDT, QUAN, THANHPHO, EMAIL) VALUES ('DT0002', 'CN0002', 'ALPHA2', '0332458614', 'QUAN 5', 'TP.HCM', 'ALPHA2@GMAIL.COM')

GO
INSERT INTO SANPHAM(MASP, TENSP, GIA) VALUES ('SP0001', N'SỮA CÔ GÁI HÀ LAN', '25')
INSERT INTO SANPHAM(MASP, TENSP, GIA) VALUES ('SP0002', N'SỮA CHUA CÔ GÁI HÀ LAN', '30')
INSERT INTO SANPHAM(MASP, TENSP, GIA) VALUES ('SP0003', N'SỮA FAMI', '34')
INSERT INTO SANPHAM(MASP, TENSP, GIA) VALUES ('SP0004', N'SỮA TH TRUE MILK', '54')

GO
INSERT INTO CHINHANH_SANPHAM(MADT, MACN, MASP, SOLUONGTON) VALUES ('DT0001','CN0001', 'SP0001', 15)
INSERT INTO CHINHANH_SANPHAM(MADT, MACN, MASP, SOLUONGTON) VALUES ('DT0001','CN0002', 'SP0002', 8)
INSERT INTO CHINHANH_SANPHAM(MADT, MACN, MASP, SOLUONGTON) VALUES ('DT0002','CN0001', 'SP0003', 10)
INSERT INTO CHINHANH_SANPHAM(MADT, MACN, MASP, SOLUONGTON) VALUES ('DT0002','CN0002', 'SP0004', 4)

GO



--SELECT * FROM DOITAC
--SELECT * FROM SANPHAM
--SELECT * FROM CHINHANH_SANPHAM

--DELETE FROM CHINHANH_SANPHAM
--DELETE FROM SANPHAM
--SELECT * FROM TAIKHOAN
-- DELETE FROM TAIKHOAN WHERE MATK = 'QTV0003'
--DELETE FROM QUANTRIVIEN WHERE MAQTV = 'QTV0002'

SELECT * FROM DONHANG
SELECT * FROM TAIXE
SELECT * FROM TAIKHOAN WHERE LOAIND = 3
DELETE TAIKHOAN WHERE MATK = 'TX0003'
UPDATE DONHANG SET MATX = 'TX0001'

select * from NHANVIEN where MANV = 'NV0001'