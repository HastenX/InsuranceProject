package Src.AreaCodeUI;

import Src.AreaCodeTXT.*;
import Src.PlayerData;
import java.util.Scanner;

public class AirportUI extends UI {
    public AirportUI(PlayerData data) {

        AirportTXT.intro();
        try {
            if (PlayerData.seedChecker(data.seed)) {
                AirportTXT.introSinOne();

                this.ui = new Scanner(System.in);
                this.choice = this.ui.nextInt();
                this.badResponse = true;

                while (this.badResponse) {
                    switch (this.choice) {
                        case 1:
                            if (data.typeInsurance > 0) {
                                DefaultTXT.covered("cost of food");
                                this.badResponse = false;
                            } else {
                                data.money -= 250;
                                DefaultTXT.notCovered("cost of staying at hotel and cost of food", data.money);
                                this.badResponse = false;
                            }
                            break;
                        case 2:
                            if (data.typeInsurance > 0) {
                                DefaultTXT.covered("cost of staying at hotel and cost of food");
                                this.badResponse = false;
                            } else {
                                data.money -= 500;
                                DefaultTXT.notCovered("cost of staying at hotel and cost of food", data.money);
                                this.badResponse = false;
                            }
                            break;

                        default:
                            DefaultTXT.failureToEnter();
                            this.badResponse = true;
                            break;
                    }
                }
            }
        } catch (Exception Exception) {
            DefaultTXT.failureToEnter();
            this.badResponse = true;
        }
        AirportTXT.introSinOneFail();
        try {
            AirportTXT.introSinTwo();

            this.ui = new Scanner(System.in);
            this.badResponse = true;
            this.choice = this.ui.nextInt();

            while (this.badResponse) {
                switch (this.choice) {
                    case 1:
                        if (data.typeInsurance > 0) {
                            DefaultTXT.covered("cost of utilities and gas\n between reserved place and airport");
                            this.badResponse = false;
                        } else {
                            data.money -= 800;
                            DefaultTXT.notCovered("cost of utilities and gas\n between reserved place and airport",
                                    data.money);
                            this.badResponse = false;
                        }
                        break;
                    case 2:
                        if (data.typeInsurance > 0) {
                            DefaultTXT.covered("having utilities and staying at a hotel");
                            this.badResponse = false;
                        } else {
                            data.money -= 500;
                            DefaultTXT.notCovered("cost of utilities and hotel", data.money);
                            this.badResponse = false;
                        }
                        break;

                    default:
                        DefaultTXT.failureToEnter();
                        this.badResponse = true;
                        break;
                }
            }
        } catch (Exception Exception) {
            DefaultTXT.failureToEnter();
            this.badResponse = true;
        }
        System.out.println("Overall, you have " + data.money + "$ To sepend on vacation");
    }
}
