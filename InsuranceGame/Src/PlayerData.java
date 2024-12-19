package Src;

import Src.AreaCodeUI.*;

public class PlayerData extends UI {
    private static int i = 1;
    static PlayerData data = new PlayerData();

    PlayerData() {
        IntroductionUI ui = new IntroductionUI();
        this.name = ui.name;
        this.money = ui.money;
        this.typeInsurance = ui.typeInsurance;
        this.seed = ui.seed;
    }

    public static PlayerData getInstance() {
        return data;
    }

    public static boolean seedChecker(double seed) {
        i++;
        return Character.getNumericValue(String.valueOf(seed).charAt(i)) >= 6;
    }
}
