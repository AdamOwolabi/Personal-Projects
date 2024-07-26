
public class Sword {
	double cost;
	int damage;
	boolean isEngraved;
	public Sword() {
		cost = 2.0;
		damage = 4;
		isEngraved = false;
		
	}
	
	@Override
	public String toString() {
		return "Sword [cost=" + cost + ", damage=" + damage + ", isEngraved=" + isEngraved + "]";
	}

	public Sword(double cost, int damage, boolean isEngraved) {
		this.cost = cost;
		this.damage = damage;
		this.isEngraved = isEngraved;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void setIsEngraved(boolean isEngraved) {
		this.isEngraved = isEngraved;
	}

	public double getCost() {
		return cost;
	}

	public int getDamage() {
		return damage;
	}

	public boolean getIsEngraved() {
		return isEngraved;
	}
}
