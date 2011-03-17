package com.ncts.model;

import com.ncts.model.BaseObject;
import org.compass.annotations.SearchableId;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;

@Entity
@Table(name="ncts_user",catalog="NCTS")
public class NctsUser extends BaseObject implements Serializable {
    private String userId;
    private String userName;
    private String password;
    private String szch;
    private String sqymc;
    private String sfzrxm;
    private String snbxh;
    private boolean isOpened;
    private boolean isRepeat;
    private boolean isScan;
    private boolean isValid;

    public NctsUser() {
        this.isOpened = false;
        this.isRepeat = false;
        this.isScan = false;
        this.isValid = false;
    }

    public NctsUser(String userName) {
        this.userName = userName;
        this.isOpened = false;
        this.isRepeat = false;
        this.isScan = false;
        this.isValid = false;
    }

    @Id
    @Column(length = 32)
    @SearchableId
    @GeneratedValue(generator = "userIdGenerator")
    @GenericGenerator(name = "userIdGenerator", strategy = "uuid")
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="UserName", nullable=false, length=20)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="Password", nullable=false, length=32)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="SZCH", nullable=false, length=40)
    public String getSzch() {
        return this.szch;
    }
    
    public void setSzch(String szch) {
        this.szch = szch;
    }
    
    @Column(name="SQYMC", nullable=false, length=100)
    public String getSqymc() {
        return this.sqymc;
    }
    
    public void setSqymc(String sqymc) {
        this.sqymc = sqymc;
    }
    
    @Column(name="SFZRXM", nullable=false, length=500)
    public String getSfzrxm() {
        return this.sfzrxm;
    }
    
    public void setSfzrxm(String sfzrxm) {
        this.sfzrxm = sfzrxm;
    }
    
    @Column(name="SNBXH", length=30)
    public String getSnbxh() {
        return this.snbxh;
    }
    
    public void setSnbxh(String snbxh) {
        this.snbxh = snbxh;
    }
    
    @Column(name="IsOpened", nullable=false)
    public boolean getIsOpened() {
        return this.isOpened;
    }
    
    public void setIsOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }
    
    @Column(name="IsRepeat", nullable=false)
    public boolean getIsRepeat() {
        return this.isRepeat;
    }
    
    public void setIsRepeat(boolean isRepeat) {
        this.isRepeat = isRepeat;
    }
    
    @Column(name="IsSCan", nullable=false)
    public boolean getIsScan() {
        return this.isScan;
    }
    
    public void setIsScan(boolean isScan) {
        this.isScan = isScan;
    }
    
    @Column(name="IsValid", nullable=false)
    public boolean getIsValid() {
        return this.isValid;
    }
    
    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NctsUser pojo = (NctsUser) o;

        if (userName != null ? !userName.equals(pojo.userName) : pojo.userName != null) return false;
        if (password != null ? !password.equals(pojo.password) : pojo.password != null) return false;
        if (szch != null ? !szch.equals(pojo.szch) : pojo.szch != null) return false;
        if (sqymc != null ? !sqymc.equals(pojo.sqymc) : pojo.sqymc != null) return false;
        if (sfzrxm != null ? !sfzrxm.equals(pojo.sfzrxm) : pojo.sfzrxm != null) return false;
        if (snbxh != null ? !snbxh.equals(pojo.snbxh) : pojo.snbxh != null) return false;

        return true;
    }

    public int hashCode() {
        int result = 0;
        result = (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (szch != null ? szch.hashCode() : 0);
        result = 31 * result + (sqymc != null ? sqymc.hashCode() : 0);
        result = 31 * result + (sfzrxm != null ? sfzrxm.hashCode() : 0);
        result = 31 * result + (snbxh != null ? snbxh.hashCode() : 0);

        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getSimpleName());

        sb.append(" [");
        sb.append("userId").append("='").append(getUserId()).append("', ");
        sb.append("userName").append("='").append(getUserName()).append("', ");
        sb.append("password").append("='").append(getPassword()).append("', ");
        sb.append("szch").append("='").append(getSzch()).append("', ");
        sb.append("sqymc").append("='").append(getSqymc()).append("', ");
        sb.append("sfzrxm").append("='").append(getSfzrxm()).append("', ");
        sb.append("snbxh").append("='").append(getSnbxh()).append("', ");
        sb.append("isOpened").append("='").append(getIsOpened()).append("', ");
        sb.append("isRepeat").append("='").append(getIsRepeat()).append("', ");
        sb.append("isScan").append("='").append(getIsScan()).append("', ");
        sb.append("isValid").append("='").append(getIsValid()).append("'");
        sb.append("]");
      
        return sb.toString();
    }

}
