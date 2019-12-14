
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author williamlaw
 */
public class Wenmo {
    double balance;
    double amount;
    double newBalance;
    
    public Static voic main Wenmo(double initialBalance){
        balance = initialBalance;
        System.out.println("Hello your total balance is " + balance);
    }
    
    //creating account
    public String openAccount (String openAcount){
      return openAccount;
    }
    
    //Receive payment
    public double receivePayment(double amount ){
        double newBalance = balance + amount;
        balance = newBalance;            
        return balance;
    }
    //Send Payment
    public double sendPayment (double amount){
        double newBalance = balance - amount;
        balance = newBalance;
        return balance;       
    }
    
}
    

