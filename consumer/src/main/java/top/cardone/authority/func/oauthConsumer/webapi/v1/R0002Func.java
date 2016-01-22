package top.cardone.authority.func.oauthConsumer.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.OauthConsumerDto;
import top.cardone.authority.service.OauthConsumerService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 授权消费 - 查询列表
 */
@Component("/web-api/v1/configuration/oauthConsumer/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<OauthConsumerDto> oauthConsumerDtoList = ApplicationContextHolder.getBean(OauthConsumerService.class).findList(OauthConsumerDto.class, map);

        return this.toMapList(oauthConsumerDtoList);
    }

    private List<Map<String, Object>> toMapList(List<OauthConsumerDto> oauthConsumerDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (OauthConsumerDto oauthConsumerDto : oauthConsumerDtoList) {
            mapList.add(this.toMap(oauthConsumerDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(OauthConsumerDto oauthConsumerDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", oauthConsumerDto.getBeginDate());
        map.put("clientId", oauthConsumerDto.getClientId());
        map.put("clientSecret", oauthConsumerDto.getClientSecret());
        map.put("createdByCode", oauthConsumerDto.getCreatedByCode());
        map.put("createdDate", oauthConsumerDto.getCreatedDate());
        map.put("dataStateCode", oauthConsumerDto.getDataStateCode());
        map.put("departmentCode", oauthConsumerDto.getDepartmentCode());
        map.put("endDate", oauthConsumerDto.getEndDate());
        map.put("lastModifiedByCode", oauthConsumerDto.getLastModifiedByCode());
        map.put("lastModifiedDate", oauthConsumerDto.getLastModifiedDate());
        map.put("oauthConsumerId", oauthConsumerDto.getOauthConsumerId());
        map.put("orgCode", oauthConsumerDto.getOrgCode());
        map.put("permissionCodes", oauthConsumerDto.getPermissionCodes());
        map.put("roleCodes", oauthConsumerDto.getRoleCodes());
        map.put("siteCode", oauthConsumerDto.getSiteCode());
        map.put("stateCode", oauthConsumerDto.getStateCode());
        map.put("systemInfoCode", oauthConsumerDto.getSystemInfoCode());
        map.put("version", oauthConsumerDto.getVersion());
        map.put("wfId", oauthConsumerDto.getWfId());

        return map;
    }
}