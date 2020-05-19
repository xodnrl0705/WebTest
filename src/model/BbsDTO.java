package model;

import java.sql.Date;

public class BbsDTO {

	/*
	DTO객체를 만들때 테이블 컬럼의 타입과는 상관없이 대부분의
	멤버변수는 String형으로 정의하면 된다. JSP에서 산술연산이
	꼭 필요한 경우에만 int, double과 같이 숫자형으로 정의한다. 
	*/
	
	private String num;
	private String title;
	private String content;
	private String id;
	private java.sql.Date postDate;
	private String visitcount;
	
	public BbsDTO() {}
	
	public BbsDTO(String num, String title, String content, Date postDate, String id) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.postDate = postDate;
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public java.sql.Date getPostDate() {
		return postDate;
	}

	public void setPostdate(java.sql.Date postDate) {
		this.postDate = postDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getVisitcount() {
		return visitcount;
	}
	public void setVisitcount(String visitcount) {
		this.visitcount = visitcount;
	}
	
	
}
