/**
 * Created by alena on 12.02.16.
 */
public class Kangoroo implements Marsupials, Herbivorous  {
    String name;
    int years;
    String bag = Marsupials.bag;
    String favoriteEat = Herbivorous.favouriteEat;

    public Kangoroo(String name, int years){
        this.name = name;
        this.years = years;

    }
    @Override
    public void eatGrass() {
        System.out.println("A kangaroo " + name + "eat grass! It`s not tasty!");
    }

    @Override
    public void eatFlower() {
        System.out.println("A kangaroo " + name + "eat flower! It`s tasty!");
    }

    @Override
    public void eatFruit() {
        System.out.println("A kangaroo " + name + "eat fruit! It`s very tasty!");

    }

    @Override
    public void makePosterity() {
        if (this.years < 10){
            System.out.println("A kangaroo " + name + "make Posterity! It`s very Happy!");
        } else {
            System.out.println("A kangaroo " + name + "is very old for making posterity!");
        }

    }

    @Override
    public void putPosterityInBag() {
        System.out.println("A kangaroo " + name + "put calve in bag");

    }

    @Override
    public void pullPosterityFromBag() {

        System.out.println("A kangaroo " + name + "pull calve from bag. A calve is old");
    }
}
