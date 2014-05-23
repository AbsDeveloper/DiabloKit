/**
 * 
 */
package es.jsonkit.profile;

/**
 * @author Adrian
 * 
 */
public abstract class IDiabloObject {

	private String battleTag;
	private Integer heroId;
	private String server;
	private String locale;

	public IDiabloObject() {
	}

	public IDiabloObject(final String battleTag, final String server, final Integer heroId) {
		this.battleTag = battleTag;
		this.server = server;
		this.heroId = heroId;
	}

	public IDiabloObject(final String battleTag, final Integer heroId) {
		this.battleTag = battleTag;
		this.heroId = heroId;
	}

	public IDiabloObject(final String battleTag, final String server) {
		this.battleTag = battleTag;
		this.server = server;
	}

	public IDiabloObject(final String battleTag) {
		this.battleTag = battleTag;
	}

	/**
	 * @return the battleTag
	 */
	public String getBattleTag() {
		return this.battleTag;
	}

	/**
	 * @param battleTag
	 *            the battleTag to set
	 */
	public void setBattleTag(final String battleTag) {
		this.battleTag = battleTag;
	}

	/**
	 * @return the heroId
	 */
	public Integer getHeroId() {
		return this.heroId;
	}

	/**
	 * @param heroId
	 *            the heroId to set
	 */
	public void setHeroId(final Integer heroId) {
		this.heroId = heroId;
	}

	/**
	 * @return the server
	 */
	public String getServer() {
		return this.server;
	}

	/**
	 * @param server
	 *            the server to set
	 */
	public void setServer(final String server) {
		this.server = server;
	}

	/**
	 * @return the locale
	 */
	public String getLocale() {
		return this.locale;
	}

	/**
	 * @param locale
	 *            the locale to set
	 */
	public void setLocale(final String locale) {
		this.locale = locale;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IDiabloObject [battleTag=" + this.battleTag + ", heroId=" + this.heroId + ", server=" + this.server + ", locale=" + this.locale + "]";
	}

	public abstract String generateUrl();

}
