package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex05 {
	
	public static void main(String[] args) throws Exception{
		
		InputStream in=new FileInputStream("C:\\javaStudy\\프로그램\\file\\MS949.txt");
		InputStreamReader isr=new InputStreamReader(in, "MS949");
		BufferedReader br=new BufferedReader(isr);
		
		OutputStream out=new FileOutputStream("C:\\javaStudy\\프로그램\\file\\MS949-c.txt");
		OutputStreamWriter osw=new OutputStreamWriter(out, "MS949");
		BufferedWriter bw=new BufferedWriter(osw);
		
		while(true) {
			String str=br.readLine();
			if(str==null) {
				break;
			}
			
			bw.write(str);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}
}
