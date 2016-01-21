package top.cardone.authority.func.userPermission.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户与许可 - 复合
 */
@Component("/web-api/v1/configuration/userPermission/m0002.json")
public class M0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(UserPermissionService.class).findOne(map);
    }
}