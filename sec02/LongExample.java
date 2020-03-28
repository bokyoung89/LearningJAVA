//long 타입 변수 : 컴파일러는 정수 리터럴을 int 타입으로 간주하므로, 정수 리터럴이 int 허용 범위를 초과하면  뒤에 대문자 L을 붙인다.
package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
	//	long var3 = 10000000000000000; 컴파일 에러
		long var4 = 10000000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
