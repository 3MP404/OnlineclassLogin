
public abstract class Days extends Onlineclass{
	int[] classes; //1: 영A 2: 영B 3: 수 4: 한국사  5: 물리 6: 중국어 7: 서버구축 8: 자바 9:네보 10: DB 11: 진로 12: 주제연구 13 : 반 14 : 문학A 15:문학B 16: 체육	 
	void run(Ebs e,GoogleClassroom c, Goorm g) {
		for(int i=0;i<classes.length;i++) {
			//
			switch(classes[i]) {
			case 1:
				e.go("https://hoc22.ebssw.kr/sr2english/hmpg/hmpgAlctcrListView.do?menuSn=347280"); //영A
				break;
			case 2:
				c.go("https://classroom.google.com/u/0/c/NjkzNzExNjk0Njha"); //영B
				break;
			case 3:
				e.go("https://hoc22.ebssw.kr/sunrin2math/hmpg/hmpgAlctcrListView.do?menuSn=391020"); //수학
				break;
			case 4:
				e.go("https://hoc22.ebssw.kr/sunrinhistory01/hmpg/hmpgAlctcrListView.do?menuSn=346987"); //한국사
				break;
			case 5:
				e.go("https://hoc22.ebssw.kr/peter1667/hmpg/hmpgAlctcrListView.do?menuSn=399240"); //물리
				break;
			case 6:
				c.go("https://classroom.google.com/u/0/c/Njg3OTk3NjE4Mjla"); //중국어
				break;
			case 7:
				c.go("https://classroom.google.com/u/0/c/Njg4NTAzNjkxMTBa"); //서버
				break;
			case 8:
				c.go("https://classroom.google.com/u/0/c/Njg3OTk2MTE0NTda"); //자바
				break;
			case 9:
				e.go("https://hoc22.ebssw.kr/sunrintest01/hmpg/hmpgAlctcrListView.do?menuSn=291548"); //네트워크보안
				break;
			case 10:
				g.go("https://sunrint-hs.goorm.io/learn/lecture/17890/2020-%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4"); //DB
				break;
			case 11:
				e.go("https://hoc22.ebssw.kr/sunrint2jinro/hmpg/hmpgAlctcrListView.do?menuSn=333224"); //진로
				break;
			case 12:
				e.go("https://hoc22.ebssw.kr/ca2020/hmpg/hmpgAlctcrListView.do?menuSn=409665"); //주제연구발표
				break;
			case 13:
				e.go("https://hoc22.ebssw.kr/peter1666/hmpg/hmpgAlctcrListView.do?menuSn=398433"); //반
				break;
			case 14:
				e.go("https://hoc22.ebssw.kr/being1212/hmpg/hmpgAlctcrListView.do?menuSn=345899"); //문학 A
				break;
			case 15:
				e.go("https://hoc22.ebssw.kr/priti2/hmpg/hmpgAlctcrListView.do?menuSn=347314"); //문학 B
				break;
			}
		}
	}
}
