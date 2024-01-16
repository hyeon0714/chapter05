package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		
		InputStream in=new FileInputStream("C:\\javaStudy\\프로그램\\file\\MS949.txt");
		InputStreamReader isr=new InputStreamReader(in, "MS949");//읽을수 있게 변환
		BufferedReader bf= new BufferedReader(isr);
		
		
		while(true) {
			String str=bf.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		
		bf.close();
	}

}
