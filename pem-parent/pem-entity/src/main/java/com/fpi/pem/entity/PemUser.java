package com.fpi.pem.entity;

import java.io.Serializable;

public class PemUser implements Serializable{
    static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 用户名
     */
    private String username;
    private String password;
    /**
     * 姓名
     */
    private String name;
    /**
     * M 男 W 女
     */
    private String sex;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 邮箱
     */
    private String email;
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
