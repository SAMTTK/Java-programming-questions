import uulib.Console;
public class week_8_2 {
    public static boolean isVowel(char a){
        if (a == ('a') || a == ('e') || a == ('i') || a == ('o') || a == ('u'))
            return true;
            else
                return false;
    }

    public static void question2(){
        int j = 0;
        char a = 'r';
        while(a!= '.'){
            a = Character.toLowerCase(Console.getChar("Enter a character"));
            isVowel(a);
            if (isVowel(a)){
                j +=1;
                System.out.println(j +" Vowel");}
                else
                System.out.println(j +" Vowel");
            }


        }

    public static void main(String[] args) {
    question2();

    }
}