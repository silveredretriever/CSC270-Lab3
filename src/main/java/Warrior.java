
public class Warrior extends Job {

	@Override
	public int attack(int val, int strength, int dexterity, int intelligence) {
		return strength*val+dexterity;
	}

	@Override
	public String getJobName() {
		return "WARRIOR";
	}

}
