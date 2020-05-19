package model;

import java.sql.Date;

public class MemberDTO {

	//멤버변수 : 정보은닉을 위해 private으로 선언함.
	private String id;
	private String pass;
	private String name;
	private java.sql.Date regidate;
	
	public MemberDTO() {}

	public MemberDTO(String id, String pass, String name, Date regidate) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.regidate = regidate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.sql.Date getRegidate() {
		return regidate;
	}

	public void setRegidate(java.sql.Date regidate) {
		this.regidate = regidate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("아이디:%s, 비밀번호:%s, 이름:%s" , id, pass,name);
	}
	
}
