
public abstract class Days extends Onlineclass{
	int[] classes; //1: ��A 2: ��B 3: �� 4: �ѱ���  5: ���� 6: �߱��� 7: �������� 8: �ڹ� 9:�׺� 10: DB 11: ���� 12: �������� 13 : �� 14 : ����A 15:����B 16: ü��	 
	void run(Ebs e,GoogleClassroom c, Goorm g) {
		for(int i=0;i<classes.length;i++) {
			//
			switch(classes[i]) {
			case 1:
				e.go("https://hoc22.ebssw.kr/sr2english/hmpg/hmpgAlctcrListView.do?menuSn=347280"); //��A
				break;
			case 2:
				c.go("https://classroom.google.com/u/0/c/NjkzNzExNjk0Njha"); //��B
				break;
			case 3:
				e.go("https://hoc22.ebssw.kr/sunrin2math/hmpg/hmpgAlctcrListView.do?menuSn=391020"); //����
				break;
			case 4:
				e.go("https://hoc22.ebssw.kr/sunrinhistory01/hmpg/hmpgAlctcrListView.do?menuSn=346987"); //�ѱ���
				break;
			case 5:
				e.go("https://hoc22.ebssw.kr/peter1667/hmpg/hmpgAlctcrListView.do?menuSn=399240"); //����
				break;
			case 6:
				c.go("https://classroom.google.com/u/0/c/Njg3OTk3NjE4Mjla"); //�߱���
				break;
			case 7:
				c.go("https://classroom.google.com/u/0/c/Njg4NTAzNjkxMTBa"); //����
				break;
			case 8:
				c.go("https://classroom.google.com/u/0/c/Njg3OTk2MTE0NTda"); //�ڹ�
				break;
			case 9:
				e.go("https://hoc22.ebssw.kr/sunrintest01/hmpg/hmpgAlctcrListView.do?menuSn=291548"); //��Ʈ��ũ����
				break;
			case 10:
				g.go("https://sunrint-hs.goorm.io/learn/lecture/17890/2020-%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4"); //DB
				break;
			case 11:
				e.go("https://hoc22.ebssw.kr/sunrint2jinro/hmpg/hmpgAlctcrListView.do?menuSn=333224"); //����
				break;
			case 12:
				e.go("https://hoc22.ebssw.kr/ca2020/hmpg/hmpgAlctcrListView.do?menuSn=409665"); //����������ǥ
				break;
			case 13:
				e.go("https://hoc22.ebssw.kr/peter1666/hmpg/hmpgAlctcrListView.do?menuSn=398433"); //��
				break;
			case 14:
				e.go("https://hoc22.ebssw.kr/being1212/hmpg/hmpgAlctcrListView.do?menuSn=345899"); //���� A
				break;
			case 15:
				e.go("https://hoc22.ebssw.kr/priti2/hmpg/hmpgAlctcrListView.do?menuSn=347314"); //���� B
				break;
			}
		}
	}
}
