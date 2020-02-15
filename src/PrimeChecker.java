/*
PrimeChecker
https://learn.zybooks.com/zybook/UWFCOP5007Spring2020/chapter/14/section/5

Reference:
https://www.mathsisfun.com/prime_numbers.html

 */
public class PrimeChecker {
    // Returns 0 if value is not prime, 1 if value is prime
    public static int isPrime(int testVal, int divVal) {
        int returnVal=1;
        // Base case 1: 0 and 1 are not prime, testVal is not prime
        if (testVal==0 || testVal==1) {
            returnVal=0;
        } else if (divVal>1 && testVal % divVal == 0) {
            returnVal=0;
            //System.out.println(testVal + "  " + divVal);
        } else if (divVal>2) {
            returnVal = isPrime(testVal,divVal-1);
        }
        //else { returnVal=1;
        //}
        //System.out.println(testVal + "  " + divVal+ "  " + returnVal);
        return returnVal;
        // Base case 2: testVal only divisible by 1, testVal is prime

        // Recursive Case
        // Check if testVal can be evenly divided by divVal
        // Hint: use the % operator

        // If not, recursive call to isPrime with testVal and (divVal - 1)

    }

    public static void main(String[] args) {
        int primeCheckVal;     // Value checked for prime

        // Check primes for values 1 to 10
        for (primeCheckVal = 1; primeCheckVal <= 100; ++primeCheckVal) {
            if (isPrime(primeCheckVal, (primeCheckVal - 1)) == 1) {
                System.out.println(primeCheckVal + " is prime.");
            }
            else {
                System.out.println(primeCheckVal + " is not prime.");
            }
        }
    }
}

