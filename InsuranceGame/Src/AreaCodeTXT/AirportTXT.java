package Src.AreaCodeTXT;

public class AirportTXT extends DefaultTXT {
    public static void intro() {
        System.out.println("It's the next day and you've arrived at the airport--");
    }

    public static void introSinOne() {
        System.out.println("""
                and a Winter storm west delays your trip by 2 days; what do you do?
                1) Sleep and eat in the airport for 2 days
                2) Find a nearby Hotel""");
    }

    public static void introSinOneFail() {
        System.out.println("""
                and the skies were clear, and had no struggle arriving to the West Coast.""");
    }

    public static void introSinTwo() {
        System.out.println("""
                Oh no, your bags got delayed by a day! Your staying far from the airport; what
                should you do?
                1) Bite the bullet and leave airport, and come back when your stuff arrives
                2) Wait it out at a hotel""");
    }
}