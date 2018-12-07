package com.ittzg.task;

import java.util.Date;

/**
 * @Author: ittzg
 * @CreateDate: 2018/12/7 11:13
 * @Description: 这是Java中解决定时任务的方案一
 */
public class TimedTaskDemo01 {
    public static void main(String[] args) {
        new Thread(() ->{
            int time = 1;
            while(true){
                //表示每5秒钟执行一次
                System.out.println("Perform the task every 5 secouds!\t"+(time++)+"\t"+new Date());
                try {Thread.sleep(5000);} catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
