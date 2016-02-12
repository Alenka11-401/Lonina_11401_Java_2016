/**
 * Created by alena on 12.02.16.
 */
public class Koala implements Marsupials, Herbivorous {
    String name;
    int years;
    String bag = Marsupials.bag;
    String favoriteEat = Herbivorous.favouriteEat;

    public Koala(String name, int years){
        this.name = name;
        this.years = years;

    }
    @Override
    public void eatGrass() {
        System.out.println("A koala " + name + "eat grass! It`s very tasty!");
    }

    @Override
    public void eatFlower() {
        System.out.println("A koala " + name + "eat flower! It`s not tasty!");
    }

    @Override
    public void eatFruit() {
        System.out.println("A koala " + name + "eat fruit! It`s not tasty!");

    }

    @Override
    public void makePosterity() {
        if (this.years < 10){
            System.out.println("A koala " + name + "make Posterity! It`s very Happy!");
        } else {
            System.out.println("A koala " + name + "is very old for making posterity!");
        }

    }

    @Override
    public void putPosterityInBag() {
        System.out.println("A koala " + name + "put calve in bag");

    }

    @Override
    public void pullPosterityFromBag() {

        System.out.println("A koala " + name + "pull calve from bag. A calve is old");
    }
}
