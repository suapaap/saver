package day01;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력.
		 * 평균이 80이상이면 합격, 아니면 불합격
		 * */
		
		int kor=85; 
		int eng=78;
		int math=77;
		int sum=0;
		sum = kor+eng+math;
		System.out.println("합계 :"+sum);
		int count=3;
		int avg = sum/count;
		System.out.println("평균 :"+avg);
	if (avg >= 80) { System.out.println("합격"); }
	else {System.out.println("불합격"); }
	}

}
