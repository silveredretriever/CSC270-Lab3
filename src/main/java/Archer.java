
public class Archer extends Job {

	@Override
	public int attack(int val, int strength, int dexterity, int intelligence) {
		return (int) (dexterity*1.5*val);
	}

	@Override
	public String getJobName() {
		return "ARCHER";
	}

}
