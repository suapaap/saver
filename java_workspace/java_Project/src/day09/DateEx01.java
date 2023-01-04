package day09;

import java.util.Calendar;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
//		Date d = new Date(); // depercated : 비권장
//		d.getDate();
//		System.out.println(d);
		
		/* Calendar 클래스는 추상 클래스
		 * 따라서 직접 객체를 생성할 수 없다.
		 * new 연산자를 이용한 객체 구현이 안됨
		 * getInstance() 를 이용하여 구현한 클래스를 통해 인스턴스를 얻어 옴
		 * */
		Calendar now = Calendar.getInstance();		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // 0월부터 시작
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String s = "";
			switch(week) {
			case 1: s =("일요일"); break;
			case 2: s =("월요일"); break;
			case 3: s =("화요일"); break;
			case 4: s =("수요일"); break;
			case 5: s =("목요일"); break;
			case 6: s =("금요일"); break;
			case 7: s =("토요일"); break;
			default : System.out.println("잘못된 값입니다.");
			
			}  
		
		System.out.print(year+"-"+month+"-"+day+"-"+s);
		System.out.println();
//		System.out.println(week); // 일요일부터 표기됨 (요일)
		
		
		int ap = now.get(Calendar.AM_PM);
		String ampm = "";
		switch(ap) {
		case 0: ampm=("오전"); break;
		case 1: ampm=("오후"); break;
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int time = now.get(Calendar.SECOND);
		System.out.println(ampm+" "+hour+":"+minute+":"+time);	
	}
}