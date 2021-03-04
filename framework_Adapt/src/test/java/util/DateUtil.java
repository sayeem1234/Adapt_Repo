package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {

    public static List<String> createTimeLine(int incrementBy, int futureHours) {
        List<String> timeline = new ArrayList<>();
        timeline.add("Now");
        SimpleDateFormat format = new SimpleDateFormat("ha");
        Calendar cl = Calendar.getInstance();
        for (int i = 0; i < futureHours; i++) {
            cl.add(Calendar.HOUR_OF_DAY, incrementBy);
            Date date = cl.getTime();
            String TimeAfterTwoHours = format.format(date).toLowerCase();
            timeline.add(TimeAfterTwoHours);
        }
        return timeline;
    }

}
