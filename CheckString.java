package checkString;

import java.util.Scanner;

/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class CheckString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		/*
		 * contains() 메소드는 특정 문자열이 포함되어 있는지 확인하는 기능을 한다. 
		 * 특정 문자열이 포함되어 있다면 true를 없다면 false를 반환한다.
		 */
		
		int check = -1;
		for(int i=0; i<text.length(); i++) {
			for(int j=0; j<word.length(); j++) {
				if(text.contains(word)) {
					check = 1;
				}else {
					check = -1;
				}
			}
		}
		
		if(check==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
