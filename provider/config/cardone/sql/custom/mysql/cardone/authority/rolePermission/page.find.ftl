SELECT T.*
FROM c1_role_permission
<#include "page.where.ftl">
limit <#if offset??>:offset<#else>0</#if> , <#if pageSize??>:pageSize<#else>10</#if>