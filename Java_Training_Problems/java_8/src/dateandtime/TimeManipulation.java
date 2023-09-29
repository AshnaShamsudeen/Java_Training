package dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TimeManipulation{

	public static void main(String[] args) {
		//get the current system date
		LocalTime today =LocalTime.now();
		System.out.println(today);
		//create a new date
		LocalTime time1=LocalTime.of(3, 32,54 );
		System.out.println(time1);
		//create a date from string
		String str="03:15:10";
		LocalTime time2=LocalTime.parse(str);
		System.out.println(time2);
		//to get month,year and day from a date
		
		//to get month in words
		int hour=today.getHour();
		int minutes=today.getMinute();
		int seconds =today.getSecond();
		System.out.println(hour);
		System.out.println(minutes);
		System.out.println(seconds);
		
//		//comparing 2 dates
//		//find out which date value after the other
//		boolean check=date1.isAfter(date2);
//		System.out.println(check);
//		boolean check2=date1.isBefore(date2);
//		System.out.println(check2);
//		//to convert the format
//		String dateStr="03-05-2023";
//		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		LocalDate date3=LocalDate.parse(dateStr,format);
//		System.out.println(date3.format(format));
//		System.out.println(date3.format(format1));

}}
