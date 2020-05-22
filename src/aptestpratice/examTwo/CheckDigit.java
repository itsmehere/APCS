package aptestpratice.examTwo;

public class CheckDigit {
    /** Returns the check digit for num
     * Precondition: The number of digits in num is between one and
     six, inclusive.
     * num >= 0
     */
    public static int getCheck(int num) {
        /* implementation not shown */

        // For the sake of no errors.
        return 0;
    }

    /** Returns true if numWithCheckDigit is valid, or false
     otherwise,
     * as described in part (a)
     * Precondition: The number of digits in numWithCheckDigit
     is
     * between two and seven, inclusive.
     * numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit){
        return getCheck(numWithCheckDigit / 10) == (numWithCheckDigit % 10);
    }
    // There may be variables and methods not shown.
}
