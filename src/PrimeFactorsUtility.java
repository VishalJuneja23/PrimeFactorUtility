/**
 * Created by jvishal on 12/25/16.
 */

import java.util.ArrayList;
public class PrimeFactorsUtility {

    private PrimeFactorsUtility(){}

    public static int isPrime(int number)
    {
        for(int i =2; i<= Math.sqrt(number); i++)
        {
            if(number % i == 0)
                return 0;
        }

        return 1;
    }

    public static ArrayList primeFactors(int number) {
        ArrayList<Integer> primefactors = new ArrayList<Integer>();

        for(int i=2; i<= number/2; i++ )
        {
            if(number % i == 0)
            {
                if(isPrime(i) == 1)
                    primefactors.add(i);
            }
        }

        return primefactors;
    }

    public static void main(String[] args) {

        ArrayList primeFactors = PrimeFactorsUtility.primeFactors(30);
        System.out.println(primeFactors);
    }


}
