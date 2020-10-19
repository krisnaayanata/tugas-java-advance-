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
public class room {
    String name;
    int noOfChairs;
    int a,b=0;
    boolean isBooked;
    ArrayList<dimension> inDimension = new ArrayList<dimension>();
    ArrayList<window> inWindow = new ArrayList<window>();
    dimension dimen =new dimension();
    window win =new window();
    //constructor
    public room(String name, int noOfChairs, boolean isBooked, dimension dimen, window win){
        this.name=name;
        this.noOfChairs=noOfChairs;
        this.isBooked= isBooked;
        inDimension.add(dimen);
        inWindow.add(win);
    }
    
    public room(){
        this.name="";
        this.noOfChairs=0;
        this.isBooked=true;
        this.inDimension=null;
        this.inWindow=null;
    }
    
    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setNOC(int noOfChairs){
        this.noOfChairs=noOfChairs;
    }
    public void setIsBooked(boolean isBooked){
        this.isBooked=isBooked;
    }
    
    //getter
    public String getName(){
        return this.name;
    }
    public int getNOC(){
        return this.noOfChairs;
    }
    public boolean getIsBooked(){
        return this.isBooked;
    }
    
    
    
    public void printDimension(){
        int i;
        for(i=0;i<inDimension.size();i++){
            System.out.println(inDimension.get(i));
            
        }
    }
    public void printWindow(){
        int i;
        for(i=0;i<inWindow.size();i++){
            System.out.println(inWindow.get(i));
            
        }
    }

    public String toString(){
        return "room name: "+getName()+"with dimension "+this.inDimension+", \nwith "
                +this.inWindow+" and "+getNOC()+" chairs, and is already booked: "+getIsBooked();
    }
    
}
