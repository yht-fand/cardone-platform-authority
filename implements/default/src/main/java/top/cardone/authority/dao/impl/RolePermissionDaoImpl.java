package top.cardone.authority.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 角色与许可
 *
 * @author yao hai tao
 */
public class RolePermissionDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.RolePermissionDao {
    @Override
    public Map<String, Object> findOneByRolePermissionId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");
		
        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        String findListByKeywordSqlFilePath = this.getSqlFilePath("findListByKeyword");

        return this.findList(findListByKeywordSqlFilePath, findList);
    }
}