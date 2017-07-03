package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 许可服务
 *
 * @author yao hai tao
 */
public interface PermissionService extends PageService {
    /**
     * @see top.cardone.authority.service.PermissionService#page
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.PermissionService#page
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.PermissionService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.PermissionService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.PermissionService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.PermissionService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.PermissionService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.PermissionService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.PermissionService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.PermissionService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.PermissionService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.PermissionService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.PermissionService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.PermissionService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.PermissionService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.PermissionService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.PermissionService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.PermissionService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.PermissionService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.PermissionService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int saveCache(Object save);

    /**
     * @see top.cardone.authority.service.PermissionService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.PermissionService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int[] updateListCache(List<Object> updateList);

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

    /**
     * 生成
     *
     * @return
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int generateData();

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    @CacheEvict(value = "top.cardone.authority.service.PermissionService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generatePermissionTreeAction")})
    int generateData(String flagObjectCode);
}