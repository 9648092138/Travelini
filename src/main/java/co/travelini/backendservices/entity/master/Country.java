package co.travelini.backendservices.entity.master;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.travelini.backendservices.entity.PrimaryContact;


@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "id", nullable = false)
	private long id;

	@Column(name = "code", nullable = false, unique = true)
	private String code;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "isdCode", nullable = false)
	private short isdCode;

	@Column(name = "defaultCurrencyId", nullable = false)
	private long defaultCurrencyId;

	@Column(name = "enabled", nullable = false)
	private boolean enabled = true;

	@Column(name = "currencycode",nullable = true)
    private String currencyCode;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getIsdCode() {
		return isdCode;
	}

	public void setIsdCode(short isdCode) {
		this.isdCode = isdCode;
	}

	public long getDefaultCurrencyId() {
		return defaultCurrencyId;
	}

	public void setDefaultCurrencyId(long defaultCurrencyId) {
		this.defaultCurrencyId = defaultCurrencyId;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
