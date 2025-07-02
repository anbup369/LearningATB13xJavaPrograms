package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_String_Builder_Type_Conversion_null {
    public static void main(String[] args) {
        StringBuilder stringbuilder = new StringBuilder("Pramod");
        stringbuilder.append(123);
        stringbuilder.append((String) null);

        System.out.println(stringbuilder);
    }
}
