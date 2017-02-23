package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 用户组与角色服务
 *
 * @author yao hai tao
 */
public interface UserGroupRoleService extends PageService {
	/**
     * @see top.cardone.authority.service.UserGroupRoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupRoleService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

	/**
     * @see top.cardone.authority.service.UserGroupRoleService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupRoleService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);
	
    /**
     * 查询用户组与角色对象
     *
     * @param findOne 用户组与角色标识
     * @return 用户组与角色对象
     */
    Map<String, Object> findOneByUserGroupRoleId(Map<String, Object> findOne);
	
    /**
     * 查询用户组与角色下拉列表
     *
     * @param findList 关键字
     * @return 用户组与角色下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}