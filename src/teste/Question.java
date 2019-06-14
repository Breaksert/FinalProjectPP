/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestion;
import interfaces.models.IQuestionMetadata;
import interfaces.models.IQuestionMultipleChoice;
import interfaces.models.IQuestionNumeric;
import interfaces.models.IQuestionYesNo;

/**
 *
 * @author João Paulo Oliveira
 */
public class Question extends Receiver{
    
    
    protected String title;
    protected String question_description;
    protected String[] options = new String[4];
    protected String correct_answer;
    protected String user_answer;

    public Question() {
        
    }
 

}
