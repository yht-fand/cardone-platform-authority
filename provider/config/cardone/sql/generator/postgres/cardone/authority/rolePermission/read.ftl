SELECT
<#switch (object_id!)>
<#case "batchNo">
batch_no AS batchNo
<#break>
<#case "beginDate">
begin_date AS beginDate
<#break>
<#case "createdByCode">
created_by_code AS createdByCode
<#break>
<#case "createdDate">
created_date AS createdDate
<#break>
<#case "dataStateCode">
data_state_code AS dataStateCode
<#break>
<#case "departmentCode">
department_code AS departmentCode
<#break>
<#case "endDate">
end_date AS endDate
<#break>
<#case "flagCode">
flag_code AS flagCode
<#break>
<#case "flagObjectCode">
flag_object_code AS flagObjectCode
<#break>
<#case "jsonData">
json_data AS jsonData
<#break>
<#case "lastModifiedByCode">
last_modified_by_code AS lastModifiedByCode
<#break>
<#case "lastModifiedDate">
last_modified_date AS lastModifiedDate
<#break>
<#case "orderBy">
order_by_ AS orderBy
<#break>
<#case "orgCode">
org_code AS orgCode
<#break>
<#case "permissionCode">
permission_code AS permissionCode
<#break>
<#case "personalCode">
personal_code AS personalCode
<#break>
<#case "roleCode">
role_code AS roleCode
<#break>
<#case "rolePermissionId">
role_permission_id AS rolePermissionId
<#break>
<#case "siteCode">
site_code AS siteCode
<#break>
<#case "stateCode">
state_code AS stateCode
<#break>
<#case "systemInfoCode">
system_info_code AS systemInfoCode
<#break>
<#case "version">
version_ AS version
<#break>
<#default>
COUNT(*) AS COUNT_
</#switch>
FROM c1_role_permission
<#include "where.ftl">