
public class Monday extends Days{
	
	Monday() {
		super.classes=new int[]{8,4,11,2};
		Ebs e=new Ebs();
		Goorm g=new Goorm();
		super.run(e,null,g);
	}
}
