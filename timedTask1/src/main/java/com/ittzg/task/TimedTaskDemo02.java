package com.ittzg.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: ittzg
 * @CreateDate: 2018/12/7 13:17
 * @Description: 使用Timer完成定时任务
 */
public class TimedTaskDemo02 {
    public static void main(String[] args) throws ParseException {
        System.out.println("程序执行时间"+new Date());
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("this is a timerTask /n 目标任务执行时间："+new Date());
            }
        };
        Timer timer = new Timer();
        /*//1.schedule(TimerTask task, Date time) 表示在指定的时间点执行task
        Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2018-12-07 13:57:50");

        timer.schedule(timerTask,date);*/
       /* //2.schedule(TimerTask task, long ms) 表示延迟ms毫秒以后执行task
        timer.schedule(timerTask,5000); //5000表示5秒*/

        /*//3.schedule(TimerTask task, Date firstTime, long period) 表示任务从date时候首次开始执行，以后每period 毫秒执行一次
        Date date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2018-12-07 14:18:30");
        timer.schedule(timerTask,date1,5000);*/

        //4.schedule(TimerTask task, long delay, long period)
        // 表示任务从delay毫秒时候开始首次执行，以后每period 毫秒执行一次
        timer.schedule(timerTask,5000,5000);

        //5.scheduleAtFixedRate(TimerTask task, Date firstTime, long period)
        // 表示任务从date时候首次开始执行，以后每period 毫秒执行一次

        //6.scheduleAtFixedRate(TimerTask task, long delay, long period)
        // 表示任务从delay毫秒时候开始首次执行，以后每period 毫秒执行一次
    }
}
