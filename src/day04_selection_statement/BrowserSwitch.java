package day04_selection_statement;

public class BrowserSwitch {
    public static void main(String[] args) {
        //this is the only place to use switch in automation testing

        String browser = "chrome";

        switch(browser.toLowerCase()){ // ready method, can use ignore case due to sensitivity
            case "chrome" -> System.out.println("Open the chrome browser");
            case "firefox"-> System.out.println("Open the firefox browser");
            case "safari" -> System.out.println("Open the safari browser");

            default -> System.out.println("Invalid browser");
        }

    }
}
