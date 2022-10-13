import java.util.ArrayList;

public class Teacher  extends Person{

    public ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        currentCourses = new ArrayList<>();
    }

    @Override
    boolean addCourse(String course) {
        for (String s:canTeach) {
            if(course.equalsIgnoreCase(s)){
                currentCourses.add(course);
                return true;
            }
        }
        return false;
    }
}
