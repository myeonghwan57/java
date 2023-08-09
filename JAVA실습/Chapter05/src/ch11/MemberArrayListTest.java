package ch11;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberArrayList memberarraylist = new MemberArrayList();
		Member member1 = new Member(1001,"LEE");
		Member member2 = new Member(1002,"KIM");
		Member member3 = new Member(1003,"KANG");
		Member member4 = new Member(1004,"PARK");
		Member member5 = new Member(1005,"CHOI");
		
		memberarraylist.addMember(member1);
		memberarraylist.addMember(member2);
		memberarraylist.addMember(member3);
		memberarraylist.addMember(member4);
		memberarraylist.addMember(member5);
		
		memberarraylist.showAllMember();
		memberarraylist.removeMember(1001);
		memberarraylist.showAllMember();
		memberarraylist.removeMember(1006);
	}

}
