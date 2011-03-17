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
import javax.persistence.Version;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;

@Entity
@Table(name="ncts_elecidentify",catalog="NCTS")
public class NctsElecidentify extends BaseObject implements Serializable {
    private String identifyId;
    private Long version;
    private String applyId;
    private String snbxh;
    private String siteDomains;
    private String identifyCode;
    private Integer isValid;
    private Date createDate;
    private Date destroyDate;

    @Id
    @Column(length = 32)
    @SearchableId
    @GeneratedValue(generator = "identifyIdGenerator")
    @GenericGenerator(name = "identifyIdGenerator", strategy = "uuid")
    public String getIdentifyId() {
        return this.identifyId;
    }
    
    public void setIdentifyId(String identifyId) {
        this.identifyId = identifyId;
    }
    @Version
    @Column(name="Version", nullable=false)
    public Long getVersion() {
        return this.version;
    }
    
    public void setVersion(Long version) {
        this.version = version;
    }
    
    @Column(name="ApplyID", nullable=false, length=32)
    public String getApplyId() {
        return this.applyId;
    }
    
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }
    
    @Column(name="SNBXH", nullable=false, length=30)
    public String getSnbxh() {
        return this.snbxh;
    }
    
    public void setSnbxh(String snbxh) {
        this.snbxh = snbxh;
    }
    
    @Column(name="SiteDomains", nullable=false, length=200)
    public String getSiteDomains() {
        return this.siteDomains;
    }
    
    public void setSiteDomains(String siteDomains) {
        this.siteDomains = siteDomains;
    }
    
    @Column(name="IdentifyCode", nullable=false, length=50)
    public String getIdentifyCode() {
        return this.identifyCode;
    }
    
    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }
    
    @Column(name="IsValid", nullable=false, length=1)
    public Integer getIsValid() {
        return this.isValid;
    }
    
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CreateDate", nullable=false, length=10)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DestroyDate", length=10)
    public Date getDestroyDate() {
        return this.destroyDate;
    }
    
    public void setDestroyDate(Date destroyDate) {
        this.destroyDate = destroyDate;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NctsElecidentify pojo = (NctsElecidentify) o;

        if (version != null ? !version.equals(pojo.version) : pojo.version != null) return false;
        if (applyId != null ? !applyId.equals(pojo.applyId) : pojo.applyId != null) return false;
        if (snbxh != null ? !snbxh.equals(pojo.snbxh) : pojo.snbxh != null) return false;
        if (siteDomains != null ? !siteDomains.equals(pojo.siteDomains) : pojo.siteDomains != null) return false;
        if (identifyCode != null ? !identifyCode.equals(pojo.identifyCode) : pojo.identifyCode != null) return false;
        if (createDate != null ? !createDate.equals(pojo.createDate) : pojo.createDate != null) return false;
        if (destroyDate != null ? !destroyDate.equals(pojo.destroyDate) : pojo.destroyDate != null) return false;

        return true;
    }

    public int hashCode() {
        int result = 0;
        result = (version != null ? version.hashCode() : 0);
        result = 31 * result + (applyId != null ? applyId.hashCode() : 0);
        result = 31 * result + (snbxh != null ? snbxh.hashCode() : 0);
        result = 31 * result + (siteDomains != null ? siteDomains.hashCode() : 0);
        result = 31 * result + (identifyCode != null ? identifyCode.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (destroyDate != null ? destroyDate.hashCode() : 0);

        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getSimpleName());

        sb.append(" [");
        sb.append("identifyId").append("='").append(getIdentifyId()).append("', ");
        sb.append("version").append("='").append(getVersion()).append("', ");
        sb.append("applyId").append("='").append(getApplyId()).append("', ");
        sb.append("snbxh").append("='").append(getSnbxh()).append("', ");
        sb.append("siteDomains").append("='").append(getSiteDomains()).append("', ");
        sb.append("identifyCode").append("='").append(getIdentifyCode()).append("', ");
        sb.append("isValid").append("='").append(getIsValid()).append("', ");
        sb.append("createDate").append("='").append(getCreateDate()).append("', ");
        sb.append("destroyDate").append("='").append(getDestroyDate()).append("'");
        sb.append("]");
      
        return sb.toString();
    }

}
