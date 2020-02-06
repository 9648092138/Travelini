package co.travelini.backendservices.entity.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "travel_style")
public class TravelStyle {

	@Id
	@Column(name = "travel_style_id", nullable = false)
	private long id;

	@Column(name = "code", nullable = false, unique = true)
	private String code;

	@Column(name = "display", nullable = false)
	private String display;

	@Column(name = "enabled", nullable = false)
	private boolean enabled = true;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	

}
