package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	private List<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {}
	
	public void addAnimal(Animal animal) {
		
		animals.add(animal); // 업캐스팅 된 Tiger, Monkey 리스트에 추가
	}
	
	public void showAnimals() {
		
		System.out.println("동물들의 울음소리를 들어보세요:");
		
		for (Animal animal : animals) {
			
			animal.sound();
		}
	}
	
	public void displayMenu() {
		
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		
		do {
			System.out.println("****** KH 동물원 ******");
			System.out.println("원하는 작업을 선택하세요 :");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택: ");
			
			try {
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1: showAnimals(); break;
				case 2: System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("메뉴에 없는 입력입니다. 다시 입력해주세요.");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine(); // 이미 잘못 입력된 값을 제거
				
				menuNum = -1;
			}
			
			
		} while(menuNum != 2);
		
	}
}
