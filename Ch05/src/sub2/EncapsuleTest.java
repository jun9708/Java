package sub2;
/*
 *	날짜 : 2024.01.02
 *	이름 : 김준형
 *	내용 : Java 클래스 실습하기
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		//객체생성
		Car sonata = new Car("소나타", "흰색", 10);
		
		//캡슐화된 속성에 대한 초기화는 생성자에서 수행
		//sonata.name = "소나타"; //취약코드 -> 캡슐화
		//sonata.color = "흰색";
		//sonata.speed = 10;

		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// 캡슐화된 속성에 대한 수정을 위해 Setter 호출
		sonata.setColor("흰색");
		sonata.show();
		
		//Account 객체 생성 및 초기화
		Account kb = new Account("123-10-1001","김유신",10000);
		//kb.bank = "123-10-1001";
		//kb.name = "김유신";
		//kb.balance = 10000;
		
		kb.desposite(80000);
		kb.withdraw(7000);
		kb.show();
		
		
	}
}
