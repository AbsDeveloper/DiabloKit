/**
 * 
 */
package es.jsonkit.diablo.arq;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.jsonkit.diablo.data.ProfileTest;
import es.jsonkit.exceptions.GenericDiablo3ApiException;
import es.jsonkit.utilities.DiabloApiUtilities;

/**
 * @author Adrian
 * 
 */
public class ArqHeroItemsTest {

	private static final String SERVER = "eu";

	private static final String BATTLE_TAG = "KIROS-2221";

	private static final Integer HERO_ID = 9698410;

	private static final Logger LOGGER = Logger.getLogger(ProfileTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ArqHeroItemsTest.LOGGER.info("Inicio test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ArqHeroItemsTest.LOGGER.info("Fin test");
	}

	@Test
	public void test() {

		try {
			DiabloApiUtilities.getHeroItems(ArqHeroItemsTest.BATTLE_TAG, ArqHeroItemsTest.SERVER, ArqHeroItemsTest.HERO_ID);
		}
		catch (GenericDiablo3ApiException e) {
			Assert.fail();
		}

	}
}
