package com.fairyoo.fring.util;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * @author MengYi at 2019-01-08 10:41
 */
public class FringQuartzUtil extends QuartzJobBean {


    /**
     * 执行定时任务
     * https://www.cnblogs.com/ealenxie/p/9134602.html
     * https://github.com/EalenXie/SpringBoot-Quartz
     * 
     * @param jobExecutionContext
     * @return 
     * @author by MengYi at 2019-01-08 10:42
    */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("quartz task "+new Date());
    }
}
