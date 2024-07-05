package com.won; //영화관리. 내가 본 영화들 리스트들을 관리. 본것들을 별점을 주는 프로그램. 새로본 영화도 등록가능.

import java.util.*;
import java.io.*;

//상품을 관리하는 메인 클래스
public class Mini1Project {
	
	Scanner scanner = new Scanner(System.in);
	private List<Movie> listmovie = new ArrayList<>();
	
	public void showMenu() {
		while(true) {		//4번을 누를 때 까지 계속 살아 있음
			//메뉴를 보여주는 메소드
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("1.등록하기 |  2.목록보기  |  3.별점주기  |  4.수정하기  |  5.삭제하기  |  6.파일저장  |  7.종료하기  |");
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("선택: ");
			
			// 키보드를 입력받는 코드
			String selectNo = scanner.nextLine(); // 번호를 읽기
			
			switch(selectNo) {
			case "1":		// 등록하기. 1을 누른 후 타자를 쳐서 이름을 등록하게 하고 싶다.
				System.out.println("영화를 입력해주세요.");
	
				List<String> list = new ArrayList<>();
				list.add("Java");		// "Java"값을 가진 String객체를 0번째 인덱스에 추가 및 저장
				list.add("JDBC");		// "JDBC"값을 가진 String객체를 1번째 인덱스에 추가 및 저장
				list.add("Servlet/JSP");// "Servlet/JSP"값을 가진 String객체를 2번째 인덱스에 추가 및 저장
				list.add(2, "Database");// 2번째 인덱스에 "Database"값을 가진 String객체를 저장. 3번째 인덱스에 "Servlet/JSP"값이 저장됨
				list.add("iBatis");  // 4번째 인덱스에 "iBatis"값을 가진 String객체를 저장


				
				break;
				
			case "2":		// 목록보기. 2를 누르면 movieList창이 켜지게 하고 싶다.
					try {
						Reader readerOri = new FileReader(
								WatchedMovieExample.class.getResource("MovieList.txt").getPath()
								);
					
						BufferedReader reader = new BufferedReader(readerOri);
						String line;
					while((line = reader.readLine()) != null) {
						System.out.println(line);
						}
						reader.close();
				
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
									
			case "3":		// 별점보기	
				System.out.println("별점을 선택해주세요(1~5): ");
				int star = scanner.nextInt();
				switch (star) {
				
					case 5:
						System.out.println("매우 재미있습니다.");
						break;
					
					case 4:
						System.out.println("재미 있습니다.");
						break;
												
					case 3:
						System.out.println("그저 그랬습니다.");
						break;
												
					case 2:
						System.out.println("재미 없습니다.");
						break;
													
					case 1:
						System.out.println("매우 재미 없습니다.");
						
						break;
					default:
						System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
						
				}			
						break;
								
			case "4":	//수정하기
				System.out.println("수정할 번호를 누르세요.");
					int save = scanner.nextInt();
				 private void saveMovie() {
					 
				 
				        if (list.isEmpty()) {
				            System.out.println("등록된 글이 없습니다.");
				            return;
				        }

				        System.out.print("수정할 글 번호를 입력하세요: ");
				        int index = scanner.nextInt();
				        scanner.nextLine(); // 버퍼 비우기

				        if (index < 1 || index > posts.size()) {
				            System.out.println("잘못된 글 번호입니다.");
				            return;
				        }

				        Post post = posts.get(index - 1);
				        System.out.println("현재 제목: " + post.getTitle());
				        System.out.print("수정할 제목을 입력하세요: ");
				        String newTitle = scanner.nextLine();
				        System.out.println("현재 내용: " + post.getContent());
				        System.out.print("수정할 내용을 입력하세요: ");
				        String newContent = scanner.nextLine();

				        post.setTitle(newTitle);
				        post.setContent(newContent);

				        System.out.println("글이 수정되었습니다.");
				 }
				
				
				break;
				
			case "5":	//삭제하기
				System.out.println("삭제할 번호를 누르세요");
				break;
				
			case "6":	//파일저장
				System.out.println("수정하시겠습니까");
				
				break;
				
			case "7": //종료하기
				System.out.println("종료합니다.");
				return;
				
			default:
				System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
				
							
	
				
			
			}
		}
	}
}

	


								
/*
	// 상품 등록 실행
	public void registerMovie() {
		try {
		Movie movie = new Movie();
		
		System.out.print("등록하기: ");  
		movie.setEnter(scanner.nextLine());
		
		
	//			Movie.setEnter(++counter); //상품 객체에 목록 저장
		
		System.out.print("목록보기: ");  //줄바꿈은 하면 안되니까 ln 제거
		movie.setMenu(scanner.nextLine()); //상품 객체에 상품 이름 저장
			
		
		System.out.print("별점주기: ");  
		movie.setGrade(scanner.nextLine()); // 상품 객체에 상품 재고 저장
	
		
		System.out.print("종료하기: ");  
		movie.setFinish(scanner.nextLine());
		
		
		listmovie.add(movie);
		}catch(Exception e) {
			System.out.println("등록 에러: " + e.getMessage());
		}
	}
	
		
		
	}
*/