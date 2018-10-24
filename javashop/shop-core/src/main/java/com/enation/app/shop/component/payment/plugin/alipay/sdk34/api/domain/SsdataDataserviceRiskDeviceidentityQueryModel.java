package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 设备指纹H5版本
 *
 * @author auto create
 * @since 1.0, 2017-05-31 14:27:31
 */
public class SsdataDataserviceRiskDeviceidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8822273225516913738L;

	/**
	 * 设备token值， 服务端JS生成的设备token值（由我方提供的JS生成），界面引入我方提供的js即可获取afs_token值，token的失效期为12个小时，基本上是190位的一串字符。
	 */
	@ApiField("device_token")
	private String deviceToken;

	public String getDeviceToken() {
		return this.deviceToken;
	}
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

}
