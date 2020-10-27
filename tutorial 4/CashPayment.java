/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
    }

    public CashPayment() {
    }

    @Override
    public String toString() {
        return "Cash Payment, "+super.toString();
    }
    
    
}
