import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//--------------------------------------------- Task 1 25 - July
        System.out.println("Exam Question");

        String[] q = {"1. 2 + 2 =", "2. 2 + 3 =", "3. 2 + 4 = ", "4. 2 + 5 = ", "5. 2 + 6 = "};

        int[] a = {4, 5, 6, 7, 8};

        for (int i = 0; i <= 5; i++)
        {
            System.out.println(q[i]);
            int x = read.nextInt();
            if(a[i] == x){

                System.out.println("Correct Answer ");
            }
            else {
                System.out.println("wrong answer ");

            }

        }

    }
}
