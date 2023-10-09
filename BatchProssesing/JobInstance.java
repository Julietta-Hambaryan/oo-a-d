package com.company.BatchProssesing;

import java.util.Date;

public class JobInstance {
    private Date startDate;
    private Date endDate;
    private InstanceImplementation impl;
    public Status status;
    public JobStatistics jobStatistics;

    public JobInstance(Date startDate, Date endDate, InstanceImplementation impl, JobStatistics jobStatistics, Status status) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.impl = impl;
        this.jobStatistics = jobStatistics;
        this.status = status;
    }

    public void readStatistics() {
        System.out.println("Status: " + this.status);
        System.out.println("Read Count: " + jobStatistics.getReadCount());
        System.out.println("Write Count: " + jobStatistics.getWriteCount());
    }

    public void read(){
        impl.readImpl();
    }

    public void process(){
        impl.processImpl();
    }

    public void write(){
        impl.writeImpl();
    }

    public boolean isCompleted(){
        return impl.isCompleted();
    }

}

