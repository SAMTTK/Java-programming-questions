public class week_10_1 {
    public static int countCold(int[] temps) {
        int n = 0;

        for(int i = 0; i < temps.length; ++i) {
            if (temps[i] < 1) {
                ++n;
            }
        }

        return n;
    }

    public static int countWarm(int[] temps) {
        int n = 0;

        for(int i = 0; i < temps.length; ++i) {
            if (temps[i] > 10) {
                ++n;
            }
        }

        return n;
    }

    public static int average(int[] data) {
        int total = 0;
        int c = 0;

        for(int i = 0; i < data.length; ++i) {
            total += data[i];
            ++c;
        }

        return total / c;
    }

    public static void question1() {
        int[] temps = new int[]{9, 2, 11, -1, 10, 0, 7, -2, 8, 2, 10, -2, 12, 3};
        System.out.println(countCold(temps) + " cold nights");
        System.out.println(countWarm(temps) + " warm nights");
        System.out.println(average(temps) + " degrees average");
    }

    public static void main(String[] args) {
        question1();
    }
}