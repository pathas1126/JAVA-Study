package j200210;

public class GenericEx<T> {

	// ��� ����
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
		// v[] ���, Ȯ�� for��
		for (T s : v) {
			System.out.println(s);
		}
		// v[] ��ȯ
		return v;
	}

}
