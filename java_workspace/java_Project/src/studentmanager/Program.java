package studentmanager;

import java.util.Scanner;

public interface Program {
	
	/* program interface
	 * 학생리스트 출력
	 * 학생등록
	 * 학생검색
	 * 수강신청
	 * 수강철회
	 * */
	
	public abstract void printStudent();
	
	public abstract void insertStudent(Scanner scan);
	
	public abstract void serchStudent(Scanner scan);
	
	public abstract void registerSubject(Scanner scan);
	
	public abstract void deleteSubject(Scanner scan);
}
