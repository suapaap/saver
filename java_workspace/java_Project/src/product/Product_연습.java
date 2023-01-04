package product;

public class Product_연습 {
	private String menu;
	private int price;

	public Product_연습() {}		
	public Product_연습(String menu, Integer price) {
		this.menu = menu;
		this.price = price;
	}
	
		@Override
		public String toString() {
			return menu + " " + price ;
		}
		public String getMenu() {
			return menu;
		}
		public void setMenu(String menu) {
			this.menu = menu;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
}
