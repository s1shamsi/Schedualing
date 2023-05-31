package com.Schedual.Scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedual {

//1-@Scheduled(cron = "0 */5 * * * *")


//2-@Scheduled(cron = "0 0 * * * *")


//3-@Scheduled(cron = "0 30 14 * * *")


//4-@Scheduled(cron = "0 0 8 ? * MON")


//5-@Scheduled(cron = "0 0 3 1 * *")


//6-@Scheduled(cron = "0 30 19,22 * * SUN")


//7-@Scheduled(cron = "0 0/15 8-22 * * *")


//8-@Scheduled(cron = "0 0 9-17 * * MON-FRI")


//9-@Scheduled(cron = "0 0 3 * * *")


//10-@Scheduled(cron = "0 0 * 1 * *")


//11-@Scheduled(cron = "0 0/30 8-17 * * MON-FRI")


//12-@Scheduled(cron = "0 0 * 15 * *")


//13-@Scheduled(cron = "0 0 18 * * *")


//14-
//@Scheduled(cron = "0 0/5 * * * MON-FRI")
//@Scheduled(cron = "0 0/15 * * * SAT,SUN")

//15-@Scheduled(cron = "0 0/10 9-17 * * MON-FRI")


//16-@Scheduled(cron = "0 0 * 1-15 * *")


//17-
//@Scheduled(cron = "0 */5 * * * MON-FRI")
//@Scheduled(cron = "0 0/15 * * * SAT,SUN")


//18-@Scheduled(cron = "0 30 23 ? * FRI")


//19-@Scheduled(cron = "0 0 * */2 * *")


//20-@Scheduled(cron = "0 */5 9-18 * * SAT,SUN")


//21-@Scheduled(cron = "0 30 3 * * MON-FRI")


//22-@Scheduled(cron = "0 0 9-17 15 * *")


//23-@Scheduled(cron = "0 15 8 * * MON-THU")


//24-@Scheduled(cron = "0 0 22 * 12 *")


//25-@Scheduled(cron = "0 0,30 18-23 * * MON-FRI")


//26-@Scheduled(cron = "0 30 16 1,15 * *")


//27-@Scheduled(cron = "0 */10 9-17 * * MON-FRI")


//28-@Scheduled(cron = "0 0 12 ? * 4#3")


//29-@Scheduled(cron = "0 0 22 ? 7-9 SUN")


//30-@Scheduled(cron = "0 0 12 ? 7 MON-SAT")


//31-@Scheduled(cron = "0 30 23 ? * FRI")


//32-@Scheduled(cron = "0 15 3 * * ?")


//33-@Scheduled(cron = "0 0 6-20 ? * MON-FRI")


//34-@Scheduled(cron = "0 0/30 * 15,30 * ?")


//35-@Scheduled(cron = "0 0/5 * 1 * ?")


//36-@Scheduled(cron = "0 0 9-17 ? * MON-FRI")


//37-
@Scheduled(cron = "0 0/15 14-22 ? * SAT,SUN")


//38- @Scheduled(cron = "")


//39-@Scheduled(cron = "")


//40-@Scheduled(cron = "")


//41-    @Scheduled(cron = "")


//42-  @Scheduled(cron = "")


//43- @Scheduled(cron = "")


//44-@Scheduled(cron = "")


//45- @Scheduled(cron = "")


//46- @Scheduled(cron = "")


//47-@Scheduled(cron = "")


//48-  @Scheduled(cron = "")


//49-@Scheduled(cron = "")


//50-@Scheduled(cron = "")

    public void schedule1(){
        System.out.println("Hello world, This Said from CodeLine");
    }

////
}