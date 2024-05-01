package com.gst.Gst1A.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mis_dpm_gst_14a")
public class Gst1A {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer S_NO;
	private Double DISPOSAL_OF_ARN_WITHIN_7;
	private Double NO_OF_ARN_RECEIVED_GSTN;
	private Double NO_OF_ARN_RECEIVED_CPC;
	public Gst1A() {
		super();
	
	}
	public Integer getS_NO() {
		return S_NO;
	}
	public void setS_NO(Integer s_NO) {
		S_NO = s_NO;
	}
	public Double getDISPOSAL_OF_ARN_WITHIN_7() {
		return DISPOSAL_OF_ARN_WITHIN_7;
	}
	public void setDISPOSAL_OF_ARN_WITHIN_7(Double dISPOSAL_OF_ARN_WITHIN_7) {
		DISPOSAL_OF_ARN_WITHIN_7 = dISPOSAL_OF_ARN_WITHIN_7;
	}
	public Double getNO_OF_ARN_RECEIVED_GSTN() {
		return NO_OF_ARN_RECEIVED_GSTN;
	}
	public void setNO_OF_ARN_RECEIVED_GSTN(Double nO_OF_ARN_RECEIVED_GSTN) {
		NO_OF_ARN_RECEIVED_GSTN = nO_OF_ARN_RECEIVED_GSTN;
	}
	public Double getNO_OF_ARN_RECEIVED_CPC() {
		return NO_OF_ARN_RECEIVED_CPC;
	}
	public void setNO_OF_ARN_RECEIVED_CPC(Double nO_OF_ARN_RECEIVED_CPC) {
		NO_OF_ARN_RECEIVED_CPC = nO_OF_ARN_RECEIVED_CPC;
	}
	public double calculatePercentage() {
		return(DISPOSAL_OF_ARN_WITHIN_7/(NO_OF_ARN_RECEIVED_GSTN+NO_OF_ARN_RECEIVED_CPC))*100;
	}

}
