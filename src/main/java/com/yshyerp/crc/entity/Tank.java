package com.yshyerp.crc.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@TableName("tank")
public class Tank implements Serializable {
    private String code;

    private String code1;

    private String d;

    private String tank;

    private Boolean tax;

    private String batchNo;

    private Date date;

    private String tCustomer;

    private String cCustomer;

    private String commodity;

    private Boolean oil;

    private Boolean oilO;

    private String tankH;

    private String maxH;

    private String maxV;

    private String safetyH;

    private String safetyV;

    private String klitreCm;

    private String pipeLine;

    private BigDecimal gaugeM;

    private BigDecimal density;

    private Integer quantity;

    private Integer mBalance;

    private Integer hQuan;

    private BigDecimal lowestVol;

    private BigDecimal limitVol;

    private BigDecimal crrVol;

    private Boolean crrVolUse;

    private Boolean lockTank;

    private String phase;

    private Date commence;

    private Integer thruputMi;

    private String station1;

    private String station2;

    private String station3;

    private Boolean cStatus;

    private String tUse;

    private String lastComm;

    private String tenant;

    private Date updateD;

    private Boolean crc;

    private Boolean crc1;

    private Boolean coa;

    private String coa1;

    private Short coaP;

    private Boolean crrUse;

    private Boolean fd;

    private BigDecimal fdWeight;

    private Integer q1;

    private Integer q2;

    private Boolean bs;

    private String gType;

    private BigDecimal r;

    private Short t;

    private BigDecimal m;

    private Boolean xfz;

    private BigDecimal temp1;

    private BigDecimal temp2;

    private String n2;

    private Boolean hot;

    private Boolean cool;

    private Boolean tg;

    private Boolean bw;

    private String jr;

    private Boolean hx;

    private Boolean zh;

    private Date uDate;

    private String allowComm;

    private static final long serialVersionUID = 1L;

    public Tank(String code, String code1, String d, String tank, Boolean tax, String batchNo, Date date, String tCustomer, String cCustomer, String commodity, Boolean oil, Boolean oilO, String tankH, String maxH, String maxV, String safetyH, String safetyV, String klitreCm, String pipeLine, BigDecimal gaugeM, BigDecimal density, Integer quantity, Integer mBalance, Integer hQuan, BigDecimal lowestVol, BigDecimal limitVol, BigDecimal crrVol, Boolean crrVolUse, Boolean lockTank, String phase, Date commence, Integer thruputMi, String station1, String station2, String station3, Boolean cStatus, String tUse, String lastComm, String tenant, Date updateD, Boolean crc, Boolean crc1, Boolean coa, String coa1, Short coaP, Boolean crrUse, Boolean fd, BigDecimal fdWeight, Integer q1, Integer q2, Boolean bs, String gType, BigDecimal r, Short t, BigDecimal m, Boolean xfz, BigDecimal temp1, BigDecimal temp2, String n2, Boolean hot, Boolean cool, Boolean tg, Boolean bw, String jr, Boolean hx, Boolean zh, Date uDate, String allowComm) {
        this.code = code;
        this.code1 = code1;
        this.d = d;
        this.tank = tank;
        this.tax = tax;
        this.batchNo = batchNo;
        this.date = date;
        this.tCustomer = tCustomer;
        this.cCustomer = cCustomer;
        this.commodity = commodity;
        this.oil = oil;
        this.oilO = oilO;
        this.tankH = tankH;
        this.maxH = maxH;
        this.maxV = maxV;
        this.safetyH = safetyH;
        this.safetyV = safetyV;
        this.klitreCm = klitreCm;
        this.pipeLine = pipeLine;
        this.gaugeM = gaugeM;
        this.density = density;
        this.quantity = quantity;
        this.mBalance = mBalance;
        this.hQuan = hQuan;
        this.lowestVol = lowestVol;
        this.limitVol = limitVol;
        this.crrVol = crrVol;
        this.crrVolUse = crrVolUse;
        this.lockTank = lockTank;
        this.phase = phase;
        this.commence = commence;
        this.thruputMi = thruputMi;
        this.station1 = station1;
        this.station2 = station2;
        this.station3 = station3;
        this.cStatus = cStatus;
        this.tUse = tUse;
        this.lastComm = lastComm;
        this.tenant = tenant;
        this.updateD = updateD;
        this.crc = crc;
        this.crc1 = crc1;
        this.coa = coa;
        this.coa1 = coa1;
        this.coaP = coaP;
        this.crrUse = crrUse;
        this.fd = fd;
        this.fdWeight = fdWeight;
        this.q1 = q1;
        this.q2 = q2;
        this.bs = bs;
        this.gType = gType;
        this.r = r;
        this.t = t;
        this.m = m;
        this.xfz = xfz;
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.n2 = n2;
        this.hot = hot;
        this.cool = cool;
        this.tg = tg;
        this.bw = bw;
        this.jr = jr;
        this.hx = hx;
        this.zh = zh;
        this.uDate = uDate;
        this.allowComm = allowComm;
    }

