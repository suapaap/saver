package day03;

public class 주사위 {

	public static void main(String[] args) {
		int count = 0;// 이동회수
		int goal = 0;// 이동거리
		int num = 30;
		
		while(goal<num) {
			int dice = (int)(Math.random()*6)+1;
		System.out.println("주사위"+dice+" 나왔습니다.");
		goal= dice+goal;
		
		System.out.println("남은 칸 "+ (num-goal));
		
		count++;		
		System.out.println(count+"번 던지셨습니다.");
		System.out.println();
		
		
		
		} {System.out.println("도착!!");
		}
		

		
		int random; //주사위 값
		int sum=0; //전진 칸 수
		int count1=0; // 이동횟수
		int last= 30; // 목표값
		
		while(sum < last) {
			random = (int)(Math.random()*6)+1;
			sum = sum+random; 
			count1++;
			System.out.println("주사위 숫자 : "+random+","+sum+"전진!");
			System.out.println((last-sum)+"칸 남았습니다.");
		}
		System.out.println("도착 ~!! 총 이동 횟수" + count1);
//		
		
	}

}
