package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\javaStudy\\프로그램\\file\\song.txt");
		BufferedReader bfr=new BufferedReader(fr);
		
		while(true) {
			String str=bfr.readLine();//한줄씩 읽도록 하는 문법
			
			if(str==null) {//주소의 비교이므로 ==null을 사용한다(값은 equals)
				break;//마지막 문장에 내용이 없으면 null값이 되서 반복문 탈출
			}
			System.out.println(str);
		}
		bfr.close();
	}
}
