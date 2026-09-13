/**
 * A virtual Squirrel.  Will need to implement a constructor and the abstract methods from Animal.
 * 
 * @author Taylor Bakare
 */

public class Squirrel extends Animal {

      public Squirrel(String name){
        super(name);
    }

    public void speak(){
        System.out.println(name + " says chitter chitter.");
    }

    public void play(){
        System.out.println(name + " burries the acorn.");
    }
    
    
}
