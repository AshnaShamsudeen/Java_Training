package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTimeManipulation {

	public static void main(String[] args) {
		//get the current system date
		LocalDate today =LocalDate.now();
		System.out.println(today);
		//create a new date
		LocalDate date1=LocalDate.of(2020, 4, 5);
		System.out.println(date1);
		//create a date from string
		String str="2019-10-15";
		LocalDate date2=LocalDate.parse(str);
		System.out.println(date2);
		//to get month,year and day from a date
		
		//to get month in words
		Month month=today.getMonth();
		//get month in number
		int monthNum=today.getMonthValue();
		int year=today.getYear();
		int day =today.getDayOfMonth();
		System.out.println(month);
		System.out.println(year);
		System.out.println(day);
		System.out.println(monthNum);
		//comparing 2 dates
		//find out which date value after the other
		boolean check=date1.isAfter(date2);
		System.out.println(check);
		boolean check2=date1.isBefore(date2);
		System.out.println(check2);
		//to convert the format
		String dateStr="03-05-2023";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date3=LocalDate.parse(dateStr,format);
		System.out.println(date3.format(format));
		System.out.println(date3.format(format1));

	}

}
