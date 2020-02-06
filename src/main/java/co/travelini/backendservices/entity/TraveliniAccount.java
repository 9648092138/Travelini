package co.travelini.backendservices.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "travelini_accounts")
@Component
public class TraveliniAccount {
	
	@Id
	@Column(name = "account_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountId;

	private String name;

	private String email;

	private String password;

	private String phoneNum;

	private String imageLocation;

	private Timestamp creationTime;

	public Timestamp getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	private boolean enabled = false;

	@Column(name = "updateFlag")
	@Value("${some.key:false}")
	private boolean updateFlag = false;

	@OneToOne
	private TraveliniAccountSetting traveliniAccountSetting;

	private String otp;

	public TraveliniAccount() {
		super();

	}

	public TraveliniAccount(long accountId, String name, String email, String password, String phoneNum,
			String imageLocation, boolean enabled, boolean updateFlag, TraveliniAccountSetting traveliniAccountSetting,
			String otp) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
		this.imageLocation = imageLocation;
		this.enabled = enabled;
		this.updateFlag = updateFlag;
		this.traveliniAccountSetting = traveliniAccountSetting;
		this.otp = otp;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public TraveliniAccountSetting getTraveliniAccountSetting() {
		return traveliniAccountSetting;
	}

	public void setTraveliniAccountSetting(TraveliniAccountSetting traveliniAccountSetting) {
		this.traveliniAccountSetting = traveliniAccountSetting;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

//	public boolean isUpdateFlag() {
//		return updateFlag;
//	}
//
//	public void setUpdateFlag(boolean updateFlag) {
//		this.updateFlag = updateFlag;
//	}

	@Override
	public String toString() {
		return "TraveliniAccount [accountId=" + accountId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", phoneNum=" + phoneNum + ", imageLocation=" + imageLocation + ", enabled=" + enabled
				+ ", updateFlag=" + updateFlag + ", traveliniAccountSetting=" + traveliniAccountSetting + ", otp=" + otp
				+ "]";
	}

	public boolean isUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(boolean updateFlag) {
		this.updateFlag = updateFlag;
	}

}
