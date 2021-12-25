﻿
CREATE PROC SP_XEMDSSANPHAM
-- DROP PROC SP_XEMDSSANPHAM
	@MADT CHAR(10)
AS

BEGIN TRAN
	SET TRAN ISOLATION LEVEL SERIALIZABLE 
	BEGIN TRY

		IF NOT EXISTS (SELECT *
						FROM CHINHANH_SANPHAM
						WHERE MADT= @MADT)
		BEGIN
			PRINT  @MADT + N' KHÔNG TỒN TẠI'
			ROLLBACK TRAN
			RETURN 1
		END

		SELECT * FROM CHINHANH_SANPHAM
		--ĐỂ TEST
		WAITFOR DELAY '0:0:10'
		---------------------------------
		SELECT *
		FROM CHINHANH_SANPHAM

	END TRY
	BEGIN CATCH
		PRINT N'LỖI HỆ THỐNG'
		ROLLBACK TRAN
		RETURN 1
	END CATCH
COMMIT TRAN
RETURN 0

go


--DROP PROC SP_THEMSP
CREATE PROC SP_THEMSP
	@MADT CHAR(10),
	@MACN char(10),
	@MASP char(10),
	@TENSP nvarchar(40),
	@GIA money,
	@SL int
AS
BEGIN TRAN
	BEGIN TRY
	IF EXISTS (SELECT * 
				FROM SANPHAM 
				WHERE MASP=@MASP )
	BEGIN
		PRINT CAST(@MASP AS VARCHAR(10)) + N' Đã Tồn Tại'
		ROLLBACK TRAN
		RETURN 1
	END

	IF NOT EXISTS (SELECT * 
				FROM CHINHANH_SANPHAM
				WHERE MACN =@MACN )
	BEGIN
		PRINT CAST(@MACN AS VARCHAR(10)) + N' Không tồn tại'
		ROLLBACK TRAN
		RETURN 1
	END

	IF @SL <= 0 
	BEGIN
		PRINT N'Số lượng sản phẩm phải lớn hơn 0'
		ROLLBACK TRAN
		RETURN 1
	END
	

	INSERT INTO SANPHAM (MASP,TENSP,GIA)
	VALUES (@MASP,@TENSP,@GIA)

	INSERT INTO CHINHANH_SANPHAM (MADT,MACN,MASP,SOLUONGTON)
	VALUES (@MADT,@MACN,@MASP,@SL)

	END TRY
	BEGIN CATCH
		PRINT N'LỖI HỆ THỐNG'
		ROLLBACK TRAN
		RETURN 1	
	END CATCH
COMMIT TRAN
RETURN 0





