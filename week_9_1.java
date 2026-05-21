import uulib.Console;
public class week_9_1 {
    public static String getCoinValue(int coin) {
        String m = "a";
        switch (coin) {
            case (1):
                m = "penny";
                break;
            case (2):
                m = "two pence";
                break;
            case (5):
                m = "five pence";
                break;
            case (10):
                m = "ten pence";
                break;
            case (20):
                m = "twenty pence";
                break;
            case (50):
                m = "fifty pence";
                break;
            case (100):
                m = "one pound";
                break;
            case (200):
                m = "two pounds";
                break;
            default:
                m = "Invalid X";
                break;
        }
        return m;
    }
    public static void question1(){

        int j = 2;
        while(j!=0){
            j = Console.getInt("coin (0 to quit)");
            System.out.println(getCoinValue(j));
        }
    }


    public static void main(String[] args) {
        question1();
    }
}