package com.myshop;

import java.util.List;
import java.util.Scanner;

import com.myshop.dao.CustomerDAO;
import com.myshop.dao.OrderDAO;
import com.myshop.dao.ProductDAO;
import com.myshop.dto.CustomerDTO;
import com.myshop.dto.OrderDTO;
import com.myshop.dto.ProductDTO;

public class MyShopMain {
	public static void main(String[] args) {
		System.out.println("쇼핑몰에 오신것을 환영합니다");

		CustomerDAO customerDAO = CustomerDAO.getInstance();
		ProductDAO  productDAO  = ProductDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();

		CustomerDTO loginedCustomer = null;


		Scanner sc = new Scanner(System.in);

		while(true) {

			if(loginedCustomer == null) {
				System.out.println("-----------------------------------------------------------");
				System.out.println("| 종료 : 0 | 로그인 : 1 | 회원가입 : 2 | 상품목록 : 3 | 주문하기 : 4 |");
				System.out.println("-----------------------------------------------------------");
			}else {
				System.out.println("-----------------------------------------------------------");
				System.out.println("| 종료 : 0 | 로그아웃 : 1 | 주문현황 : 2 | 상품목록 : 3 | 주문하기 : 4 |");
				System.out.println("-----------------------------------------------------------");
			}

			System.out.println("선택 : ");
			int answer = sc.nextInt();

			if(answer == 0) {
				break;


			}else if(answer == 1) {
				if(loginedCustomer == null) {
					//로그인
					System.out.println("아이디 입력 : ");
					String custId = sc.next();

					loginedCustomer = customerDAO.selectCustomer(custId);

					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getCustName() + "님 어서오세요");
					}else {
						System.out.println(custId+"와 일치하는 회원이 없습니다");
						loginedCustomer = null;
					}
				}
				else {
					//로그아웃
					System.out.println(loginedCustomer.getCustName()+"님 안녕히 가세요.");
					loginedCustomer = null;
				}
			}
			else if (answer == 2) {
				if(loginedCustomer == null) {
					CustomerDTO customer = new CustomerDTO();

					System.out.println("아이디 입력");
					customer.setCustId(sc.next());

					System.out.println("이름 입력");
					customer.setCustName(sc.next());

					System.out.println("휴대폰 입력");
					customer.setCustHp(sc.next());

					System.out.println("주소 입력");
					customer.setCustAddr(sc.next());

					customerDAO.insertCustomer(customer);

					System.out.println("회원가입을 하셨습니다");
				}else {
					//주문현황
					String custId = loginedCustomer.getCustId();
					List<OrderDTO> orders = orderDAO.selectOrders(custId);
					
					System.out.println("-------주문현황-------");
					for(OrderDTO order : orders) {
						System.out.println(order);
					}
					System.out.println("-------------------");
				}
			}else if( answer ==3 ) {
				//상품목록
				List<ProductDTO> products = productDAO.selectProducts();
				
				//상품출력
				products.stream().forEach(System.out::println);
			}else if(answer == 4) {
				//주문하기
				if(loginedCustomer == null) {
					System.out.println("로그인을 먼저 하세요");
					continue;
				}else{
					System.out.println("주문 상품번호 입력 : ");
					int prodNo = Integer.parseInt(sc.next());
					
					System.out.println("주문 수량 입력 : ");
					int prodCount = Integer.parseInt(sc.next());
					
					OrderDTO order = new OrderDTO();
					order.setOrderProduct(prodNo);
					order.setOrderCount(prodCount);
					order.setOrderId(loginedCustomer.getCustId());
					
					orderDAO.insertOrder(order);
					productDAO.updateProduct(null);
				}
			}
		}
		
		System.out.println("안녕히가십시오");
	}
}
