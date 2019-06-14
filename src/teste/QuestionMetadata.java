/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import interfaces.models.IQuestionMetadata;

/**
 *
 * @author João Paulo Oliveira
 */
public class QuestionMetadata implements IQuestionMetadata {

    private long timestamp_start;
    private long timestamp_finish;
    
    @Override
    public long getTimestamp_start() {
        return this.timestamp_start;
    }

    @Override
    public void setTimestamp_start(long timestamp_start) {
        this.timestamp_start = timestamp_start;
    }

    @Override
    public long getTimestamp_finish() {
        return this.timestamp_finish;
    }

    @Override
    public void setTimestamp_finish(long timestamp_finish) {
        this.timestamp_finish = timestamp_finish;
    }
    
}
