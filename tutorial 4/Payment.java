/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }
    public Payment() {
        this.amount = 0;
    }
    

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "amount paid is " +amount;
    }    
    
}
