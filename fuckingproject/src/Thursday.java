public class Thursday extends Days{
	Thursday() {
		super.classes=new int[]{1,9,5,6,12,8,3};
		Ebs e=new Ebs();
		GoogleClassroom c=new GoogleClassroom();
		super.run(e,c,null);
	}
}
