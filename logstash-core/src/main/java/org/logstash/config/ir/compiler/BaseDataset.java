package org.logstash.config.ir.compiler;

/**
 * Provides common behavior for Dataset classes generated by Java execution.
 */
public abstract class BaseDataset implements Dataset {
    private boolean done;

    protected void setDone() {
        done = true;
    }

    protected void clearDone() {
        done = false;
    }

    protected boolean isDone() {
        return done;
    }

}
