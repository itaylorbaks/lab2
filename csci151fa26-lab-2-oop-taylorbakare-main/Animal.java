
/**
 * An abstract class for different animals to extend.
 * 
 * @author Taylor Bakare
 */
public abstract class Animal {

    String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void speak();

    public abstract void play();

    
}
