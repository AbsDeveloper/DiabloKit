/**
 * 
 */
package es.jsonkit.diablo.data;

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
public class HeroSkillTest {

	private static final Logger LOGGER = Logger.getLogger(ProfileTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		HeroSkillTest.LOGGER.info("Inicio test de las habilidades del heroe");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		HeroSkillTest.LOGGER.info("Fin test de las habilidades del heroe");
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
				HeroSkillTest.LOGGER.error("El servicio no ha devuelto informacion");
				Assert.fail();
			}
			else {
				HeroSkillTest.LOGGER.info("El servicio esta operativo, ha devuelto informacion");
			}
		}
		catch (IOException ioe) {
			HeroSkillTest.LOGGER.error("La informacion no pudo ser recogida, servicio no disponible " + ioe.getMessage());
			Assert.fail();
		}
		catch (Exception e) {
			Assert.fail();
		}
	}
}
