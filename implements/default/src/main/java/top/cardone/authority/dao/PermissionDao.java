package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 许可
 *
 * @author yao hai tao
 */
public interface PermissionDao extends PageDao {
    List<String> readListPermissionCodeByUserCode(String userCode);


    /**
     * 查询许可对象
     *
     * @param findOne 角色标识
     * @return 角色对象
     */
    Map<String, Object> findOneByPermissionId(Map<String, Object> findOne);

    /**
     * 查询角色下拉列表
     *
     * @param findList 关键字
     * @return 角色下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

    /**
     * 查询树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);
}