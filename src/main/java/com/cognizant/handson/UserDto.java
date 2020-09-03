package com.cognizant.handson;


public class UserDto {

	private String id;

	private String login;

	private String type;

	private String url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() { return url; }

	public void setUrl(String url) { this.url = url; }

	@Override
	public String toString() {
		return "UserDto{" +
				"id='" + id + '\'' +
				", login='" + login + '\'' +
				", type='" + type + '\'' +
				", url='" + url + '\'' +
				'}';
	}
}
