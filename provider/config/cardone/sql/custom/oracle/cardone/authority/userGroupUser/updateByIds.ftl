UPDATE C1_USER_GROUP_USER SET END_DATE = SYSDATE, DATA_STATE_CODE = '0' WHERE
INSTR(','||:userGroupUserIds||',', ','||USER_GROUP_USER_ID||',') > 0