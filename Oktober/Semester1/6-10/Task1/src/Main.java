public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Victor", 20);
        Car c1 = new Car("Ford", "Focus RS", 2016, "Hatchback");
        c1.setDriver(d1);
        System.out.print(c1);
        System.out.println(d1);
        Car c2 = new Car("Alpine", "Vision Gran Turismo", 2013, "Super");
        c2.setDriver(d1);
        System.out.print(c2);
        System.out.println(d1);
    }
}