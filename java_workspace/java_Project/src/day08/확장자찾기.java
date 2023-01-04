package day08;

import java.util.Scanner;

public class 확장자찾기 {

	public static void main(String[] args) {
		/* 5개 문자열 배열을 생선한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일명 중 이미지 파일을 검색하여 출력하는 코드를 작성
		 * 이미지 형식 파일 (jpg,png,gif,jpeg)
		 * */
		Scanner scan = new Scanner(System.in);
		String file[] = new String[5];
		String serch[] = new String[]{"jpg","jpeg","png","gif"};
		int cnt =0;
		int menu ;
		
			System.out.println("파일명을 5개 등록해주세요");
			for(int i=0; i<file.length; i++) {
				file[i]=scan.next();
			}
			
			if(isContain(file, serch));{
			System.out.println("찾으신 확장자 파일은"); 
			}
			
			printCon(file, serch);
			
					
	}
	/* 기능 : 배열에서 찾는 문자열이 있는지 없는지 확인해서 알려주는 메서드
	 * 매개변수 : 배열, 찾는 값
	 * 리턴타입 : boolean 
	 * 메서드명 : isContain 
	 */

	public static boolean isContain(String file[], String name[]) {
		int cnt =0;
		for (int i=0; i<file.length; i++) {
			for(int j=0; j<name.length; j++) {
			if (file[i].contains(name[j])) {
				cnt++;
				}
			}
		}
		if (cnt==0) {
			return false;
		}else {
		return true;
		}
	}
	
	public static void printCon(String file[], String name[]) {
		for (int i=0; i<file.length; i++) {
			for(int j=0; j<name.length; j++) {
			if (file[i].contains(name[j])) {
				System.out.println(file[i]);
			}
			else {
				System.out.println("찾는 값이 없습니다.");
			}
			}
		}
	}
}