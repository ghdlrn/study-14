package PolyArgumentTest2;

public class Tv extends Product {
	Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}
	//Object클래스의 toString을 오버라이딩한다.
	public String toString() {return "Tv";}
}
