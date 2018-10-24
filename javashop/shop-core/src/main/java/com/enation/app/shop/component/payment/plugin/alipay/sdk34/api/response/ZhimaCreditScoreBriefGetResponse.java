package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.response;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayResponse;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.credit.score.brief.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-06 14:40:27
 */
public class ZhimaCreditScoreBriefGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8547684574747244434L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 准入判断结果  Y=准入,N=不准入,N/A=无法评估该用户的信用
	 */
	@ApiField("is_admittance")
	private String isAdmittance;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setIsAdmittance(String isAdmittance) {
		this.isAdmittance = isAdmittance;
	}
	public String getIsAdmittance( ) {
		return this.isAdmittance;
	}

}
