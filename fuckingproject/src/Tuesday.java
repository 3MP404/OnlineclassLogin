
public class Tuesday extends Days{
	
	Tuesday() {
		System.out.println("check");
		super.classes=new int[]{1,6,3,15,7,4};
		Ebs e=new Ebs();
		GoogleClassroom c=new GoogleClassroom();
		super.run(e,c,null);
	}
}
