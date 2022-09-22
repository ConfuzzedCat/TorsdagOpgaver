public class Task1{
    public static void main(String[] args){
        System.out.println(palindrome("Den laks skal ned"));
    }
    public static boolean palindrome(String s){
        boolean temp = true;
        for(int i = 0; i < s.length(); i++){
            if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt(s.length()-(1+i))){
                temp = false;
            }
        }
        return temp;

    }
}
