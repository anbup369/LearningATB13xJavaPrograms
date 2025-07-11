package ex_29_Wrapper_Class;
//Autoboxing and unboxing
public class Lab214_Wrapper_Conversion_Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a; // This Boxing -> automatically JVM will store the value
        // Primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue());
        System.out.println("Auto boxed b:"+b);
        System.out.println(Integer.MIN_VALUE);

        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println("unboxed v: "+v);
    }
}
