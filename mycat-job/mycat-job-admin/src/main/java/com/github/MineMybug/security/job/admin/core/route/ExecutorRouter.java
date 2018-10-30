package com.github.MineMybug.security.job.admin.core.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.MineMybug.security.core.biz.model.ReturnT;
import com.github.MineMybug.security.core.biz.model.TriggerParam;

import java.util.ArrayList;

/**
 * Created by xuxueli on 17/3/10.
 */
public abstract class ExecutorRouter {
    protected static Logger logger = LoggerFactory.getLogger(ExecutorRouter.class);

    /**
     * route run executor
     *
     * @param triggerParam
     * @param addressList
     * @return  ReturnT.content: final address
     */
    public abstract ReturnT<String> routeRun(TriggerParam triggerParam, ArrayList<String> addressList);

}