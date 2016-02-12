/**
 * Created by alena on 12.02.16.
 */
public class Snake implements Reptiles, Predators{
    String name;
    int years;
    String favouriteEat = Predators.favouriteEat;
    String reptile = Reptiles.crawl;



    public Snake(String name, int years){
        this.name = name;
        this.years = years;

    }
    @Override
    public void eatSmallExtraction() {
        System.out.println("A snake " + name + " eat insect. It`s not full!!!!!");

    }

    @Override
    public void eatBigExtraction() {
        System.out.println("A snake " + name + " eat lizard. It`s overeat !!!!!");

    }

    @Override
    public void eatNormalExtraction() {
        System.out.println("A snake" + name + " eat mouse. It`s full !!!!!");


    }

    @Override
    public void crawlFromDanger() {
        System.out.println("A snake " + name + " crawl very fast!");
    }

    @Override
    public void stickOutTongue() {
        System.out.println("A snake " + name + " stick out tongue! it`s looking for insect");
    }

    @Override
    public void layEggs() {

        System.out.println("A snake " + name + " lay eggs! it`s wait posterity!");
    }
}
