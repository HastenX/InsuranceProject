package Src.AreaCodeUI;

import Src.AreaCodeTXT.DefaultTXT;
import Src.AreaCodeTXT.IntroductionTXT;
import java.util.Scanner;

public class IntroductionUI extends UI {
    public IntroductionUI() {
        this.ui = new Scanner(System.in);

        this.seed = Math.random(); // generate num 0->1
        this.money = 5000;
        this.badResponse = true;
        while (this.badResponse) {
            try {
                IntroductionTXT.preniumSelection(this.money);
                this.placeNum = this.ui.nextInt();
                switch (placeNum) {
                    case 1:
                        this.typeInsurance = 0;
                        this.badResponse = false;
                        break;
                    case 2:
                        this.typeInsurance = 1;
                        this.money -= 300;
                        this.badResponse = false;
                        break;
                    case 3:
                        this.typeInsurance = 2;
                        this.money -= 600;
                        this.badResponse = false;
                        break;
                    case 4:
                        this.typeInsurance = 3;
                        this.money -= 900;
                        this.badResponse = false;
                        break;
                    default:
                        DefaultTXT.failureToEnter();
                }
                // if (!this.badResponse) {
                // this.ui.close();
                // }
            } catch (Exception Exception) {
                DefaultTXT.failureToEnter();
            }
        }
    }
}
