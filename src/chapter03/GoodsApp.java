/*package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		// private 접근자는 내부에서만 접근 가능
		//goods.name = "cannon";	// 에러
		goods.setName("cannon");
		//goods.price = 200000;
		goods.setPrice(-1);
		//goods.countSold = 10;
		goods.setCountSold(10);
		//goods.countStock = 100;
		goods.setCountStock(100);
		
		System.out.println(
				// private 접근자는 내부에서만 접근 가능
				//"name : " + goods.name + 	// 에러
				"name : " + goods.getName() + 
				//", price : " + goods.price + 
				", price : " + goods.getPrice() + 
				//", sountSold : " + goods.countSold + 
				", sountSold : " + goods.getCountSold() +
				//", countStock : " + goods.countStock 
				", countStock : " + goods.getCountStock()
		);
	}

}
*/