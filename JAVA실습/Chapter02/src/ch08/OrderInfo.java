package ch08;

public class OrderInfo {


	public String orderNum;
	public String phoneNum;
	public String address;
	public String orderDate;
	public String orderPrice;
	public String menuNum;
	
	public OrderInfo (String orderNum,String phoneNum,String address,String orderDate,String orderPrice,String menuNum) {
		this.orderNum = orderNum;
		this.phoneNum = phoneNum;
		this.address = address;
		this.orderDate =orderDate;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
		
		System.out.println("배달 주문이 들어왔습니다.");
		System.out.println("주문 번호 : "+ orderNum);
		System.out.println("전화 번호 : "+ phoneNum);
		System.out.println("주소 : "+ address);
		System.out.println("날짜 : "+ orderDate);
		System.out.println("가격 : "+ orderPrice);
		System.out.println("메뉴 번호 : "+ menuNum);
	}
	
	
}
