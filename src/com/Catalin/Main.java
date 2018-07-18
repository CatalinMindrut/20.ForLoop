package com.Catalin;

public class Main {
    public static void main(String[] args) {
        //The last challenge:
        challenge();

        //test
        for(int i=10; i<100; i += 10)
            System.out.println(i);
            System.out.println("**********************************");
        //test

        /**The "for" statement is ofter referred to as the "for loop" and the idea is that you repeatedly
         * loop something until a condition is satisfied, this means that a code block will be processed a given
         * number of times before a condition is satisfied.
         *
         * for(init; termination; increment) = this is a basic for loop format. Init is the code that is being
         * initialized once at the start of the loop, termination - this is where we tell the loop when to exit,
         * this has to evaluate to false and once it evaluates to false the loop will exit and increment is an
         * expression that is invoked after each iteration of the loop, as the loop goes around. A common thing
         * to use as an increment is a number.
         */
        for(int i = 0; i<5; i++)
        /**This is where the loop starts, with an i variable that has a value of 0.
         * Once the loop exits and is finished with, the i variable will be deleted.
         * The loop will continue until i is no longer < 5 and at that point it will break.
         * At end of each loop we want to increase the value of i so i++. This will increase the value by 1, each
         * for each loop until the value of i is no longer <5.
         */
            System.out.println("Loop " + i + " hello!");

            //Using the for statement, call the calculateInterest method with
        // The amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8
        // Print the results to the console window.

        //Challenge:
        for(int i = 2; i<9; i++){
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        /** As the code was initially written for the challenge, the interest rate at 7% will output in the
         * console a value of 700.000000000001. You can actually limit the number of decimal points after the
         * comma by using: String.format("%.2f", insert code here). This will limit the number of decimals to 2.
         */

        //Challenge:
        //How would you modify the for loop above to do the same thing as show but to
        //start from 8% and work down to 2%.
        for(int i = 8; i>1; i--){
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        /** All of this can be shortened with a for loop. Having to verify the interest rate, in this example,
         * for many more values will be very time consuming
         */
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
    }
    public static double calculateInterest (double amount, double interestRate){
        return(amount * (interestRate/100));
    }


    //Challenge:
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    //Create a for statement using any range of numbers
    //Determine if the number is a prime number using the isPrime method
    //If it is a prime number, print it out and increment a count of number of prime numbers found
    //If that count is 3, exit the for loop
    //Hint: use the break; statement to exit.
    public static void challenge(){
        int count = 0;
        for(int i = 10; i < 200; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i + " is a prime number.");
            if(count == 3){
                break;
            }
                /**First we declare an integer named count, that is equal to 0. Then we set up a loop
                 * that starts with 10 and ends at 200.
                 * Then we verify that the integer declared in the loop (i) is a prime number, using
                 * the method provided earlier.
                 * If the number is a prime number, we increment the count by 1.
                 * If the count reaches the value of 3, we break out of the loop.
                 */
            }
        }
    }
}
