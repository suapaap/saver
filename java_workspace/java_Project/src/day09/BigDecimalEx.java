package day09;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {
		//BigDecimal: 값을 초기화하기 위해서 문자열로 값을 넘겨줘야 
		BigDecimal bd = new BigDecimal("1000");
		BigDecimal bd2 = new BigDecimal("1000");
		//System.out.println(bd);
		
		//사칙연산을 이용하여 연산이 불가능.
		// + : add , - : subtract , * : multiply , / :divide , % :remainder
		System.out.println("+ > "+  bd.add(bd2));
		System.out.println("- > "+ bd.subtract(bd2));
		System.out.println("* > "+ bd.multiply(bd2));
		System.out.println("/ > "+ bd.divide(bd2));
		System.out.println("% > "+ bd.remainder(bd2));
		
		//비교를 나타낼 때 compareTo 
		System.out.println(bd.compareTo(bd2));
		
		BigInteger bi = new BigInteger("123456789");
		System.out.println(bi);
		
		//BigInteger 형변환
		// int -> BigInteger
		BigInteger bi2 = BigInteger.valueOf(020611121727); // 일반숫자
		System.out.println(bi2);
		
		int int_bigNum = bi2.intValue();
		System.out.println(int_bigNum);
		long long_bignum = bi2.longValue();
		String string_bigstr = bi2.toString();
		System.out.println(string_bigstr);
	}

}
