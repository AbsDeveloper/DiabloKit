package es.jsonkit.profile.ability;

public class Rune {

	private String slug;

	private String type;

	private String name;

	private Integer level;

	private String description;

	private String simpleDescription;

	private String tooltipParams;

	private String skillCalcId;

	private Integer order;

	public Rune() {

	}

	/**
	 * @return the slug
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * @param slug
	 *            the slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the simpleDescription
	 */
	public String getSimpleDescription() {
		return simpleDescription;
	}

	/**
	 * @param simpleDescription
	 *            the simpleDescription to set
	 */
	public void setSimpleDescription(String simpleDescription) {
		this.simpleDescription = simpleDescription;
	}

	/**
	 * @return the tooltipParams
	 */
	public String getTooltipParams() {
		return tooltipParams;
	}

	/**
	 * @param tooltipParams
	 *            the tooltipParams to set
	 */
	public void setTooltipParams(String tooltipParams) {
		this.tooltipParams = tooltipParams;
	}

	/**
	 * @return the skillCalcId
	 */
	public String getSkillCalcId() {
		return skillCalcId;
	}

	/**
	 * @param skillCalcId
	 *            the skillCalcId to set
	 */
	public void setSkillCalcId(String skillCalcId) {
		this.skillCalcId = skillCalcId;
	}

	/**
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rune [slug=" + slug + ", type=" + type + ", name=" + name + ", level=" + level + ", description=" + description + ", simpleDescription=" + simpleDescription
				+ ", tooltipParams=" + tooltipParams + ", skillCalcId=" + skillCalcId + ", order=" + order + "]";
	}

}
