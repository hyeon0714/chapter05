package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;

public class PhoneApp {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("C:\\javaStudy\\프로그램\\file\\PhoneDB.txt");
		BufferedReader br=new BufferedReader(fr);
		
		while(true) {
			String str=br.readLine();
			
			if(str==null) {
				break;
			}
			String[] a=str.split(",");
			String name=a[0];
			String hp=a[1];
			String company=a[2];
			
			System.out.println("이름:  "+name);
			System.out.println("핸드폰:  "+hp);
			System.out.println("회사번호:  "+company);
			System.out.println();
		}
		br.close();
		
		
		
		
		
		
		//리더 준비
		//리더+버퍼 --> Phone_DB.txt   UTF-8
		
		//파일을 읽는다
		//,로 분리한다
		//이름, hp, company로 구분
		//출력
	}
}
