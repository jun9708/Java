package sub6;

import java.util.Scanner;

public class CRUDTest {
public static void main(String[] args) {
	System.out.println("회원관리 매니저");
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("===========================================================");
		System.out.println("| 종료 : 0 | 입력 : 1 | 조회 : 2 | 검색 : 3 | 수정 : 4 | 삭제 : 5 |");
		System.out.println("===========================================================");
		System.out.println("선택 > ");
		int answer = sc.nextInt();
		UserDAO dao = UserDAO.getInstance();
		
		if(answer == 0) {
			break;
		}else if(answer == 1) {
			//입력
			UserDTO dto = new UserDTO();
			System.out.println("아이디 입력 :");
			dto.setUid(sc.next());
			
			System.out.println("이름 입력 : ");
			dto.setName(sc.next());
			
			System.out.println("생년월일 입력 : ");
			dto.setBirth(sc.next());
			
			System.out.println("주소 입력 : ");
			dto.setAddr(sc.next());
			
			dao.insertUsers(dto);
			System.out.println("등록완료");
		}
		
	}
}
}
