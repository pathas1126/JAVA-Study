package j200203;

// Date Ŭ���� import, ���� ��Ű���� ���� Ŭ������ �ҷ��� ���� * ���
import java.util.Date;

public class GetDate {

	public Date getDate() {
		Date d = new Date();
		return d;
		// �͸�ü: return new Date(); �ε� �ۼ� ����
	}

	public void setDate(Date nd) {
		System.out.println("���� �ð�: " + nd);
	}

	public static void main(String[] args) {
		GetDate gd = new GetDate(); // ��ü ����: �޼ҵ� ȣ�� ����
		Date nd = gd.getDate();
		gd.setDate(nd);
	}

}
