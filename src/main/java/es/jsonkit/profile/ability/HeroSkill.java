/**
 * 
 */
package es.jsonkit.profile.ability;

import es.jsonkit.profile.Hero;
import es.jsonkit.url.constantes.Constantes;

/**
 * @author Adrian
 * 
 */
public class HeroSkill extends Hero {

	public static final String END_OF_REQUEST = "";

	private Skills skills;

	public HeroSkill() {
		super();
	}

	public HeroSkill(final String battleTag, final String server, final Integer heroId) {
		super(battleTag, server, heroId);
	}

	public HeroSkill(final String battleTag, final Integer heroId) {
		super(battleTag, heroId);
	}

	/**
	 * @return the skills
	 */
	public Skills getSkills() {
		return this.skills;
	}

	/**
	 * @param skills
	 *            the skills to set
	 */
	public void setSkills(final Skills skills) {
		this.skills = skills;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HeroSkill [skills=" + this.skills + "]";
	}

	@Override
	public String generateUrl() {
		StringBuilder strUrl = new StringBuilder();
		strUrl.append(Constantes.URL_HTTP);
		strUrl.append(this.getServer());
		strUrl.append(Constantes.URL_PUNTO);
		strUrl.append(Constantes.URL_BATTLE);
		strUrl.append(Constantes.URL_NET);
		strUrl.append(Constantes.URL_API);
		strUrl.append(Constantes.URL_DIABLO3);
		strUrl.append(Constantes.URL_PROFILE);
		strUrl.append(this.getBattleTag());
		strUrl.append(Constantes.URL_BARRA);
		strUrl.append(Constantes.URL_HERO);
		strUrl.append(HeroSkill.END_OF_REQUEST);
		strUrl.append(this.getHeroId());
		return strUrl.toString();
	}
}
