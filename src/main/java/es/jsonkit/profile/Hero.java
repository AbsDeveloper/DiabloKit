package es.jsonkit.profile;

import com.google.gson.annotations.SerializedName;

/**
 * @author Adrian
 * 
 *         Esta clase recopila toda la informacion general del heroe.
 * 
 */
public class Hero {

	/**
	 * Nivel de paragon
	 */
	private Integer paragonLevel;

	/**
	 * Nombre del heroe
	 */
	private String name;

	/**
	 * Id identificativo del heroe
	 */
	private Integer id;

	/**
	 * Nivel (0- 70)
	 */
	private Integer level;

	/**
	 * Forma de juego
	 * if <code>true</code> hardcore mode.Otherwise softcore mode
	 */
	private Boolean hardcore;

	/**
	 * Genero
	 * 0 - Hombre
	 * 1 - Mujer
	 */
	private Integer gender;

	/**
	 * Only if hardcore mode is <code>true</code>
	 */
	private Boolean dead;
	/**
	 * Clase del heroe
	 */
	@SerializedName("class")
	private String clase;
	/**
	 * Ultima actualizacion
	 */
	@SerializedName("last-updated")
	private Integer lastUpdated;

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
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the dead
	 */
	public Boolean getDead() {
		return dead;
	}

	/**
	 * @param dead
	 *            the dead to set
	 */
	public void setDead(Boolean dead) {
		this.dead = dead;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hero [paragonLevel=" + paragonLevel + ", name=" + name + ", id=" + id + ", level=" + level + ", hardcore=" + hardcore + ", gender=" + gender + ", dead=" + dead
				+ ", clase=" + clase + ", lastUpdated=" + lastUpdated + "]";
	}

}
