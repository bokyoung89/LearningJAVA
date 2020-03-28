//char 타입 : 하나의 문자를 작은 따옴표에 감싼 것이 문자 리터럴. 문자 리터럴은 유니코드(0~65535)로 변환되어 저장된다.
//문자 리터럴을 int 타입에 저장할 경우 : 작은 따옴표로 감싼 문자 리터럴은 유니코드로 변환되므로 int 타입 변수에도 저장할 수 있다.
//다만 char 타입 변수에 저장하면 자등으로 문자로 매핑되어 출력되지만, int 타입 변수에 저장하면 유니코드 자체가 출력된다.
package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';		//문자를 직접 저장 (모두 문자 A로 출력)
		char c2 = 65;		//10진수로 저장 
		char c3 = '\u0041';	//16진수로 저장
		
		char c4 = '가';		//문자를 직접 저장 (모두 문자 가로 출력)
		char c5 = 44032;	//10진수로 저장
		char c6 = '\uac00';	//16진수로 저장
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
				
	}

}
