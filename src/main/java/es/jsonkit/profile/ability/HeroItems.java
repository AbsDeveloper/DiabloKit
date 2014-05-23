package es.jsonkit.profile.ability;

import es.jsonkit.profile.Hero;
import es.jsonkit.profile.item.Items;

public class HeroItems extends Hero {
	private Items items;

	public HeroItems() {
		super();
	}

	public HeroItems(final String battleTag, final Integer heroId) {
		super(battleTag, heroId);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HeroItems [items=" + this.items + "]";
	}

}
