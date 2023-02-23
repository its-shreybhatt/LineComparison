import java.util.Random;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program!");

        Random value = new Random();
        // LINE 1
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
//            Random value = new Random();
            int ary1 = value.nextInt(10);
            array[i] = ary1;
        }
        int x1 = array[0];
        int x2 = array[1];
        int y1 = array[2];
        int y2 = array[3];
        double leng1 = x2 - x1;
        double leng2 = y2 - y1;
        double pow1 = Math.pow(leng1, 2);
//        System.out.println("length of 1st 2 points = " + pow1);
        double pow2 = Math.pow(leng2, 2);
//        System.out.println("length of 2nd 2 points = " + pow2);
        double power = pow1 + pow2;
        double length1 = Math.sqrt(power);
        System.out.println("Length of a 1st line = " + length1);
        System.out.println("  *  *  ");

        // LINE 2
        int[] array2 = new int[4];
        for (int i = 0; i < 4; i++) {
//            Random value = new Random();
            int ary2 = value.nextInt(10);
            array2[i] = ary2;
        }
        int x11 = array2[0];
        int x22 = array2[1];
        int y11 = array2[2];
        int y22 = array2[3];
        double length2 = Math.sqrt(Math.pow((x22 - x11), 2) + Math.pow((y22 - y11), 2));
        System.out.println("Length of a 2nd line = " + length2);
        System.out.println(" *   *  ");

        // Comparision
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