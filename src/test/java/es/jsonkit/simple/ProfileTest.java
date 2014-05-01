/**
 * 
 */
package es.jsonkit.simple;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import es.jsonkit.profile.Profile;

/**
 * @author Adrian
 * 
 */
public class ProfileTest {

	private static final Logger LOGGER = Logger.getLogger(ProfileTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		LOGGER.info("Inicio test del perfil del heroe");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		LOGGER.info("Fin test del perfil del heroe");
	}

	@Test
	public void test() {
		Gson g = new Gson();
		JsonReader jsonReader = null;
		Profile profile = null;

		try {
			jsonReader = new JsonReader(new InputStreamReader(new URL("http://eu.battle.net/api/d3/profile/MrSk-2664/").openStream()));
			profile = g.fromJson(jsonReader, Profile.class);

			if (profile == null) {
				LOGGER.error("ProfileTest --> El servicio no ha devuelto informacion");
				Assert.fail();
			}
			else {
				LOGGER.info(profile.toString());
			}
		}
		catch (IOException ioe) {
			LOGGER.error("ProfileTest -->  La informacion no pudo ser recogida, servicio no disponible " + ioe.getMessage());
			Assert.fail();
		}

	}

}
