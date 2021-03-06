package microservice.online.entity;
// Generated 2017-4-19 16:46:12 by Hibernate Tools 3.2.2.GA

/**
 * TbUserRoleId generated by hbm2java
 */
public class TbUserRoleId implements java.io.Serializable {

	private int uid;
	private int rid;

	public TbUserRoleId() {
	}

	public TbUserRoleId(int uid, int rid) {
		this.uid = uid;
		this.rid = rid;
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

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
