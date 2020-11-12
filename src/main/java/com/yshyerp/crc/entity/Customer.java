package com.yshyerp.crc.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("")
public class Customer implements Serializable {
    private String customer;

    @TableId("code")
    private String code;

    private String fullname;

    private String cname;

    private String address;

    private String postcode;

    private String areaCode;

    private String telephone1;

    private String telephone2;

    private String faxno;

    private String contact;

    private String taxno;

    private String d;

    private Integer drumlock;

    private Integer order1;

    private static final long serialVersionUID = 1L;

    public Customer(String customer, String code, String fullname, String cname, String address, String postcode, String areaCode, String telephone1, String telephone2, String faxno, String contact, String taxno, String d, Integer drumlock, Integer order1) {
        this.customer = customer;
        this.code = code;
        this.fullname = fullname;
        this.cname = cname;
        this.address = address;
        this.postcode = postcode;
        this.areaCode = areaCode;
        this.telephone1 = telephone1;
        this.telephone2 = telephone2;
        this.faxno = faxno;
        this.contact = contact;
        this.taxno = taxno;
        this.d = d;
        this.drumlock = drumlock;
        this.order1 = order1;
    }

    public Customer() {
        super();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1 == null ? null : telephone1.trim();
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2 == null ? null : telephone2.trim();
    }

    public String getFaxno() {
        return faxno;
    }

    public void setFaxno(String faxno) {
        this.faxno = faxno == null ? null : faxno.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getTaxno() {
        return taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno == null ? null : taxno.trim();
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    public Integer getDrumlock() {
        return drumlock;
    }

    public void setDrumlock(Integer drumlock) {
        this.drumlock = drumlock;
    }

    public Integer getOrder1() {
        return order1;
    }

    public void setOrder1(Integer order1) {
        this.order1 = order1;
    }
}