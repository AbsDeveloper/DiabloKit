/**
 * 
 */
package es.jsonkit.profile.ability;

import com.google.gson.annotations.SerializedName;

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

	private final Skills skills;

	public HeroSkill() {
		this.skills = new Skills();
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
	 * @return the skills
	 */
	public Skills getSkills() {
		return skills;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HeroSkill [id=" + id + ", name=" + name + ", clase=" + clase + ", gender=" + gender + ", level=" + level + ", paragonLevel=" + paragonLevel + ", hardcore="
				+ hardcore + ", skills=" + skills + "]";
	}

}
