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

import es.jsonkit.profile.ability.HeroSkill;

/**
 * @author Adrian
 * 
 */
public class SkillTest {

	private static final Logger LOGGER = Logger.getLogger(ProfileTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		LOGGER.info("Inicio test de las habilidades del heroe");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		LOGGER.info("Fin test de las habilidades del heroe");
	}

	@Test
	public void test() {
		Gson g = new Gson();
		JsonReader jsonReader = null;
		HeroSkill hs = null;

		try {
			jsonReader = new JsonReader(new InputStreamReader(new URL("http://eu.battle.net/api/d3/profile/KIROS-2221/hero/9698410").openStream()));
			hs = g.fromJson(jsonReader, HeroSkill.class);

			if (hs == null) {
				LOGGER.error("SkillTest --> El servicio no ha devuelto informacion");
				Assert.fail();
			}
			else {
				LOGGER.info(hs.toString());
			}
		}
		catch (IOException ioe) {
			LOGGER.error("SkillTest --> La informacion no pudo ser recogida, servicio no disponible " + ioe.getMessage());
			Assert.fail();
		}

	}
}
