import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> options;

    public Menu(ArrayList<String> options) {
        this.options = options;
    }
    public int showMenu(){

        for (int i = 0; i < options.size(); i++){
            System.out.println("["+(i+1)+"] " + options.get(i));
        }
        System.out.println("Type a number to choose.");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt()+1;
    }
}
