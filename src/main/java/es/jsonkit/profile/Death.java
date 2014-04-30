package es.jsonkit.profile;

@Deprecated
public class Death {

	private Integer killer;

	private Integer location;

	private Integer time;

	public Integer getKiller() {
		return killer;
	}

	public void setKiller(Integer killer) {
		this.killer = killer;
	}

	public Death withKiller(Integer killer) {
		this.killer = killer;
		return this;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public Death withLocation(Integer location) {
		this.location = location;
		return this;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Death withTime(Integer time) {
		this.time = time;
		return this;
	}

}
