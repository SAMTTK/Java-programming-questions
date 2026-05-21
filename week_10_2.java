public class week_10_2 {
    public static int[] fillFibonacci(int[] data) {
        data[0] = 1;
        data[1] = 1;

        for(int i = 2; i < data.length; ++i) {
            data[i] = data[i - 1] + data[i - 2];
        }

        return data;
    }

    public static void printFibonacci(int[] data) {
        for(int i = 1; i < data.length; ++i) {
            System.out.println(i + " " + data[i]);
        }

    }

    public static void question2() {
        int[] a = fillFibonacci(new int[6]);
        int[] b = fillFibonacci(new int[15]);
        int[] c = fillFibonacci(new int[2]);
        printFibonacci(a);
        printFibonacci(b);
        printFibonacci(c);
    }

    public static void main(String[] args) {
        question2();
    }
}