package top.cardone.authority.func.userRole.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.UserRoleDto;
import top.cardone.authority.service.UserRoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户与角色 - 查询
 */
@Component("/web-api/v1/configuration/userRole/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        UserRoleDto userRoleDto = ApplicationContextHolder.getBean(UserRoleService.class).findOne(UserRoleDto.class, map);

        return this.toMap(userRoleDto);
    }

    private Map<String, Object> toMap(UserRoleDto userRoleDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", userRoleDto.getBeginDate());
        map.put("createdByCode", userRoleDto.getCreatedByCode());
        map.put("createdDate", userRoleDto.getCreatedDate());
        map.put("dataStateCode", userRoleDto.getDataStateCode());
        map.put("departmentCode", userRoleDto.getDepartmentCode());
        map.put("endDate", userRoleDto.getEndDate());
        map.put("flagCode", userRoleDto.getFlagCode());
        map.put("lastModifiedByCode", userRoleDto.getLastModifiedByCode());
        map.put("lastModifiedDate", userRoleDto.getLastModifiedDate());
        map.put("orgCode", userRoleDto.getOrgCode());
        map.put("permissionCodes", userRoleDto.getPermissionCodes());
        map.put("roleCode", userRoleDto.getRoleCode());
        map.put("roleCodes", userRoleDto.getRoleCodes());
        map.put("siteCode", userRoleDto.getSiteCode());
        map.put("stateCode", userRoleDto.getStateCode());
        map.put("systemInfoCode", userRoleDto.getSystemInfoCode());
        map.put("userCode", userRoleDto.getUserCode());
        map.put("userRoleId", userRoleDto.getUserRoleId());
        map.put("version", userRoleDto.getVersion());
        map.put("wfId", userRoleDto.getWfId());

        return map;
    }
}