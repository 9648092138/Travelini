package co.travelini.backendservices.dto.request;

import java.math.BigInteger;

public class Distance {
	
	private String units;
	
	private BigInteger value;
	
	private String direction;

	public Distance() {
		// TODO Auto-generated constructor stub
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	

	public BigInteger getValue() {
		return value;
	}

	public void setValue(BigInteger value) {
		this.value = value;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	

}
