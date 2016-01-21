package top.cardone.authority.func.role.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.RoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 角色 - 批量创建
 */
@Component("/web-api/v1/configuration/role/c0002.json")
public class C0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(RoleService.class).save(map);
    }
}
