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

public class q1 {

    
    public static void main(String args[]){
        int survey;
        double salary;
        Scanner key = new Scanner(System.in);
        System.out.println("Hitung Gaji");
        System.out.print("masukan jumalah survey");
        survey=key.nextInt();
        int qty=survey%5;
        if(qty==0){
            salary=(survey/5)*70.00;
        }
        else{
            double a=(survey/5)*70.00;
            salary = a+(qty*10.00);
        }
        System.out.print(salary);
    }
}
