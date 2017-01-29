/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */

class CD{
    int r;
    CD (int r){
        this.r=r;
    }
 
}

class DVD extends CD {
 int c;
 DVD(int r, int c){
  super(r);
  this.c=c;
 }
}

public class Test13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
