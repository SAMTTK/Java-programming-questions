public class week_10_3 {
    public static int[] fillFibonacci(int[] data) {
        if (data.length <= 1) {
            return data;
        } else {
            data[0] = 1;
            data[1] = 1;

            for(int i = 2; i < data.length; ++i) {
                data[i] = data[i - 1] + data[i - 2];
            }

            return data;
        }
    }

    public static void printFibonacci(int[] data) {
        for(int i = 1; i < data.length; ++i) {
            System.out.println(i + " " + data[i]);
        }

    }

    public static int average(int[] data) {
        int total = 0;
        int c = 0;
        if (data.length == 0) {
            System.out.println("Your array is too short");
            return 0;
        } else {
            for(int i = 0; i < data.length; ++i) {
                total += data[i];
                ++c;
            }

            return total / c;
        }
    }

    public static void question3() {
        int[] data = new int[0];
        int avg = average(data);
        System.out.println("Average is " + avg);
        int[] fib0 = new int[0];
        int[] fib1 = new int[1];
        fib0 = fillFibonacci(fib0);
        fib1 = fillFibonacci(fib1);
        printFibonacci(fib0);
        printFibonacci(fib1);
    }

    public static void main(String[] args) {
        question3();
    }
}