package TASK.IF_ELSE_CONDITION;
/*
Task 23th June 2025 (Basic If-Else) 1-7
Task 24th June 2025(if else programs)- 8-10

 */
public class Task_1_10 {

    // 1. Check if a Number is Positive or Negative
    public static void checkPositiveNegative(int number) {
        if (number > 0) {
            System.out.println("1. [Positive Check] " + number + " is a positive number.");
        } else if (number < 0) {
            System.out.println("1. [Positive Check] " + number + " is a negative number.");
        } else {
            System.out.println("1. [Positive Check] The number is zero.");
        }
    }

    // 2. Check if a Number is Even or Odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("2. [Even/Odd Check] " + number + " is even.");
        } else {
            System.out.println("2. [Even/Odd Check] " + number + " is odd.");
        }
    }

    // 3. Find the Maximum of Two Numbers
    public static void findMaximum(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println("3. [Maximum Finder] Maximum between " + a + " and " + b + " is: " + max);
    }

    // 4. Check if a Character is a Vowel or Consonant
    public static void checkVowelConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("4. [Vowel Check] '" + ch + "' is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println("4. [Vowel Check] '" + ch + "' is a consonant.");
        } else {
            System.out.println("4. [Vowel Check] '" + ch + "' is not an alphabet character.");
        }
    }

    // 5. Check if a Person is Eligible to Vote
    public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("5. [Voting Eligibility] Age " + age + ": Eligible to vote.");
        } else {
            System.out.println("5. [Voting Eligibility] Age " + age + ": Not eligible to vote.");
        }
    }

    // 6. Find the Smallest of Two Numbers
    public static void findMinimum(int a, int b) {
        int min = (a < b) ? a : b;
        System.out.println("6. [Minimum Finder] Minimum between " + a + " and " + b + " is: " + min);
    }

    // 7. Find the Largest of Three Numbers
    public static void findLargestOfThree(int a, int b, int c) {
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("7. [Largest of Three] Largest among " + a + ", " + b + ", and " + c + " is: " + largest);
    }

    // 8. Find the Smallest of Three Numbers
    public static void findSmallestOfThree(int a, int b, int c) {
        int smallest;
        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }
        System.out.println("8. [Smallest of Three] Smallest among " + a + ", " + b + ", and " + c + " is: " + smallest);
    }

    // 9. Find the Largest of Two Numbers
    public static void findLargestOfTwo(int x, int y) {
        int largest;
        if (x >= y) {
            largest = x;
        } else {
            largest = y;
        }
        System.out.println("9. [Largest of Two] Largest between " + x + " and " + y + " is: " + largest);
    }

    // 10. Check if a Year is a Leap Year
    public static void checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("10. [Leap Year Check] " + year + " is a leap year.");
                } else {
                    System.out.println("10. [Leap Year Check] " + year + " is not a leap year.");
                }
            } else {
                System.out.println("10. [Leap Year Check] " + year + " is a leap year.");
            }
        } else {
            System.out.println("10. [Leap Year Check] " + year + " is not a leap year.");
        }
    }

    // Main method to run all checks
    public static void main(String[] args) {
        checkPositiveNegative(-10);
        checkEvenOdd(7);
        findMaximum(34, 78);
        checkVowelConsonant('e');
        checkVotingEligibility(17);
        findMinimum(5, 3);
        findLargestOfThree(45, 12, 78);
        findSmallestOfThree(8, 3, 5);
        findLargestOfTwo(66, 99);
        checkLeapYear(2024);
    }
}