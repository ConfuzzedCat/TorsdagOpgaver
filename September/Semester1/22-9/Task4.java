public class Task4{
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;
    
    public static void main(String[] args){
        fibonacci();

    }

    public static void fibonacci(){
        if(n3 == 0){
            System.out.print("0 1 ");
        }
        if(n1 + n2 < 1000){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            fibonacci();
        }
    }
}