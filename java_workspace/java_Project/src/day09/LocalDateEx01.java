package day09;

import java.time.LocalDate;

public class LocalDateEx01 {

	public static void main(String[] args) {
		/* java1.8 이전 버전에는 Date =>deparecated 사용
		 * java1.8 이후 버전에는 Calendar, LocalDate, LocalTime, LocalDateTime 사용을 권장
		 * */
		LocalDate today = LocalDate.now();
		LocalDate date = LocalDate.of(2020, 12, 02);
		System.out.println(date);
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.minusYears(3L));
		System.out.println(today.plusDays(5L));
		
	}

}
