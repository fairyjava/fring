//package com.fairyoo.fring.web.controller;
//
//import com.fairyoo.fring.util.FringQuartzUtil;
//import com.fairyoo.fring.util.FringScheduledUtil;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.var;
//import org.omg.CORBA.PUBLIC_MEMBER;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Date;
//import java.util.Timer;
//import java.util.TimerTask;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//
///**
// * SpringBoot几种定时任务的实现方式
// *
// * Timer：这是java自带的java.util.Timer类，这个类允许你调度一个java.util.TimerTask任务。使用这种方式可以让你的程序按照某一个频度执行，但不能在指定时间运行。一般用的较少。
// * ScheduledExecutorService：也jdk自带的一个类；是基于线程池设计的定时任务类,每个调度任务都会分配到线程池中的一个线程去执行,也就是说,任务是并发执行,互不影响。
// * Spring Task：Spring3.0以后自带的task，可以将它看成一个轻量级的Quartz，而且使用起来比Quartz简单许多。
// * Quartz：这是一个功能比较强大的的调度器，可以让你的程序在指定时间执行，也可以按照某一个频度执行，配置起来稍显复杂。
// *
// *
// * @author MengYi at 2019-01-08 09:26
// */
//@Api(tags = "定时任务", value = "")
//@RestController
//@RequestMapping(value = "/fring/timer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//public class TimerController {
//
////    @Autowired
////    private FringScheduledUtil fringScheduledUtil;
////
////    @Autowired
////    private FringQuartzUtil fringQuartzUtil;
////
////
////    @ApiOperation(value = "TimerTask")
////    @GetMapping(value = "/timerTask")
////    public void timerRun() {
////        TimerTask timerTask = new TimerTask() {
////            @Override
////            public void run() {
////                System.out.println("task  run:"+ new Date());
////            }
////        };
////
////        var t = new Timer();
////        t.schedule(timerTask, 10,3000);
////
////    }
////
////    @ApiOperation(value = "ScheduledExecutorService")
////    @GetMapping(value = "/scheduledRun")
////    public void scheduledRun() {
////        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
////
////        //// 参数：1、任务体 2、首次执行的延时时间    3、任务执行间隔 4、间隔时间单位
////        service.scheduleAtFixedRate(()-> {
////
////            System.out.println("task ScheduledExecutorService "+new Date());
////
////        }, 10, 3000, TimeUnit.MILLISECONDS);
////    }
////
////    @ApiOperation(value = "FringScheduledUtil.asyncscheduledFixedRate")
////    @GetMapping(value = "/asyncscheduledFixedRate")
////    public void asyncscheduledFixedRate() {
////        fringScheduledUtil.fixedRate();
////    }
////
//
//
//
//}
