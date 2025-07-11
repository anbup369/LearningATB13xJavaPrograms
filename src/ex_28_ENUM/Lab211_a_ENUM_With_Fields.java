package ex_28_ENUM;

//Enum with fields and methods
public class Lab211_a_ENUM_With_Fields {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());

        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.google.getUrl());


    }
}

