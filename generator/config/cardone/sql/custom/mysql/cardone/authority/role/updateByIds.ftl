UPDATE t_role SET END_DATE = NOW() WHERE INSTR(:ids, roleId) > 0