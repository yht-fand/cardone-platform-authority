package top.cardone.authority.service.impl;

import top.cardone.authority.dao.UserGroupRoleDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.SimpleDefaultService;

/**
 * 用户组与角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserGroupRoleServiceImpl extends SimpleDefaultService<UserGroupRoleDao> implements top.cardone.authority.service.UserGroupRoleService {
}