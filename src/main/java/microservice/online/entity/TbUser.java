package microservice.online.entity;
// Generated 2017-4-19 18:24:38 by Hibernate Tools 3.2.2.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbUser generated by hbm2java
 */
@Entity
@Table(name = "tb_user", catalog = "wx_manage")
public class TbUser implements java.io.Serializable {

	private static final long serialVersionUID = -5479991162746884876L;
	private int cid;
	private String username;
	private String password;
	private String nickname;
	private Integer headimgid;
	private Date rgtime;
	private Integer infoid;
	private String state;

	public TbUser() {
	}

	public TbUser(int cid) {
		this.cid = cid;
	}

	public TbUser(int cid, String username, String password, String nickname, Integer headimgid, Date rgtime,
			Integer infoid, String state) {
		this.cid = cid;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.headimgid = headimgid;
		this.rgtime = rgtime;
		this.infoid = infoid;
		this.state = state;
	}

	@Id

	@Column(name = "cid", unique = true, nullable = false)
	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Column(name = "username", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "nickname", length = 20)
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "headimgid")
	public Integer getHeadimgid() {
		return this.headimgid;
	}

	public void setHeadimgid(Integer headimgid) {
		this.headimgid = headimgid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rgtime", length = 19)
	public Date getRgtime() {
		return this.rgtime;
	}

	public void setRgtime(Date rgtime) {
		this.rgtime = rgtime;
	}

	@Column(name = "infoid")
	public Integer getInfoid() {
		return this.infoid;
	}

	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
	}

	@Column(name = "state", length = 5)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
