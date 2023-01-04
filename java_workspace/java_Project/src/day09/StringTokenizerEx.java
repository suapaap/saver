package day09;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String str = "100,200,300,400,500";
		//StringTokenizer(문자열, 구분자, true/false); 
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
		}
		
		String[] num = str.split(",");
		for(String tmp:num) {
			System.out.println(tmp+" ");
		}
		
		String exp = "x=100*(10-a)/3*2";
		StringTokenizer st2= new StringTokenizer(exp,"x=*(-)/",false);
		while(st2.hasMoreTokens()) {
			System.out.print(st2.nextToken()+" ");
			
//		String[] num1 = exp.split("x|=|(|-|)|/");
//		for(String num1)
		}
	}
}