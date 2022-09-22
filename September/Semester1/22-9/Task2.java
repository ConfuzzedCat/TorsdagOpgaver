public class Task2{
    public static void main(String[] args){
        System.out.println(partOfWord("København", 1, 5));
    }
    public static String partOfWord(String fullWord, int sIndex, int eIndex){
        return fullWord.substring(sIndex, eIndex);
    }
}