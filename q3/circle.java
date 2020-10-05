/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class circle {
    point c = new point();
    public double r;
    
    //constructor
    public circle(double x, double y, double r){
        this.c.setX(x);
        this.c.setY(y);
        this.r=r;
    }
    public circle(){
        this.c.setX(0);
        this.c.setY(0);
        this.r=0;
    }
    
    //setter
    public void setRadius(double r){
        this.r=r;
    }
    
    //getter
    public double getRadius(){
        return this.r;
    }
    
}
