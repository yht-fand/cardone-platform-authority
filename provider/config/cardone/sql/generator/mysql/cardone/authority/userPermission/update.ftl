UPDATE c1_user_permission
<#assign prefixName = 'SET'>
<#if (update_beginDate??)>
${prefixName} `BEGIN_DATE` = :update_beginDate_value
<#assign prefixName = ','>
</#if>
<#if (update_createdByCode??)>
${prefixName} `CREATED_BY_CODE` = :update_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_createdDate??)>
${prefixName} `CREATED_DATE` = :update_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (update_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` = :update_dataStateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` = :update_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (update_endDate??)>
${prefixName} `END_DATE` = :update_endDate_value
<#assign prefixName = ','>
</#if>
<#if (update_flagCode??)>
${prefixName} `FLAG_CODE` = :update_flagCode_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` = :update_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` = :update_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
<#if (update_orgCode??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (update_permissionCode??)>
${prefixName} `PERMISSION_CODE` = :update_permissionCode_value
<#assign prefixName = ','>
</#if>
<#if (update_permissionCodes??)>
${prefixName} `PERMISSION_CODES` = :update_permissionCodes_value
<#assign prefixName = ','>
</#if>
<#if (update_roleCodes??)>
${prefixName} `ROLE_CODES` = :update_roleCodes_value
<#assign prefixName = ','>
</#if>
<#if (update_siteCode??)>
${prefixName} `SITE_CODE` = :update_siteCode_value
<#assign prefixName = ','>
</#if>
<#if (update_siteCode??)>
<#if (update_siteCode_value??)>
${prefixName} `SITE_CODE` = :update_siteCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_stateCode??)>
${prefixName} `STATE_CODE` = :update_stateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE` = :update_systemInfoCode_value
<#assign prefixName = ','>
</#if>
<#if (update_systemInfoCode??)>
<#if (update_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :update_systemInfoCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_userCode??)>
${prefixName} `USER_CODE` = :update_userCode_value
<#assign prefixName = ','>
</#if>
<#if (update_userPermissionId??)>
${prefixName} `USER_PERMISSION_ID` = :update_userPermissionId_value
<#assign prefixName = ','>
</#if>
<#if (update_version??)>
${prefixName} `VERSION_` = :update_version_value
<#assign prefixName = ','>
</#if>
<#if (update_wfId??)>
${prefixName} `WF_ID` = :update_wfId_value
<#assign prefixName = ','>
</#if>
<#include "where.ftl">