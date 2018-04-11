package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 角色与许可
 *
 * @author yao hai tao
 */
public class RolePermissionDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.RolePermissionDao {
    @Override
    public int generateData(String flagObjectCode) {
//        String findListForDepartmentSqlFilePath = this.getSqlFilePath("findListForDepartment");
//
//        List<Map<String, Object>> forDepartmentList = this.findList(findListForDepartmentSqlFilePath);
//
        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        int count = this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);
//
//        for (Map<String, Object> forDepartment : forDepartmentList) {
//            forDepartment.putAll(putAll);
//
//            count += this.insertByNotExists(forDepartment);
//        }
//

        return count;
    }
}