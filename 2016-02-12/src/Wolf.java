/**
 * Created by alena on 12.02.16.
 */
public class Wolf implements Animals, Predators, Mammals {
    String name;
    String color;
    String life = Animals.life;
    public Wolf( String name, String color){
        this.color =  color;
        this.name = name;

    }
    @Override
    public void walkInForest() {

        System.out.println("A wolf " + name + " walk in forest. It is " + color +" Now it is " + life + " RRRRRRRRRRRR!!!!!!!!");
    }

    @Override
    public void walkOnField() {
        System.out.println("A wolf " + name + " walk on field. It is " + color +" Now it is " + life + " RRRRRRRRRRRR!!!!!!!!");

    }

    @Override
    public void walkOnSweem() {
        System.out.println("A wolf " + name + " walk on sweem. It is " + color +" Now it is " + life + " RRRRRRRRRRRR!!!!!!!!");

    }

    @Override
    public void feedCalves() {
        System.out.println("A wolf " + name + "feed her calve with milk!");

    }

    @Override
    public void makeMilk() {
        System.out.println("A wolf " + name + "make milk for her calve");

    }

    @Override
    public void makePosterity() {
        System.out.println("A wolf " + name + "make posterity! It`s happy!!!!!");

    }

    @Override
    public void eatSmallExtraction() {
        System.out.println("A wolf " + name + " eat mouse. It`s not full!!!!!");

    }

    @Override
    public void eatBigExtraction() {
        System.out.println("A wolf " + name + " eat cow. It`s overeat !!!!!");

    }

    @Override
    public void eatNormalExtraction() {
        System.out.println("A wolf " + name + " eat rabbit. It`s full !!!!!");


    }
}
