package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		
		printCharArray(c);// 원래 배열 원소 출력

		
		replaceSpace(c);// 공백 문자 바꾸기
		 System.out.println();
		
		printCharArray(c);// 수정된 배열 원소 출력
	}

	public static void replaceSpace(char c[]) {
		for(int i=0; i<c.length-1; i++) {
			if(c[i]==' ')
				c[i]=',';
		}
			}

	public static void printCharArray(char c[]) {
		for(int i=0; i<c.length-1; i++)
			System.out.print(c[i]);
	}
}
