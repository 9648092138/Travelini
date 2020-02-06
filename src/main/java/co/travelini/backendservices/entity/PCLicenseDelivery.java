package co.travelini.backendservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pc_license_delivery")
public class PCLicenseDelivery {

	@Id
	@Column(name = "pc_license_delivery_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pcLicenseDeliveryId;

	@Column(name = "primary_contact_id", nullable = false)
	private long primaryContactId;

	@Column(name = "delivery_type", length = 16, nullable = false)
	private String deliveryType;

	public long getPcLicenseDeliveryId() {
		return pcLicenseDeliveryId;
	}

	public void setPcLicenseDeliveryId(long pcLicenseDeliveryId) {
		this.pcLicenseDeliveryId = pcLicenseDeliveryId;
	}

	public long getPrimaryContactId() {
		return primaryContactId;
	}

	public void setPrimaryContactId(long primaryContactId) {
		this.primaryContactId = primaryContactId;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	
}