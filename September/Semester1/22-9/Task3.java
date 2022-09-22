import java.util.Random;

public class Task3{
    static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

    public static void main(String[] args){
        divisible(12);
        System.out.println(getRandomIndex(arr));
        recursion(10);
    }
    public static void divisible(int div){
        for(int i = 0; i < 100; i++){
            if(i%div==0){
                System.out.print(i + " ");
            }
        } 
        System.out.println();
    }
    public static int getRandomIndex(int[] array){
        return array[new Random().nextInt(array.length)];
    }
    public static int recursion(int n){
        System.out.print(n+ " ");
        if(n > 0){
            n--;
            recursion(n);
        }
        return n;
    }
}