/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */
public class Test52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] str = new String [2];
        int idx=0;
        
        str[0]="1";
        str[1]="2";
        
        
        System.out.println(str.length);
        for (String s: str)
        {  
            //str[idx]="hola";
            str[idx].concat("element");
            idx++;
        }
        
    }
    
}
