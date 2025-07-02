package ex_15_StringBuffer_Builder_StringFunctions;
//.append(123): Appends the integer 123 to the end of the current string.
// Since StringBuilder handles type conversion internally, 123 is converted to "123" automatically.
public class Lab146_String_Buffer_Type_Conversion_null {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer("Pramod");
        stringbuffer.append(123);
        stringbuffer.append((String) null);
        System.out.println(stringbuffer);



    }
}
