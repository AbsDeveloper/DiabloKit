package es.jsonkit.profile.ability;

public class Skill {

	private String slug;

	private String name;

	private String icon;

	private Integer level;

	private String categorySlug;

	private String tooltipUrl;

	private String description;

	/**
	 * Solo para habilidades pasivas
	 */
	private String flavor;

	private String simpleDescription;

	private String skillCalcId;

	public Skill() {

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
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
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
	 * @return the categorySlug
	 */
	public String getCategorySlug() {
		return categorySlug;
	}

	/**
	 * @param categorySlug
	 *            the categorySlug to set
	 */
	public void setCategorySlug(String categorySlug) {
		this.categorySlug = categorySlug;
	}

	/**
	 * @return the tooltipUrl
	 */
	public String getTooltipUrl() {
		return tooltipUrl;
	}

	/**
	 * @param tooltipUrl
	 *            the tooltipUrl to set
	 */
	public void setTooltipUrl(String tooltipUrl) {
		this.tooltipUrl = tooltipUrl;
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
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * @param flavor
	 *            the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Skill [slug=" + slug + ", name=" + name + ", icon=" + icon + ", level=" + level + ", categorySlug=" + categorySlug + ", tooltipUrl=" + tooltipUrl
				+ ", description=" + description + ", flavor=" + flavor + ", simpleDescription=" + simpleDescription + ", skillCalcId=" + skillCalcId + "]";
	}

}
