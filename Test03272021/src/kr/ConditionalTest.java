package kr;

import java.util.Scanner;

public class ConditionalTest {

	public static void main(String[] args) {
		// 조건문 테스트 - 메뉴 골라주는 프로그램
		// 비가오는 날엔 만들어 먹는다. 맑은 날엔 배달주문. 흐린날엔 외식
		// 만들어 먹는 메뉴는 김치전 또는 감자전 또는 해물파전
		// 배달주문 메뉴는 치킨, 피자, 분식
		// 흐린날 메뉴는 삼겹살, 파스타, 삼계탕 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘의 날씨를 입력하세요.");
		System.out.println("1.비 2.맑음 3.흐림");
		int i=sc.nextInt();
		if (i==1) {
			System.out.print("오늘은 비가 오는군요. 추천메뉴는 ");
			int menu=(int)(Math.random()*3)+1;
			if (menu==1) {
				System.out.print("김치전");
			}else if (menu==2) {
				System.out.print("감자전");
			}else if(menu==3) {
				System.out.print("해물파전");
			}
			System.out.println("입니다. 만들어 보세요.");
		}else if (i==2){
			System.out.print("오늘은 맑군요. 추천메뉴는 ");
			int menu=(int)(Math.random()*3)+1;
			if (menu==1) {
				System.out.print("치킨");
			}else if (menu==2) {
				System.out.print("피자");
			}else if(menu==3) {
				System.out.print("분식");
			}
			System.out.println("입니다. 배달주문 해보세요.");
		}else if (i==3){
			System.out.print("오늘은 흐리군요. 추천메뉴는 ");
			int menu=(int)(Math.random()*3)+1;
			if (menu==1) {
				System.out.print("삼겹살");
			}else if (menu==2) {
				System.out.print("파스타");
			}else if(menu==3) {
				System.out.print("삼계탕");
			}
			System.out.println("입니다. 밖에서 외식하세요.");
		}

	}

}
