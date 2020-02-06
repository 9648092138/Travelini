package co.travelini.backendservices.entity;



import javax.persistence.*;
import java.util.List;

@Entity
public class InterestList extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String interestName;

    private String interestImage;

    private Long interestId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInterestName() {
		return interestName;
	}

	public void setInterestName(String interestName) {
		this.interestName = interestName;
	}

	public String getInterestImage() {
		return interestImage;
	}

	public void setInterestImage(String interestImage) {
		this.interestImage = interestImage;
	}

	public Long getInterestId() {
		return interestId;
	}

	public void setInterestId(Long interestId) {
		this.interestId = interestId;
	}
    
    

}
