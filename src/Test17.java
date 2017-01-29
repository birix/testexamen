/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */

 class CheckingAccount{
    public int amount;
    public CheckingAccount(int amount){
        this.amount=amount;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void changeAmount(int x){
        amount+=x;
    }
}
public class Test17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckingAccount acct= new CheckingAccount((int)(Math.random()*1000));
        //acct.amount=0;
        System.out.println("cuenta"+acct.getAmount());
    }
    
}
