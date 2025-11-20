public class PrimeNumberCheck {
  // Prime Number: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("Number '" + num + "' is " + (isPrime ? "Prime" : "Not Prime"));
    }
}
