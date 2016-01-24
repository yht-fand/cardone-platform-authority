package top.cardone.authority.func.userPermission.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.UserPermissionDto;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 用户与许可 - 查询分页
 */
@Component("/web-api/v1/configuration/userPermission/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<UserPermissionDto> userPermissionDtoPage = ApplicationContextHolder.getBean(UserPermissionService.class).page(UserPermissionDto.class, map);

        return ApplicationContextHolder.func(PageSupport.class, pageSupport -> pageSupport.newMap(this.toMapList(userPermissionDtoPage.getContent()), map, userPermissionDtoPage.getTotalElements()));
    }

    private List<Map<String, Object>> toMapList(List<UserPermissionDto> userPermissionDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (UserPermissionDto userPermissionDto : userPermissionDtoList) {
            mapList.add(this.toMap(userPermissionDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(UserPermissionDto userPermissionDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", userPermissionDto.getBeginDate());
        map.put("createdByCode", userPermissionDto.getCreatedByCode());
        map.put("createdDate", userPermissionDto.getCreatedDate());
        map.put("dataStateCode", userPermissionDto.getDataStateCode());
        map.put("departmentCode", userPermissionDto.getDepartmentCode());
        map.put("endDate", userPermissionDto.getEndDate());
        map.put("flagCode", userPermissionDto.getFlagCode());
        map.put("lastModifiedByCode", userPermissionDto.getLastModifiedByCode());
        map.put("lastModifiedDate", userPermissionDto.getLastModifiedDate());
        map.put("orgCode", userPermissionDto.getOrgCode());
        map.put("permissionCode", userPermissionDto.getPermissionCode());
        map.put("permissionCodes", userPermissionDto.getPermissionCodes());
        map.put("roleCodes", userPermissionDto.getRoleCodes());
        map.put("siteCode", userPermissionDto.getSiteCode());
        map.put("stateCode", userPermissionDto.getStateCode());
        map.put("systemInfoCode", userPermissionDto.getSystemInfoCode());
        map.put("userCode", userPermissionDto.getUserCode());
        map.put("userPermissionId", userPermissionDto.getUserPermissionId());
        map.put("version", userPermissionDto.getVersion());
        map.put("wfId", userPermissionDto.getWfId());

        return map;
    }
}