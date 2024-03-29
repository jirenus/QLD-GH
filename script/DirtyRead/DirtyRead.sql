﻿--DROP PROC SP_CAPNHATTK
--DROP PROC SP_XEMTK

--CAP NHAT TAI KHOAN
CREATE PROC SP_CAPNHATTK
	@MATK CHAR(10),
	@MATKHAU VARCHAR(16),
	@TINHTRANG INT
AS
BEGIN TRAN
	IF NOT EXISTS (SELECT * FROM TAIKHOAN WHERE MATK = @MATK)
	BEGIN
		RAISERROR(N'Mã tài khoản không tồn tại', 16, 1)
		RETURN
	END
	IF (@MATKHAU = '')
	BEGIN
		UPDATE TAIKHOAN
		SET TINHTRANG = @TINHTRANG
		WHERE MATK = @MATK
	END
	ELSE
	BEGIN
		UPDATE TAIKHOAN
		SET MATKHAU = @MATKHAU, TINHTRANG = @TINHTRANG
		WHERE MATK = @MATK
	END
		
	WAITFOR DELAY '00:00:05'
	IF @TINHTRANG NOT IN (0, 1)
	BEGIN
		RAISERROR(N'Tình trạng không hợp lệ. Nhập 0 để khóa tài khoản, 1 để mở khóa (hoặc không khóa)',16,1)
		ROLLBACK
		RETURN
	END
COMMIT TRAN

GO

--XEM TAI KHOAN
CREATE PROC SP_XEMTK
	@MATK CHAR(12)
AS

BEGIN TRAN
	IF NOT EXISTS (SELECT * FROM TAIKHOAN WITH(NOLOCK) WHERE MATK = @MATK)
	BEGIN
		ROLLBACK
		RAISERROR(N'Mã tài khoản không tồn tại',16,1)
	END
	SELECT TAIKHOAN.* FROM TAIKHOAN WITH(NOLOCK) WHERE MATK = @MATK
COMMIT TRAN

GO

