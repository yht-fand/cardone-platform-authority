SELECT
<#switch (object_id!)>
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
<#case "order">
order_ AS order
<#break>
<#case "orgCode">
org_code AS orgCode
<#break>
<#case "roleCode">
role_code AS roleCode
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
<#case "userGroupCode">
user_group_code AS userGroupCode
<#break>
<#case "userGroupRoleId">
user_group_role_id AS userGroupRoleId
<#break>
<#case "version">
version_ AS version
<#break>
<#default>
COUNT(1) AS COUNT_
</#switch>
FROM c1_user_group_role
<#include "where.ftl">