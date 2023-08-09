package ch05;

public class Fruit {
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("==========상품 정보==========");
		System.out.println("상품 이름 : " + name);
		System.out.println("상품 가격 : " + price);
	}
}
