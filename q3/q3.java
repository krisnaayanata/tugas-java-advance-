/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class q3 {
    public static void main (String args[]){
        point p = new point();
        circle circle1 = new circle();
        
        Scanner key = new Scanner(System.in);
        System.out.print("masukan Point(x): ");
        p.setX(key.nextDouble());
        System.out.print("masukan Point(y): ");
        p.setY(key.nextDouble());
        
        System.out.print("masukan Circle(x): ");
        circle1.c.setX(key.nextDouble());
        System.out.print("masukan Circle(Y): ");
        circle1.c.setY(key.nextDouble());
        System.out.print("masukan Circle(R): ");
        circle1.setRadius(key.nextDouble());
        
        double x=p.getX()-circle1.c.getX();
        double y=p.getY()-circle1.c.getY();
        double d = Math.sqrt(Math.pow(x,2)-Math.pow(y,2));
        
        if(d<circle1.r){
            System.out.println("dalam lingkaran");
        }
        else if(d==circle1.r){
            System.out.println("sejajar dengan lingakaran");
        }
        else if(d>circle1.r){
            System.out.println("diluar lingkaran");
        }
        else{
            System.out.println("salah bos");
        }
    }
}
