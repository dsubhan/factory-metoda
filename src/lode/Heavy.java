package lode;

public class Heavy extends Ship{

	public Heavy(String name, int speed, int size, int hp, int nCannon) {
		super(name, speed, size, hp, nCannon);
		this.speed = 2;
		this.size = 5;
		this.hp = 15;
		this.nCannon = 10;
	}

}
