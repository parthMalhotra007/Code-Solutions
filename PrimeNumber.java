import java.util.Scanner;

public class PrimeNumber {

    public boolean isPrime(int n)
    {
        boolean flag = true;

        if(n <=1) // 0 and 1 are not prime numbers
        {
            flag = false;
        }
        if(n == 2) // 2 is a prime number
        {
            flag = false;
        }
        if(n % 2 == 0) // All other even numbers are not prime
        {
            flag = false;
        }
        for(int i = 3 ; i <= Math.sqrt(n); i+=2)
        {
            if(n % i == 0)
            {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        PrimeNumber primeNumber = new PrimeNumber();
        boolean ans = primeNumber.isPrime(num);
        System.out.println("Is It A PRIME NUMBER " + ans);


    }
}
