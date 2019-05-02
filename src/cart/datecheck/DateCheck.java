package cart.datecheck;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * This is the class to check date of promotion whether correct.
 *
 * @author From internet
 * created on Dec 10, 2018
 */
public class DateCheck {
	public static boolean isEffectiveDate(String beginDate, String endDate) throws ParseException {
    	String format = "yyyy-MM-dd";
    	Date nowTime= new Date(); 
    	Date startTime = new SimpleDateFormat(format).parse(beginDate); 
    	Date endTime = new SimpleDateFormat(format).parse(endDate);
    	
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
}
