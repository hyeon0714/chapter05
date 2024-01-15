package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {
	public static void main(String[] args) throws IOException {//IO 예외처리
		
		InputStream a = new FileInputStream("C:\\javaStudy\\프로그램\\file\\img.jpg");
		
		OutputStream b = new FileOutputStream("C:\\javaStudy\\프로그램\\file\\byteBuffer.jpg");
		
		byte[] buff=new byte[1024];
		
		System.out.println("복사시작");
		while(true) {
			int data=a.read(buff);//buff 배열을 통한 보조작성->>속도가 빨라진다
			System.out.println(data);
			if(data==-1) {
				System.out.println("종료");
				break;
			}
			
			b.write(buff);
		}
		
		a.close();
		b.close();
		
	}
}
