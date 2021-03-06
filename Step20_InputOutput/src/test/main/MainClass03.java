package test.main;
/*
 * 	[ input ]
 * 
 * 	InputStream
 * 	FileInputStream(파일에 있는 바이트 알갱이 입력)
 * 	FileReader(파일에 있는 문자열 입력)
 * 	InputStreamReader
 * 	BufferedReader(줄 단위로 문자열 입력)
 * - console, file, socket 에 입력
 * 
 * 	[ output ]
 * 	
 * 	OutputStream
 * 	FileOutputStream(파일에 바이트 알갱이 출력)
 * 	FileWriter(파일에 문자열 출력)
 * 	OutputStreamWriter
 * 	BufferedWriter(줄 단위로 문자열 출력)
 * - console, file, socket 에 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		//키보드와 연결된 객체의 참조값
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		//InputStreamReader 객체의 참조값을 생성자의 인자로
		//전달하면서 BufferedReader 객체 생성하기
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("한줄 입력:");
			//문자열 한줄 입력 받기
			String line = br.readLine();
			System.out.println("- 입력한 문자열 -");
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
