/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class CreditCardPayment extends Payment{
    protected String expiredDate,name,number;

    public CreditCardPayment(String expiredDate, String name, String number, double amount) {
        super(amount);
        this.expiredDate = expiredDate;
        this.name = name;
        this.number = number;
    }
    public CreditCardPayment() {
        this.expiredDate = "";
        this.name = "";
        this.number = "";
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Using card ( "+this.name+" ["+this.number+"] exp: "+this.expiredDate+"\nwith day: "+
                this.expiredDate.charAt(0)+this.expiredDate.charAt(1)+" and year: "+this.expiredDate.charAt(3)+this.expiredDate.charAt(4)+"\nfor credit-card payment, "+super.toString();
    }
    
    
    
    
}
