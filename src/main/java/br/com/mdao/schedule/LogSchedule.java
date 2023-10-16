package br.com.mdao.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Slf4j
public class LogSchedule {

    //Roda a cada 5min
    @Scheduled(cron="0 0/5 * * * *")
    public void logScheduleMinute() {
        log.info("STARTED AT MINUTE: " + LocalTime.now());
    }

    //Roda às 15:00
    @Scheduled(cron="0 0 15 * * *")
    public void logScheduleHour(){
        log.info("STARTED AT HOUR: " + LocalTime.now());
    }
}
