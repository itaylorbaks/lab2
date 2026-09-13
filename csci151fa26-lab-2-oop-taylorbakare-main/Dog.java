/**
 * A virtual dog
 * 
 * @author Cynthia Taylor
 */

public class Dog {

    String name;

    public Dog(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println(name + " says woof woof.");
    }

    public void play(){
        System.out.println(name + " chases the stick.");
    }
    
}
