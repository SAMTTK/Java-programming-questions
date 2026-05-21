import uulib.Console;
public class week_8_3 {
    public static int larger(int a, int b){
        if (a>b)
            return a;
        else
            return b;
    }
    public static void question3(){
        int largest = 0;
        int b = Console.getInt("Enter your numbers, type 0 to end the calculation");
        while (b!=0){
            largest = larger(largest,b);
            b = Console.getInt("Enter your numbers, type 0 to end the calculation");
        }
        System.out.println("Largest number was "+largest);
    }
    public static void main(String[] args) {
        question3();
    }
}