package j200120;

class Account {

	// 1. ��� ���� ����
	String name; // ���� ����
	String accountNo; // ���¹�ȣ: ������� �ʱ� ������ ���ڿ��� ����
	long balance = 1000; // ���� �ܾ�

	// 2. ��� �޼ҵ� ����
	// �ܾ� ��ȸ �޼���: �ܼ�, �ݺ�, �Ű����� X, ��ȯ�� X
	void searchPrint() {
		System.out.println(name + "���� �ܾ��� " + balance + "�Դϴ�.");
	}

	// ������ �Ա� �޼��� : �Ű����� O, ��ȯ�� X
	void deposit(long input) {
		balance += input;
		System.out.println(input + "��ŭ �Ա��� �Ϸ�Ǿ����ϴ�. (�ܾ�): " + balance);
	}

	// ��� �޼��� : �Ű����� O, ��ȯ�� X
	void withdraw(long output) {
		balance -= output;
		System.out.println(output + "��ŭ ����� �Ϸ�Ǿ����ϴ�. (�ܾ�): " + balance);
	}
}

public class AccountHandling {

	public static void main(String[] args) {
		// �ϳ��� Ŭ������ ���� ���� ��ü ����

		// ö�� ���� ����
		Account cheolsoo = new Account(); // cheolsoo ��ü ����
		cheolsoo.name = "ö��";
		cheolsoo.accountNo = "1234-542-11612";

		// ���� ���� ����
		Account younghee = new Account(); // younghee ��ü ����
		younghee.name = "����";
		younghee.accountNo = "5342-112-23521";
		
		// ö�� ���¿� 5000�� �Ա�
		cheolsoo.deposit(5000);	// deposit�޼��带 ȣ���ϸ鼭 5000�� ����
		
		// ö�� ���¿��� 4000�� ���
		cheolsoo.withdraw(4000);
		
		// ö�� ������ �ܾ� ��ȸ
		cheolsoo.searchPrint();
	}

}
