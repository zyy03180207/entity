package microservice.online.entity;
// Generated 2017-4-19 18:24:38 by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbRole generated by hbm2java
 */

@Entity
@Table(name = "tb_role", catalog = "wx_manage")
public class TbRole implements java.io.Serializable {
	
	private static final long serialVersionUID = -4957834597331471430L;
	private int id;
	private String name;
	private String introduce;
	private String state;

	public TbRole() {
	}

	public TbRole(int id) {
		this.id = id;
	}

	public TbRole(int id, String name, String introduce, String state) {
		this.id = id;
		this.name = name;
		this.introduce = introduce;
		this.state = state;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "introduce", length = 100)
	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Column(name = "state", length = 5)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
