package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashSet memberhashset = new MemberHashSet();
		Member member1 = new Member(1001,"LEE");
		Member member2 = new Member(1002,"KIM");
		Member member3 = new Member(1003,"KANG");
		Member member4 = new Member(1004,"PARK");
		Member member5 = new Member(1005,"CHOI");
		
		memberhashset.addMember(member1);
		memberhashset.addMember(member2);
		memberhashset.addMember(member3);
		memberhashset.addMember(member4);
		memberhashset.addMember(member5);
		
		memberhashset.showAllMember();
		memberhashset.removeMember(1001);
		memberhashset.showAllMember();
		memberhashset.removeMember(1006);
	}

}
