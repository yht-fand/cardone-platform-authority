UPDATE t_permission SET END_DATE = NOW() WHERE INSTR(:ids, ID) > 0