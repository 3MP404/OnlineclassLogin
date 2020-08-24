
public class Tuesday extends Days{
	
	Tuesday() {
		super.classes=new int[]{16,1,6,3,14,7,4};
		Ebs e=new Ebs();
		GoogleClassroom c=new GoogleClassroom();
		super.run(e,c,null);
	}
}
