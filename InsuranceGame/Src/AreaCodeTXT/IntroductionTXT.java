package Src.AreaCodeTXT;

public class IntroductionTXT extends DefaultTXT {

    public static void balance(double money) {
        System.out.println("Balance: " + money + "$");

    }

    public static void preniumSelection(double money) {
        balance(money);
        System.out.println(
                """
                        (Note: in real life, most travel insurance would cover all of these frontiers,
                            this is for dramatic re-anactement)
                        Your trip to the west-coast is tommorrow during winter break, please pick a cost %:
                                1 : None
                                2 : 6% cost (300$)- includes Trip delay coverage and Emergency transit to hospitals
                                3 : 12% cost (600$) - 6% perks, but also includes trip cancelation, sickness and damaged bagage
                                4 : 18% cost (900$) - 12% perks, but also inludes Rental car damage""");
    }
}