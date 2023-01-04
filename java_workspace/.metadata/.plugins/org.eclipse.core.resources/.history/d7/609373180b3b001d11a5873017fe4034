package day09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx01 {

	public static void main(String[] args) throws ParseException {
		/* 날짜를 문자열로 format 설정
		 * */
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		String dateString = sf.format(date);
		System.out.println(dateString);
		
		// 문자열을 날짜로 변경방법
		String dateString2 = "2020-12-02 13:53:45";
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2 = sf2.parse(dateString2);
		System.out.println(date2);
		
	}

}
