
public class Hero implements HeroInterface {
	Race heroRace;
	Job heroJob;
	
	public Hero(Race heroRace, Job heroJob) {
		this.heroRace = heroRace;
		this.heroJob = heroJob;
	}

	@Override
	public int attack(int val) {
		return heroJob.attack(val, heroRace.getSTR(), heroRace.getDEX(), heroRace.getINT());
	}

	@Override
	public int getSTR() {
		return heroRace.getSTR();
	}

	@Override
	public int getDEX() {
		return heroRace.getDEX();
	}

	@Override
	public int getINT() {
		return heroRace.getINT();
	}

	@Override
	public String getRaceName() {
		return heroRace.getRaceName();
	}

	@Override
	public String getJobName() {
		return heroJob.getJobName();
	}

}
