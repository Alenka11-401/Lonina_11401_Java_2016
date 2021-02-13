import java.util.List;

/**
 * Created by alena on 26.02.16.
 */
public class Student {
    private Institute institute;
    private List<Lesson> lessons;
    private String name;

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Institute getInstitute() {
        return institute;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }



    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }



    public Student(String name, Institute institute, List<Lesson> lessons){
        this.name = name;
        this.institute = institute;
        this.lessons = lessons;
    }

}
