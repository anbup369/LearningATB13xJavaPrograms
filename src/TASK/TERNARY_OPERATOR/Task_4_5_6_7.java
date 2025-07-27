package TASK.TERNARY_OPERATOR;
/*
2. TYPECASTING PROGRAMS

🔹Program 4: Implicit Typecasting (Widening)

                    Description: Convert int A =100 to double.

🔹 Program 5: Explicit Typecasting (Narrowing)

                  Description: Casts a double to an int, cutting off decimals value.

🔹 Program 6: Character to ASCII

                    Description: Typecasts a character to its ASCII integer value. Example Print A ASCII Int value.

🔹 Program 7: Typecasting in Division

                     Description: int a = 10, int b = 3; now divide 10/3 and store the decimal value in the Result variable and print it.
 */
public class Task_4_5_6_7 {
    public static void main(String[] args) {
        //Program 4: Implicit Typecasting (Widening)
        int A = 100;
        double B = A;
        System.out.printf("\nPrinting A:%d and B:%.2f ",A,B);

        //Program 5: Explicit Typecasting (Narrowing)
        double C = 100.75;
        int D =(int)C;
        System.out.printf("\nPrinting C:%.2f and D:%d",C,D);
        //Program 6: Character to ASCII
        char E = 'A';
        int F = (int)E;
        System.out.printf("\nPrinting E:%c and F:%d",E,F);
        //Program 7: Typecasting in Division
        int a = 10;
        int b=3;
        float Result = (float) 10 /3;
        System.out.printf("\nPrinting Division of a:%d and b:%d :Result:%.2f",a,b,Result);
    }
}
