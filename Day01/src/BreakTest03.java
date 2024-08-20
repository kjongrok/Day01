/*	메서드 오버로딩의 구분 요건으로 메서드명 앞의 리턴 타입을 다르게 한 오버로딩은 적용되지 않는다.
 *	일반적으로 오버로딩 구분 요건으로는 전달인자(매개변수) 개수를 다르게 하든지, 매개변수 타입을 다르게 한 오버로딩을 적용한다.
 */	

class Mt03{
	void pr (int k) {
		System.out.println(k);
	}

	int pr(int k) {
		retrun k;
	}
} //Mt03 class

public class BreakTest03 {

	public static void main(String[] args) {
		Mt03 mt03 = new Mt03();
		mt03.pr(100);
		int result = mt03.pr(100);
	}

}
