package es.jsonkit.profile;

import java.util.ArrayList;
import java.util.List;

public class Profile {

	public static final String END_OF_REQUEST = "/";
	private List<Hero> heroes = new ArrayList<Hero>();
	private Integer lastHeroPlayed;
	private Integer lastUpdated;
	private Kills kills;
	private TimePlayed timePlayed;
	private List<FallenHero> fallenHeroes = new ArrayList<FallenHero>();
	private Integer paragonLevel;
	private Integer paragonLevelHardcore;
	private String battleTag;
	private Progression progression;

	public Profile() {
		this.inicializarProfile();
	}

	private void inicializarProfile() {
		this.heroes = new ArrayList<Hero>();
		this.kills = new Kills();
		this.timePlayed = new TimePlayed();
		this.progression = new Progression();
	}

	/**
	 * @return the heroes
	 */
	public List<Hero> getHeroes() {
		return heroes;
	}

	/**
	 * @param heroes
	 *            the heroes to set
	 */
	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
	}

	/**
	 * @return the lastHeroPlayed
	 */
	public Integer getLastHeroPlayed() {
		return lastHeroPlayed;
	}

	/**
	 * @param lastHeroPlayed
	 *            the lastHeroPlayed to set
	 */
	public void setLastHeroPlayed(Integer lastHeroPlayed) {
		this.lastHeroPlayed = lastHeroPlayed;
	}

	/**
	 * @return the lastUpdated
	 */
	public Integer getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * @param lastUpdated
	 *            the lastUpdated to set
	 */
	public void setLastUpdated(Integer lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	/**
	 * @return the kills
	 */
	public Kills getKills() {
		return kills;
	}

	/**
	 * @param kills
	 *            the kills to set
	 */
	public void setKills(Kills kills) {
		this.kills = kills;
	}

	/**
	 * @return the timePlayed
	 */
	public TimePlayed getTimePlayed() {
		return timePlayed;
	}

	/**
	 * @param timePlayed
	 *            the timePlayed to set
	 */
	public void setTimePlayed(TimePlayed timePlayed) {
		this.timePlayed = timePlayed;
	}

	/**
	 * @return the fallenHeroes
	 */
	public List<FallenHero> getFallenHeroes() {
		return fallenHeroes;
	}

	/**
	 * @param fallenHeroes
	 *            the fallenHeroes to set
	 */
	public void setFallenHeroes(List<FallenHero> fallenHeroes) {
		this.fallenHeroes = fallenHeroes;
	}

	/**
	 * @return the paragonLevel
	 */
	public Integer getParagonLevel() {
		return paragonLevel;
	}

	/**
	 * @param paragonLevel
	 *            the paragonLevel to set
	 */
	public void setParagonLevel(Integer paragonLevel) {
		this.paragonLevel = paragonLevel;
	}

	/**
	 * @return the paragonLevelHardcore
	 */
	public Integer getParagonLevelHardcore() {
		return paragonLevelHardcore;
	}

	/**
	 * @param paragonLevelHardcore
	 *            the paragonLevelHardcore to set
	 */
	public void setParagonLevelHardcore(Integer paragonLevelHardcore) {
		this.paragonLevelHardcore = paragonLevelHardcore;
	}

	/**
	 * @return the battleTag
	 */
	public String getBattleTag() {
		return battleTag;
	}

	/**
	 * @param battleTag
	 *            the battleTag to set
	 */
	public void setBattleTag(String battleTag) {
		this.battleTag = battleTag;
	}

	/**
	 * @return the progression
	 */
	public Progression getProgression() {
		return progression;
	}

	/**
	 * @param progression
	 *            the progression to set
	 */
	public void setProgression(Progression progression) {
		this.progression = progression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [heroes=" + heroes + ", lastHeroPlayed=" + lastHeroPlayed + ", lastUpdated=" + lastUpdated + ", kills=" + kills + ", timePlayed=" + timePlayed
				+ ", fallenHeroes=" + fallenHeroes + ", paragonLevel=" + paragonLevel + ", paragonLevelHardcore=" + paragonLevelHardcore + ", battleTag=" + battleTag
				+ ", progression=" + progression + "]";
	}

}
