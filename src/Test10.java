/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */
public class Test10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder sb= new StringBuilder(5);
        String s="";
        
        if (sb.equals(s)){
            System.out.println("match 1");            
        } else if (sb.toString().equals(s.toString())){
        System.out.println("match 2");
        } else  {
               System.out.println("match no"); 
                }
    }
    
}
