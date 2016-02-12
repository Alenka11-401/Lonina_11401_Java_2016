/**
 * Created by alena on 12.02.16.
 */
public class Hedgehog implements Predators, Mammals {
    String name;
    int years;
    String favoriteEat = Predators.favouriteEat;
    String calve = Mammals.calve;


    public Hedgehog(String name, int years){
        this.name = name;
        this.years = years;

    }
    @Override
    public void feedCalves() {
        System.out.println("A hedgehog " + name + "feed her calve with milk!");

    }

    @Override
    public void makeMilk() {
        System.out.println("A hedgehog " + name + "make milk for calve.");

    }

    @Override
    public void makePosterity() {
        System.out.println("A hedgehog " + name + "make Posterity! A cow is HAPPY!");
    }

    @Override
    public void eatSmallExtraction() {
        System.out.println("A hedgehog " + name + " eat insect. It`s not full!!!!!");

    }

    @Override
    public void eatBigExtraction() {
        System.out.println("A hedgehog " + name + " eat snake. It`s overeat !!!!!");

    }

    @Override
    public void eatNormalExtraction() {
        System.out.println("A hedgehog " + name + " eat mouse. It`s full !!!!!");


    }
}
