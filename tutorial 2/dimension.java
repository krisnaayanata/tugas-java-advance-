/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class dimension {
    int width, length;
    
    //constructor
    public dimension(int inWidth, int  inLength){
        this.width=inWidth;
        this.length=inLength;
    }
    public dimension(){
        this.width=0;
        this.length=0;
    }
    
    //setter
    public void setWidth(int width){
        this.width=width;
    }
    public void setLength(int length){
        this.length=length;
    }
    
    //getter
    public int getWidth(){
        return this.width;
    }
    public int getLength(){
        return this.length;
    }
    

    public String toString(){
        return "width: "+getWidth()+" and length: "+getLength();
    }
    
}
