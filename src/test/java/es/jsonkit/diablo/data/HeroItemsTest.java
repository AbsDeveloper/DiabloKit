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

import es.jsonkit.profile.ability.HeroItems;

/**
 * @author Adrian
 * 
 */
public class HeroItemsTest {

	private static final Logger LOGGER = Logger.getLogger(ProfileTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		HeroItemsTest.LOGGER.info("Inicio test de los items del heroe");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		HeroItemsTest.LOGGER.info("Fin test de los items del heroe");
	}

	@Test
	public void test() {
		Gson g = new Gson();
		JsonReader jsonReader = null;
		HeroItems hi = null;

		try {
			jsonReader = new JsonReader(new InputStreamReader(new URL("http://eu.battle.net/api/d3/profile/KIROS-2221/hero/9698410").openStream()));
			hi = g.fromJson(jsonReader, HeroItems.class);

			if (hi == null) {
				HeroItemsTest.LOGGER.error("El servicio no ha devuelto informacion");
				Assert.fail();
			}
			else {
				HeroItemsTest.LOGGER.info("El servicio esta operativo, ha devuelto informacion");
			}
		}
		catch (IOException ioe) {
			HeroItemsTest.LOGGER.error("La informacion no pudo ser recogida, servicio no disponible " + ioe.getMessage());
			Assert.fail();
		}
		catch (Exception e) {
			Assert.fail();
		}
	}
}
