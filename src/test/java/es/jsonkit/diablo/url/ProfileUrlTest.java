package es.jsonkit.diablo.url;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.jsonkit.profile.Profile;

/**
 * http://{server}.battle.net/api/d3/profile/{battleTag}/
 * 
 * @author Adrian
 * 
 */
public class ProfileUrlTest {

	private static final Logger LOGGER = Logger.getLogger(ProfileUrlTest.class);

	private static final String SERVER = "eu";

	private static final String BATTLE_TAG = "KIROS-2221";

	private static final String EXPECTED_URL = "http://eu.battle.net/api/d3/profile/KIROS-2221/";

	/**
	 * @throws java.lang.Exception
	 */
	@Before()
	public void setUp() throws Exception {
		ProfileUrlTest.LOGGER.info("Inicio test para la generacion de la url del jon para el perfil del heroe");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After()
	public void tearDown() throws Exception {
		ProfileUrlTest.LOGGER.info("Fin test para la generacion de la url del jon para el perfil del heroe");
	}

	@Test()
	public void test() {
		Profile profile = new Profile();
		profile.setBattleTag(ProfileUrlTest.BATTLE_TAG);
		profile.setServer(ProfileUrlTest.SERVER);

		ProfileUrlTest.LOGGER.info("Url Esperada   --> " + ProfileUrlTest.EXPECTED_URL);
		ProfileUrlTest.LOGGER.info("Url Construida --> " + profile.generateUrl());

		Assert.assertEquals(ProfileUrlTest.EXPECTED_URL, profile.generateUrl());

	}

}
