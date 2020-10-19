/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class window {
   String direction;
    
    //constructor
    public window(String inDirection){
        this.direction=inDirection;
    }
    public window(){
        this.direction="";
    }
    
    //setter
    public void setDirection(String inDirection){
        this.direction=inDirection;
    }
    
    public String getDirection(){
        return this.direction;
    }
    

    public String toString(){
        return "window facing "+getDirection();
    }
    
    
}