    public Tank() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1 == null ? null : code1.trim();
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    public String getTank() {
        return tank;
    }

    public void setTank(String tank) {
        this.tank = tank == null ? null : tank.trim();
    }

    public Boolean getTax() {
        return tax;
    }

    public void setTax(Boolean tax) {
        this.tax = tax;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String gettCustomer() {
        return tCustomer;
    }

    public void settCustomer(String tCustomer) {
        this.tCustomer = tCustomer == null ? null : tCustomer.trim();
    }

    public String getcCustomer() {
        return cCustomer;
    }

    public void setcCustomer(String cCustomer) {
        this.cCustomer = cCustomer == null ? null : cCustomer.trim();
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity == null ? null : commodity.trim();
    }

    public Boolean getOil() {
        return oil;
    }

    public void setOil(Boolean oil) {
        this.oil = oil;
    }

    public Boolean getOilO() {
        return oilO;
    }

    public void setOilO(Boolean oilO) {
        this.oilO = oilO;
    }

    public String getTankH() {
        return tankH;
    }

    public void setTankH(String tankH) {
        this.tankH = tankH == null ? null : tankH.trim();
    }

    public String getMaxH() {
        return maxH;
    }

    public void setMaxH(String maxH) {
        this.maxH = maxH == null ? null : maxH.trim();
    }

    public String getMaxV() {
        return maxV;
    }

    public void setMaxV(String maxV) {
        this.maxV = maxV == null ? null : maxV.trim();
    }

    public String getSafetyH() {
        return safetyH;
    }

    public void setSafetyH(String safetyH) {
        this.safetyH = safetyH == null ? null : safetyH.trim();
    }

    public String getSafetyV() {
        return safetyV;
    }

    public void setSafetyV(String safetyV) {
        this.safetyV = safetyV == null ? null : safetyV.trim();
    }

    public String getKlitreCm() {
        return klitreCm;
    }

    public void setKlitreCm(String klitreCm) {
        this.klitreCm = klitreCm == null ? null : klitreCm.trim();
    }

    public String getPipeLine() {
        return pipeLine;
    }

    public void setPipeLine(String pipeLine) {
        this.pipeLine = pipeLine == null ? null : pipeLine.trim();
    }

    public BigDecimal getGaugeM() {
        return gaugeM;
    }

    public void setGaugeM(BigDecimal gaugeM) {
        this.gaugeM = gaugeM;
    }

    public BigDecimal getDensity() {
        return density;
    }

    public void setDensity(BigDecimal density) {
        this.density = density;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getmBalance() {
        return mBalance;
    }

    public void setmBalance(Integer mBalance) {
        this.mBalance = mBalance;
    }

    public Integer gethQuan() {
        return hQuan;
    }

    public void sethQuan(Integer hQuan) {
        this.hQuan = hQuan;
    }

    public BigDecimal getLowestVol() {
        return lowestVol;
    }

    public void setLowestVol(BigDecimal lowestVol) {
        this.lowestVol = lowestVol;
    }

    public BigDecimal getLimitVol() {
        return limitVol;
    }

    public void setLimitVol(BigDecimal limitVol) {
        this.limitVol = limitVol;
    }

    public BigDecimal getCrrVol() {
        return crrVol;
    }

    public void setCrrVol(BigDecimal crrVol) {
        this.crrVol = crrVol;
    }

    public Boolean getCrrVolUse() {
        return crrVolUse;
    }

    public void setCrrVolUse(Boolean crrVolUse) {
        this.crrVolUse = crrVolUse;
    }

    public Boolean getLockTank() {
        return lockTank;
    }

    public void setLockTank(Boolean lockTank) {
        this.lockTank = lockTank;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase == null ? null : phase.trim();
    }

    public Date getCommence() {
        return commence;
    }

    public void setCommence(Date commence) {
        this.commence = commence;
    }

    public Integer getThruputMi() {
        return thruputMi;
    }

    public void setThruputMi(Integer thruputMi) {
        this.thruputMi = thruputMi;
    }

    public String getStation1() {
        return station1;
    }

    public void setStation1(String station1) {
        this.station1 = station1 == null ? null : station1.trim();
    }

    public String getStation2() {
        return station2;
    }

    public void setStation2(String station2) {
        this.station2 = station2 == null ? null : station2.trim();
    }

    public String getStation3() {
        return station3;
    }

    public void setStation3(String station3) {
        this.station3 = station3 == null ? null : station3.trim();
    }

    public Boolean getcStatus() {
        return cStatus;
    }

    public void setcStatus(Boolean cStatus) {
        this.cStatus = cStatus;
    }

    public String gettUse() {
        return tUse;
    }

    public void settUse(String tUse) {
        this.tUse = tUse == null ? null : tUse.trim();
    }

    public String getLastComm() {
        return lastComm;
    }

    public void setLastComm(String lastComm) {
        this.lastComm = lastComm == null ? null : lastComm.trim();
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant == null ? null : tenant.trim();
    }

    public Date getUpdateD() {
        return updateD;
    }

    public void setUpdateD(Date updateD) {
        this.updateD = updateD;
    }

    public Boolean getCrc() {
        return crc;
    }

    public void setCrc(Boolean crc) {
        this.crc = crc;
    }

    public Boolean getCrc1() {
        return crc1;
    }

    public void setCrc1(Boolean crc1) {
        this.crc1 = crc1;
    }

    public Boolean getCoa() {
        return coa;
    }

    public void setCoa(Boolean coa) {
        this.coa = coa;
    }

    public String getCoa1() {
        return coa1;
    }

    public void setCoa1(String coa1) {
        this.coa1 = coa1 == null ? null : coa1.trim();
    }

    public Short getCoaP() {
        return coaP;
    }

    public void setCoaP(Short coaP) {
        this.coaP = coaP;
    }

    public Boolean getCrrUse() {
        return crrUse;
    }

    public void setCrrUse(Boolean crrUse) {
        this.crrUse = crrUse;
    }

    public Boolean getFd() {
        return fd;
    }

    public void setFd(Boolean fd) {
        this.fd = fd;
    }

    public BigDecimal getFdWeight() {
        return fdWeight;
    }

    public void setFdWeight(BigDecimal fdWeight) {
        this.fdWeight = fdWeight;
    }

    public Integer getQ1() {
        return q1;
    }

    public void setQ1(Integer q1) {
        this.q1 = q1;
    }

    public Integer getQ2() {
        return q2;
    }

    public void setQ2(Integer q2) {
        this.q2 = q2;
    }

    public Boolean getBs() {
        return bs;
    }

    public void setBs(Boolean bs) {
        this.bs = bs;
    }

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType == null ? null : gType.trim();
    }

    public BigDecimal getR() {
        return r;
    }

    public void setR(BigDecimal r) {
        this.r = r;
    }

    public Short getT() {
        return t;
    }

    public void setT(Short t) {
        this.t = t;
    }

    public BigDecimal getM() {
        return m;
    }

    public void setM(BigDecimal m) {
        this.m = m;
    }

    public Boolean getXfz() {
        return xfz;
    }

    public void setXfz(Boolean xfz) {
        this.xfz = xfz;
    }

    public BigDecimal getTemp1() {
        return temp1;
    }

    public void setTemp1(BigDecimal temp1) {
        this.temp1 = temp1;
    }

    public BigDecimal getTemp2() {
        return temp2;
    }

    public void setTemp2(BigDecimal temp2) {
        this.temp2 = temp2;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2 == null ? null : n2.trim();
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Boolean getCool() {
        return cool;
    }

    public void setCool(Boolean cool) {
        this.cool = cool;
    }

    public Boolean getTg() {
        return tg;
    }

    public void setTg(Boolean tg) {
        this.tg = tg;
    }

    public Boolean getBw() {
        return bw;
    }

    public void setBw(Boolean bw) {
        this.bw = bw;
    }

    public String getJr() {
        return jr;
    }

    public void setJr(String jr) {
        this.jr = jr == null ? null : jr.trim();
    }

    public Boolean getHx() {
        return hx;
    }

    public void setHx(Boolean hx) {
        this.hx = hx;
    }

    public Boolean getZh() {
        return zh;
    }

    public void setZh(Boolean zh) {
        this.zh = zh;
    }

    public Date getuDate() {
        return uDate;
    }

    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    public String getAllowComm() {
        return allowComm;
    }

    public void setAllowComm(String allowComm) {
        this.allowComm = allowComm == null ? null : allowComm.trim();
    }
}