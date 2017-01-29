/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */
public class Test19 {
    
    void readCard(int cardNo)throws Exception{
        System.out.println("Reading card");
    }
    
    void chechCard (int cardNo) throws RuntimeException{
        
         System.out.println("check card");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test19 ex=new Test19();
        int cardNo=1231231;
         
        ex.chechCard(cardNo);
       
        ex.readCard(cardNo);
        
    }
    
}
