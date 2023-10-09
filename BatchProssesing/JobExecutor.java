package com.company.BatchProssesing;

public class JobExecutor {

    public void executeJob(JobInstance jobInstance){
        while (!jobInstance.isCompleted()){
            jobInstance.status = Status.RUNNING;
            try { // Exception handling needs to be improved
                jobInstance.read();
                jobInstance.jobStatistics.incrementReadCount();
                jobInstance.process();
                jobInstance.write();
                jobInstance.jobStatistics.incrementWriteCount();
            }
            catch (Exception e){
                // logic for exception handling
            }
        }
    }
}
