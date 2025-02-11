package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/*
		 * 자바 기본 자료형 8가지
		 * 
		 * 논리형: boolean (1byte)
		 * 정수형: byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형: float(4byte), double(8byte)
		 * 문자형: char(2yte, 유니코드)
		 * 
		 * 참조형 - 문자열 String
		 */
		
		// 변수 선언: 메모리(RAM)에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입: 변수에 값을 집어 넣는 것.
		
		boolean booleanData; // 변수의 선언
		// 메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고
		// 할당된 공간의 이름을 booleanData라고 정하겠다.
		
		booleanData = true; // booleanData 변수에 true 논리값 집어넣기(대입)
		
		System.out.println("booleanData: " + booleanData);
		
		
		byte byteNumber = 127; // 128 넣으면 오류 (값의 범위 -128 ~ 127)
		// 메모리에 정수값을 저장할 공간을 1byte 할당하고
		// 할당된 공간의 이름을 byteNumber라고 부르겠다.
		// byteNumber 변수에 처음으로(초기값) 127을 넣음
		// -> 초기화: 처음 변수에 값을 대입
		
		short shortNumber = 32767;
		
		// 정수 자료형 기본형! int (short, byte는 옛날코드 잔재)
		int intNumber = 2147483647;
	// 자료형 변수명 대입연산자 리터럴;
	// 프로그래밍에서 대입되는 데이터(값 자체)를 리터럴이라는 단어로도 표현
		
		// 리터럴: 변수에 대입되거나 작성되어지는 값 자체.
		// 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000l; // l 또는 L
		// The literal 10000000000 of type int is out of range
		// -> 100억이라는 값은 int의 범위를 벗어났다.
		// -> 리터럴값 자체를 int로 인식하고 있다.
		// -> 뒤에 L을 붙여줌으로써 long 자료형인 것을 나타내줌.
		
		float floatNumber = 1.2345f; // f 또는 F
		// 1.2345까지만 쓰면 double 자료형으로 인식하기 때문에
		// 변수 타입인 float과 일치하지 않아 Type mismatch라는 에러가 발생함.
		
		// 실수 자료형 기본형! double
		double doubleNumber = 3.141592;
		// 리터럴 표기법 없는 실수는 double로 인식
		// d / D 사용 가능!
		
		// 문자형(char) 리터럴 표기법: ''(홑따옴표)
		// -> 문자 하나
		char ch = 'A';
		char ch2 = 66;
		
		System.out.println("ch: " + ch);
		System.out.println("ch2: " + ch2);
		
		/*
		 * char 자료형에 숫자가 대입될 수 있는 이유!
		 * - 컴퓨터에는 문자표가 존재하고 있음
		 *   숫자에 따라 지정된 문자 모양이 각각 매핑되고
		 *   'B' 문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 *   -> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것도
		 *      가능함.
		 */
		
		// 변수 명명 규칙
		
		// 1. 대소문자가 구분되며 길이 제한이 없다.
		char abcdefg123456;
		
		// 2. 예약어를 사용하면 안 된다.
		// double final;
		
		// 3. 숫자로 시작하면 안 된다.
		// char 1abc;
		char a1bc;
		
		// 4. 특수문자는 '_'와 '$'만을 허용한다. (하지만 쓰지 않는다)
		int $intNumber;
		int int_Number;
		// 자바는 카멜표기법 사용
		// _ 작성 표기법은 DB에서 사용
		// 자바의 상수에서 사용
		// MEMBER_NAME
		
		// 5. 카멜표기법(맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		char helloWorldAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지 않는다 (하지만 쓰지 않는다)
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		// ---------------------------
		
		// 상수의 정의: 한 번만 저장할 수 있음
		// 상수의 선언법: final을 맨 앞에 붙이면 됨
		// 대문자로 표기
		
		/*
		 * - 상수를 사용하는 경우
		 * 1) 변하면 안되는 고정된 값을 저장할 때
		 * 2) 특정한 값에 의미를 부여하는 경우
		 */
		
		final int MIN_AGE = 1;
		final int MAX_AGE = 130;
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
	}

}
