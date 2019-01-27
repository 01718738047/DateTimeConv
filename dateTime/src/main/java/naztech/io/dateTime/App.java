package naztech.io.dateTime;

/**
 * Hello world!
 *
 */
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class App {

	public static  LocalDate date_conv_localdate(Date date) { 
		
         final ZoneId systemDefault = ZoneId.systemDefault();
		LocalDate lt=date.toInstant().atZone(systemDefault).toLocalDate();
		return lt;
	}
	
	public static ZonedDateTime date_conv_ZonedDateTime(Date date) { 

		return ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}
	

	
public static LocalDateTime date_conv_Localdatetime(Date date) {

	return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
}

public static LocalDate calender_conv_localdate(Calendar c) { 
	
	Instant ins = c.getTime().toInstant();
	LocalDate date = ins.atZone(ZoneId.systemDefault()).toLocalDate();
	return date;

}

public static LocalTime Localdatetime_conv_Localtime(Date date) {

	return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalTime();
}
public static ZoneOffset Localdatetime_conv_zoneOffSet(LocalDateTime ldt) {

	return ZoneId.systemDefault().getRules().getOffset(ldt);
}

public static OffsetDateTime zoneOffSet_conv_OffsetDateTime(ZoneOffset zno) { 

	return OffsetDateTime.now(zno);
}


public static OffsetTime zoneOffSet_conv_OffsetTime(ZoneOffset zoneOffSet) { 

	return  OffsetTime.now(zoneOffSet);
}
}
