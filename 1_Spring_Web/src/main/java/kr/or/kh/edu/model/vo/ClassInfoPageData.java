package kr.or.kh.edu.model.vo;

import java.util.ArrayList;

public class ClassInfoPageData {
	private ClassInfo classInfo;
	private ArrayList<ClassInfo> classInfoNameList;
	public ClassInfoPageData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassInfoPageData(ClassInfo classInfo, ArrayList<ClassInfo> classInfoNameList) {
		super();
		this.classInfo = classInfo;
		this.classInfoNameList = classInfoNameList;
	}
	public ClassInfo getClassInfo() {
		return classInfo;
	}
	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}
	public ArrayList<ClassInfo> getClassInfoNameList() {
		return classInfoNameList;
	}
	public void setClassInfoNameList(ArrayList<ClassInfo> classInfoNameList) {
		this.classInfoNameList = classInfoNameList;
	}
	
}
