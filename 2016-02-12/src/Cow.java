/**
 * Created by alena on 12.02.16.
 */
public class Cow implements Animals, Herbivorous, Mammals{
    String name;
    String poroda;
    int years;
    String life = Animals.life;
    public Cow(String name, String poroda, int years){
        this.name = name;
        this.poroda = poroda;
        this.years = years;

    }
    @Override
    public void walkInForest() {
        System.out.println("A cow " + name + " walk in forest. It is " +poroda +" Now it is " + life + " MOOOOOOOOOOO!!!!!!!!");
    }

    @Override
    public void walkOnField() {
        System.out.println("A cow " + name + " walk on field. It is " +poroda +" Now it is " + life + "MOOOOOOOOOO!!!!!!!!");
    }

    @Override
    public void walkOnSweem() {

        System.out.println("A cow " + name + " walk on Sweem. It is " +poroda +" Now it is " + life + "MOOOOOOOOOO!!!!!!!!");
    }

    @Override
    public void eatGrass() {
        System.out.println("A cow " + name + "eat grass! It`s very tasty!");
    }

    @Override
    public void eatFlower() {
        System.out.println("A cow " + name + "eat flower! Hostess will be very agly!");
    }

    @Override
    public void eatFruit() {
        System.out.println("A cow " + name + "eat fruit! Hostess will be very agly!");
    }

    @Override
    public void feedCalves() {
        System.out.println("A cow " + name + "feed her calve with milk!");

    }

    @Override
    public void makeMilk() {
        System.out.println("A cow " + name + "make milk for Hostess.");

    }

    @Override
    public void makePosterity() {
        System.out.println("A cow " + name + "make Posterity! A cow is HAPPY!");
    }
}
