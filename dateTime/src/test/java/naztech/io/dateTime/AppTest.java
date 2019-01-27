package naztech.io.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import naztech.io.dateTime.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	
	public void testCompareTo() {
		App dt = new App();
		Date date = new Date(2019, 0, 17,4,4,2);
		
		
		//Date to localdate
		
		LocalDate lt = dt.date_conv_localdate(date);
		LocalDate lt2 = LocalDate.of(2019, Month.JANUARY, 17);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
		String formattedString = lt.format(formatter);
		String formattedString2 = lt2.format(formatter);

		assertEquals(formattedString2, formattedString);
		
		
		
		
		
		//date_to_ZonedDateTime
		ZonedDateTime zn=dt.date_conv_ZonedDateTime(date);
		ZonedDateTime zn2=ZonedDateTime.of(2019, 1, 17, 3, 38, 4, 1, ZoneId.systemDefault());
		
		String formattedString3 = zn.format(formatter);
		String formattedString4 = zn2.format(formatter);
		assertEquals(formattedString4, formattedString3);
		
		
		
		
		
		//LocalDate calender_to_localdate()
		
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 17, 03, 45, 20);
		LocalDate lt3 = dt.calender_conv_localdate(c);
		String formattedString5 = lt3.format(formatter);
		LocalDate lt4 = LocalDate.of(2019, Month.JANUARY, 17);
		String formattedString6 = lt4.format(formatter);
		
		assertEquals(formattedString6, formattedString5);
		
		//LocalDate date_to_Localdatetime()
		LocalDateTime ltd=dt.date_conv_Localdatetime(date) ;
		String formattedString7 = ltd.format(formatter);
		LocalDateTime ltd2=LocalDateTime.of(2019, Month.JANUARY, 17, 3, 54);
		String formattedString8 = ltd2.format(formatter);
		//System.out.println(formattedString7);
		//System.out.println(formattedString8);
		assertEquals(formattedString8, formattedString7);
	
		//Localdatetime_to_Localtime()
		
		LocalTime lt11=dt.Localdatetime_conv_Localtime(date);
		LocalTime lt12=LocalTime.of(4, 4);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm");
		String formattedString9=lt11.format(formatter2);
		String formattedString10=lt12.format(formatter2);
		assertEquals(formattedString10, formattedString9);
	
		
		//Localdatetime_to_zoneOffSet()
		LocalDateTime ldt=LocalDateTime.of(2019, Month.JANUARY, 17, 3,54);
		ZoneOffset zot=dt.Localdatetime_conv_zoneOffSet(ldt);
		ZoneOffset zot2=ZoneOffset.of("+06:00");
		assertEquals(zot2, zot);
		
		
		//zoneOffSet_to_OffsetDateTime()
	    OffsetDateTime off =OffsetDateTime.now();
		ZoneOffset znn=ZoneOffset.of("+06:00");
		OffsetDateTime off2=dt.zoneOffSet_conv_OffsetDateTime(znn);
		//System.out.println(off);
		//System.out.println(off2);
		assertEquals(off2.format(formatter), off.format(formatter));
		
		
		//zoneoffset to offsettime
		
		ZoneOffset zoneOffSet = ZoneOffset.of("+06:00");
		OffsetTime time=dt.zoneOffSet_conv_OffsetTime(zoneOffSet);
		OffsetTime off77=OffsetTime.of(17, 7, 46, 936,ZoneOffset.UTC);
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("hh");
		assertEquals(time.format(formatter3),off77.format(formatter3));
              
		
	}

}