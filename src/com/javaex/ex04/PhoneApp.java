package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {
	
	public static void main(String[] args) throws IOException{
	
		Reader r=new FileReader("C:\\javaStudy\\프로그램\\file\\PhoneDB.txt");
		BufferedReader br=new BufferedReader(r);
		
		List<String> pList=new ArrayList<String>();
		
		while(true) {
			String str=br.readLine();
			if(str==null) {
				break;
			}
			pList.add(str);
		}
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i));//리스트에 제대로 올라갓는지 확인
		}
		
		Writer w=new FileWriter("C:\\javaStudy\\프로그램\\file\\PhoneDB2.txt");//한번 시작하면 계속 누적됨으로 2번파일에 작성
		BufferedWriter bw=new BufferedWriter(w);
		
		pList.add("황일영, 010-3333-5151, 비트");//리스트 순번 이상없는지 확인
		
		for(int i=0; i<pList.size(); i++) {
			bw.write(pList.get(i));
			bw.newLine();
		}
		
		
		
		br.close();
		bw.close();
		
		
		//쓰기 빨때 쓰면 파일 다 지워짐
		
		//파일에서 읽은 내용을 리스트로 관리
		
		//자신의 정보 Person리스트에 추가하고
		
	}
}
