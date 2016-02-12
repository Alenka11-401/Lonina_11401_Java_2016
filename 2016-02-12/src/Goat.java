/**
 * Created by alena on 12.02.16.
 */
public class Goat implements Animals, Mammals, Herbivorous{
    String name;
    String poroda;
    int years;
    String life = Animals.life;
    public Goat(String name, String poroda, int years){
        this.name = name;
        this.poroda = poroda;
        this.years = years;

    }
    @Override
    public void walkInForest() {
        System.out.println("A goat " + name + " walk in forest. It is " +poroda +" Now it is " + life + " Meeeeeeeeeeeee!!!!!!!!");
    }

    @Override
    public void walkOnField() {
        System.out.println("A goat " + name + " walk on Field. It is " +poroda +" Now it is " + life + " Meeeeeeeeeeeee!!!!!!!!");
    }

    @Override
    public void walkOnSweem() {
        System.out.println("A goat " + name + " walk on sweem. It is " +poroda +" Now it is " + life + " Meeeeeeeeeeeee!!!!!!!!");
    }

    @Override
    public void eatGrass() {
        System.out.println("A goat " + name + "eat grass! It`s very tasty!");
    }

    @Override
    public void eatFlower() {
        System.out.println("A goat " + name + "eat flower! Hostess will be very agly!");
    }

    @Override
    public void eatFruit() {
        System.out.println("A goat " + name + "eat fruit! Hostess will be very agly!");

    }

    @Override
    public void feedCalves() {
        System.out.println("A goat " + name + "feed her calve with milk!");

    }

    @Override
    public void makeMilk() {
        System.out.println("A goat " + name + "make milk for Hostess.");

    }

    @Override
    public void makePosterity() {
        System.out.println("A goat " + name + "make Posterity! A cow is HAPPY!");
    }
}
