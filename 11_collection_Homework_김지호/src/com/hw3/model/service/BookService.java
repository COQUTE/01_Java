package com.hw3.model.service;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	private final int BOOK = 1;
	private final int FAVORITES = 2;
	
	private List<Book> bookList;		// 책 리스트
	private List<Book> favoritesList;	// 즐겨찾기 리스트
	private Scanner sc;
	
	// 기본 생성자 안에서 리스트 초기화
	public BookService() {
		bookList = new LinkedList<Book>();
		
		bookList.add(new Book("세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book("역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book("꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
		
		favoritesList = new LinkedList<Book>();
		sc = new Scanner(System.in);
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("\n*****도서 목록 프로그램*****");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			
			try {
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1: add(BOOK); break;
				case 2: selectAll(BOOK); break;
				case 3: update(); break;
				case 4: remove(BOOK); break;
				case 5: add(FAVORITES); break;
				case 6: remove(FAVORITES); break;
				case 7: selectAll(FAVORITES); break;
				case 8: recommend(); break;
				case 0: System.out.println("프로그램이 종료되었습니다."); break;
				default: System.out.println("메뉴에 없는 번호입니다.");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				sc.nextLine(); // 버퍼 비워주기
				
				menuNum = -1;
			} catch(NullPointerException e) {
				System.out.println("리스트가 비어있습니다.");
			}
			
		} while(menuNum != 0);
		
		sc.close();
	}
	
	public void add(int num) {

		// 종류를 판별해주는 num을 받고
		// -> num이 1(BOOK)인 경우는 도서
		// -> num이 2(FAVORITES)인 경우는 즐겨찾기
		try {
			switch(num) {
			
			case BOOK: {
				
				System.out.println("**********도서 등록**********");
				
				System.out.print("도서 번호 : ");
				int id = sc.nextInt();
				sc.nextLine(); // 버퍼 비워주기
				
				System.out.print("도서 제목 : ");
				String name = sc.nextLine();
				
				System.out.print("도서 저자 : ");
				String author = sc.nextLine();
				
				System.out.print("도서 가격 : ");
				int price = sc.nextInt();
				sc.nextLine(); // 버퍼 비워주기
				
				System.out.print("도서 출판사 : ");
				String publisher = sc.nextLine();
				
				if (bookList.add(new Book(id, name, author, price, publisher))) {
					System.out.println("등록 완료");
					
				} else { // bookList에 add 실패
					System.out.println("등록 실패");
				}
			}
			break;
			
			case FAVORITES: {
				
				System.out.println("**********즐겨찾기 등록**********");
				System.out.print("추가하고 싶은 도서 번호를 입력하세요: ");
				// 도서 번호를 입력하면
				// 일치하는 도서 번호를 가진 Book 객체를
				// 즐겨찾기 리스트에 추가
				int id = sc.nextInt();
				sc.nextLine();
				
				for(Book book : bookList) {
					
					if (book.getId() == id) {
						// 얕은 복사
						if (favoritesList.add(book)) {
							System.out.println("등록 완료");
						} else {
							System.out.println("등록 실패");
						}
						
						return;
					}
				}
				
				System.out.println("해당 번호를 가진 책이 없습니다.");
			}
			break;
			
			// 1(BOOK)이나 2(FAVORITES)가 아닌 경우
			default: System.out.println("책/즐겨찾기 중에서 선택해주세요.");
			}
		} catch(InputMismatchException e) {
				throw e;
		}
	}
	
	// Book 객체를 담고 있는 List를 매개변수로 입력 받아
	// 해당 List의 모든 객체 정보를 출력
	public void selectList(List<Book> list) {
		
		if (list.isEmpty()) {
			throw new NullPointerException();
		}
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
	
	public void selectAll(int num) {
		
		// 종류를 판별해주는 num을 받고
		// -> num이 1(BOOK)인 경우는 도서
		// -> num이 2(FAVORITES)인 경우는 즐겨찾기
		
		switch(num) {
		
		case BOOK: {
			
			System.out.println("**********도서 조회**********");
			
			selectList(bookList); 
		}
		break;
		
		case FAVORITES: {
			
			System.out.println("********즐겨찾기 조회********");
			
			selectList(favoritesList);
		}
		break;
		
		// 1(BOOK)이나 2(FAVORITES)가 아닌 경우
		default: System.out.println("책/즐겨찾기 중에서 선택해주세요.");
		}
	}
	
	public void updateList(int menuNum, Book book) {
		
		switch(menuNum) {
		
		// 도서명 수정
		case 1: {
			System.out.println("=====도서명 수정=====");
			System.out.print("수정할 이름을 입력하세요: ");
			
			book.setName(sc.nextLine());
		}
		break;
		
		// 도서 저자 수정
		case 2: {
			System.out.println("=====저자명 수정=====");
			System.out.print("수정할 저자명을 입력하세요: ");
			
			book.setAuthor(sc.nextLine());
		}
		break;
		
		// 도서 가격 수정
		case 3: {
			System.out.println("=====가격 수정=====");
			System.out.print("수정할 가격을 입력하세요: ");
			
			book.setPrice(sc.nextInt());
			sc.nextLine();
		}
		break;
		
		// 도서 출판사 수정
		case 4: {
			System.out.println("=====출판사 수정=====");
			System.out.print("수정할 출판사를 입력하세요: ");
			
			book.setPublisher(sc.nextLine());
		}
		break;
		
		// 수정 종료
		case 0: System.out.println("수정 종료"); return;
		
		default: System.out.println("메뉴에 없는 번호입니다.");
		}
		
	}
	
	public void update() {
		
		if(bookList.isEmpty()) {
			throw new NullPointerException();
		}
		
		System.out.println("**********도서 수정**********");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		
		boolean isFound = false;
		Book updateBook = null;
		
		try {
			int id = sc.nextInt();
			
			// 입력한 id와 동일한 id를 가진 Book 객체가 있는지 확인
			// 있으면 계속 진행, 없으면 해당 번호를 가진 책이 없습니다.
			for(Book book : bookList) {
				
				if(book.getId() == id) {
					
					updateBook = book;
					isFound = true;
					break;
				}
			}
			
			if (isFound) {
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				
				System.out.print("어떤 정보를 수정하시겠습니까?");
				int menuNum = sc.nextInt();
				sc.nextLine();
				
				updateList(menuNum, updateBook);
				
			} else
				System.out.println("해당 번호를 가진 책이 없습니다.");
			
		} catch (InputMismatchException e) {
			throw e;
		} catch (NullPointerException e) {
			throw e;
		}
		
	}
	
	public void removeHasSameId(int id, List<Book> list) {
		
		for(Book book : list) {
			
			if (book.getId() == id) {
				
				if(list.remove(book)) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				return;
			}
		}
		System.out.println("해당 번호를 가진 책이 없습니다.");
	}
	
	public void remove(int num) {
		
		// 종류를 판별해주는 num을 받고
		// -> num이 1(BOOK)인 경우는 도서
		// -> num이 2(FAVORITES)인 경우는 즐겨찾기
		
		try {
			switch(num) {
			
			case BOOK: {
				
				if(bookList.isEmpty()) {
					throw new NullPointerException();
				}
				
				System.out.println("**********도서 삭제**********");
				System.out.print("삭제할 도서 번호를 입력하세요 : ");
				
				int id = sc.nextInt();
				sc.nextLine();
				
				removeHasSameId(id, bookList);
				
			}
			break;
			
			case FAVORITES: {
				
				if(favoritesList.isEmpty()) {
					throw new NullPointerException();
				}
				
				System.out.println("********즐겨찾기 삭제********");
				System.out.print("삭제할 즐겨찾기 번호를 입력하세요 : ");

				int id = sc.nextInt();
				sc.nextLine();
				
				removeHasSameId(id, favoritesList);
				
			}
			break;
			
			// 1(BOOK)이나 2(FAVORITES)가 아닌 경우
			default: System.out.println("책/즐겨찾기 중에서 선택해주세요.");
			}
		} catch(InputMismatchException e) {
			throw e;
		} catch(NullPointerException e) {
			throw e;
		}
		
	}
	
	public void recommend() {
		
		Random random = new Random();
		
		System.out.println("**********추천 도서**********");
		
		try {
			System.out.println(bookList.get(random.nextInt(bookList.size())));
			
		} catch(NullPointerException e) {
			throw e;
		}
		
	}
	
}
