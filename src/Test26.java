
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */
public class Test26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> names = new ArrayList<>();
        names.add("rob");
        names.add("bran");
        names.add("rick");
        names.add("bran");
        
        if(names.remove("bran")){
            names.remove("jon");
        }
        
        //names.remove("bran");
        
        System.out.println(names);
    }
    
}
