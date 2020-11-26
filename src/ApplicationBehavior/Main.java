package ApplicationBehavior;


public class Main {

		public static void main(String args[]) {
			Character charac = new King(new BehaviorBow());
			charac.fight();
			charac.setWeapon(new BehaviorSword());
			charac.fight();
			
			FrameMenu f = new FrameMenu();
		}
}
