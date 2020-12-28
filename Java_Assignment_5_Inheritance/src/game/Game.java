package game;

public class Game {
	
	public static void main(String[] args) {
		
		GameObject player = new Player();
		player.update();
		
		GameObject enemy = new Enemy();
		enemy.update();
	}
	

}
