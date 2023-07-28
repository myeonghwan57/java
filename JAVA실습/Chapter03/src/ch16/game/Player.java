package ch16.game;

public class Player {

	private PlayerLevel level;
	
	public Player(){ // 기본 플레이어를 초급자로 
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel( PlayerLevel level ) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}

}
