/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class point {
    public double x,y;
    
    //constructor
    public point(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public point(){
        this.x=0;
        this.y=0;
    }
    //setter
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    //getter
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    } 
}
