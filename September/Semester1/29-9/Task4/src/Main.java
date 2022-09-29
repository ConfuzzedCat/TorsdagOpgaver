import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> actions = new ArrayList<>(Arrays.asList("Start a game","Resume the game", "Pause game", "End game"));
        Menu m = new Menu(actions);
        doAction(m.showMenu());

    }

    private static void doAction(int action) {
        switch (action){
            case 1:
                System.out.println("Starting game!");
                break;
            case 2:
                System.out.println("Resuming game");
                break;
            case 3:
                System.out.println("Pausing game");
                break;
            case 4:
                System.out.println("Ending game");
                break;
        }
    }
}