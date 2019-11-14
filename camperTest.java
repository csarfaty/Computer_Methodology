import static org.junit.Assert.*;

import org.junit.*;

public class camperTest {
	Camper camper= new Camper("First","last",1);
	@Test
	public void testingBothCamperConstructorsToAddNewCamper() {
		Camper camper1 = new Camper("firstName", "lastName", "address", 1, 2, 300);
		Camper camper2 = new Camper("firstName", "lastName", 1);
		camper1.addCamper();
		camper2.addCamper();
		assertEquals(2, camper.getTotalCampers());
	}
	public void testingRemovingOfCamper() {
		Camper camper1 = new Camper("firstName", "lastName", "address", 1, 2, 300);
		Camper camper2 = new Camper("firstName", "lastName", 1);
		camper1.addCamper();
		camper2.addCamper();
		camper1.removeCamper();
		assertEquals(1, camper.getTotalCampers());
		
	}
	

}
