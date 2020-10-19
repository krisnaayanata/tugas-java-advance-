/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class car extends Vehicle{
    int seatCapacity;

    //constructor
    public car(int seatCapacity, String regNo, String owner) {
        super(regNo, owner);
        this.seatCapacity = seatCapacity;
    }

    public car() {
        this.seatCapacity = 0;
    }
    
    //setter
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    
    //getter
    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return "car "+ super.getRegNo()+"owned by: "+super.getOwner()+"with seatCapacity: " + getSeatCapacity();
    }
    
}
