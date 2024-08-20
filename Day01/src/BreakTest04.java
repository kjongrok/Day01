/* 전달 인자 개수가 다른 메서드가 오버로딩이 된 경우는 그 개수만큼 중복해서 메서드를 정의해야 한다.
 * 이러한 불편함을 해결하기 위해서 자바 5버전에서 가변인자리는 문법이 추가되었다.
 */

class Mt04{
	void prn(int a) {
		System.out.println(a);
	}

	void prn(int a, int b) {
		System.out.println(a+"\t"+b);
	}

	void prn(int a, int b, int c) {
		System.out.println(a+"\t"+b+"\t"+c);
	}

	

}//Mt04 class

class Mt05{
	// 가변인자 문법 적용 int ... arr
		void prn (int ... arr) {
			System.out.println(" \n ===========> 가변인자 적용");;
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]+"\t");
			}
			System.out.println("\n=============>");
			
			// 향상된 확장 for 반복문으로 가변인자값 출력
			for(int k : arr)
				System.out.println(k+"\t");
		}
}

public class BreakTest04 {
	public static void main(String[] args) {
		Mt04 m04 = new Mt04();
		m04.prn(10);
		m04.prn(10,20);
		m04.prn(10,20,30);
		
		Mt05 m05 = new Mt05();
		m05.prn(20,10);
		m05.prn(20);

	}
	
}










