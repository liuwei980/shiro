package springboot.oa.domain.user;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private String id;

    private String userName;

    private String password;

    private String userType;

    private String createuser;

    private String address;

    private Date createtime;

    private String tel;

    private String status;

    private String nickName;

    private String xzdwId;

    private String xzdwName;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getXzdwId() {
        return xzdwId;
    }

    public void setXzdwId(String xzdwId) {
        this.xzdwId = xzdwId == null ? null : xzdwId.trim();
    }

    public String getXzdwName() {
        return xzdwName;
    }

    public void setXzdwName(String xzdwName) {
        this.xzdwName = xzdwName == null ? null : xzdwName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", userType=").append(userType);
        sb.append(", createuser=").append(createuser);
        sb.append(", address=").append(address);
        sb.append(", createtime=").append(createtime);
        sb.append(", tel=").append(tel);
        sb.append(", status=").append(status);
        sb.append(", nickName=").append(nickName);
        sb.append(", xzdwId=").append(xzdwId);
        sb.append(", xzdwName=").append(xzdwName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}