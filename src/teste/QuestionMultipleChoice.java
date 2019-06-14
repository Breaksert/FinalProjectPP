/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;


import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestionMetadata;
import interfaces.models.IQuestionMultipleChoice;

/**
 *
 * @author João Paulo Oliveira
 */

public class QuestionMultipleChoice extends Receiver implements IQuestionMultipleChoice {

    
    
    @Override
    public String getTitle() {
        return this.question.title;
    }

    @Override
    public void setTitle(String title) throws QuestionException {
        this.question.title = title;
    }

    @Override
    public String getQuestion_description() {
        return this.question.question_description;
    }

    @Override
    public void setQuestion_description(String question_description) throws QuestionException {
        this.question.question_description = question_description;
    }

    @Override
    public IQuestionMetadata getQuestion_metadata() {
    return this.question_metadata;
    }

    @Override
    public void setQuestion_metadata(IQuestionMetadata question_metadata) {
        this.question_metadata = question_metadata;
    }

    @Override
    public boolean isDone() {
        if(this.answer != null){
            this.isDone = true;
            return isDone;
        }else{
            return isDone;
        }
    }

    @Override
    public void setDone(boolean done) {
        this.isDone = done;
    }

    @Override
    public void answer(String user_answer) {
        this.answer = user_answer;
    }

    @Override
    public boolean evaluateAnswer() {
        return (this.answer == null ? this.question.correct_answer == null : 
                this.answer.equals(this.question.correct_answer));
    }

    
    @Override
    public String[] getOptions() {
        return this.question.options;
    }

    @Override
    public void setOptions(String[] options) {
        this.question.options = options;
    }

    @Override
    public String getCorrect_answer() {
        return this.question.correct_answer;
    }

    @Override
    public void setCorrect_answer(String correct_answer) {
        this.question.correct_answer = correct_answer;
    }

    @Override
    public String getUser_answer() {
        return this.question.user_answer;
    }

    @Override
    public void setUser_answer(String user_answer) {
        this.question.correct_answer = user_answer;
    }
    
    
}
