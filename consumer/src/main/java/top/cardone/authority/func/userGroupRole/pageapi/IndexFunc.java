package top.cardone.authority.func.userGroupRole.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户组与角色 - 索引
 */
@Component("/authority/userGroupRole/index.json")
public class IndexFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}