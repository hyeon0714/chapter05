package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	
	public static void main(String[] args) throws IOException{
		
		InputStream i=new FileInputStream("C:\\javaStudy\\프로그램\\file\\img.jpg");
		BufferedInputStream ib = new BufferedInputStream(i);
		
		OutputStream o=new FileOutputStream("C:\\javaStudy\\프로그램\\file\\byte2.jpg");
		BufferedOutputStream ob=new BufferedOutputStream(o);
		
		System.out.println("복사시작");
		while(true) {
			int data=ib.read();
			
			ob.write(data);
			if(data==-1) {
				System.out.println("종료");
				break;
			}
		}
		ib.close();
		ob.close();
		
	}
}
