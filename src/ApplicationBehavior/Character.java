package ApplicationBehavior;

abstract class Character {
	
	protected BehaviorWeapon weapon;
	
	public Character(BehaviorWeapon w) {
		this.weapon = w;
	}

	public String fight() {
		return this.weapon.useWeapon();
	}
	
	public void setWeapon(BehaviorWeapon w) {
		this.weapon = w;
	}
	
}
