package edu.hk.oarr.run;

import edu.hk.oarr.model.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		
		service.displayMenu();
		
	}
}
