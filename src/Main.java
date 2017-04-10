import time_zones.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Hrant on 10.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        TimeZones timeZones = new TimeZones();
        ArrayList<TimeZone> timeZoneList = timeZones.getZoneArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.print("please input sorting type (1-Country Code, 2-Time Zone): ");
        String sortType = scanner.nextLine();
        int sortTypeInt = Integer.parseInt(sortType);
        switch (sortTypeInt) {
            case 1:
                Collections.sort(timeZoneList, new CodeComparator());
                printCodeFirst(timeZoneList);
                break;
            case 2:
                Collections.sort(timeZoneList, new TimeZoneComparator());
                printTimeZoneFirst(timeZoneList);
                break;
        }

    }

    public static void printCodeFirst(ArrayList<TimeZone> timeZoneList){
        for(TimeZone timeZone : timeZoneList)
            System.out.println(timeZone);
    }

    public static void printTimeZoneFirst(ArrayList<TimeZone> timeZoneList){
        for(TimeZone timeZone : timeZoneList)
            System.out.println(String.format("%d, %s, %s", timeZone.getId(), timeZone.getTimeZoneName(), timeZone.getCountryCode()));
    }


}
