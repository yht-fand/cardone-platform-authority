SELECT T.*
FROM C1_USER_GROUP_PERMISSION t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)