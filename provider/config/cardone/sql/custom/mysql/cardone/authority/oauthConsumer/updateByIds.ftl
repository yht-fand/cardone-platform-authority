UPDATE c1_oauth_consumer SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE INSTR(:oAuthConsumerIds, OAUTH_CONSUMER_ID) > 0