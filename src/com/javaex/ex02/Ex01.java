package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {
	
	public static void main(String[] args) throws IOException {
		
		Writer fw=new FileWriter("C:\\javaStudy\\프로그램\\file\\song.txt");
		BufferedWriter bfw=new BufferedWriter(fw);
		
		bfw.write("학교종이 땡땡땡");
		bfw.newLine();//줄바꿈 '\n'이 아니어도 줄바꿈 가능->맥, 리눅스에도 똑같이 적용된다
		bfw.write("고드름");//띄어쓰기 없이 붙어서 나온다
		bfw.newLine();
		bfw.write("우리집 강아지");
		
		bfw.close();
		
	}
}
