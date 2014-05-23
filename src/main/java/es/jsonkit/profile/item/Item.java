package es.jsonkit.profile.item;

public class Item {

	private String id;

	private String name;

	private String icon;

	private String displayColor;

	private String tooltipParams;

	public Item() {

	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
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
	 * @return the displayColor
	 */
	public String getDisplayColor() {
		return displayColor;
	}

	/**
	 * @param displayColor
	 *            the displayColor to set
	 */
	public void setDisplayColor(String displayColor) {
		this.displayColor = displayColor;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", icon=" + icon + ", displayColor=" + displayColor + ", tooltipParams=" + tooltipParams + "]";
	}

}
