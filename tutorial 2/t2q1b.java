/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

public class t2q1b {
    public static void main (String args[]){
        System.out.println("=====BOOK ROOM=====");
        ;
        Scanner key = new Scanner(System.in);
        System.out.print("input the room name: ");
        String name = key.next();
        System.out.print("you  want to book it(y/n)?: ");
        String booked=key.next();
        boolean book=true;
        if(booked.equals("y")){
            book=true;
        }
        else if(booked.equals("n")){
            book=false;
        }
        System.out.print("where is the direction of the windows: ");
        String windows = key.next();
        window w = new window(windows);
        
        System.out.print("how much chair did you need?: ");
        int chair=key.nextInt();
        
        
        System.out.print("input Length: ");
        int length = key.nextInt();
        System.out.print("input Width: ");
        int  width = key.nextInt();
        dimension d = new dimension(width,length);
        room r = new room(name, chair, book, d, w);
        System.out.println(r.toString());  
    }
}
