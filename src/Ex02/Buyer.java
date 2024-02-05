package Ex02;

public class Buyer {
	int money = 1000; 
	Product[] cart = new Product[3];  //구입한 제품을 저장하기 위한 배열
	int i = 0; // Product 배열 cart에 사용될 index
	
	void buy(Product p) {

		if (money<p.price) { //가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드 종료
			System.out.println(p + "을/를 사기에는 잔액이 부족합니다.");
			return;
		}
		money -= p.price;   // 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
		
		add(p) ; 		 // 장바구니에 구입한 물건 담기 add메서드 호출
	}
	
	void add (Product p) {

	
		 
		if (i>=cart.length) {			// i의 값이 장바구니의 크기보다 같거나 크면
			Product[] temp = new Product[2*cart.length]; //	 기존의 장바구니보다 2배 큰 새로운 배열 생성
			for (int i = 0; i<cart.length; i++)
				temp[i] = cart[i]; // 새로운 장바구니와 기존의 장바구니 교체
				cart = temp; 		 				// 기존의 장바구니의 내용을 새로운 배열에 복사
		}
		cart[i++] = p;   // 물건을 장바구니cart에 저장, 그리고 i 의 값을 1 증가
	}
	
	void summary() {
		String itemList = "";
		int sum = 0;
		for(i = 0; i<cart.length; i++) {
			itemList += cart[i] + ", ";
			sum += cart[i].price; //장바구니 모든 금액 더해서 출력
		}
		System.out.println("장바구니에 담긴 물건의 물건은은" + itemList + "입니다.");
		System.out.println("장바구니에 담긴 물건의 총 금액은" + sum + "원 입니다.");
		System.out.println("현재 남은 잔액은" + money + "원 입니다."); // 물건을 사고 남은 금액 money 출력
	}
}
