/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Vehicle {
    String owner, regNo;

    //constructor
    public Vehicle(String regNo, String owner) {
        this.regNo = regNo;
        this.owner = owner;
    }
    public Vehicle() {
        this.regNo = "";
        this.owner = "";
    }
    
    //setter
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    //getter

    public String getRegNo() {
        return regNo;
    }

    public String getOwner() {
        return owner;
    }
    
    //String

    @Override
    public String toString() {
        return "regNo" + regNo + ", owner by" + owner;
    }
    
    
}
