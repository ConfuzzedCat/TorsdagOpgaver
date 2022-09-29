import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> Courses;

    public Student(String n ) {
        Courses = new ArrayList<>();
        name = n;
    }

    public void addCourse(Course c){
        Courses.add(c);
    }

    @Override
    public String toString() {
        String s = "Student: " + name + ". Courses: ";

        for (Course c: Courses) {
            s += c + ", ";
        }
        s = s.substring(0, s.length()-2);
        return s;
    }
}
