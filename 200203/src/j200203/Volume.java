package j200203;
// ��ü ���α׷��� ���赵, ��� Ŭ�������� �������� �ʿ���ϴ� �޼ҵ� ����

public interface Volume {
	//	1. ���� ����, ���� ����(�Ű����� O, ��ȯ�� X)
	public void volumeUp(int level);
	
	// 2. ���� ����
	public void volumeDown(int level);
	
	// 3, 4 turn on, turn off
	// => �ڽ� �������̽����� ����
}