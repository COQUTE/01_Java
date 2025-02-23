package edu.kh.oop.practice.model.vo;

public class Hero {

	// 속성
	private String nickname;	// 닉네임
	private String job;			// 직업
	private int hp;				// 체력
	private int mp;				// 마력
	private int level;			// 레벨
	private double exp;			// 경험치
	
	// 기능
	public Hero() {	}

	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		String str = "";
		str += "===========캐릭터 생성===========\n";
		str += job + " 직업으로 '" + nickname + "'님이 생성되었습니다.\n";
		str += "현재 레벨: " + level + "\n";
		str += "현재 hp: " + hp + "\n";
		str += "현재 mp: " + mp + "\n";
		str += "현재 경험치: " + exp + "\n";
		
		System.out.print(str);
	}

	public String getNickname() {
		return nickname;
	}

	public void attack(double exp) {
		
		/* 전달받은 경험치를 현재 경험치에
		 * 누적하고, 공격했다는 메세지 출력.
		 * (단, 현재 경험치가 300 이상이면
		 * 현재 레벨을 1 증가시키고,
		 * 레벨이 올랐다는 메세지 출력)
		 */
		double remainExp = this.exp / 300;
		
		this.exp += exp;
		
		System.out.printf("'%s'은/는 공격을 했다!!! 현재 경험치: %.1f\n", nickname, this.exp);
		
		if (remainExp + exp >= 300) {
			
			this.level++;
			
			System.out.println("레벨이 올랐습니다!! 현재레벨: " + level);
		}
	}
	
	public void dash() {
		
		/* 대시 할 때 마다 현재 mp에서
		 * -10씩 감소되며 대시했다는 메세지 출력.
		 * (단, 현재 mp가 0 이하라면
		 * 마력이 부족하여 대시할 수
		 * 없다는 메세지 출력)
		 */
		
		if (mp <= 0) {
			System.out.println("[마력 부족]더 이상 대시 할 수 없어요~!");
			
		} else {
			mp -= 10;	
			
			System.out.printf("'%s'의 엄청 빠른 대시!!! 남은 마력: %d\n", nickname, mp);
		}
	}

	@Override
	public String toString() {
		
		//호출 시 해당 메서드를 호출한 객체의 현재 정보를 출력
		String str = "";
		str += "==========='" + nickname +"'님의 정보===========\n";
		str += "현재 레벨: " + level + "\n";
		str += "현재 hp: " + hp + "\n";
		str += "현재 mp: " + mp + "\n";
		str += "현재 경험치: " + exp + "\n";
		
		return str;
	}
	
}
