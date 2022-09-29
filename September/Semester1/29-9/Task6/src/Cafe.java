import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    public void loadMenuData(){

        try {
            File file = new File("coffee.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
        }
        catch (Exception e){
            System.out.println("There was error while trying to load file. Exception: " + e);
        }

    }
}