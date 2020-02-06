package co.travelini.backendservices.dto.response;

import java.math.BigInteger;
import java.util.List;

import com.travelport.schema.common_v45_0.TypeTrinary;
import com.travelport.schema.hotel_v45_0.HotelRateDetail.Inclusions.MealPlans;
import com.travelport.schema.hotel_v45_0.RateMatchIndicator;

public class RoomType {
	
	/**
	 * rate info
	 */
	private String ratePlantype;
	private String baseRate;
	private String totalRate;
	private BigInteger rateCategory;
	private String rateChangeIndicator;
	private boolean extraFeesIncluded;
	
	/**
	 * discription
	 */
	private List<String> roomDiscription;
	private List<String> rateDiscription; 
	private String effectiveDate;
	private String expireDate;
	private String effectiveBaseRate;
	private List<String> paymentCodes;
	private TypeTrinary commissionIndicator;
	private String commissionPercent;
	
	/**
	 * room capicity info
	 */
	private List<RateMatchIndicator> roomCapicity; 
	
	/**
	 * cancellation info
	 */
	private TypeTrinary nonRefundableStay;
	private String cancelDeadline;
	private String guaranteeType;
	
	/**
	 * inclusion inof
	 */
	private TypeTrinary smokingRoomIndicator;
	private BigInteger bedTypesCode;
	private MealPlans mealPlan;
	private Integer mealPlanCode;
	


	public RoomType() {
		// TODO Auto-generated constructor stub
	}



	public String getRatePlantype() {
		return ratePlantype;
	}



	public void setRatePlantype(String ratePlantype) {
		this.ratePlantype = ratePlantype;
	}



	public String getBaseRate() {
		return baseRate;
	}



	public void setBaseRate(String baseRate) {
		this.baseRate = baseRate;
	}



	public String getTotalRate() {
		return totalRate;
	}



	public void setTotalRate(String totalRate) {
		this.totalRate = totalRate;
	}



	



	public BigInteger getRateCategory() {
		return rateCategory;
	}



	public void setRateCategory(BigInteger rateCategory) {
		this.rateCategory = rateCategory;
	}



	public String getRateChangeIndicator() {
		return rateChangeIndicator;
	}



	public void setRateChangeIndicator(String rateChangeIndicator) {
		this.rateChangeIndicator = rateChangeIndicator;
	}



	public boolean isExtraFeesIncluded() {
		return extraFeesIncluded;
	}



	public void setExtraFeesIncluded(boolean extraFeesIncluded) {
		this.extraFeesIncluded = extraFeesIncluded;
	}



	public List<String> getRoomDiscription() {
		return roomDiscription;
	}



	public void setRoomDiscription(List<String> roomDiscription) {
		this.roomDiscription = roomDiscription;
	}



	public List<String> getRateDiscription() {
		return rateDiscription;
	}



	public void setRateDiscription(List<String> rateDiscription) {
		this.rateDiscription = rateDiscription;
	}



	public String getEffectiveDate() {
		return effectiveDate;
	}



	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}



	public String getExpireDate() {
		return expireDate;
	}



	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}



	public String getEffectiveBaseRate() {
		return effectiveBaseRate;
	}



	public void setEffectiveBaseRate(String effectiveBaseRate) {
		this.effectiveBaseRate = effectiveBaseRate;
	}



	public List<String> getPaymentCodes() {
		return paymentCodes;
	}



	public void setPaymentCodes(List<String> paymentCodes) {
		this.paymentCodes = paymentCodes;
	}



	



	public TypeTrinary getCommissionIndicator() {
		return commissionIndicator;
	}



	public void setCommissionIndicator(TypeTrinary commissionIndicator) {
		this.commissionIndicator = commissionIndicator;
	}

	

	public String getCommissionPercent() {
		return commissionPercent;
	}



	public void setCommissionPercent(String commissionPercent) {
		this.commissionPercent = commissionPercent;
	}



	public List<RateMatchIndicator> getRoomCapicity() {
		return roomCapicity;
	}



	public void setRoomCapicity(List<RateMatchIndicator> roomCapicity) {
		this.roomCapicity = roomCapicity;
	}



	



	public TypeTrinary getNonRefundableStay() {
		return nonRefundableStay;
	}



	public void setNonRefundableStay(TypeTrinary nonRefundableStay) {
		this.nonRefundableStay = nonRefundableStay;
	}



	public String getCancelDeadline() {
		return cancelDeadline;
	}



	public void setCancelDeadline(String cancelDeadline) {
		this.cancelDeadline = cancelDeadline;
	}



	public String getGuaranteeType() {
		return guaranteeType;
	}



	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	

	public TypeTrinary getSmokingRoomIndicator() {
		return smokingRoomIndicator;
	}



	public void setSmokingRoomIndicator(TypeTrinary smokingRoomIndicator) {
		this.smokingRoomIndicator = smokingRoomIndicator;
	}

	


	public BigInteger getBedTypesCode() {
		return bedTypesCode;
	}



	public void setBedTypesCode(BigInteger bedTypesCode) {
		this.bedTypesCode = bedTypesCode;
	}







	public MealPlans getMealPlan() {
		return mealPlan;
	}



	public void setMealPlan(MealPlans mealPlan) {
		this.mealPlan = mealPlan;
	}



	public Integer getMealPlanCode() {
		return mealPlanCode;
	}



	public void setMealPlanCode(Integer mealPlanCode) {
		this.mealPlanCode = mealPlanCode;
	}
	
	

}
