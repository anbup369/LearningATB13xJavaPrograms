package ex_29_Wrapper_Class;

// Demonstrates conversion between String, primitive types, and wrapper classes
public class Lab215_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {
        // ✅ String to Wrapper Conversion
        String num = "10";
        System.out.println("String num is: " + num);

        // Converts String to Integer using parseInt (returns primitive int)
        Integer a = Integer.parseInt(num); // Autoboxes to Integer
        System.out.println("Integer a is: " + a);

        // Converts String to Integer using valueOf (returns Integer directly)
        Integer b = Integer.valueOf(num);
        System.out.println("Integer b is: " + b);

        // ✅ String to Primitive Conversion
        int aa = Integer.parseInt(num); // Returns primitive int
        System.out.println("Primitive int aa is: " + aa);

        // ✅ Wrapper to String Conversion using toString()
        String wrapperToStr = a.toString();
        System.out.println("Wrapper to String (a.toString()): " + wrapperToStr);

        // ✅ Primitive to Wrapper and then to String
        int age = 10; // primitive
        Integer age_wrapper = age; // autoboxing
        String ageStr = age_wrapper.toString(); // converts wrapper to String
        System.out.println("Primitive to String via Wrapper: " + ageStr);

        // ✅ Direct Primitive to String using String.valueOf()
        String ageStrDirect = String.valueOf(age);
        System.out.println("Direct Primitive to String using valueOf(): " + ageStrDirect);

        // ✅ Wrapper to Primitive (Unboxing)
        int unboxed = b; // automatically unboxed
        System.out.println("Wrapper to Primitive (unboxed b): " + unboxed);
    }
}