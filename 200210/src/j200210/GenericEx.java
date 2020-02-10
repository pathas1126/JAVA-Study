package j200210;

public class GenericEx<T> {

	// 멤버 변수
	// String v[]; Double v2[]; Integer v3[];
	T v[];

	// setter, Overloading
	public void setV(T... n) {
		v = n;
	}

	/*
	 * public void setV(Double... n) { v2 = n; }
	 * 
	 * public void setV(Integer... n) { v3 = n; }
	 */

	// getter
	public T[] getV() {
		// v[] 출력, 확장 for문
		for (T s : v) {
			System.out.println(s);
		}
		// v[] 반환
		return v;
	}

}
