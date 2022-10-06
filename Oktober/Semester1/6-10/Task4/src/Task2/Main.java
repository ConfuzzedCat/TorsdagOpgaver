package Task2;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(2, 25, 24);
        Room r2 = new Room(1, 4, 3);
        Room r3 = new Room(0,3, 5);
        ArrayList<Room> rooms = new ArrayList<>(Arrays.asList(r1,r2,r3));
        Building b1 = new Building(rooms, 2, 3,false);
        System.out.println(countLampsInBuilding(b1));
        System.out.println(isNormal(b1));
    }
    public static int countLampsInBuilding(Building b){
        int sum = 0;
        for (Room r: b.getRooms()) {
            sum += r.getNumberOfLamps();
        }
        return sum;
    }
    public static boolean isNormal(Building b){
        int floors = b.getNumberOfFloors();
        int rooms = b.getRooms().size();
        if(floors > rooms){
            System.out.println("This building is odd");
            return false;
        }
        return true;
    }
}
