package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("C:\\javaStudy\\프로그램\\file\\MS949.txt");
		BufferedReader bfw = new BufferedReader(fr);
		
		
		while(true) {
			String str=bfw.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		bfw.close();
		
	}

}
