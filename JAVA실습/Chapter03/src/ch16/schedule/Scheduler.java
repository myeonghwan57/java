package ch16.schedule;

public interface Scheduler {
	void getNextCall();
	void sendCallToAgent();
}
