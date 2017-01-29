/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */
public class Test18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String shirts [] [] = new String [2][2];
        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";
        
        for(int index=0; index<2;++index){
            for (int idx=0; idx<2; ++idx){
                System.out.println(shirts[index][idx]+":");
            }
        }
    }
    
    
    
}
