import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

public class CronTriggerExample
{
    public static void main( String[] args ) throws Exception
    {

        JobDetail job = new JobDetail();
        job.setName("CRONJobName");
        job.setJobClass(HelloJob.class);

        CronTrigger trigger = new CronTrigger();
        trigger.setName("dummyTriggerName");
        trigger.setCronExpression("0/3 * * * * ?");

        //schedule it
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);

    }
}
