SELECT T.*
FROM c1_role_permission t
<#include "page.where.ftl">
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>