SELECT
<#assign prefixName = ' '>
<#if (select_batchNo??)>
${prefixName} batch_no
<#assign prefixName = ','>
</#if>
<#if (select_beginDate??)>
${prefixName} begin_date
<#assign prefixName = ','>
</#if>
<#if (select_createdByCode??)>
${prefixName} created_by_code
<#assign prefixName = ','>
</#if>
<#if (select_createdDate??)>
${prefixName} created_date
<#assign prefixName = ','>
</#if>
<#if (select_dataStateCode??)>
${prefixName} data_state_code
<#assign prefixName = ','>
</#if>
<#if (select_departmentCode??)>
${prefixName} department_code
<#assign prefixName = ','>
</#if>
<#if (select_endDate??)>
${prefixName} end_date
<#assign prefixName = ','>
</#if>
<#if (select_flagCode??)>
${prefixName} flag_code
<#assign prefixName = ','>
</#if>
<#if (select_flagObjectCode??)>
${prefixName} flag_object_code
<#assign prefixName = ','>
</#if>
<#if (select_jsonData??)>
${prefixName} json_data
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName} last_modified_by_code
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName} last_modified_date
<#assign prefixName = ','>
</#if>
<#if (select_orderBy??)>
${prefixName} order_by_
<#assign prefixName = ','>
</#if>
<#if (select_orgCode??)>
${prefixName} org_code
<#assign prefixName = ','>
</#if>
<#if (select_permissionCode??)>
${prefixName} permission_code
<#assign prefixName = ','>
</#if>
<#if (select_personalCode??)>
${prefixName} personal_code
<#assign prefixName = ','>
</#if>
<#if (select_siteCode??)>
${prefixName} site_code
<#assign prefixName = ','>
</#if>
<#if (select_stateCode??)>
${prefixName} state_code
<#assign prefixName = ','>
</#if>
<#if (select_systemInfoCode??)>
${prefixName} system_info_code
<#assign prefixName = ','>
</#if>
<#if (select_userGroupCode??)>
${prefixName} user_group_code
<#assign prefixName = ','>
</#if>
<#if (select_userGroupPermissionId??)>
${prefixName} user_group_permission_id
<#assign prefixName = ','>
</#if>
<#if (select_version??)>
${prefixName} version_
<#assign prefixName = ','>
</#if>
<#if prefixName ==  ' '>
*
</#if>
FROM c1_user_group_permission
<#include "where.ftl">
<#assign prefixName = 'ORDER BY'>
<#if (order_by_batchNo??)>
${prefixName} batch_no ${order_by_batchNo_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_beginDate??)>
${prefixName} begin_date ${order_by_beginDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdByCode??)>
${prefixName} created_by_code ${order_by_createdByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdDate??)>
${prefixName} created_date ${order_by_createdDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName} data_state_code ${order_by_dataStateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_departmentCode??)>
${prefixName} department_code ${order_by_departmentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_endDate??)>
${prefixName} end_date ${order_by_endDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_flagCode??)>
${prefixName} flag_code ${order_by_flagCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_flagObjectCode??)>
${prefixName} flag_object_code ${order_by_flagObjectCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_jsonData??)>
${prefixName} json_data ${order_by_jsonData_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName} last_modified_by_code ${order_by_lastModifiedByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName} last_modified_date ${order_by_lastModifiedDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orderBy??)>
${prefixName} order_by_ ${order_by_orderBy_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orgCode??)>
${prefixName} org_code ${order_by_orgCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_permissionCode??)>
${prefixName} permission_code ${order_by_permissionCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_personalCode??)>
${prefixName} personal_code ${order_by_personalCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_siteCode??)>
${prefixName} site_code ${order_by_siteCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_stateCode??)>
${prefixName} state_code ${order_by_stateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName} system_info_code ${order_by_systemInfoCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_userGroupCode??)>
${prefixName} user_group_code ${order_by_userGroupCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_userGroupPermissionId??)>
${prefixName} user_group_permission_id ${order_by_userGroupPermissionId_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_version??)>
${prefixName} version_ ${order_by_version_value!}
<#assign prefixName = ','>
</#if>
