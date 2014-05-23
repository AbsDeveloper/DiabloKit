/**
 * 
 */
package es.jsonkit.diablo.data;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import es.jsonkit.profile.Hero;

/**
 * @author Adrian
 * 
 */
public class HeroTest {

	private static final Logger LOGGER = Logger.getLogger(ProfileTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		HeroTest.LOGGER.info("Inicio test de las habilidades del heroe");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		HeroTest.LOGGER.info("Fin test de las habilidades del heroe");
	}

	@Test
	public void test() {
		Gson g = new Gson();
		JsonReader jsonReader = null;
		Hero hs = null;

		try {
			jsonReader = new JsonReader(new InputStreamReader(new URL("http://eu.battle.net/api/d3/profile/KIROS-2221/hero/9698410").openStream()));
			hs = g.fromJson(jsonReader, Hero.class);

			if (hs == null) {
				HeroTest.LOGGER.error("El servicio no ha devuelto informacion");
				Assert.fail();
			}
			else {
				HeroTest.LOGGER.info("El servicio esta operativo, ha devuelto informacion");
			}
		}
		catch (UnknownHostException uhe) {
			HeroTest.LOGGER.error("La informacion no pudo ser recogida, servicio no disponible " + uhe.getMessage());
			Assert.fail();
		}
		catch (MalformedURLException mue) {
			HeroTest.LOGGER.error("La informacion no pudo ser recogida, se ha especificado un protocolo desconocido " + mue.getMessage());
			Assert.fail();
		}
		catch (IOException ioe) {
			HeroTest.LOGGER.error("La informacion no pudo ser recogida, servicio no disponible " + ioe.getMessage());
			Assert.fail();
		}
		catch (Exception e) {
			Assert.fail();
		}

	}
}
