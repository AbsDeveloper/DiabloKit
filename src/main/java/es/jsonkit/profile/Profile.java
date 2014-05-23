package es.jsonkit.profile;

import java.util.List;

import es.jsonkit.url.constantes.Constantes;

public class Profile extends IDiabloObject {

	public static final String END_OF_REQUEST = "/";
	private List<Hero> heroes = null;
	private Integer lastHeroPlayed;
	private Integer lastUpdated;
	private Kills kills;
	private TimePlayed timePlayed;
	private List<FallenHero> fallenHeroes = null;
	private Integer paragonLevel;
	private Integer paragonLevelHardcore;
	private Progression progression;

	public Profile() {
	}

	public Profile(final String battleTag) {
		super(battleTag);
	}

	public Profile(final String battleTag, final String server) {
		super(battleTag, server);
	}

	/**
	 * @return the heroes
	 */
	public List<Hero> getHeroes() {
		return this.heroes;
	}

	/**
	 * @param heroes
	 *            the heroes to set
	 */
	public void setHeroes(final List<Hero> heroes) {
		this.heroes = heroes;
	}

	/**
	 * @return the lastHeroPlayed
	 */
	public Integer getLastHeroPlayed() {
		return this.lastHeroPlayed;
	}

	/**
	 * @param lastHeroPlayed
	 *            the lastHeroPlayed to set
	 */
	public void setLastHeroPlayed(final Integer lastHeroPlayed) {
		this.lastHeroPlayed = lastHeroPlayed;
	}

	/**
	 * @return the lastUpdated
	 */
	public Integer getLastUpdated() {
		return this.lastUpdated;
	}

	/**
	 * @param lastUpdated
	 *            the lastUpdated to set
	 */
	public void setLastUpdated(final Integer lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	/**
	 * @return the kills
	 */
	public Kills getKills() {
		return this.kills;
	}

	/**
	 * @param kills
	 *            the kills to set
	 */
	public void setKills(final Kills kills) {
		this.kills = kills;
	}

	/**
	 * @return the timePlayed
	 */
	public TimePlayed getTimePlayed() {
		return this.timePlayed;
	}

	/**
	 * @param timePlayed
	 *            the timePlayed to set
	 */
	public void setTimePlayed(final TimePlayed timePlayed) {
		this.timePlayed = timePlayed;
	}

	/**
	 * @return the fallenHeroes
	 */
	public List<FallenHero> getFallenHeroes() {
		return this.fallenHeroes;
	}

	/**
	 * @param fallenHeroes
	 *            the fallenHeroes to set
	 */
	public void setFallenHeroes(final List<FallenHero> fallenHeroes) {
		this.fallenHeroes = fallenHeroes;
	}

	/**
	 * @return the paragonLevel
	 */
	public Integer getParagonLevel() {
		return this.paragonLevel;
	}

	/**
	 * @param paragonLevel
	 *            the paragonLevel to set
	 */
	public void setParagonLevel(final Integer paragonLevel) {
		this.paragonLevel = paragonLevel;
	}

	/**
	 * @return the paragonLevelHardcore
	 */
	public Integer getParagonLevelHardcore() {
		return this.paragonLevelHardcore;
	}

	/**
	 * @param paragonLevelHardcore
	 *            the paragonLevelHardcore to set
	 */
	public void setParagonLevelHardcore(final Integer paragonLevelHardcore) {
		this.paragonLevelHardcore = paragonLevelHardcore;
	}

	/**
	 * @return the progression
	 */
	public Progression getProgression() {
		return this.progression;
	}

	/**
	 * @param progression
	 *            the progression to set
	 */
	public void setProgression(final Progression progression) {
		this.progression = progression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [heroes=" + this.heroes + ", lastHeroPlayed=" + this.lastHeroPlayed + ", lastUpdated=" + this.lastUpdated + ", kills=" + this.kills + ", timePlayed="
				+ this.timePlayed + ", fallenHeroes=" + this.fallenHeroes + ", paragonLevel=" + this.paragonLevel + ", paragonLevelHardcore=" + this.paragonLevelHardcore
				+ ", battleTag=" + "this.progression=" + this.progression + "]";
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
		strUrl.append(Profile.END_OF_REQUEST);
		return strUrl.toString();
	}

}
