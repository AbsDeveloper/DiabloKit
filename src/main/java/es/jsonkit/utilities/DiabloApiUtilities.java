/**
 * 
 */
package es.jsonkit.utilities;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import es.jsonkit.profile.Hero;
import es.jsonkit.profile.IDiabloObject;
import es.jsonkit.profile.Profile;
import es.jsonkit.profile.ability.HeroItems;
import es.jsonkit.profile.ability.HeroSkill;

/**
 * @author ABS_Developer
 * 
 */

public class DiabloApiUtilities {

	private static final Logger LOGGER = Logger.getLogger(DiabloApiUtilities.class);

	/**
	 * @param pBattleTag
	 * @param pHeroId
	 * @return
	 */
	public static IDiabloObject getHeroSkill(final String pBattleTag, final Integer pHeroId) {
		return getHeroSkillObject(pBattleTag, pHeroId);
	}

	/**
	 * @param pBattleTag
	 * @param pHeroId
	 * @return
	 */
	public static IDiabloObject getHeroItems(final String pBattleTag, final Integer pHeroId) {
		return getHeroItemsObject(pBattleTag, pHeroId);
	}

	/**
	 * @param pBattleTag
	 * @param pHeroId
	 * @return
	 */
	public static IDiabloObject getHero(final String pBattleTag, final Integer pHeroId) {
		return getHeroObject(pBattleTag, pHeroId);
	}

	/**
	 * @param pBattleTag
	 * @return
	 */
	public static IDiabloObject getProfile(final String pBattleTag) {
		return getProfileObject(pBattleTag);
	}

	/**
	 * @param pIDiabloObject
	 * @return
	 */
	private static IDiabloObject getGson(final IDiabloObject pIDiabloObject) {
		Gson g = new Gson();
		JsonReader jsonReader = null;
		IDiabloObject iDiabloObject = null;

		try {
			jsonReader = new JsonReader(new InputStreamReader(new URL(pIDiabloObject.generateUrl()).openStream()));// pIDiabloObject.getUrl()
			iDiabloObject = g.fromJson(jsonReader, pIDiabloObject.getClass());
		}
		catch (IOException ioe) {
			DiabloApiUtilities.LOGGER.error("HeroTest --> La informacion no pudo ser recogida, servicio no disponible " + ioe.getMessage());
		}

		return iDiabloObject;
	}

	/**
	 * @param pBattleTag
	 * @param pHeroId
	 * @return
	 */
	private static IDiabloObject getHeroSkillObject(final String pBattleTag, final Integer pHeroId) {
		return getGson(new HeroSkill(pBattleTag, pHeroId));
	}

	/**
	 * @param pBattleTag
	 * @param pHeroId
	 * @return
	 */
	private static IDiabloObject getHeroItemsObject(final String pBattleTag, final Integer pHeroId) {
		return getGson(new HeroItems(pBattleTag, pHeroId));
	}

	/**
	 * @param pBattleTag
	 * @param pHeroId
	 * @return
	 */
	private static IDiabloObject getHeroObject(final String pBattleTag, final Integer pHeroId) {
		return getGson(new Hero(pBattleTag, pHeroId));
	}

	/**
	 * @param pBattleTag
	 * @return
	 */
	private static IDiabloObject getProfileObject(final String pBattleTag) {
		return getGson(new Profile(pBattleTag));
	}
}
