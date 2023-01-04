package day07;

public class Ezen출력 {

	public static void main(String[] args) {
//	EzenComputer ez = new EzenComputer("홍길동", 930627, 30,"010-1234-1234","인천");
//	ez.stuinfo();
//	ez.assistinfo();
//	ez.stuclsinfo("Java", 3);
//	ez.stuclsinfo("DB", 4);
	EzenComputer[] std = new EzenComputer[5];
	std[0]=new EzenComputer("강여사",931117,30,"010-1111-1111","인천");
	std[1]=new EzenComputer("이수아",201202,3,"010-2222-2222","부천");
	std[3]=new EzenComputer("이수온",931201,30,"010-3333-3333","인천");
	std[4]=new EzenComputer("이샛별",911105,32,"010-4444-4444","인천");	
	
	String searchName="이수아";
	for(int i=0; i<std.length; i++) {
		if(std[i]!=null && std[i].getName().equals(searchName)) {
			std[i].stuinfo();
			std[i].assistinfo();
		}	
	} 
	
	String searchWhere="인천";
	for(EzenComputer tmp : std) {
		if(tmp != null && tmp.getWhere().equals(searchWhere)) {
			tmp.stuinfo();
			tmp.assistinfo();
		}
	}
	
	}
	
}
