package es.jsonkit.profile;

import com.google.gson.annotations.SerializedName;

/**
 * @author Adrian
 * 
 *         La clase FallenHero almacena la informacion referente a los heroes
 *         caidos en
 *         el modo hardocre de juego, la informacion es limitada
 * 
 */
public class FallenHero {

	private String name;

	private Integer level;

	private Stats stats;

	private Kills kills;

	private Boolean hardcore;

	private Integer heroId;

	private Integer gender;
	@SerializedName("class")
	private String clase;

	public FallenHero() {
		this.inicializarFallenHero();
	}

	private void inicializarFallenHero() {
		this.stats = new Stats();
		this.kills = new Kills();

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * @return the stats
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * @param stats
	 *            the stats to set
	 */
	public void setStats(Stats stats) {
		this.stats = stats;
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
	 * @return the hardcore
	 */
	public Boolean getHardcore() {
		return hardcore;
	}

	/**
	 * @param hardcore
	 *            the hardcore to set
	 */
	public void setHardcore(Boolean hardcore) {
		this.hardcore = hardcore;
	}

	/**
	 * @return the heroId
	 */
	public Integer getHeroId() {
		return heroId;
	}

	/**
	 * @param heroId
	 *            the heroId to set
	 */
	public void setHeroId(Integer heroId) {
		this.heroId = heroId;
	}

	/**
	 * @return the gender
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}

	/**
	 * @param clase
	 *            the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FallenHero [name=" + name + ", level=" + level + ", stats=" + stats + ", kills=" + kills + ", hardcore=" + hardcore + ", heroId=" + heroId + ", gender=" + gender
				+ ", clase=" + clase + "]";
	}

}
