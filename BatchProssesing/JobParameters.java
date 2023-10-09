package com.company.BatchProssesing;

public class JobParameters {

    private Integer chunkSize;
    private Boolean restartFailedJob;

    public JobParameters (Integer chunkSize, Boolean restartFailedJob) {
        this.chunkSize = chunkSize;
        this.restartFailedJob = restartFailedJob;
    }

    public int getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(int chunkSize) {
        this.chunkSize = chunkSize;
    }

    public boolean isRestartFailedJob() {
        return restartFailedJob;
    }

    public void setRestartFailedJob(boolean restartFailedJob) {
        this.restartFailedJob = restartFailedJob;
    }
}
