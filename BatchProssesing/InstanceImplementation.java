package com.company.BatchProssesing;

public interface InstanceImplementation {
    void readImpl();
    void processImpl();
    void writeImpl();
    boolean isCompleted();
}
