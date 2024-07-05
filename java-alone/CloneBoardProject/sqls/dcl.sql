ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE
;

CREATE USER boarduser1 IDENTIFIED BY 1234 
;

ALTER USER boarduser1 account unlock
;

-- 4. 계정 권한 부여
GRANT resource, dba, CONNECT TO boarduser1
;

GRANT CREATE ANY TABLE TO boarduser1
;		-- 이러한 행위들이 다 DCL GRANT가 그 명령어.
