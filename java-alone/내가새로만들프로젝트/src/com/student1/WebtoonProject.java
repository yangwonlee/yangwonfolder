package com.student1;
import java.util.Scanner;

public class WebtoonProject {
	public static void main(String[] args) {
		System.out.println("웹툰 게시판 프로그램 시작");
		
		WebtoonService webtoonService = new WebtoonService(); //게시판 접근 및 제어 객체 생성,선언
		Scanner scanner = new Scanner(System.in); // 키보드입력을 받는 객체. 범용적이라 맨위에.
		
		// 게시판 프로그램 대기를 위해 무한 루프 코드 작성. 종료 일 때만 벗어남.
		while(true) {
			System.out.println("     <<웹툰>>    ");
			//게시판 메뉴
			System.out.println(
					"(1.글작성, 2.글목록(1~4), 3.상세보기, 4.별점주기, 5.수정, 6.삭제, 7.종료");
			
			//1. 메뉴 선택번호를 입력받기
			int menuNumber = 0;
			try {
				menuNumber = Integer.parseInt(scanner.nextLine());
			}catch(Exception e) {	//메뉴에 숫자 외의 값을 입력했을때의 예외처리
				System.out.println("\n잘못된 값을 입력하셨습니다. 다시 입력 해주세요.");
				continue; //컨티뉴를 해야 이어갈 수 있음.
			}
			System.out.println("선택된 번호-> " + menuNumber);
			
			if(menuNumber < 1 || menuNumber>7) {	//메뉴에 1~7외의 숫자를 넣었을때의 예외처리
				System.out.println("메뉴 번호는 1~7번 사이의 숫자만 가능합니다.");
				continue;
			}	
			
			switch(menuNumber) {
				case 1: //글작성 실행
					System.out.println("(글작성)");
					System.out.println("--------------------------------------------");
					System.out.println("(장르목록)"										 );
					System.out.println("1.무협물\t2.판타지물\t3.개그물\t4.드라마물");		
					System.out.println("--------------------------------------------");
					webtoonService.insertWebtoon();
					break;
					
				case 2: //목록보기
					System.out.println("--------------------------------------------");
					System.out.println("(글목록)"										 );
					System.out.println("1.무협물\t2.판타지물\t3.개그물\t4.드라마물\t5.종료");		
					System.out.println("--------------------------------------------");	
				webtoonService.selectAllWebtoon();
					
				int genreNumber = 0;	//장르넘버는 0이야.
					try {
						genreNumber = Integer.parseInt(scanner.nextLine()); //장르에 숫자를넣자.
					}catch(Exception e) {
						System.out.println("\n잘못된 값을 입력하셨습니다. 다시 입력 해주세요.");
						continue;
					}
					System.out.println("선택된 번호-> " + genreNumber);
			
					if(genreNumber <1 || genreNumber>4) {
						System.out.println("장르 번호는 1~4번 사이의 숫자만 가능합니다.");
						continue;
						}		
						switch(genreNumber) {
							case 1: //무협물
								System.out.println("(무협물)");
								break;
							case 2: //판타지
								System.out.println("(판타지물)");
								break;
							case 3: //개그물
								System.out.println("(개그물)");
								break;
							case 4: //드라마물
								System.out.println("(드라마물)");
								break;	
							case 5: 
								System.out.println("종료.");
								break;
							}	
						if(menuNumber == 5) {
							System.out.println("(종료)");
						
							break;
							}
				
				case 3: //상세보기
					System.out.println("(상세보기)");
					
					webtoonService.selectOneWebtoon();
					break;
					
				case 4: //별점보기
					System.out.println("(별점보기)");
					
					webtoonService.ratingOneWebtoon();
					break;
					
				case 5: //글수정
					System.out.println("(글수정)");
						
					webtoonService.updateOneWebtoon();
					break;	
					
					
				case 6: //글삭제
					System.out.println("(글삭제)");	
					
					webtoonService.deleteOneWebtoon();
					break;	
				
				case 7: //프로그램 종료
					System.out.println("(종료)");
					break;
			}
			if (menuNumber == 6) {
				System.out.println("게시판 프로그램 종료");
			}		
			break;
				}			
		}
	}
