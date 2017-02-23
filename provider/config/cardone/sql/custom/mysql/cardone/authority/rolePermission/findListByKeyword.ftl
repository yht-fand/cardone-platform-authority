<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.ROLEPERMISSION_CODE  ,d.NAME FROM c1_role_permission d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`ROLEPERMISSION_CODE`)
</#if>
ORDER BY d.ORDER_, d.ROLEPERMISSION_CODE
LIMIT 20