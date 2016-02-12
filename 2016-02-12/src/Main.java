/**
 * Created by alena on 12.02.16.
 */
public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Burenka", "White", 5);
        cow.eatGrass();
        cow.eatFlower();
        cow.eatFruit();
        cow.makeMilk();
        cow.feedCalves();
        cow.makePosterity();
        cow.walkInForest();
        cow.walkOnField();
        cow.walkOnSweem();

        Fox fox = new Fox("Sestrichka", "red", 6);
        fox.feedCalves();
        fox.walkOnSweem();
        fox.walkOnField();
        fox.walkInForest();
        fox.eatBigExtraction();
        fox.eatNormalExtraction();
        fox.eatSmallExtraction();
        fox.makeMilk();
        fox.makePosterity();

        Goat goat = new Goat("Dereza", "Rogataya",2);
        goat.feedCalves();
        goat.makePosterity();
        goat.walkOnSweem();
        goat.makeMilk();
        goat.walkOnField();
        goat.eatFlower();
        goat.eatFruit();
        goat.eatGrass();
        goat.walkInForest();
        goat.makePosterity();

        Hedgehog hedgehog = new Hedgehog("Yedjik", 3);
        hedgehog.makePosterity();
        hedgehog.makeMilk();
        hedgehog.feedCalves();
        hedgehog.eatSmallExtraction();
        hedgehog.eatBigExtraction();
        hedgehog.eatNormalExtraction();

        Kangoroo kangoroo= new Kangoroo("Rooo",9);
        kangoroo.makePosterity();
        kangoroo.pullPosterityFromBag();
        kangoroo.eatGrass();
        kangoroo.eatFruit();
        kangoroo.eatFlower();
        kangoroo.putPosterityInBag();

        Koala koala = new Koala("mishka", 5);
        koala.putPosterityInBag();
        koala.eatFlower();
        koala.eatFruit();
        koala.eatGrass();
        koala.makePosterity();
        koala.pullPosterityFromBag();

        Lizard lizard = new Lizard("Liza", 5);
        lizard.eatNormalExtraction();
        lizard.eatBigExtraction();
        lizard.eatSmallExtraction();
        lizard.crawlFromDanger();
        lizard.stickOutTongue();
        lizard.layEggs();

        Perch perch = new Perch("Kudzep", 2);
        perch.diveIntoDepths();
        perch.jumpOut();
        perch.swimLong();

        Shark shark = new Shark("Yom", 6);
        shark.swimLong();
        shark.jumpOut();
        shark.diveIntoDepths();
        shark.eatSmallExtraction();
        shark.eatBigExtraction();
        shark.eatNormalExtraction();

        Snake snake= new Snake("Zmiy", 1);
        snake.eatNormalExtraction();
        snake.layEggs();
        snake.eatBigExtraction();
        snake.stickOutTongue();
        snake.eatSmallExtraction();
        snake.crawlFromDanger();

        Whale whale = new Whale("Kit", 8);
        whale.diveIntoDepths();
        whale.feedCalves();
        whale.jumpOut();
        whale.makeMilk();
        whale.swimLong();
        whale.makePosterity();

        Wolf wolf = new Wolf("Seriy", "seriy");
        wolf.makePosterity();
        wolf.eatSmallExtraction();
        wolf.walkInForest();
        wolf.makeMilk();
        wolf.eatBigExtraction();
        wolf.eatNormalExtraction();
        wolf.feedCalves();
        wolf.walkOnField();
        wolf.walkOnSweem();

    }
}
