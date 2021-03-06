package com.kpleasing.esb.model.crm002;

import java.io.Serializable;

import com.kpleasing.esb.model.RequestHeader;

public class CRM002Request extends RequestHeader implements Serializable {

	/**	 * 	 */
	private static final long serialVersionUID = 7663815332131747413L;
	private String channel_type;
	private String channel_id;

	public String getChannel_type() {
		return channel_type;
	}

	public void setChannel_type(String channel_type) {
		this.channel_type = channel_type;
	}

	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
}
