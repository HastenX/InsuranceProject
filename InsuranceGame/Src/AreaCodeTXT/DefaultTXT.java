package Src.AreaCodeTXT;

public class DefaultTXT {
    protected double money;

    public static void enterName() {
        System.out.println("Enter your name:");

    }

    public static void failureToEnter() {
        System.out.println("Enter a Number listed");

    }

    public static void covered(String what) {
        System.out.println("Your insurance covered the cost of " + what + "\nYour Trip Balance is unchanged");

    }

    public static void notCovered(String what, double money) {
        System.out.println("You paid the cost of " + what + "\nYour Trip Balance is " + money + "$");

    }
}
