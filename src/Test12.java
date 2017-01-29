/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */
public class Test12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ta="A ";
        ta=ta.concat("B ");
        String tb="C ";
        ta=ta.concat(tb);
        ta.replace('C','D');
        ta=ta.concat(tb);
        System.out.println(ta);
    }
    
}
