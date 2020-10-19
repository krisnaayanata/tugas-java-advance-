/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class t2q1a {    

    public static void main (String args[]){
        String name="room 1";
        String direction="west";
        boolean booked=true;
        int chair=10;int width=5; int length=4;
        dimension d = new dimension(width,length);
        window w = new window();
        room r = new room(name, chair, booked, d, w);
        System.out.println(r.toString());
        
        
    }
}
