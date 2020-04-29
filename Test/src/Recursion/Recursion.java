package Recursion;

public class Recursion {


    public int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        System.out.println(num * recursiveFactorial(num - 1));

        return num * recursiveFactorial(num - 1);

    }

    public int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
        return factorial;

    }

}
