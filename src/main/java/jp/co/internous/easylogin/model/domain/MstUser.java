package jp.co.internous.easylogin.model.domain;

public class MstUser {

	private int id;
	
	private String userName;
	
	private String password;
	
	private String fullName;
	
	//idの設定と取得するメソッド
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	
	//userNameの設定と取得するメソッド
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	
	
	//passwordの設定と取得をするメソッド
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	
	//fullNameの設定と取得をするメソッド
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullName() {
		return fullName;
	}
	
}
