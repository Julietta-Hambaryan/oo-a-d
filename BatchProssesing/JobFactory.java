package com.company.BatchProssesing;

import java.util.Date;

public class JobFactory {

    private static JobFactory instance;

    private JobFactory() {  // singleton JobFactory
    }

    public static JobFactory getInstance() {
        if (instance == null) {
            instance = new JobFactory();
        }
        return instance;
    }

    public JobInstance createJobInstance(InstanceImplementation impl) {
        Date startDate = null;
        Date endDate = null;
        JobStatistics jobStatistics =  new JobStatistics();
        return new JobInstance(startDate, endDate,impl, jobStatistics, Status.NEW);
    }
}
