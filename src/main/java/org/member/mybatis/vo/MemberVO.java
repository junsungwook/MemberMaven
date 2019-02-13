package org.member.mybatis.vo;

public class MemberVO {
	private String id,pass,name,addr,memo,reg_date;

	public String getId() {
		return id == null ? "" : id.trim();
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass == null ? "" : pass.trim();
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name == null ? "" : name.trim();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr == null ? "" : addr.trim();
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMemo() {
		return memo == null ? "" : memo.trim();
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReg_date() {
		return reg_date == null ? "" : reg_date.trim();
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
}
