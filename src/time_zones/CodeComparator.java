package time_zones;

import java.util.Comparator;

/**
 * Created by Hrant on 10.04.2017.
 */
public class CodeComparator implements Comparator<TimeZone> {
    @Override
    public int compare(TimeZone o1, TimeZone o2) {
        return o1.getCountryCode().compareTo(o2.getCountryCode());
    }

}
