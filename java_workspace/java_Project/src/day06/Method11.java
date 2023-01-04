package day06;

public class Method11 {

	public static void main(String[] args) {
		/* 가변인자 메서드
		 * - 매개변수의 개수가 고정되어있지 않는 경우
		 * */
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6,7));
		System.out.println(sum(1,2,3,4,5,6,7,7,6,4,1,2,5,6,7,8,6,4,4));
	}
	public static int sum(int...num) { // num가 배열처럼 순서대로 입력사용됨
		int res=0;
		for(int tmp:num) {
			res+=tmp;
		}
		return res;
	}
}
