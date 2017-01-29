/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */

interface Readable {
    public void readBook();
    public void setBook();
    
}

abstract class Book implements Readable {
    public void readBook() {}
    //public abstract void setBook();
}

 class Ebook extends Book{
    public void readBook(){}
    public void setBook() {}
    
}
public class Test11 {
    
}
