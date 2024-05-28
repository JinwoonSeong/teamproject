package kr.ac.kopo.member.vo;
/*

	CREATE TABLE t_member(
		id varchar2(50) PRIMARY KEY
		, password varchar2(256) NOT NULL
		, name varchar2(100) NOT NULL
		, phone varchar2(15) 
		, TYPE char(1) DEFAULT 'U'
	)	

 */

/*
 	1. 모든 멤버변수는 private 접근제한자 설정
 	2. 기본생성자 필수
 	3. getter/setter 메소드
 */

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String phone;
	private String type;
	
	public MemberVO() {
	}

	public MemberVO(String id, String password, String name, String phone, String type) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", type="
				+ type + "]";
	}

	
}



