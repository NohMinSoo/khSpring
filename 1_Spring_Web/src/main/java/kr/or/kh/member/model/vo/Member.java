package kr.or.kh.member.model.vo;

import java.sql.Date;

/**
 * @FileName : Member.java 
 * @Date :  2018-11-16
 * @작성자 : 노민수
 * @변경이력 :  
 * @프로그램 설명 : 회원 1명에 대한 정보를 담을 수 있는 VO 객체
 */
public class Member {
	private int mNo;
	private String mId;
	private String mPw;
	private String mName;
	private String mNickName;
	private String mEmail;
	private String mPhone;
	private String mAddress;
	private String mActive;
	private Date mEnroll;
	

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public Member(int mNo, String mId, String mPw, String mName, String mNickName, String mEmail, String mPhone,
			String mAddress, String mActive, Date mEnroll) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mPw = mPw;
		this.mName = mName;
		this.mNickName = mNickName;
		this.mEmail = mEmail;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
		this.mActive = mActive;
		this.mEnroll = mEnroll;
	}




	public int getmNo() {
		return mNo;
	}


	public void setmNo(int mNo) {
		this.mNo = mNo;
	}


	public String getmId() {
		return mId;
	}


	public void setmId(String mId) {
		this.mId = mId;
	}


	public String getmPw() {
		return mPw;
	}


	public void setmPw(String mPw) {
		this.mPw = mPw;
	}


	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}


	public String getmNickName() {
		return mNickName;
	}


	public void setmNickName(String mNickName) {
		this.mNickName = mNickName;
	}


	public String getmEmail() {
		return mEmail;
	}


	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}


	public String getmPhone() {
		return mPhone;
	}


	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}


	public String getmAddress() {
		return mAddress;
	}


	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}


	public String getmActive() {
		return mActive;
	}


	public void setmActive(String mActive) {
		this.mActive = mActive;
	}


	public Date getmEnroll() {
		return mEnroll;
	}


	public void setmEnroll(Date mEnroll) {
		this.mEnroll = mEnroll;
	}




	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mPw=" + mPw + ", mName=" + mName + ", mNickName=" + mNickName
				+ ", mEmail=" + mEmail + ", mPhone=" + mPhone + ", mAddress=" + mAddress + ", mActive=" + mActive
				+ ", mEnroll=" + mEnroll + "]";
	}
	

	
	
	
	
}
