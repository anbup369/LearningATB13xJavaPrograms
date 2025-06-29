package ex_04_Operators;

    public class Lab038_Unary_Operator {
        public static void main(String[] args) {
            // Positive and Negative unary
            int a = +10;   //        int a = 10; optional
            int a1 = -110;
            System.out.println("a: " + a);
            System.out.println("a1: " + a1);

            // Increment operator
            int x = 5;
            System.out.println("x (before): " + x);
            System.out.println("++x: " + (++x)); // Pre-increment
            System.out.println("x++: " + (x++)); // Post-increment
            System.out.println("x (after): " + x);

            // Decrement operator
            int y = 5;
            System.out.println("y (before): " + y);
            System.out.println("--y: " + (--y)); // Pre-decrement
            System.out.println("y--: " + (y--)); // Post-decrement
            System.out.println("y (after): " + y);

            // Logical complement
            boolean flag = true;
            System.out.println("flag: " + flag);
            System.out.println("!flag: " + !flag);

            // Bitwise complement --> ~n ==(n+1)
            int num = 7;  // in 32 bit binary format: 00000000 00000000 00000000 00000111
            System.out.println("num: " + num); //
            System.out.println("~num: " + ~num); // Flips all bits: 00000000 00000000 00000000 00000111 -> 11111111 11111111 11111111 11111000 (which is -8)        }
        }
    }

