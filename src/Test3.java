
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */
public class Test3 {
    
    public static void main (String [] args){
    String date = LocalDate
            .parse("2014-05-04")
            .format(DateTimeFormatter.ISO_DATE_TIME);
    System.out.println(date);
    }
    
}
