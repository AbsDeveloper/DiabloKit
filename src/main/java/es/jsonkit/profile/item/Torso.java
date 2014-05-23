package es.jsonkit.profile.item;

public class Torso {

	private String id;

	private String name;

	private String icon;

	private String displayColor;

	private String tooltipParams;

	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final String id) {
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
	 * @return the icon
	 */
	public String getIcon() {
		return this.icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(final String icon) {
		this.icon = icon;
	}

	/**
	 * @return the displayColor
	 */
	public String getDisplayColor() {
		return this.displayColor;
	}

	/**
	 * @param displayColor
	 *            the displayColor to set
	 */
	public void setDisplayColor(final String displayColor) {
		this.displayColor = displayColor;
	}

	/**
	 * @return the tooltipParams
	 */
	public String getTooltipParams() {
		return this.tooltipParams;
	}

	/**
	 * @param tooltipParams
	 *            the tooltipParams to set
	 */
	public void setTooltipParams(final String tooltipParams) {
		this.tooltipParams = tooltipParams;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bracers [id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", displayColor=" + this.displayColor + ", tooltipParams=" + this.tooltipParams + "]";
	}
}
