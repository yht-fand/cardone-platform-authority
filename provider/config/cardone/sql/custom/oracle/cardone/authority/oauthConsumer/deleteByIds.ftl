DELETE FROM C1_OAUTH_CONSUMER WHERE
INSTR(','||:oauthConsumerIds||',', ','||OAUTH_CONSUMER_ID||',') > 0
