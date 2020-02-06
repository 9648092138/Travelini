package co.travelini.backendservices.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "BucketList")

public class BucketList
{
	
@Id
@Column(name = "bucket_list_id",nullable = false)
@GeneratedValue(strategy = GenerationType.IDENTITY )
private long bucket_list_id;

private String name;

@CreationTimestamp
private Date bucketcreateddate;

private String bucketdescription;

private String bucketimage;

@Version
private Date bucketlastupdate;

private long adult_count;

private long child_count;

@OneToOne
private TraveliniAccount traveliniAccount;


public long getBucket_list_id() {
	return bucket_list_id;
}

public void setBucket_list_id(long bucket_list_id) {
	this.bucket_list_id = bucket_list_id;
}

public Date getBucketcreateddate() {
	return bucketcreateddate;
}

public void setBucketcreateddate(Date bucketcreateddate) {
	this.bucketcreateddate = bucketcreateddate;
}

public String getBucketdescription() {
	return bucketdescription;
}

public void setBucketdescription(String bucketdescription) {
	this.bucketdescription = bucketdescription;
}

public String getBucketimage() {
	return bucketimage;
}

public void setBucketimage(String bucketimage) {
	this.bucketimage = bucketimage;
}

public Date getBucketlastupdate() {
	return bucketlastupdate;
}

public void setBucketlastupdate(Date bucketlastupdate) {
	this.bucketlastupdate = bucketlastupdate;
}

public long getAdult_count() {
	return adult_count;
}

public void setAdult_count(long adult_count) {
	this.adult_count = adult_count;
}

public long getChild_count() {
	return child_count;
}

public void setChild_count(long child_count) {
	this.child_count = child_count;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



public TraveliniAccount getTraveliniAccount() {
	return traveliniAccount;
}

public void setTraveliniAccount(TraveliniAccount traveliniAccount) {
	this.traveliniAccount = traveliniAccount;
}

@Override
public String toString() {
	return "BucketList [bucket_list_id=" + bucket_list_id + ", bucketcreateddate=" + bucketcreateddate
			+ ", bucketdescription=" + bucketdescription + ", bucketimage=" + bucketimage + ", bucketlastupdate="
			+ bucketlastupdate + ", adult_count=" + adult_count + ", child_count=" + child_count + "]";
}



}