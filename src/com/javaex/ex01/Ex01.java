package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	
	public static void main(String[] args) throws IOException {//IO 예외처리
		
		InputStream a =new FileInputStream("C:\\javaStudy\\프로그램\\file\\img.jpg");//파일위치가 필요하다
		OutputStream b=new FileOutputStream("C:\\javaStudy\\프로그램\\file\\byteimg.jpg");
		
		
		System.out.println("복사시작");
		while(true) {
			int data = a.read();//데이터의 크기가 int를 넘어설수 있으므로 while 무한반복으로 넣는다
			System.out.println(data);
			if(data==-1) {//Input의 마지막은 -1로 끝난다
				System.out.println("종료"+data);
				break;
			}
			
			b.write(data);
	
		}
		a.close();//Input 종료	
		b.close();//Output종료
	}
}
