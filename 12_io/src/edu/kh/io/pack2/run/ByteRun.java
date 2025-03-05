package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {

		/*
		// 불변성(Immutable)의 String
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.hashCode()); // 69609650
		System.out.println(str2.hashCode()); // 69609650
		
		str2 = str2 + " world";
		System.out.println(str2.hashCode()); // -832992604
		
		// 가변성(Mutable)의 StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode()); // 1706377736
		sb.append("Hello world!");
		sb.append("12345");
		System.out.println(sb.hashCode()); // 1706377736
		*/
		
		ByteService service = new ByteService();
		
//		service.fileByteOutput();
//		service.bufferedFileByteOutput();
		
//		service.fileByteInput();
//		service.fileByteInput2();
//		service.bufferedFileByteInput();
		
//		service.readProperties();
		
		service.fileCopy();
	}

}
