﻿SELECT * FROM TAIKHOAN

DECLARE @RESULT NVARCHAR(2000)

EXEC SP_CAPNHATTHONGTINNHANVIEN 'NV0001', 'ABCDE', 0, @RESULT OUTPUT

PRINT @RESULT

SELECT * FROM TAIKHOAN
