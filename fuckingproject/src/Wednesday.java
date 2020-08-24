
public class Wednesday extends Days{
	
	Wednesday() {
		super.classes=new int[] {8,4,14,11,2,13};
		Ebs e=new Ebs();
		GoogleClassroom c=new GoogleClassroom();
		
		super.run(e,c,null);
	}
}
