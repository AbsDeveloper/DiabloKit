/**
 * 
 */
package es.jsonkit.profile.ability;

import com.google.gson.annotations.SerializedName;

import es.jsonkit.profile.inventory.Items;

/**
 * @author Adrian
 * 
 */
public class HeroSkill {

	private Integer id;

	private String name;

	@SerializedName("class")
	private String clase;

	private Integer gender;

	private Integer level;

	private Integer paragonLevel;

	private Boolean hardcore;

	private Skills skills;

	private Items items;

	public HeroSkill() {
		this.skills = new Skills();
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
	 * @return the clase
	 */
	public String getClase() {
		return this.clase;
	}

	/**
	 * @param clase
	 *            the clase to set
	 */
	public void setClase(final String clase) {
		this.clase = clase;
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
	 * @return the skills
	 */
	public Skills getSkills() {
		return this.skills;
	}

	/**
	 * @return the items
	 */
	public Items getItems() {
		return this.items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(final Items items) {
		this.items = items;
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
		return "HeroSkill [id=" + this.id + ", name=" + this.name + ", clase=" + this.clase + ", gender=" + this.gender + ", level=" + this.level + ", paragonLevel="
				+ this.paragonLevel + ", hardcore=" + this.hardcore + ", skills=" + this.skills + ", items=" + this.items + "]";
	}

}
