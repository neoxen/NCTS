package com.ncts.model;

import com.ncts.model.BaseObject;
import org.compass.annotations.SearchableId;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;

@Entity
@Table(name="ncts_application",catalog="NCTS")
public class NctsApplication extends BaseObject implements Serializable {
    private String applyId;
    private String userId;
    private String siteName;
    private String siteDomains;
    private Integer siteType;
    private String siteIcpno;
    private String siteIp;
    private String siteIsp;
    private String siteOpenDay;
    private String siteMail;
    private String siteAddress;
    private String siteInfo;
    private String snbxh;
    private String operId;
    private Integer applyType;
    private Integer auditStatus;
    private String auditComment;
    private String currHandleDept;
    private String currHandler;
    private Date handleTime;
    private String nextHandleDept;
    private Integer isValid;
    private String createDate;
    private String destroyDate;

    @Id
    @Column(length = 32)
    @SearchableId
    @GeneratedValue(generator = "applyIdGenerator")
    @GenericGenerator(name = "applyIdGenerator", strategy = "uuid")
    public String getApplyId() {
        return this.applyId;
    }
    
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }
    
    @Column(name="UserID", nullable=false, length=32)
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="SiteName", nullable=false, length=100)
    public String getSiteName() {
        return this.siteName;
    }
    
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    
    @Column(name="SiteDomains", nullable=false, length=200)
    public String getSiteDomains() {
        return this.siteDomains;
    }
    
    public void setSiteDomains(String siteDomains) {
        this.siteDomains = siteDomains;
    }
    
    @Column(name="SiteType", nullable=false, length=1)
    public Integer getSiteType() {
        return this.siteType;
    }
    
    public void setSiteType(Integer siteType) {
        this.siteType = siteType;
    }
    
    @Column(name="SiteICPNo", nullable=false, length=50)
    public String getSiteIcpno() {
        return this.siteIcpno;
    }
    
    public void setSiteIcpno(String siteIcpno) {
        this.siteIcpno = siteIcpno;
    }
    
    @Column(name="SiteIP", nullable=false, length=15)
    public String getSiteIp() {
        return this.siteIp;
    }
    
    public void setSiteIp(String siteIp) {
        this.siteIp = siteIp;
    }
    
    @Column(name="SiteISP", nullable=false, length=100)
    public String getSiteIsp() {
        return this.siteIsp;
    }
    
    public void setSiteIsp(String siteIsp) {
        this.siteIsp = siteIsp;
    }
    
    @Column(name="SiteOpenDay", nullable=false, length=10)
    public String getSiteOpenDay() {
        return this.siteOpenDay;
    }
    
    public void setSiteOpenDay(String siteOpenDay) {
        this.siteOpenDay = siteOpenDay;
    }
    
    @Column(name="SiteMail", nullable=false, length=100)
    public String getSiteMail() {
        return this.siteMail;
    }
    
    public void setSiteMail(String siteMail) {
        this.siteMail = siteMail;
    }
    
    @Column(name="SiteAddress", nullable=false, length=100)
    public String getSiteAddress() {
        return this.siteAddress;
    }
    
    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }
    
    @Column(name="SiteInfo", length=200)
    public String getSiteInfo() {
        return this.siteInfo;
    }
    
    public void setSiteInfo(String siteInfo) {
        this.siteInfo = siteInfo;
    }
    
    @Column(name="SNBXH", nullable=false, length=30)
    public String getSnbxh() {
        return this.snbxh;
    }
    
    public void setSnbxh(String snbxh) {
        this.snbxh = snbxh;
    }
    
    @Column(name="OperID", length=32)
    public String getOperId() {
        return this.operId;
    }
    
    public void setOperId(String operId) {
        this.operId = operId;
    }
    
    @Column(name="ApplyType", nullable=false, length=1)
    public Integer getApplyType() {
        return this.applyType;
    }
    
    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }
    
    @Column(name="AuditStatus", nullable=false, length=1)
    public Integer getAuditStatus() {
        return this.auditStatus;
    }
    
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }
    
    @Column(name="AuditComment", length=200)
    public String getAuditComment() {
        return this.auditComment;
    }
    
    public void setAuditComment(String auditComment) {
        this.auditComment = auditComment;
    }
    
    @Column(name="CurrHandleDept", length=32)
    public String getCurrHandleDept() {
        return this.currHandleDept;
    }
    
    public void setCurrHandleDept(String currHandleDept) {
        this.currHandleDept = currHandleDept;
    }
    
    @Column(name="CurrHandler", length=32)
    public String getCurrHandler() {
        return this.currHandler;
    }
    
    public void setCurrHandler(String currHandler) {
        this.currHandler = currHandler;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="HandleTime", length=10)
    public Date getHandleTime() {
        return this.handleTime;
    }
    
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }
    
    @Column(name="NextHandleDept", length=32)
    public String getNextHandleDept() {
        return this.nextHandleDept;
    }
    
    public void setNextHandleDept(String nextHandleDept) {
        this.nextHandleDept = nextHandleDept;
    }
    
    @Column(name="IsValid", nullable=false, length=1)
    public Integer getIsValid() {
        return this.isValid;
    }
    
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
    
    @Column(name="CreateDate", nullable=false, length=10)
    public String getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    
    @Column(name="DestroyDate", nullable=false, length=10)
    public String getDestroyDate() {
        return this.destroyDate;
    }
    
    public void setDestroyDate(String destroyDate) {
        this.destroyDate = destroyDate;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NctsApplication pojo = (NctsApplication) o;

        if (userId != null ? !userId.equals(pojo.userId) : pojo.userId != null) return false;
        if (siteName != null ? !siteName.equals(pojo.siteName) : pojo.siteName != null) return false;
        if (siteDomains != null ? !siteDomains.equals(pojo.siteDomains) : pojo.siteDomains != null) return false;
        if (siteIcpno != null ? !siteIcpno.equals(pojo.siteIcpno) : pojo.siteIcpno != null) return false;
        if (siteIp != null ? !siteIp.equals(pojo.siteIp) : pojo.siteIp != null) return false;
        if (siteIsp != null ? !siteIsp.equals(pojo.siteIsp) : pojo.siteIsp != null) return false;
        if (siteOpenDay != null ? !siteOpenDay.equals(pojo.siteOpenDay) : pojo.siteOpenDay != null) return false;
        if (siteMail != null ? !siteMail.equals(pojo.siteMail) : pojo.siteMail != null) return false;
        if (siteAddress != null ? !siteAddress.equals(pojo.siteAddress) : pojo.siteAddress != null) return false;
        if (siteInfo != null ? !siteInfo.equals(pojo.siteInfo) : pojo.siteInfo != null) return false;
        if (snbxh != null ? !snbxh.equals(pojo.snbxh) : pojo.snbxh != null) return false;
        if (operId != null ? !operId.equals(pojo.operId) : pojo.operId != null) return false;
        if (auditComment != null ? !auditComment.equals(pojo.auditComment) : pojo.auditComment != null) return false;
        if (currHandleDept != null ? !currHandleDept.equals(pojo.currHandleDept) : pojo.currHandleDept != null) return false;
        if (currHandler != null ? !currHandler.equals(pojo.currHandler) : pojo.currHandler != null) return false;
        if (handleTime != null ? !handleTime.equals(pojo.handleTime) : pojo.handleTime != null) return false;
        if (nextHandleDept != null ? !nextHandleDept.equals(pojo.nextHandleDept) : pojo.nextHandleDept != null) return false;
        if (createDate != null ? !createDate.equals(pojo.createDate) : pojo.createDate != null) return false;
        if (destroyDate != null ? !destroyDate.equals(pojo.destroyDate) : pojo.destroyDate != null) return false;

        return true;
    }

    public int hashCode() {
        int result = 0;
        result = (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (siteName != null ? siteName.hashCode() : 0);
        result = 31 * result + (siteDomains != null ? siteDomains.hashCode() : 0);
        result = 31 * result + (siteIcpno != null ? siteIcpno.hashCode() : 0);
        result = 31 * result + (siteIp != null ? siteIp.hashCode() : 0);
        result = 31 * result + (siteIsp != null ? siteIsp.hashCode() : 0);
        result = 31 * result + (siteOpenDay != null ? siteOpenDay.hashCode() : 0);
        result = 31 * result + (siteMail != null ? siteMail.hashCode() : 0);
        result = 31 * result + (siteAddress != null ? siteAddress.hashCode() : 0);
        result = 31 * result + (siteInfo != null ? siteInfo.hashCode() : 0);
        result = 31 * result + (snbxh != null ? snbxh.hashCode() : 0);
        result = 31 * result + (operId != null ? operId.hashCode() : 0);
        result = 31 * result + (auditComment != null ? auditComment.hashCode() : 0);
        result = 31 * result + (currHandleDept != null ? currHandleDept.hashCode() : 0);
        result = 31 * result + (currHandler != null ? currHandler.hashCode() : 0);
        result = 31 * result + (handleTime != null ? handleTime.hashCode() : 0);
        result = 31 * result + (nextHandleDept != null ? nextHandleDept.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (destroyDate != null ? destroyDate.hashCode() : 0);

        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getSimpleName());

        sb.append(" [");
        sb.append("applyId").append("='").append(getApplyId()).append("', ");
        sb.append("userId").append("='").append(getUserId()).append("', ");
        sb.append("siteName").append("='").append(getSiteName()).append("', ");
        sb.append("siteDomains").append("='").append(getSiteDomains()).append("', ");
        sb.append("siteType").append("='").append(getSiteType()).append("', ");
        sb.append("siteIcpno").append("='").append(getSiteIcpno()).append("', ");
        sb.append("siteIp").append("='").append(getSiteIp()).append("', ");
        sb.append("siteIsp").append("='").append(getSiteIsp()).append("', ");
        sb.append("siteOpenDay").append("='").append(getSiteOpenDay()).append("', ");
        sb.append("siteMail").append("='").append(getSiteMail()).append("', ");
        sb.append("siteAddress").append("='").append(getSiteAddress()).append("', ");
        sb.append("siteInfo").append("='").append(getSiteInfo()).append("', ");
        sb.append("snbxh").append("='").append(getSnbxh()).append("', ");
        sb.append("operId").append("='").append(getOperId()).append("', ");
        sb.append("applyType").append("='").append(getApplyType()).append("', ");
        sb.append("auditStatus").append("='").append(getAuditStatus()).append("', ");
        sb.append("auditComment").append("='").append(getAuditComment()).append("', ");
        sb.append("currHandleDept").append("='").append(getCurrHandleDept()).append("', ");
        sb.append("currHandler").append("='").append(getCurrHandler()).append("', ");
        sb.append("handleTime").append("='").append(getHandleTime()).append("', ");
        sb.append("nextHandleDept").append("='").append(getNextHandleDept()).append("', ");
        sb.append("isValid").append("='").append(getIsValid()).append("', ");
        sb.append("createDate").append("='").append(getCreateDate()).append("', ");
        sb.append("destroyDate").append("='").append(getDestroyDate()).append("'");
        sb.append("]");
      
        return sb.toString();
    }

}
