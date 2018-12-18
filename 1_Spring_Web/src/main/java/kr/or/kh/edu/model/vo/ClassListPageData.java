package kr.or.kh.edu.model.vo;

import java.util.ArrayList;

public class ClassListPageData {
	private ArrayList<ClassInfo> classInfoList;
	private ArrayList<ClassInfo> classInfoNameList;
	private String pageNavi;
	public ClassListPageData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassListPageData(ArrayList<ClassInfo> classInfoList, ArrayList<ClassInfo> classInfoNameList,
			String pageNavi) {
		super();
		this.classInfoList = classInfoList;
		this.classInfoNameList = classInfoNameList;
		this.pageNavi = pageNavi;
	}
	public ArrayList<ClassInfo> getClassInfoList() {
		return classInfoList;
	}
	public void setClassInfoList(ArrayList<ClassInfo> classInfoList) {
		this.classInfoList = classInfoList;
	}
	public ArrayList<ClassInfo> getClassInfoNameList() {
		return classInfoNameList;
	}
	public void setClassInfoNameList(ArrayList<ClassInfo> classInfoNameList) {
		this.classInfoNameList = classInfoNameList;
	}
	public String getPageNavi() {
		return pageNavi;
	}
	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}
	
}
