//package com.fairyoo.fring.util;
//
//import org.quartz.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author MengYi at 2019-01-08 10:43
// */
//@Configuration
//public class FringQuartzConfig {
//
//    @Bean
//    public JobDetail teatQuartzDetail(){
//        return JobBuilder.newJob(FringQuartzUtil.class).withIdentity("ringQuartzUtil").storeDurably().build();
//    }
//
//
//    @Bean
//    public Trigger testQuartzTrigger(){
//        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
//                .withIntervalInSeconds(10)  //设置时间周期单位秒
//                .repeatForever();
//        return TriggerBuilder.newTrigger().forJob(teatQuartzDetail())
//                .withIdentity("ringQuartzUtil")
//                .withSchedule(scheduleBuilder)
//                .build();
//    }
//
//}
