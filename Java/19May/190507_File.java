//Main
package main;

import UI.FileUI;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileUI();
	}
}


//UI

package UI;

import java.util.Scanner;

import Service.FileService;

public class FileUI {
	
	private Scanner sc = new Scanner(System.in);
	private Scanner sc2 = new Scanner(System.in);
	private int choice;
	private String content;
	private FileService fs = new FileService();
	private boolean flag = true;
	
	public FileUI() {
	
		while (flag) {
			menu();
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: //글 쓰기
				System.out.println("내용을 입력해 주세요");
				content = sc2.nextLine();
				
				fs.writeString(content);
				break;
			case 2: //글 읽기
				System.out.println("내용 : ");
				System.out.println(fs.readString());
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}
	
	public void menu() {
		System.out.println("===========");
		System.out.println("1. 글 쓰기");
		System.out.println("2. 글 읽기");
		System.out.println("3. 종료");
		System.out.println("===========");
		
	}
}


//Service

package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileService {

	private FileInputStream fis;
	private FileOutputStream fos;
	private InputStreamReader isr;
	private OutputStreamWriter osw;
	
	public void writeString(String str) {// 글쓰기
		try {
			fos = new FileOutputStream("C:/test/text.txt");
			osw = new OutputStreamWriter(fos, "MS949");
			
			osw.write(str);
			osw.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String readString() {// 글읽기

		try {
			
			fis = new FileInputStream("C:/test/text.txt");
			isr = new InputStreamReader(fis, "MS949");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String str = "";
		int a = 0;
		
		while (a != -1) {
			try {
				
				a = isr.read();
				if (a != -1)
					str += (char) a;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return str;
			}
		}
		return str;
	}

	public void closeStream() {

		if (isr != null && osw != null) {
			try {
				isr.close();
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
