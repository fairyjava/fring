package com.fairyoo.fring.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 在主类上使用@EnableScheduling注解开启对定时任务的支持，然后启动项目
 *
 * @author MengYi at 2019-01-08 10:15
 */
@Slf4j
@Component
public class FringScheduledUtil {

//    /**
//     * 在线cron表达式生成：http://qqe2.com/cron/index
//     *
//     * 一个cron表达式有至少6个（也可能7个）有空格分隔的时间元素。 https://www.cnblogs.com/softidea/p/5833248.html
//     * 按顺序依次为
//     * 秒（0~59）
//     * 分钟（0~59）
//     * 小时（0~23）
//     * 天（月）（0~31，但是你需要考虑你月的天数）
//     * 月（0~11）
//     * 天（星期）（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
//     * 7.年份（1970－2099）
//     *
//     * @author by MengYi at 2019-01-08 10:17
//     */
//    @Scheduled(cron = "0/5 * * * * *")
//    public void scheduled() {
//        log.info("=====>>>>>使用cron  {}", System.currentTimeMillis());
//    }
//
//
//    /**
//     * Scheduled(fixedRate = 时间间隔 )
//     *
//     *
//     * Scheduled(fixedRate)如何保证固定速度执行?
//     * 为了保证fixedRate任务真的可以按照设置的速度执行，无疑需要引入异步执行模式，确保schedule调度的任务不会被单线程执行阻塞。这里引入注解@EnableAsync和@Async。
//     *
//     * @author by MengYi at 2019-01-08 10:19
//     */
//    @Scheduled(fixedRate = 1 * 5000L)
//    public void scheduled1() {
//        log.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
//    }
//
//    @Scheduled(fixedDelay = 1 * 5000L)
//    public void scheduled2() {
//        log.info("=====>>>>>fixedDelay{}", System.currentTimeMillis());
//    }
//
//    /**
//     * 因为默认在单线程下工作，实际结果是每隔3秒钟的时间才会执行一次。那问题来了，fixedRate设置的1秒钟都没有调度吗？
//     * 发现scheduled的确是每秒调度一次，只是因为单线程执行，调度的任务都阻塞了。执行完前3次后，21:45:51把阻塞的任务都执行了，之后开始每1秒钟执行一次。
//     *
//     * @author by MengYi at 2019-01-08 10:22
//    */
//    @Scheduled(initialDelay = 1*1000L, fixedRate = 1 * 1000L)
//    public void scheduled3() {
//        log.info("=====>>>>>fixedDelay{},fixedRate{}", System.currentTimeMillis());
//    }
//
//
//
//
//    private static volatile int count = 0;
//
//
//    /**
//     * https://blog.csdn.net/terence_10years/article/details/80408902
//     *
//     * Scheduled(fixedRate)如何保证固定速度执行?
//     * 为了保证fixedRate任务真的可以按照设置的速度执行，无疑需要引入异步执行模式，确保schedule调度的任务不会被单线程执行阻塞。这里引入注解@EnableAsync和@Async。
//     *
//     * @author by MengYi at 2019-01-08 10:26
//    */
//    @Async
//    @Scheduled(initialDelay = 1*1000L, fixedRate = 1 * 1000L)
//    public void fixedRate() {
//        try {
//            log.info("--fixedRate--, count {}", count);
//            if (count < 2) {
//                count += 1;
//                Thread.sleep(1000 * 3);
//            } else {
//                Thread.sleep(100);
//            }
//        } catch (InterruptedException e) {
//            log.error(e.toString());
//        }
//    }

}
