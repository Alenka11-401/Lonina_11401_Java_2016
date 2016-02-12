/**
 * Created by alena on 12.02.16.
 */
public class Fox implements Predators, Animals, Mammals {
    String name;
    String color;
    int years;
    String life = Animals.life;

    public Fox( String name, String color, int years){
        this.color =  color;
        this.name = name;
        this.years = years;

    }
    @Override
    public void walkInForest() {

        System.out.println("A fox " + name + " walk in forest. It is " + color +" Now it is " + life + " FirFirFir!!!!!!!!");
    }

    @Override
    public void walkOnField() {
        System.out.println("A fox " + name + " walk on field. It is " + color +" Now it is " + life + " FirFirFir!!!!!!!!");

    }

    @Override
    public void walkOnSweem() {
        System.out.println("A fox " + name + " walk on sweem. It is " + color +" Now it is " + life + " FirFirFir!!!!!!!!");

    }

    @Override
    public void feedCalves() {
        System.out.println("A fox " + name + "feed her calve with milk!");

    }

    @Override
    public void makeMilk() {
        System.out.println("A fox " + name + "make milk for her calve");

    }

    @Override
    public void makePosterity() {
        System.out.println("A fox " + name + "make posterity! It`s happy!!!!!");

    }

    @Override
    public void eatSmallExtraction() {
        System.out.println("A fox " + name + " eat mouse. It`s not full!!!!!");

    }

    @Override
    public void eatBigExtraction() {
        System.out.println("A fox " + name + " eat cow. It`s overeat !!!!!");

    }

    @Override
    public void eatNormalExtraction() {
        System.out.println("A fox " + name + " eat rabbit. It`s full !!!!!");


    }
}
