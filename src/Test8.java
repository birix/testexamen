
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */


class X{
    public void printFileContet() throws IOException {
        throw new IOException();
    }
   }

public class Test8 {

    /**
     * @param args the command line arguments
     */
     
   
    public static void main(String[] args)  {
        // TODO code application logic here
        X xobj= new X();
        try{
        xobj.printFileContet();
        }catch(Exception e){}
         
    }
    
}
