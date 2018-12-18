package kr.or.kh.edu.model.vo;

public class ClassInfo {
	private int classNo;
	private String classType;
	private String className;
	private String classDetail;
	private String term;
	private int classMemberNum;
	private String ncsSub;
	private String payment;
	private String classTime;
	private String jobField;
	private String supportTarget;
	public ClassInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassInfo(int classNo, String classType, String className, String classDetail, String term,
			int classMemberNum, String ncsSub, String payment, String classTime, String jobField,
			String supportTarget) {
		super();
		this.classNo = classNo;
		this.classType = classType;
		this.className = className;
		this.classDetail = classDetail;
		this.term = term;
		this.classMemberNum = classMemberNum;
		this.ncsSub = ncsSub;
		this.payment = payment;
		this.classTime = classTime;
		this.jobField = jobField;
		this.supportTarget = supportTarget;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassDetail() {
		return classDetail;
	}
	public void setClassDetail(String classDetail) {
		this.classDetail = classDetail;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public int getClassMemberNum() {
		return classMemberNum;
	}
	public void setClassMemberNum(int classMemberNum) {
		this.classMemberNum = classMemberNum;
	}
	public String getNcsSub() {
		return ncsSub;
	}
	public void setNcsSub(String ncsSub) {
		this.ncsSub = ncsSub;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getClassTime() {
		return classTime;
	}
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}
	public String getJobField() {
		return jobField;
	}
	public void setJobField(String jobField) {
		this.jobField = jobField;
	}
	public String getSupportTarget() {
		return supportTarget;
	}
	public void setSupportTarget(String supportTarget) {
		this.supportTarget = supportTarget;
	}	
	
}
