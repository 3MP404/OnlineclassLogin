
public class Friday extends Days{
	
	Friday() {
		super.classes=new int[]{7,10,15,3,13};
		Ebs e=new Ebs();
		GoogleClassroom c=new GoogleClassroom();
		Goorm g=new Goorm();
		super.run(e,c,g);
	}
}
