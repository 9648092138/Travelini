package co.travelini.backendservices.entity;



import java.sql.Timestamp;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public abstract class BaseEntity{

	@CreationTimestamp
	public Timestamp createdon;

	@UpdateTimestamp
	public Timestamp lastUpdate;



}