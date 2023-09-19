import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroFactoryTest {
	HeroInterface elfWar;
	HeroInterface elfArc;
	HeroInterface elfMag;

	HeroInterface dwaWar;
	HeroInterface dwaArc;
	HeroInterface dwaMag;

	HeroInterface robWar;
	HeroInterface robArc;
	HeroInterface robMag;
	
	HeroInterface jagMag;
	HeroInterface dwaMar;
		
	String elf = "ELF";
	String dwa = "DWARF";
	String rob = "ROBOT";
	
	String war = "WARRIOR";
	String arc = "ARCHER";
	String mag = "MAGE";
	
	@BeforeEach
	void setUp() throws Exception {
		elfWar = HeroFactory.createHero(elf, war);
		elfArc = HeroFactory.createHero(elf, arc);
		elfMag = HeroFactory.createHero(elf, mag);
		
		dwaWar = HeroFactory.createHero(dwa, war);
		dwaArc = HeroFactory.createHero(dwa, arc);
		dwaMag = HeroFactory.createHero(dwa, mag);
		
		robWar = HeroFactory.createHero(rob, war);
		robArc = HeroFactory.createHero(rob, arc);
		robMag = HeroFactory.createHero(rob, mag);
		
		jagMag = HeroFactory.createHero("JAGUAR", mag);
		dwaMar = HeroFactory.createHero(dwa, "MARKSMAN");
	}

	@Test
	void testInitDwarf() {
		assertEquals(25, dwaWar.getSTR());
		assertEquals(20, dwaWar.getDEX());
		assertEquals(20, dwaWar.getINT());
		
		assertEquals("DWARF", dwaWar.getRaceName());
	}
	
	@Test
	void testInitElf() {
		assertEquals(20, elfArc.getSTR());
		assertEquals(25, elfArc.getDEX());
		assertEquals(20, elfArc.getINT());
		
		assertEquals("ELF", elfArc.getRaceName());
	}
	
	@Test
	void testInitRob() {
		assertEquals(20, robMag.getSTR());
		assertEquals(20, robMag.getDEX());
		assertEquals(25, robMag.getINT());
		
		assertEquals("ROBOT", robMag.getRaceName());
	}
	
	@Test
	void testInitJobs() {
		assertEquals("WARRIOR", dwaWar.getJobName());
		assertEquals("ARCHER", dwaArc.getJobName());
		assertEquals("MAGE", dwaMag.getJobName());
		
		assertEquals("WARRIOR", elfWar.getJobName());
		assertEquals("ARCHER", elfArc.getJobName());
		assertEquals("MAGE", elfMag.getJobName());
		
		assertEquals("WARRIOR", robWar.getJobName());
		assertEquals("ARCHER", robArc.getJobName());
		assertEquals("MAGE", robMag.getJobName());
	}
	
	@Test
	void testBadInput() {
		assertNull(jagMag);
		assertNull(dwaMar);
	}
	
	@Test
	void testJobAttack() {
		// hey dr. b what are we supposed to be expecting on the attack value
		// because one of these classes is WAY better than the others in one case and awful in the other
		
		// anyway we'll test this for all the job/class combos sure
		// value... 2, cuz i bet thats about what we're expecting
		
		// Dwarves, so 25 STR
		assertEquals(70, dwaWar.attack(2));
		assertEquals(60, dwaArc.attack(2));
		assertEquals(60, dwaMag.attack(2));
		
		// Elves, so 25 DEX
		assertEquals(65, elfWar.attack(2));
		assertEquals(75, elfArc.attack(2));
		assertEquals(65, elfMag.attack(2));
		
		// Robots, so 25 INT
		assertEquals(60, robWar.attack(2));
		assertEquals(60, robArc.attack(2));
		assertEquals(70, robMag.attack(2));
		
	}

}
