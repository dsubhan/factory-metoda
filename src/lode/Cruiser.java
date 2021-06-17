package lode;

public class Cruiser extends Ship{
	

	public Cruiser(String name, int speed, int size, int hp, int nCannon) {
		super(name, speed, size, hp, nCannon);
		this.speed = 10;
		this.size = 3;
		this.hp = 5;
		this.nCannon = 2;
	}

	@Override
	public String toString() {
		return "Cruiser  name=" + name + ", speed=" + speed + ", size=" + size + ", hp=" + hp + ", nCannon=" + nCannon
				+ "";
	}
	
	

}
