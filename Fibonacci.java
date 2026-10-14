 code
 
public class Fibonacci {
    public static void main(String[] args) {
        int numberOfTerms = 10;
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= numberOfTerms; i++) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}