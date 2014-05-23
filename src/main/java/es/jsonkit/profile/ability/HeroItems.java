package es.jsonkit.profile.ability;

import es.jsonkit.profile.Hero;
import es.jsonkit.profile.item.Items;
import es.jsonkit.url.constantes.Constantes;

public class HeroItems extends Hero {
	private Items items;

	public HeroItems() {
		super();
	}

	public HeroItems(final String battleTag, final String server, final Integer heroId) {
		super(battleTag, server, heroId);
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

	@Override
	public String generateUrl() {
		StringBuilder strUrl = new StringBuilder();
		strUrl.append(Constantes.URL_HTTP);
		strUrl.append(this.getServer());
		strUrl.append(Constantes.URL_PUNTO);
		strUrl.append(Constantes.URL_BATTLE);
		strUrl.append(Constantes.URL_NET);
		strUrl.append(Constantes.URL_API);
		strUrl.append(Constantes.URL_DIABLO3);
		strUrl.append(Constantes.URL_PROFILE);
		strUrl.append(this.getBattleTag());
		strUrl.append(Constantes.URL_BARRA);
		strUrl.append(Constantes.URL_HERO);
		strUrl.append(HeroSkill.END_OF_REQUEST);
		strUrl.append(this.getHeroId());
		return strUrl.toString();
	}

}
