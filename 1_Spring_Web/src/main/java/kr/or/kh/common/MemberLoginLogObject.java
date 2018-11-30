package kr.or.kh.common;

import java.sql.Timestamp;

public class MemberLoginLogObject {
	private int mllId;
	private String mId;
	private String mllSuccess;
	private Timestamp mllDateTime;
	private String mllIp;
	private String mllReason;
	private String mllUserAgent;
	private String mllUrl;
	private String mllReferer;
	
	
	public MemberLoginLogObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberLoginLogObject(int mllId, String mId, String mllSuccess, Timestamp mllDateTime, String mllIp,
			String mllReason, String mllUserAgent, String mllUrl, String mllReferer) {
		super();
		this.mllId = mllId;
		this.mId = mId;
		this.mllSuccess = mllSuccess;
		this.mllDateTime = mllDateTime;
		this.mllIp = mllIp;
		this.mllReason = mllReason;
		this.mllUserAgent = mllUserAgent;
		this.mllUrl = mllUrl;
		this.mllReferer = mllReferer;
	}
	public int getMllId() {
		return mllId;
	}
	public void setMllId(int mllId) {
		this.mllId = mllId;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getMllSuccess() {
		return mllSuccess;
	}
	public void setMllSuccess(String mllSuccess) {
		this.mllSuccess = mllSuccess;
	}
	public Timestamp getMllDateTime() {
		return mllDateTime;
	}
	public void setMllDateTime(Timestamp mllDateTime) {
		this.mllDateTime = mllDateTime;
	}
	public String getMllIp() {
		return mllIp;
	}
	public void setMllIp(String mllIp) {
		this.mllIp = mllIp;
	}
	public String getMllReason() {
		return mllReason;
	}
	public void setMllReason(String mllReason) {
		this.mllReason = mllReason;
	}
	public String getMllUserAgent() {
		return mllUserAgent;
	}
	public void setMllUserAgent(String mllUserAgent) {
		this.mllUserAgent = mllUserAgent;
	}
	public String getMllUrl() {
		return mllUrl;
	}
	public void setMllUrl(String mllUrl) {
		this.mllUrl = mllUrl;
	}
	public String getMllReferer() {
		return mllReferer;
	}
	public void setMllReferer(String mllReferer) {
		this.mllReferer = mllReferer;
	}
	@Override
	public String toString() {
		return "MemberLoginLogObject [mllId=" + mllId + ", mId=" + mId + ", mllSuccess=" + mllSuccess + ", mllDateTime="
				+ mllDateTime + ", mllIp=" + mllIp + ", mllReason=" + mllReason + ", mllUserAgent=" + mllUserAgent
				+ ", mllUrl=" + mllUrl + ", mllReferer=" + mllReferer + "]";
	}
	
	
	
}
