/* 정수 타입 : char 타입은 음수 값을 가질 수 없으며, 나머지 정수 값이 가질 수 있는 크기는 -2n-1~(2n-1-1)
 * 정수 리터럴 : 정수 타입으로 선언된 변수에는 정수 리터럴을 대입해서 정수를 저장할 수 있다.
*/

package sec02.exam01;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; 	//2진수
		int var2 = 0206;	//8진수
		int var3 = 365;		//10진수
		int var4 = 0xB3;	//16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
	}

}
