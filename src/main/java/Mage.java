
public class Mage extends Job {

	@Override
	public int attack(int val, int strength, int dexterity, int intelligence) {
		return dexterity+intelligence*val;
	}

	@Override
	public String getJobName() {
		return "MAGE";
	}

}
