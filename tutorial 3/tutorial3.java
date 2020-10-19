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
public class tutorial3 {
    
    public static void main(String args[]){
        //char f = 'y';
        String i="y";
        String r,o="";
        String choose="";
        car c = new car();
        Bus b = new Bus();
        Scanner key = new Scanner(System.in);
        while(i.equalsIgnoreCase("y")){
            System.out.print("1. Car \n2. Bus \nPlease select your Vehicle Q<uit>: ");
            choose=key.next();
            if(choose.equals("1")){
                System.out.print("input owner: ");
                r=key.next();
                System.out.print("input reg no: ");
                o=key.next();
                System.out.print("Seat Capacity: ");
                c.setSeatCapacity(key.nextInt());
                c.setOwner(o);
                c.setRegNo(r);
                System.out.println(c.toString());
                System.out.println("choose adalah "+choose);
            }
            else if(choose.equals("2")){
                System.out.print("input owner: ");
                r=key.next();
                System.out.print("input reg no: ");
                o=key.next();
                System.out.print("Sitting Capacity: ");
                b.setSittingCapacity(key.nextInt());
                System.out.print("Standing Capacity: ");
                b.setStandingCapacity(key.nextInt());
                b.setOwner(o);
                b.setRegNo(r);
                System.out.println(b.toString());
            }
            else if(choose.equalsIgnoreCase("q")){
                System.out.print("Bye bye...");
                break;
            }

            else{
                System.out.println("nilai choose adalah: "+choose);
                System.out.println("wrong input!");
            }
        
        System.out.print("wanna try it againt?(y/n): ");
        i=key.next();
            
        }
        
        
    }
}
