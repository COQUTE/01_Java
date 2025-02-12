package edu.kh.op.ex;

// 예제 코드 작성용 클래스 (기능용/메서드용)
public class OpExample {

	public OpExample() {
		
	}
	
	// ex1() method: OpExample이라는 클래스에 포함된 메서드
	public void ex1() {
		
		// 증감(증가, 감소) 연산자: ++ , --
		// 1을 더하거나 감소시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1: " + iNum1);
		System.out.println("iNum2: " + iNum2);
		
		// 전위 연산
		int temp1 = 5;
		
		System.out.println(++temp1 + 5); // 11
							// 6 + 5 -> 11
		
		// 후위 연산
		int temp2 = 3;
		
		System.out.println(temp2-- + 2); // 5
						  // 3 + 2 -> 5
						  // 3-- -> 2
		System.out.println(temp2); // 2
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		System.out.printf("%d / %d / %d\n", a, b, c);
						// 4  / 4  / 7
	}
	
}
