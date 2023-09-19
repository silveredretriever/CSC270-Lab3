public class HeroFactory
{

   public static HeroInterface createHero(String raceName, String jobName)   
   {
	  Race heroRace;
	  Job heroJob;
	  
	  if (raceName == "DWARF") {
		  heroRace = new Dwarf();
	  } else if (raceName == "ELF") {
		  heroRace = new Elf();
	  } else if (raceName == "ROBOT") {
		  heroRace = new Robot();
	  } else {
		  return null;
	  }
	  
	  if (jobName == "WARRIOR") {
		  heroJob = new Warrior();
	  } else if (jobName == "ARCHER") {
		  heroJob = new Archer();
	  } else if (jobName == "MAGE") {
		  heroJob = new Mage();
	  } else {
		  return null;
	  }
	  
      return new Hero(heroRace, heroJob);
   }







}