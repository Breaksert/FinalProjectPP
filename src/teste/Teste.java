/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;


import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.*;
import interfaces.controller.ITest;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;
import interfaces.models.IQuestionMultipleChoice;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.TestWindow;
/**
 *
 * @author João Paulo Oliveira
 */
public class Teste{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        
        try {
            /**
            Test teste = new Test();
            teste.loadFromJSONFile("C:\\FP\\PP_FinalProject\\teste_A.txt");
            
            IQuestion coisa = teste.getQuestion(0);
            
            System.out.println(teste.getQuestion(1));
            
            
            
            teste.removeQuestion(1);
            
            
            System.out.println(teste.getQuestion(3));
            
            
            
            System.out.println(teste.getQuestion(3));
            
            System.out.println(teste.numberQuestions());
            
            teste.removeQuestion(1);
            teste.removeQuestion(1);
            
            System.out.println(teste.numberQuestions());
            
            */
            
            
            ITest demoTest = new Test();
            demoTest.loadFromJSONFile("C:\\FP\\PP_FinalProject\\teste_A.txt");
            
            System.out.println(demoTest.getQuestion(0));
            
            TestWindow t = new TestWindow();
            t.startTest(demoTest);
            
            
        } catch (TestException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
}
