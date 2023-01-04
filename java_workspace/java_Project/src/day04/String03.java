package day04;

public class String03 {

	public static void main(String[] args) {
		/* 이메일에서 ID를 추출
		 * 
		 * */
		String email = "123455456@gmail.com";
		String id = email.substring(email.indexOf('@'));
		System.out.println(id);
		
		String[] strArr = email.split("@"); 
		System.out.println(strArr[0]);
		
		System.out.println();
		System.out.println("======");
		
		String fileName = "String메서드gyjgjg.jpg";
		String[] strArr1 = fileName.split("[.]");
		System.out.println("내 파일이름은 " + strArr1[0]);
		System.out.println("확장자 명은 " + strArr1[1]);
		
		System.out.println();
		System.out.println("======");
		
//		String file= fileName.substring(fileName.indexOf(0, ('.')));
//		System.out.println(file);
		
		String file= fileName.substring(0,fileName.indexOf("."));
		System.out.println(file);
		
		
	}

}
