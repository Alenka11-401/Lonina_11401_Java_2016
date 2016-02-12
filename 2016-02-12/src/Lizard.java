/**
 * Created by alena on 12.02.16.
 */
public class Lizard implements Reptiles, Predators {
    String name;
    int years;
    String favouriteEat = Predators.favouriteEat;
    String reptile = Reptiles.crawl;


    public Lizard(String name, int years){
        this.name = name;
        this.years = years;

    }
    @Override
    public void eatSmallExtraction() {
        System.out.println("A lizard " + name + " eat insect. It`s not full!!!!!");

    }

    @Override
    public void eatBigExtraction() {
        System.out.println("A lizard " + name + " eat small lizard. It`s overeat !!!!!");

    }

    @Override
    public void eatNormalExtraction() {
        System.out.println("A lizard " + name + " eat worm. It`s full !!!!!");


    }

    @Override
    public void crawlFromDanger() {
        System.out.println("A lizard " + name + " crawl very fast!");
    }

    @Override
    public void stickOutTongue() {
        System.out.println("A lizard " + name + " stick out tongue! it`s looking for insect");
    }

    @Override
    public void layEggs() {

        System.out.println("A lizard " + name + " lay eggs! it`s wait posterity!");
    }
}
