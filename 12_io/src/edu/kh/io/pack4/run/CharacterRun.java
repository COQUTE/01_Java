package edu.kh.io.pack4.run;

import edu.kh.io.pack4.model.service.CharacterService;

public class CharacterRun {

	public static void main(String[] args) {

		CharacterService service = new CharacterService();
		
//		service.fileInput();
		service.fileOutput();
	}

}
