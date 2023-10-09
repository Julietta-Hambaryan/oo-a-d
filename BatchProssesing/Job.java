package com.company.BatchProssesing;

public class Job {
    private JobParameters jobParameters;
    private InstanceImplementation instanceImpl;
    private JobInstance jobInstance;


    public Job(JobParameters jobParameters, InstanceImplementation instanceImpl, JobInstance jobInstance) {
        this.jobParameters = jobParameters;
        this.instanceImpl = instanceImpl;
        this.jobInstance = jobInstance;
    }

    public JobInstance create(InstanceImplementation impl) {
        return JobFactory.getInstance().createJobInstance(impl);
    }

    public void start(JobInstance jobInstance) {

    }


}

