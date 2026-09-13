/**
 * A virtual park
 * 
 * @author Your Name Goes Here
 */


public class Park {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Buster");
        animals[1] = new Dog("Rocky");
        animals[2] = new Cat("Milo");
        animals[3] = new Squirrel("Alvin");
        for (int i = 0; i < animals.length; i++){
            animals[i].speak();
        }
        for (int i = 0; i < animals.length; i++){
            animals[i].play();
        }
    }
    
}
