/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Cmain {
    
    public static void main(String args[]){
        double amount=0;
        double tpay=0;
        double tCP=0;
        char choose='y';
        int type=0;
        int mpay =0;
        int lpay=0;
        String number, date, name="";
        boolean valid=true;
        ArrayList<Payment> pay =new ArrayList<Payment>();
        ArrayList<CashPayment> cPay =new ArrayList<CashPayment>();
        
        Scanner key = new Scanner(System.in);
        
        while(choose=='y'){
            System.out.print("Sales amount? ");
            amount=key.nextDouble();
            System.out.print("Payment type? 1. <Cash> or 2. <Credit>: ");
            type=key.nextInt();
            if(type==1){
                CashPayment cp = new CashPayment(amount);
                System.out.println(cp);
                cPay.add(cp);
                
            }
            else if(type==2){
                while(valid==true){
                    System.out.print("Credit Card Holder: ");
                    name=key.next();
                    System.out.print("Expire on(mm/yy): ");
                    date=key.next();
                    if(date.length()==5){
                        valid=true;
                    }
                    else{
                        System.out.print("wrong input! \nwanna try againt Y<es> or N<o>? ");
                        choose=key.next().charAt(0);
                        if(choose=='y'){
                            System.out.print("Expire on(mm/yy): ");
                            date=key.next();
                            valid=true;
                        }
                        else{
                            System.out.println("good bye...");
                            valid=false;
                        }
                    }
                    System.out.print("Credit Card Number: ");
                    number=key.next();
                    CreditCardPayment ccp = new CreditCardPayment(date,name,number,amount);
                    System.out.println(ccp);
                    break;
                }   
            }
            else{
                System.out.print("wrong input! \nwanna try againt Y<es> or N<o>? ");
                choose=key.next().charAt(0);
                if (choose=='n'){
                    System.out.println("good bye...");
                    break;
                }
                
                
            }
            Payment p = new Payment(amount);
            pay.add(p);
        }
        for(Payment p:pay){
            tpay=tpay+p.getAmount();
        }
        for(CashPayment cp:cPay){
            tCP=tCP+cp.getAmount();
        }
        for(Payment p:pay){
            if(p.getAmount()<10.0){
                lpay=lpay+1;
            }
        }
        for(Payment p:pay){
            if(p.getAmount()>10.0){
                mpay=mpay+1;
            }
        }
        System.out.println("total Payment: "+tpay);
        System.out.println("total Cash Payment: "+tCP);
        System.out.println("total Payment more than RM 10.0: "+mpay);
        System.out.println("total Payment less than RM 10.0: "+lpay);
        

    }
}
