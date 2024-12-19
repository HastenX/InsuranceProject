package Src;

import Src.AreaCodeUI.AirportUI;
public class Main{
    public static void main(String[] args) {
        //Embeded Introduction UI is in .getInstance
        PlayerData data = PlayerData.getInstance();

        //Calls first area in game after introduction
        AirportUI ZoneI = new AirportUI(data);

    }
}