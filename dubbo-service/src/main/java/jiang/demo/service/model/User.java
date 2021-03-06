package jiang.demo.service.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 用户名(手机号)
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 密码
     *
     * @mbg.generated
     */
    private String password;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * 真实姓名
     *
     * @mbg.generated
     */
    private String realName;

    /**
     * 头像
     *
     * @mbg.generated
     */
    private String headImg;

    /**
     * 性别（0：男，1：女）
     *
     * @mbg.generated
     */
    private String gender;

    /**
     * 出生年月日
     *
     * @mbg.generated
     */
    private Date birthDay;

    /**
     * 绑定的邮箱
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 用户状态('NORMAL','正常“，'DISABLE', '由于多次举报被停用')
     *
     * @mbg.generated
     */
    private String userStatus;

    /**
     * 个人说明
     *
     * @mbg.generated
     */
    private String introduction;

    /**
     * 账户余额
     *
     * @mbg.generated
     */
    private Long balance;

    /**
     * 红包
     *
     * @mbg.generated
     */
    private Long redPackets;

    /**
     * 所在城市1级
     *
     * @mbg.generated
     */
    private String liveProvince;

    /**
     * 所在城市1级code
     *
     * @mbg.generated
     */
    private String liveProvinceCode;

    /**
     * 所在城市2级
     *
     * @mbg.generated
     */
    private String liveCity;

    /**
     * 所在城市2级code
     *
     * @mbg.generated
     */
    private String liveCityCode;

    /**
     * 所在城市3级
     *
     * @mbg.generated
     */
    private String liveCounty;

    /**
     * 所在城市3级code
     *
     * @mbg.generated
     */
    private String liveCountyCode;

    /**
     * 居住地址
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 注册设备类型 APP|android，APP|ios ，PC,H5
     *
     * @mbg.generated
     */
    private String deviceType;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private Date registerTime;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.user_id
     *
     * @return the value of yuansuju_user.user_id
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.user_id
     *
     * @param userId the value for yuansuju_user.user_id
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.user_name
     *
     * @return the value of yuansuju_user.user_name
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.user_name
     *
     * @param userName the value for yuansuju_user.user_name
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.password
     *
     * @return the value of yuansuju_user.password
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.password
     *
     * @param password the value for yuansuju_user.password
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.nickname
     *
     * @return the value of yuansuju_user.nickname
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.nickname
     *
     * @param nickname the value for yuansuju_user.nickname
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.real_name
     *
     * @return the value of yuansuju_user.real_name
     * @mbg.generated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.real_name
     *
     * @param realName the value for yuansuju_user.real_name
     * @mbg.generated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.head_img
     *
     * @return the value of yuansuju_user.head_img
     * @mbg.generated
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.head_img
     *
     * @param headImg the value for yuansuju_user.head_img
     * @mbg.generated
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.gender
     *
     * @return the value of yuansuju_user.gender
     * @mbg.generated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.gender
     *
     * @param gender the value for yuansuju_user.gender
     * @mbg.generated
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.birth_day
     *
     * @return the value of yuansuju_user.birth_day
     * @mbg.generated
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.birth_day
     *
     * @param birthDay the value for yuansuju_user.birth_day
     * @mbg.generated
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.email
     *
     * @return the value of yuansuju_user.email
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.email
     *
     * @param email the value for yuansuju_user.email
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.user_status
     *
     * @return the value of yuansuju_user.user_status
     * @mbg.generated
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.user_status
     *
     * @param userStatus the value for yuansuju_user.user_status
     * @mbg.generated
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.introduction
     *
     * @return the value of yuansuju_user.introduction
     * @mbg.generated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.introduction
     *
     * @param introduction the value for yuansuju_user.introduction
     * @mbg.generated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.balance
     *
     * @return the value of yuansuju_user.balance
     * @mbg.generated
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.balance
     *
     * @param balance the value for yuansuju_user.balance
     * @mbg.generated
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.red_packets
     *
     * @return the value of yuansuju_user.red_packets
     * @mbg.generated
     */
    public Long getRedPackets() {
        return redPackets;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.red_packets
     *
     * @param redPackets the value for yuansuju_user.red_packets
     * @mbg.generated
     */
    public void setRedPackets(Long redPackets) {
        this.redPackets = redPackets;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.live_province
     *
     * @return the value of yuansuju_user.live_province
     * @mbg.generated
     */
    public String getLiveProvince() {
        return liveProvince;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.live_province
     *
     * @param liveProvince the value for yuansuju_user.live_province
     * @mbg.generated
     */
    public void setLiveProvince(String liveProvince) {
        this.liveProvince = liveProvince == null ? null : liveProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.live_province_code
     *
     * @return the value of yuansuju_user.live_province_code
     * @mbg.generated
     */
    public String getLiveProvinceCode() {
        return liveProvinceCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.live_province_code
     *
     * @param liveProvinceCode the value for yuansuju_user.live_province_code
     * @mbg.generated
     */
    public void setLiveProvinceCode(String liveProvinceCode) {
        this.liveProvinceCode = liveProvinceCode == null ? null : liveProvinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.live_city
     *
     * @return the value of yuansuju_user.live_city
     * @mbg.generated
     */
    public String getLiveCity() {
        return liveCity;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.live_city
     *
     * @param liveCity the value for yuansuju_user.live_city
     * @mbg.generated
     */
    public void setLiveCity(String liveCity) {
        this.liveCity = liveCity == null ? null : liveCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.live_city_code
     *
     * @return the value of yuansuju_user.live_city_code
     * @mbg.generated
     */
    public String getLiveCityCode() {
        return liveCityCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.live_city_code
     *
     * @param liveCityCode the value for yuansuju_user.live_city_code
     * @mbg.generated
     */
    public void setLiveCityCode(String liveCityCode) {
        this.liveCityCode = liveCityCode == null ? null : liveCityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.live_county
     *
     * @return the value of yuansuju_user.live_county
     * @mbg.generated
     */
    public String getLiveCounty() {
        return liveCounty;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.live_county
     *
     * @param liveCounty the value for yuansuju_user.live_county
     * @mbg.generated
     */
    public void setLiveCounty(String liveCounty) {
        this.liveCounty = liveCounty == null ? null : liveCounty.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.live_county_code
     *
     * @return the value of yuansuju_user.live_county_code
     * @mbg.generated
     */
    public String getLiveCountyCode() {
        return liveCountyCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.live_county_code
     *
     * @param liveCountyCode the value for yuansuju_user.live_county_code
     * @mbg.generated
     */
    public void setLiveCountyCode(String liveCountyCode) {
        this.liveCountyCode = liveCountyCode == null ? null : liveCountyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.address
     *
     * @return the value of yuansuju_user.address
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.address
     *
     * @param address the value for yuansuju_user.address
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.device_type
     *
     * @return the value of yuansuju_user.device_type
     * @mbg.generated
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.device_type
     *
     * @param deviceType the value for yuansuju_user.device_type
     * @mbg.generated
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column yuansuju_user.register_time
     *
     * @return the value of yuansuju_user.register_time
     * @mbg.generated
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column yuansuju_user.register_time
     *
     * @param registerTime the value for yuansuju_user.register_time
     * @mbg.generated
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

}