/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import interfaces.controller.ITest;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.models.*;

/**
 *
 * @author João Paulo Oliveira
 */
public class Test implements ITest{
    
    
    private IQuestion[] receiver;
   

    public Test() {
    }
    
    
    
    BufferedReader reader = null;
    
    @Override
    public boolean loadFromJSONFile(String path) throws TestException {
        
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        Gson gson = new Gson();
        Receiver[] teste = gson.fromJson(reader, Receiver[].class);
        
        this.receiver = teste;

        return this.receiver == teste;
    }

    @Override
    public boolean addQuestion(IQuestion q) throws TestException {
        if(q == null){
            throw new TestException("The question is null!");
        }else{
            for(int i=0; i<this.receiver.length; i++){
                if(this.receiver[i] == null){
                    this.receiver[i] = q;
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public IQuestion getQuestion(int pos) throws TestException {
        if(this.receiver[pos] == null){
            throw new TestException("There is no question at that specific position");
        }else{
            return this.receiver[pos];
        }
    }

    @Override
    public boolean removeQuestion(int pos) {
        try {
            IQuestion questao = this.getQuestion(pos);
            questao = null;
            while(pos < receiver.length-1){
                this.receiver[pos] = this.receiver[pos + 1];
                pos++;
            }
            this.receiver[pos]=null;
            return this.receiver[pos] == null;
            
        } catch (TestException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
        
    }

    @Override
    public boolean removeQuestion(IQuestion q) {
        
        try{
           for(int i=0; i<this.receiver.length; i++){ 
                if(this.getQuestion(i) == q){
                    IQuestion questao = this.getQuestion(i);
                    questao = null;
                    while(i < receiver.length-1){
                        this.receiver[i] = this.receiver[i + 1];
                        i++;
                    }
                    this.receiver[i]=null;
                    return this.receiver[i] == null;
                }
            } 
        } catch (TestException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public int numberQuestions() {
        
        try{
            int cont=0;
            for(int i=0; i<this.receiver.length; i++){
                if(this.getQuestion(i) != null){
                    cont++;
                }
            }
            return cont;
        } catch (TestException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public boolean isComplete() {
        
        try{
            int cont=0;
            for(int i=0; i<this.receiver.length; i++){
                IQuestion questao = this.getQuestion(i);
                if(questao.isDone() == true){
                    cont++;
                }
            }
            return cont == this.receiver.length;
        } catch (TestException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ITestStatistics getTestStatistics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}