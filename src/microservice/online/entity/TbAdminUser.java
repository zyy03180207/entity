package microservice.online.entity;
// Generated 2017-4-19 16:46:12 by Hibernate Tools 3.2.2.GA

/**
 * TbAdminUser generated by hbm2java
 */
public class TbAdminUser implements java.io.Serializable {

	private int id;
	private String username;
	private String password;
	private String phone;
	private String email;
	private String crtime;
	private String state;

	public TbAdminUser() {
	}

	public TbAdminUser(int id) {
		this.id = id;
	}

	public TbAdminUser(int id, String username, String password, String phone, String email, String crtime,
			String state) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.crtime = crtime;
		this.state = state;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCrtime() {
		return this.crtime;
	}

	public void setCrtime(String crtime) {
		this.crtime = crtime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}