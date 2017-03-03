SELECT
t.`USER_ROLE_ID`,
t.`USER_CODE`,
ug.`NAME` AS USER_NAME,
REPLACE((CASE WHEN (r.PARENT_TREE_NAME IS NULL OR LENGTH(r.PARENT_TREE_NAME) < 1) THEN r.NAME ELSE CONCAT(r.PARENT_TREE_NAME, ',', r.NAME) END),',', '/') AS ROLE_TREE_NAME,
REPLACE((CASE WHEN (r.PARENT_TREE_CODE IS NULL OR LENGTH(r.PARENT_TREE_CODE) < 1) THEN t.ROLE_CODE ELSE CONCAT(r.PARENT_TREE_CODE, ',', t.ROLE_CODE) END),',', '/') AS ROLE_TREE_CODE,
t.`ROLE_CODE`,
r.`NAME` AS ROLE_NAME,
t.CREATED_BY_CODE,
(SELECT s.`NAME` FROM c1_user s WHERE s.user_code = t.CREATED_BY_CODE LIMIT 1) AS CREATED_BY_NAME,
DATE_FORMAT(t.`CREATED_DATE`, '%Y-%m-%d') AS CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
(SELECT s.`NAME` FROM c1_user s WHERE s.user_code = t.LAST_MODIFIED_BY_CODE LIMIT 1) AS LAST_MODIFIED_BY_NAME,
DATE_FORMAT(t.`LAST_MODIFIED_DATE`, '%Y-%m-%d') AS LAST_MODIFIED_DATE,
DATE_FORMAT(t.BEGIN_DATE, '%Y-%m-%d') AS BEGIN_DATE,
DATE_FORMAT(t.END_DATE, '%Y-%m-%d') AS END_DATE,
IFNULL((SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'userFlag' AND s.DICTIONARY_CODE = t.FLAG_CODE LIMIT 1), (SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'flag' AND s.DICTIONARY_CODE = t.FLAG_CODE LIMIT 1)) AS FLAG_NAME,
t.FLAG_CODE,
IFNULL((SELECT s.`NAME`  FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'userState' AND s.DICTIONARY_CODE = t.STATE_CODE LIMIT 1), (SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'state' AND s.DICTIONARY_CODE = t.STATE_CODE LIMIT 1)) AS STATE_NAME,
t.STATE_CODE,
IFNULL((SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'userDataState' AND s.DICTIONARY_CODE = t.DATA_STATE_CODE LIMIT 1), (SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'dataState' AND s.DICTIONARY_CODE = t.DATA_STATE_CODE LIMIT 1)) AS DATA_STATE_NAME,
t.DATA_STATE_CODE
FROM `c1_user_role` t
LEFT JOIN `c1_user` ug ON(ug.`USER_CODE` = t.`USER_CODE`)
LEFT JOIN `c1_role` r ON(r.`ROLE_CODE` = t.`ROLE_CODE`)
<#if cardone.StringUtils.isNotBlank(userRoleId)>
WHERE t.USER_ROLE_ID = :userRoleId
<#else>
    <#include "page.where.ftl">
ORDER BY t.`USER_CODE`,
t.`ROLE_CODE`,
t.`CREATED_DATE`
limit <#if offset??>:offset<#else>0</#if> , <#if pageSize??>:pageSize<#else>10</#if>
</#if>