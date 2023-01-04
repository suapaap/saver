package day09;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx01 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		String curr = today.toString();
		System.out.println(curr);
		String date = curr.substring(curr.indexOf("T")+1, curr.indexOf("."));
		System.out.println(date);
		
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		ZonedDateTime newyork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyork);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				System.out.println(dtf.format(today));
	}
}
