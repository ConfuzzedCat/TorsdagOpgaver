import java.util.ArrayList;

public class Student extends Person{

    private ArrayList<String> passedCourse;
    private ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourse) {
        super(name);
        this.passedCourse = passedCourse;
        currentCourses = new ArrayList<>();
    }

    @Override
    boolean addCourse(String course) {
        for (int i = 0; i < passedCourse.size(); i++){
            if(course.equalsIgnoreCase(passedCourse.get(i))){
                return false;
            }
        }
        currentCourses.add(course);
        return true;
    }
}
