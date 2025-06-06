package test.sampleModules;

public class prime_number {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        double b = Math.sqrt(number);
        int a= (int) Math.sqrt(number);
        for (int i = 2; i <= a; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 11;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
