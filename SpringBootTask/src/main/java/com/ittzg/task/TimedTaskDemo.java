package com.ittzg.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: ittzg
 * @CreateDate: 2018/12/7 20:55
 * @Description:
 */
@Component  //一定要加，否则启动时不会创建该类，更扫描不到定时任务
public class TimedTaskDemo {
    //cron生成器地址 http://cron.qqe2.com/
        // 注意生成的cron 在运行时会出现Cron expression must consist of 6 fields (found 7 in "0 * * * * ? *")
        // 这时候果断把最后一位去掉
    @Scheduled(cron = "0/5 * * * * ?") //表示每5秒钟执行一次
    public void printMsg(){
        //此处写你的业务代码
        System.out.println("这是一个定时任务\t" +new Date());
    }
}
