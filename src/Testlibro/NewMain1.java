/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testlibro;

class animal{

    private  int age;
    
    public animal(int age){
        //super();
        this.age=age;
    }
    
    animal(){
        super();
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}

class zebra extends animal{

   
    
    public zebra(int age){
        super(age);
        //this.setAge(age);
        
    }

    zebra(){
        
        this(4);
    }
    
}

/**
 *
 * @author develop
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        animal a= new animal(2);
        zebra  z= new zebra();
        
        System.out.println(a.getAge());
        System.out.println(z.getAge());
        
        
    }
    
}
