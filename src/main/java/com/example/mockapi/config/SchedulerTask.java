package com.example.mockapi.config;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@EnableScheduling
public class SchedulerTask {

    // Run every 5 seconds
//    @Scheduled(fixedRate = 5000)
//    public void fixedRateTask() throws InterruptedException {
//        Thread.sleep(8000);
//        System.out.println("Fixed Rate Task - " + LocalDateTime.now());
//    }
}

    // Run every
