package microservice.online.entity;
// Generated 2017-5-6 12:20:08 by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbFans generated by hbm2java
 */
@Entity
@Table(name = "tb_fans", catalog = "wx_manage")
public class TbFans implements java.io.Serializable {

	private static final long serialVersionUID = -7507254702765277944L;
	private int cid;
	private Integer subscribe;
	private String openid;
	private String nickname;
	private Integer sex;
	private String city;
	private String country;
	private String province;
	private String language;
	private String headimgurl;
	private String subscribeTime;
	private String unionid;
	private String remark;
	private Integer groupid;
	private String tagidList;

	public TbFans() {
	}

	public TbFans(int cid) {
		this.cid = cid;
	}

	public TbFans(int cid, Integer subscribe, String openid, String nickname, Integer sex, String city, String country,
			String province, String language, String headimgurl, String subscribeTime, String unionid, String remark,
			Integer groupid, String tagidList) {
		this.cid = cid;
		this.subscribe = subscribe;
		this.openid = openid;
		this.nickname = nickname;
		this.sex = sex;
		this.city = city;
		this.country = country;
		this.province = province;
		this.language = language;
		this.headimgurl = headimgurl;
		this.subscribeTime = subscribeTime;
		this.unionid = unionid;
		this.remark = remark;
		this.groupid = groupid;
		this.tagidList = tagidList;
	}

	@Id

	@Column(name = "cid", unique = true, nullable = false)
	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Column(name = "subscribe")
	public Integer getSubscribe() {
		return this.subscribe;
	}

	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
	}

	@Column(name = "openid", length = 50)
	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	@Column(name = "nickname", length = 50)
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Column(name = "city", length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "country", length = 50)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "province", length = 50)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "language", length = 50)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "headimgurl", length = 500)
	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	@Column(name = "subscribe_time", length = 50)
	public String getSubscribeTime() {
		return this.subscribeTime;
	}

	public void setSubscribeTime(String subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	@Column(name = "unionid", length = 50)
	public String getUnionid() {
		return this.unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	@Column(name = "remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "groupid")
	public Integer getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	@Column(name = "tagid_list", length = 200)
	public String getTagidList() {
		return this.tagidList;
	}

	public void setTagidList(String tagidList) {
		this.tagidList = tagidList;
	}

}