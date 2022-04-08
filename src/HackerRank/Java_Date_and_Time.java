package HackerRank;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Java_Date_and_Time {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2022);
        calendar.set(Calendar.DAY_OF_MONTH,8);
        calendar.set(Calendar.MONTH,4-1);

        String[] date_= {"SUNDAY", "MONDAY","TUESDAY", "WEDNESDAY","THURSDAY","FRIDAY", "SATURDAY" };
        System.out.println(date_[calendar.get(Calendar.DAY_OF_WEEK)-1]);

    }

}
