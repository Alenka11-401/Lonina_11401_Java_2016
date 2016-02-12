/**
 * Created by alena on 12.02.16.
 */
public class Shark implements Fish, Predators {
    String name;
    int years;
    String life = Fish.life;
    String favoriteEat = Predators.favouriteEat;


    public Shark(String name, int years){
        this.name = name;
        this.years = years;
    }
    @Override
    public void diveIntoDepths() {
        System.out.println("A shark " + this.name + " dive.");
    }

    @Override
    public void jumpOut() {
        System.out.println("A shark " + this.name + " jump out! YAHOOO!");

    }

    @Override
    public void swimLong() {
        System.out.println("A shark " + this.name + " swim. and swim. and swim...");


    }

    @Override
    public void eatSmallExtraction() {
        System.out.println("A shark " + name + " eat small fish. It`s not full!!!!!");

    }

    @Override
    public void eatBigExtraction() {
        System.out.println("A shark " + name + " eat other shark. It`s overeat !!!!!");

    }

    @Override
    public void eatNormalExtraction() {
        System.out.println("A shark " + name + " eat big fish. It`s full !!!!!");


    }
}
