IF EXISTS (
        SELECT request_session_id
        FROM sys.dm_tran_locks
        WHERE resource_database_id = DB_ID('model')
        )
BEGIN
    PRINT 'Model Database in use!!'
    SELECT *
    FROM sys.dm_exec_sessions
    WHERE session_id IN (
            SELECT request_session_id
            FROM sys.dm_tran_locks
            WHERE resource_database_id = DB_ID('model')
            )
END
ELSE
    PRINT 'Model Database not in used.'
;
	
USE [master];

DECLARE @kill varchar(8000) = '';  
SELECT @kill = @kill + 'kill ' + CONVERT(varchar(5), session_id) + ';'  
FROM sys.dm_exec_sessions
WHERE database_id  = db_id('Airport_DB')

EXEC(@kill)
;