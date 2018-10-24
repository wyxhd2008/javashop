package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 创建凤蝶H5应用
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:17
 */
public class AlipayMarketingToolFengdieActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2277246723455497982L;

	/**
	 * H5应用初始化数据
	 */
	@ApiField("activity")
	private FengdieActivityCreateData activity;

	/**
	 * 凤蝶模板包唯一id，从alipay.marketing.tool.fengdie.template.query接口中获取
	 */
	@ApiField("template_id")
	private Long templateId;

	public FengdieActivityCreateData getActivity() {
		return this.activity;
	}
	public void setActivity(FengdieActivityCreateData activity) {
		this.activity = activity;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
