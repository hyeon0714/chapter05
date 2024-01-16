package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PersonApp {
	
	public static void main(String[] args) throws IOException{
		
		Reader r=new FileReader("C:\\javaStudy\\프로그램\\file\\PhoneDB.txt");
		BufferedReader br=new BufferedReader(r);
		
		List<Person> pList=new ArrayList<Person>();
		
		while(true) {
			String str=br.readLine();
			if(str==null) {
				break;
			}
			String[] a=str.split(",");
			String n=a[0];
			String h=a[1];
			String c=a[2];
			Person p=new Person(n, h, c);
			
			pList.add(p);
		}
		
		Person p=new Person("황일영", "010-3333-5151", "비트");
		pList.add(p);
		
		Writer w=new FileWriter("C:\\javaStudy\\프로그램\\file\\PhoneDB3.txt");
		BufferedWriter bw=new BufferedWriter(w);
		
		for(int i=0; i<pList.size(); i++) {
			bw.write(String.valueOf(pList.get(i)));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
