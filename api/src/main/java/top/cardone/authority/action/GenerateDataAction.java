package top.cardone.authority.action;

import lombok.Synchronized;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.action.Action0;

/**
 * Created by cardo on 2017/10/25 0025.
 */
public class GenerateDataAction implements Action0 {
    @Override
    @Synchronized
    public void action() {
        ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }
}
