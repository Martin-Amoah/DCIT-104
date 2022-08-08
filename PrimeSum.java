//sum all prime numbers;


public class PrimeSum {
    public static void main(String[] args) {
        SumOfPrime(100);

    }

    static void SumOfPrime(int num) {
        boolean isPrimeNum = false;
        int sum = 0;

        for (int i = 2; i < num; i++) {
            isPrimeNum = isPrime(i); 

            if (isPrimeNum) { 
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    static boolean isPrime(int num) {
        if (num >= 2) {
            for (int i = 2; i < num; i++) {
                if (num * num % i == 0) {
                    return false;
                }
            }return true;
        } return false;
    }
}
