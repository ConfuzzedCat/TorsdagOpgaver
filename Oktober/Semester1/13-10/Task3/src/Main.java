import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Johnny", new ArrayList<>(Arrays.asList("Java 1.0")));
        Student s2 = new Student("Benny", new ArrayList<>());
        Student s3 = new Student("Lenny", new ArrayList<>());

        String c1 = "Dansk";
        String c2 = "Matematik";
        String c3 = "Engelsk";
        ArrayList<String> courses = new ArrayList<>(Arrays.asList(c1,c2,c3));

        Teacher t1 = new Teacher("Egon", new ArrayList<>(Arrays.asList(c1,c2,c3)));
        Teacher t2 = new Teacher("Søren", new ArrayList<>(Arrays.asList(c1,c2,c3)));
        courses.add("Java 1.0");
        Teacher t3 = new Teacher("Len", courses);

        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(s1, s2, s3, t1, t2, t3));

        for (Person p:persons) {
            for (String s:courses) {
                if(!p.addCourse(s)){
                    switch (p.getClass().getSimpleName()){
                        case "Student":
                            System.out.println(p.getName() + " har allerede bestået dette kursus.");
                            break;
                        case "Teacher":
                            System.out.println(p.getName() + " kan ikke undervise i dette fag");
                            break;
                    }
                }
            }
        }
    }
}