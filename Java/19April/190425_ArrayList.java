package VO;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String [] args) {
		
		ArrayList<String> sList = new ArrayList<>();
		
		sList.add("가");
		//parameter로 넘겨줌
		sList.add("나");
		sList.add("다");
		sList.add("라");
		//입력 순서대로 index부여
		
		/*System.out.println(sList.get(1));
		
		System.out.println(sList.size());
		//최대길이 확인
		
		for (String str:sList) {
			System.out.println(str);
		}*/
		
		sList.remove(2); //다 삭데
		sList.remove(2); //라 삭제
		
		sList.set(2, "마");//수정
		
		for (String str:sList) {
			System.out.println(str);
		}
		
	}

}
