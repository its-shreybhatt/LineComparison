import java.util.Random;

public class LineComparison {
    static double length1, length2;
    static Random value = new Random();

    public static void main(String[] args) {

        LineComparison lineComparison = new LineComparison();

        lineComparison.firstLength();
        lineComparison.secondLength();
        lineComparison.comparison();
    }

    void firstLength() {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            int ary1 = value.nextInt(10);
            array[i] = ary1;
        }
        int x1 = array[0];
        int x2 = array[1];
        int y1 = array[2];
        int y2 = array[3];
        length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of a 1st line = " + length1);
    }

    void secondLength() {
        int[] array2 = new int[4];
        for (int i = 0; i < 4; i++) {
            int ary2 = value.nextInt(10);
            array2[i] = ary2;
        }
        int x11 = array2[0];
        int x22 = array2[1];
        int y11 = array2[2];
        int y22 = array2[3];
        length2 = Math.sqrt(Math.pow((x22 - x11), 2) + Math.pow((y22 - y11), 2));
        System.out.println("Length of a 2nd line = " + length2);
    }

    void comparison() {
        Double obj1 = Double.valueOf(length1);
        Double obj2 = Double.valueOf(length2);
        int compare = obj1.compareTo(obj2);
        if (compare == 0) {
            System.out.println("both lines are equal");
        } else if (compare == 1) {
            System.out.println("1st line is greater");
        } else System.out.println("2nd line is greater");
    }
}