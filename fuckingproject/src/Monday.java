public class Monday extends Days{
	
	Monday() {
		super.classes=new int[]{8,4,11,2}; //������ ���ø� �ڵ�� 	����
		Ebs e=new Ebs(); 
		Goorm g=new Goorm(); //�̸� ebs�� goorm�� �� ũ�Ѹ� ������ �غ�.
		super.run(e,null,g); 
	}
}
