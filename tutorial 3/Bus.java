/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Bus extends Vehicle {
    int sittingCapacity, standingCapacity;
    
    //constructor
    public Bus(int sittingCapacity, int standingCapacity, String regNo, String owner) {
        super(regNo, owner);
        this.sittingCapacity = sittingCapacity;
        this.standingCapacity = standingCapacity;
    }

    public Bus() {
        this.sittingCapacity = 0;
        this.standingCapacity = 0;
    }

    //setter
    public void setSittingCapacity(int sittingCapacity) {
        this.sittingCapacity = sittingCapacity;
    }

    public void setStandingCapacity(int standingCapacity) {
        this.standingCapacity = standingCapacity;
    }

    //getter
    public int getSittingCapacity() {
        return sittingCapacity;
    }

    public int getStandingCapacity() {
        return standingCapacity;
    }

    @Override
    public String toString() {
        return "Bus " +super.getRegNo()+"own by"+super.getOwner()+"with sittingCapacity: " + sittingCapacity + ", and standingCapacity: " + standingCapacity;
    }
    
    
    
    
    
}
