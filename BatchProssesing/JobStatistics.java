package com.company.BatchProssesing;

public class JobStatistics {

    private Integer readCount;
    private Integer writeCount;

    public  JobStatistics(){
        this.readCount = 0;
        this.writeCount = 0;
    }

    public Integer getReadCount(){
        return this.readCount;
    }

    public  Integer getWriteCount(){
        return this.writeCount;
    }

    public void incrementReadCount(){
        this.readCount ++;
    }

    public void incrementWriteCount(){
        this.writeCount ++;
    }

}
