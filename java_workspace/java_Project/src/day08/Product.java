package day08;

public class Product {
	/* 상품을 등록하고, 등록된 상품을 출력하는 코드를 완성하시오
	 * 상품명(name), 가격(price)
	 * 등록 : 생성자로 객체생성시 바로 등록.
	 * 출력 : print(), toString
	 * getter/setter
	 * */
	 private String name;
	 private int price;
	 
//	@Override
//	public String toString() {
//		return "Product [이름 :" + name + ", 가격 :" + price + "]";
//	}
	 public void print() {
		 System.out.println("이 상품의 이름은 : "+name );
		 System.out.println("가격 :" + price); 
	 }
	 

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Product() {}
	 
	 public Product (String name , int price){
	 this.name=name; this.price=price;}



}
