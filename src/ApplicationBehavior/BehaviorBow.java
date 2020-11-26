package ApplicationBehavior;

public class BehaviorBow implements BehaviorWeapon{

	public String useWeapon() {
		System.out.println("I am a bow");
		return "fight with a bow";
	}

}
