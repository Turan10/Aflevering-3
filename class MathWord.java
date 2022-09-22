import java.util.Random;

public class MathWord {
    public static void main(String[] args){

        int number = 100;
        int divsible = 12;
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

        for (int i = 0; i < number; i++) {
            if (i % divsible == 0) {
                System.out.print(i+ " ");

            }
        }
        System.out.println();
        System.out.println(getRandom(arr));

        printNum(5);

        }
    public static int getRandom(int[] arr) {
        int rnd = new Random().nextInt(arr.length);
        return arr[rnd];
    }

    public static void printNum(int num){
        System.out.println(num);
        num = num - 1;
        System.out.println(num);
        
    }

}

