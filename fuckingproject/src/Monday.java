public class Monday extends Days{
	
	Monday() {
		super.classes=new int[]{8,4,11,2}; //오늘의 교시를 코드로 	저장
		Ebs e=new Ebs(); 
		Goorm g=new Goorm(); //미리 ebs와 goorm의 웹 크롤링 도구를 준비.
		super.run(e,null,g); 
	}
}
