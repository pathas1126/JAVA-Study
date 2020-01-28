package j200128;

public class StaticVariable {

	static int index = 0;

	int insIndex = 0;

	public void upIndex() {
		index += 1;
	}

	public void upInsIndex() {
		insIndex += 1;
	}
	
	public int getIns() {
		return insIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable sv1 = new StaticVariable();
		sv1.upIndex();
		sv1.upInsIndex();
		int insIndex1 = sv1.getIns();

		StaticVariable sv2 = new StaticVariable();
		sv2.upIndex();
		sv2.upInsIndex();
		int insIndex2 = sv2.getIns();
		System.out.println(index);
		
		System.out.println(insIndex1);
		System.out.println(insIndex2);
	}

}
