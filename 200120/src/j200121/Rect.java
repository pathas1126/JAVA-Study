package j200121;

public class Rect {
	double width;	//���簢�� ���� ����
	double height;	// ���� ����
	double square;	// ���� ����
	
	//������ ���ϴ� �޼���
	void square() {
		square = width * height;
	}
	
	//���� ��� �޼���
	void print() {
		System.out.println("���簢���� ���̴� "+square+"����cm�Դϴ�.");
	}
}
