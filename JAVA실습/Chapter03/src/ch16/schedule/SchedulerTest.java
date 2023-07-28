package ch16.schedule;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("전화 상담원 할당 방식을 선택하세요");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원");
		
		int ch = System.in.read();
		if ( ch == 'R' || ch =='r') {
			Scheduler scheduler = new RoundRobin();
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		else if ( ch == 'L' || ch =='l') {
			Scheduler scheduler = new LeastJob();
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		else if ( ch == 'P' || ch =='p') {
			Scheduler scheduler = new PriorityAllocation();
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
	}

}
