package es.jsonkit.profile;

import com.google.gson.annotations.SerializedName;

/**
 * @author Adrian
 * 
 *         Esta clase recopila toda la informacion general del heroe.
 * 
 */
public class Hero extends IDiabloObject {

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

	public Hero() {
		super();
	}

	public Hero(final String battleTag, final Integer heroId) {
		super(battleTag, heroId);
	}

	public Hero(final String battleTag, final String server, final Integer heroId) {
		super(battleTag, server, heroId);
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
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return this.level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(final Integer level) {
		this.level = level;
	}

	/**
	 * @return the hardcore
	 */
	public Boolean getHardcore() {
		return this.hardcore;
	}

	/**
	 * @param hardcore
	 *            the hardcore to set
	 */
	public void setHardcore(final Boolean hardcore) {
		this.hardcore = hardcore;
	}

	/**
	 * @return the gender
	 */
	public Integer getGender() {
		return this.gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(final Integer gender) {
		this.gender = gender;
	}

	/**
	 * @return the dead
	 */
	public Boolean getDead() {
		return this.dead;
	}

	/**
	 * @param dead
	 *            the dead to set
	 */
	public void setDead(final Boolean dead) {
		this.dead = dead;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hero [paragonLevel=" + this.paragonLevel + ", name=" + this.name + ", id=" + this.id + ", level=" + this.level + ", hardcore=" + this.hardcore + ", gender="
				+ this.gender + ", dead=" + this.dead + ", clase=" + this.clase + ", lastUpdated=" + this.lastUpdated + "]";
	}

	@Override
	public String generateUrl() {
		// TODO Auto-generated method stub
		return null;
	}

}
