package microservice.online.entity;
// Generated 2017-4-19 18:24:38 by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TbUserRoleId generated by hbm2java
 */
@Embeddable
public class TbUserRoleId implements java.io.Serializable {

	private static final long serialVersionUID = -4175518295532589125L;
	private int uid;
	private int rid;

	public TbUserRoleId() {
	}

	public TbUserRoleId(int uid, int rid) {
		this.uid = uid;
		this.rid = rid;
	}

	@Column(name = "uid", nullable = false)
	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Column(name = "rid", nullable = false)
	public int getRid() {
		return this.rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbUserRoleId))
			return false;
		TbUserRoleId castOther = (TbUserRoleId) other;

		return (this.getUid() == castOther.getUid()) && (this.getRid() == castOther.getRid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUid();
		result = 37 * result + this.getRid();
		return result;
	}

}
