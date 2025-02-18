package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		 * 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		 * 짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 */
		
		int[] arr = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = i + 1;
		
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i % 2 == 0)
				sum += arr[i];
		}
		
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		 * 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		 * 홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 */
		
		int[] arr = new int[9];
		
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i % 2 != 0)
				sum += arr[i];
		}
		
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}

	public void practice3() {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 */
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = i + 1;
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}

	public void practice4() {
		/*
		 * 정수 5개를 입력 받아 배열을 초기화 하고
		 * 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		 * 배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		 */
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			
			arr[i] = input;
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false;
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == search) {
				flag = true;
				index = i;
				break;
			}
		}
		
		if (flag) {
			System.out.println("인덱스 : " + index);
		} else {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 */
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] charArr = new char[str.length()];
		
		for (int i = 0; i < charArr.length; i++) {
			
			charArr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char search = sc.next().charAt(0);
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) :", str, search);
		
		int count = 0;
		for (int i = 0; i < charArr.length; i++) {
			
			if (charArr[i] == search) {
				
				System.out.print(" " + i);
				count++;
			}
		}
		
		System.out.println();
		
		System.out.println(search + " 개수 : " + count);
	}

	public void practice6() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 */
		
		System.out.print("정수 : ");
		int arrLength = sc.nextInt();
		
		int[] arr = new int[arrLength];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
			
			sum += arr[i];
		}
		
		System.out.println("\n총 합 : " + sum);
	}

	public void practice7() {
		// 주민등록번호 번호를 입력 받아
		// 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
		
		System.out.print("주민등록번호(-포함) : ");
		String id = sc.nextLine();
		
		char[] idCharArr = new char[id.length()];
		
		int index = 0;
		
		for (int i = 0; i < idCharArr.length; i++) {
			
			idCharArr[i] = id.charAt(i);
			
			if (idCharArr[i] == '-') {
				index = i;
			}
		}
		
		for (int i = index + 2; i < idCharArr.length; i++) {
			
			idCharArr[i] = '*';
		}

		for (int i = 0; i < idCharArr.length; i++) {
			
			System.out.print(idCharArr[i]);
		}
		
		System.out.println();
	}

	public void practice8() {
		/*
		 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		 * 다시 정수를 받도록 하세요.
		 */
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		while(input % 2 == 0 || input < 3) {
			
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			input = sc.nextInt();
		}
		
		int[] arr = new int[input];
		
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (i <= arr.length / 2)
				num++;
			else
				num--;
			
			arr[i] = num;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i == 0)
				System.out.print(arr[i]);
			else
				System.out.print(", " + arr[i]);
		}
		
		System.out.println();
	}

	public void practice9() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice10() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
				
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		System.out.print("발생한 난수 :");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (min > arr[i])
				min = arr[i];
			if (max < arr[i])
				max = arr[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice11() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for (int j = 0; j < i; j++) {
				
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		/*
		 * 로또 번호 자동 생성기 프로그램을 만들기.
		 * (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		 */
		
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for (int j = 0; j < i; j++) {
				
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		/*
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		 * 문자의 개수와 함께 출력하세요.
		 */
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		boolean isDup = false;
		int arrIndex = 0;
		int dupCount = 0;
		
		// 문자열의 중복 체크 & 중복인 인덱스를 생략하고 arr에 대입
		for (int i = 0; i < str.length(); i++) {
			
			for (int x = 0; x < i; x++) {
				
				if (str.charAt(i) == str.charAt(x)) {
					isDup = true;
					break;
				}
			}
			
			if (isDup) {
				dupCount++;
				isDup = false;
				continue;
				
			} else {
				arr[arrIndex] = str.charAt(i);
				arrIndex++;
			}
		}
		
		char[] resultArr = Arrays.copyOf(arr, arr.length - dupCount);
		
		System.out.print("문자열에 있는 문자 : ");
		
		for (int i = 0; i < resultArr.length; i++) {
			
			if(i == 0)
				System.out.print(resultArr[i]);
			else
				System.out.print(", " + resultArr[i]);
		}
		
		System.out.println("\n문자 개수 : " + resultArr.length);
	}
	
	public void practice14() {
		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		 * 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		 * 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 */
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		
		sc.nextLine();

		String[] arr = new String[input];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'y' || ch == 'Y') {
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				
				sc.nextLine();
				
				String[] newArr = new String[arr.length + addSize];
				
				System.arraycopy(arr, 0, newArr, 0, arr.length);
				
				for (int i = arr.length; i < newArr.length; i++) {
					
					System.out.print((i + 1) + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}
				
				arr = newArr;
				
			} else if (ch == 'n' || ch == 'N') {
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
