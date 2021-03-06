package es.jsonkit.diablo.url;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.jsonkit.profile.Hero;
import es.jsonkit.profile.ability.HeroSkill;
import es.jsonkit.url.constantes.Constantes;

/**
 * http://{server}.battle.net/api/d3/profile/{battleTag}/
 * 
 * @author Adrian
 * 
 */
public class HeroUrlTest {

	private static final Logger LOGGER = Logger.getLogger(HeroUrlTest.class);

	private static final String SERVER = "eu";

	private static final String BATTLE_TAG = "KIROS-2221";

	private static final Integer HERO_ID = 9698410;

	private static final String EXPECTED_URL = "http://eu.battle.net/api/d3/profile/KIROS-2221/hero/9698410";

	/**
	 * @throws java.lang.Exception
	 */
	@Before()
	public void setUp() throws Exception {
		HeroUrlTest.LOGGER.info("Inicio test para la generacion de la url del jon para el perfil de los items y skills");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After()
	public void tearDown() throws Exception {
		HeroUrlTest.LOGGER.info("Fin test para la generacion de la url del jon para el perfil de los items y skills");
	}

	@Test()
	public void test() {
		HeroSkill hero = new HeroSkill();
		hero.setBattleTag(HeroUrlTest.BATTLE_TAG);
		hero.setServer(HeroUrlTest.SERVER);
		hero.setHeroId(HeroUrlTest.HERO_ID);

		HeroUrlTest.LOGGER.info("Url Esperada   --> " + HeroUrlTest.EXPECTED_URL);
		HeroUrlTest.LOGGER.info("Url Construida --> " + hero.generateUrl());

		Assert.assertEquals(HeroUrlTest.EXPECTED_URL, hero.generateUrl());

	}

	private String generateUrl(final Hero hero) {
		StringBuilder strUrl = new StringBuilder();
		strUrl.append(Constantes.URL_HTTP);
		strUrl.append(hero.getServer());
		strUrl.append(Constantes.URL_PUNTO);
		strUrl.append(Constantes.URL_BATTLE);
		strUrl.append(Constantes.URL_NET);
		strUrl.append(Constantes.URL_API);
		strUrl.append(Constantes.URL_DIABLO3);
		strUrl.append(Constantes.URL_PROFILE);
		strUrl.append(hero.getBattleTag());
		strUrl.append(Constantes.URL_BARRA);
		strUrl.append(Constantes.URL_HERO);
		strUrl.append(HeroSkill.END_OF_REQUEST);
		strUrl.append(hero.getId());
		return strUrl.toString();
	}

}
