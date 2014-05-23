/**
 * 
 */
package es.jsonkit.utilities;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import es.jsonkit.exceptions.IODiablo3ApiException;
import es.jsonkit.exceptions.MalformedUrlDiablo3ApiException;
import es.jsonkit.exceptions.UnknownHostDiablo3ApiException;
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
	 * @throws IODiablo3ApiException
	 * @throws MalformedUrlDiablo3ApiException
	 * @throws UnknownHostDiablo3ApiException
	 */
	public static IDiabloObject getHeroSkill(final String pBattleTag, final String server, final Integer pHeroId) throws UnknownHostDiablo3ApiException,
			MalformedUrlDiablo3ApiException, IODiablo3ApiException {
		return getGson(new HeroSkill(pBattleTag, server, pHeroId));
	}

	/**
	 * @param pBattleTag
	 * @param pHeroId
	 * @return
	 * @throws IODiablo3ApiException
	 * @throws MalformedUrlDiablo3ApiException
	 * @throws UnknownHostDiablo3ApiException
	 */
	public static IDiabloObject getHeroItems(final String pBattleTag, final String server, final Integer pHeroId) throws UnknownHostDiablo3ApiException,
			MalformedUrlDiablo3ApiException, IODiablo3ApiException {
		return getGson(new HeroItems(pBattleTag, server, pHeroId));
	}

	/**
	 * @param pBattleTag
	 * @param pHeroId
	 * @return
	 * @throws IODiablo3ApiException
	 * @throws MalformedUrlDiablo3ApiException
	 * @throws UnknownHostDiablo3ApiException
	 */
	public static IDiabloObject getHero(final String pBattleTag, final String server, final Integer pHeroId) throws UnknownHostDiablo3ApiException,
			MalformedUrlDiablo3ApiException, IODiablo3ApiException {
		return getGson(new Hero(pBattleTag, server, pHeroId));
	}

	/**
	 * @param pBattleTag
	 * @return
	 * @throws IODiablo3ApiException
	 * @throws MalformedUrlDiablo3ApiException
	 * @throws UnknownHostDiablo3ApiException
	 */
	public static IDiabloObject getProfile(final String pBattleTag, final String server) throws UnknownHostDiablo3ApiException, MalformedUrlDiablo3ApiException,
			IODiablo3ApiException {
		return getGson(new Profile(pBattleTag, server));
	}

	/**
	 * @param pIDiabloObject
	 * @return
	 * @throws
	 */
	private static IDiabloObject getGson(final IDiabloObject pIDiabloObject) throws UnknownHostDiablo3ApiException, MalformedUrlDiablo3ApiException, IODiablo3ApiException {
		Gson g = new Gson();
		JsonReader jsonReader = null;
		IDiabloObject iDiabloObject = null;

		try {
			jsonReader = new JsonReader(new InputStreamReader(new URL(pIDiabloObject.generateUrl()).openStream()));// pIDiabloObject.getUrl()
			iDiabloObject = g.fromJson(jsonReader, pIDiabloObject.getClass());
		}
		catch (UnknownHostException uhe) {
			DiabloApiUtilities.LOGGER.error("getGson --> La informacion no pudo ser recogida, se ha especificado una url erronea " + uhe.getMessage());
			throw new UnknownHostDiablo3ApiException(uhe.getMessage(), uhe.getCause());
		}
		catch (MalformedURLException mue) {
			DiabloApiUtilities.LOGGER.error("getGson --> La informacion no pudo ser recogida, se ha especificado un protocolo desconocido " + mue.getMessage());
			throw new MalformedUrlDiablo3ApiException(mue.getMessage(), mue.getCause());
		}
		catch (IOException ioe) {
			DiabloApiUtilities.LOGGER.error("getGson --> La informacion no pudo ser recogida, ocurrio algun problema al obtener la informacion " + ioe.getMessage());
			throw new IODiablo3ApiException(ioe.getMessage(), ioe.getCause());
		}

		return iDiabloObject;
	}
}
