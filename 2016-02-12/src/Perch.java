/**
 * Created by alena on 12.02.16.
 */
public class Perch implements Fish {
    String name;
    int years;
    String life = Fish.life;
    String razmer = "Min";


    public Perch(String name,int years){
        this.name = name;
        this.years = years;

    }
    @Override
    public void diveIntoDepths() {
        System.out.println("A perch " + this.name + " dive.");
    }

    @Override
    public void jumpOut() {
        System.out.println("A perch " + this.name + " jump out! YAHOOO!");

    }

    @Override
    public void swimLong() {
        System.out.println("A perch " + this.name + " swim. and swim. and swim...");


    }
}
