public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("John");
        s1.addCourse(new Course("Datamatiker"));
        s1.addCourse(new Course("Dansk"));
        s1.addCourse(new Course("Matamatik"));
        System.out.println(s1);
    }
}