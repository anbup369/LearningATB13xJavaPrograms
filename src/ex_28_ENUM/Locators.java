package ex_28_ENUM;

//Fields to Enums
public enum Locators {
    page_input_email("#login-username"),
    page_input_password("#login-password"),
    page_button("#btn");

    private final String locators;

    Locators(String locators) {
        this.locators = locators;
    }

    String getLocators() {
        return this.locators;
    }

}
