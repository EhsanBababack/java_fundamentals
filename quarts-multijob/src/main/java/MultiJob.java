import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class MultiJob {


    public static void main(String[] args) throws SchedulerException {
        JobDetail job1 = JobBuilder.newJob(Job1.class)
                .withIdentity("job1", "group1").build();
        JobDetail job2 = JobBuilder.newJob(Job2.class)
                .withIdentity("job2", "group1").build();
        JobDetail job3 = JobBuilder.newJob(Job3.class)
                .withIdentity("job3", "group1").build();
        Trigger trigger1 = TriggerBuilder.newTrigger()
                .withIdentity("cronTrigger1", "group1")
                .withSchedule(CronScheduleBuilder
                        .cronSchedule("0/10 * * * * ?")).build();
        Trigger trigger2 = TriggerBuilder.newTrigger()
                .withIdentity("cronTrigger2", "group1")
                .withSchedule(CronScheduleBuilder
                        .cronSchedule("0/10 * * * * ?")).build();
        Trigger trigger3 = TriggerBuilder.newTrigger()
                .withIdentity("cronTrigger3", "group1")
                .withSchedule(CronScheduleBuilder
                        .cronSchedule("0/10 * * * * ?")).build();
//Execute the job.
        Scheduler scheduler =
                new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job1, trigger1);
        scheduler.scheduleJob(job2, trigger2);
        scheduler.scheduleJob(job3, trigger3);
    }

}