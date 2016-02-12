/**
 * Created by alena on 12.02.16.
 */
public class Whale implements Mammals, Fish {
    String name;
    int years;
    String life = Fish.life;
    String calve = Mammals.calve;

    public Whale(String name, int years){
        this.name = name;
        this.years = years;
    }
    @Override
    public void diveIntoDepths() {
        System.out.println("A whale " + this.name + " dive.");
    }

    @Override
    public void jumpOut() {
        System.out.println("A  whale " + this.name + " jump out! YAHOOO!");

    }

    @Override
    public void swimLong() {
        System.out.println("A whale " + this.name + " swim. and swim. and swim...");


    }
    @Override
    public void feedCalves() {
        System.out.println("A whale " + name + "feed her calve with milk!");

    }

    @Override
    public void makeMilk() {
        System.out.println("A whale " + name + "make milk for calve.");

    }

    @Override
    public void makePosterity() {
        System.out.println("A whale " + name + "make Posterity! A cow is HAPPY!");
    }

}
