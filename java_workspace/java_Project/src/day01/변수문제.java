package day01;

public class 변수문제 {

	public static void main(String[] args) {
		//국어(kor), 영어(eng), 수학(math)
		//세 값의 합계와 평균을 구하려고 합니다.
		// 필요한 변수와 값을 넣어주세요.
		
		int kor=85, eng=85, math=70 ;
		int sum=0;
		sum = kor+eng+math;
		int count= 3;
		double avg = (double)sum/count;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// 정수 /(나누기) 정수 = 정수
		// 값 / 0 = 예외발생(infinity)
		

	}

}
