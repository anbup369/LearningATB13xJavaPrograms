package ex_28_ENUM;

//Enum usage compared with arrays
public class Lab210_ENUM {
    public static void main(String[] args) {

        //Using Array
        A test = new A();
        System.out.println(test.days[0]);

        //Using Enum
        Day today = Day.MONDAY;
        System.out.println(Day.FRIDAY);
        System.out.println(today);
        System.out.println(PROJECT_NAMES.RestAssured);
        System.out.println(PROJECT_NAMES.vwo);
        System.out.println();

        //Printing Enum
        System.out.println("Printing Values of enum 'Day'");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

    }
}

class A {
    String[] days = {"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun"};
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum PROJECT_NAMES {
    google, RestAssured, katalon, vwo
}

