package ex_09_Switch;

public class Lab090_Interview_Invalid_Selector {
    public static void main(String[] args) {
//        switch (true) {
//            //Throws error: java: primitive patterns are a preview feature and are disabled by default.
//            // (use --enable-preview to enable primitive patterns)
//        }
    }
}

/*
"This code won’t compile because Java does not allow boolean values as the selector in a switch statement. The selector expression in a switch must be of a type supported by the switch—such as byte, short, int, char, String, enum types, or certain wrapper classes. Since true is a boolean literal, the compiler will throw an error.
If I wanted to control flow based on boolean conditions, I'd use if-else blocks instead. Or if pattern matching is the goal, I could leverage type patterns in Java 21+—but even then, switch on boolean isn't valid."

 */