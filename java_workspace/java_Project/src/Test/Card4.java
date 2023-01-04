package Test;

public class Card4 {// 클래스 구성 

	private int num;
	private char shape;

public Card4() { //생성자 초기값 선언
	shape = '♥';
	num = 1;
}	
public void print() {
	System.out.print(shape);
	switch(num) {
	case 1 : System.out.print("A ");break;
	case 11 : System.out.print("j ");break;
	case 12 : System.out.print("Q ");break;
	case 13 : System.out.print("K ");break;
	default : System.out.print(num+" ");
	}
}

	public int getNum(int num) {
	return num;
}
	public void setNum(int num) {
	if(num<1 || num>13) {
		this.num =1;
	} else {
		this.num = num;
	}
}

	
public void setShape(char shape) {
	switch(shape) {
	case '♥' : case '◆' : case '♣' : case '♠' :
		this.shape = shape;
		break;
		default : this.shape= '♥'; 
		}
	}
public char getShape(char c) {
	return shape;
}
}