package co.travelini.backendservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "ServiceTransactionList")
public class ServiceTransactionList 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Service_Transaction_Id",nullable = false)
	private long id;
	
	@Column(name = "Transaction_number")
	private String TransactionNumber;
	
	@Column(name = "type")
	private String type ;
	
	@Column(name = "accountId")
	private String accountId;

	@Column(name = "transactionId")
	private String tansactionId;
	
	
	
	public ServiceTransactionList() 
	{
		super();
		
	}





	public ServiceTransactionList(long id, String transactionNumber, String type, String accountId,
			String tansactionId) {
		super();
		this.id = id;
		TransactionNumber = transactionNumber;
		this.type = type;
		this.accountId = accountId;
		this.tansactionId = tansactionId;
	}





	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTransactionNumber() {
		return TransactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		TransactionNumber = transactionNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId2) {
		this.accountId = accountId2;
	}

	
	

	public String getTansactionId() {
		return tansactionId;
	}





	public void setTansactionId(String tansactionId) {
		this.tansactionId = tansactionId;
	}





	@Override
	public String toString() {
		return "ServiceTransactionList [id=" + id + ", TransactionNumber=" + TransactionNumber + ", type=" + type
				+ ", accountId=" + accountId + ", tansactionId=" + tansactionId + "]";
	}





	




	
	

	
	
	
}
