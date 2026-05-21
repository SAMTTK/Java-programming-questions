import uulib.Console;
public class BMI {
    public static double calcBMI(double h, double w){
        if(h <= 0 || w <= 0)
            return 0;
        else
            return (w/(h*h));
    }

    public static String getBMIResult(double x){
        String bmi = "a";
        if (x==0)           // I could not use switch & case here because switch doesn't accept double or float parameters.
            bmi = "invalid";
        else if(x<20)
            bmi = "underweight";
        else if(x>30)
            bmi= "overweight";
        else
            bmi = "normal";
        return bmi;
    }

    public static void question3_optional() {
        int x = Console.getInt("Enter 0 to run the test plan or 1 to perform a BMI calculation");
        while(x!=1 && x!=0)
            x = Console.getInt("Invalid number, enter again");
        if (x == 1)
            System.out.println(getBMIResult(calcBMI(Console.getDouble("Enter your height (in meters)"),Console.getDouble("Enter your weight (in kilograms)"))));
        else if (x == 0)
            testPlan();


    }
    public static void bmiTest(double weight, double height, String expectedResult) {
        double bmi = calcBMI(height, weight);
        String result = getBMIResult(bmi);
        if (result.equals(expectedResult)) {
            System.out.println("Success - " + bmi + " " + expectedResult);
        } else {
            System.out.println("FAILURE - " + bmi + " " + expectedResult);
        }
    }

    public static void testPlan() {
        bmiTest(60.0, 1.75, "underweight");
        bmiTest(51.5, 1.6, "normal");
        bmiTest(102.0, 1.8, "overweight");
        bmiTest(97.5, 1.9, "normal");
        bmiTest(-200.0, 2.0,"invalid");
        bmiTest(167, -1.4, "invalid");
    }



    public static void main(String[] args) {
        question3_optional();
    }
}