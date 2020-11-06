package domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author fei
 * @since 2020-11-06
 */
public class TCoach implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_coach_id", type = IdType.AUTO)
    private Integer tCoachId;

    private String tCoachName;

    private String tCoachPassword;

    private String tCoachTel;

    private String tCoachMail;

    private String tCoachOpenid;

    private String tCoachImg;

    private Integer tCoachSex;

    private Integer tCoachAge;

    private String tCoachAddress;

    private Integer tCoachInfoLevel;

    private Double tCoachBalance;

    private Integer tCoachStatus;

    private Integer tCoachTeachStatus;

    private LocalDateTime tCoachCreateTime;

    private String tCoachSpare;

    private String tCoachSect;


    public Integer gettCoachId() {
        return tCoachId;
    }

    public void settCoachId(Integer tCoachId) {
        this.tCoachId = tCoachId;
    }

    public String gettCoachName() {
        return tCoachName;
    }

    public void settCoachName(String tCoachName) {
        this.tCoachName = tCoachName;
    }

    public String gettCoachPassword() {
        return tCoachPassword;
    }

    public void settCoachPassword(String tCoachPassword) {
        this.tCoachPassword = tCoachPassword;
    }

    public String gettCoachTel() {
        return tCoachTel;
    }

    public void settCoachTel(String tCoachTel) {
        this.tCoachTel = tCoachTel;
    }

    public String gettCoachMail() {
        return tCoachMail;
    }

    public void settCoachMail(String tCoachMail) {
        this.tCoachMail = tCoachMail;
    }

    public String gettCoachOpenid() {
        return tCoachOpenid;
    }

    public void settCoachOpenid(String tCoachOpenid) {
        this.tCoachOpenid = tCoachOpenid;
    }

    public String gettCoachImg() {
        return tCoachImg;
    }

    public void settCoachImg(String tCoachImg) {
        this.tCoachImg = tCoachImg;
    }

    public Integer gettCoachSex() {
        return tCoachSex;
    }

    public void settCoachSex(Integer tCoachSex) {
        this.tCoachSex = tCoachSex;
    }

    public Integer gettCoachAge() {
        return tCoachAge;
    }

    public void settCoachAge(Integer tCoachAge) {
        this.tCoachAge = tCoachAge;
    }

    public String gettCoachAddress() {
        return tCoachAddress;
    }

    public void settCoachAddress(String tCoachAddress) {
        this.tCoachAddress = tCoachAddress;
    }

    public Integer gettCoachInfoLevel() {
        return tCoachInfoLevel;
    }

    public void settCoachInfoLevel(Integer tCoachInfoLevel) {
        this.tCoachInfoLevel = tCoachInfoLevel;
    }

    public Double gettCoachBalance() {
        return tCoachBalance;
    }

    public void settCoachBalance(Double tCoachBalance) {
        this.tCoachBalance = tCoachBalance;
    }

    public Integer gettCoachStatus() {
        return tCoachStatus;
    }

    public void settCoachStatus(Integer tCoachStatus) {
        this.tCoachStatus = tCoachStatus;
    }

    public Integer gettCoachTeachStatus() {
        return tCoachTeachStatus;
    }

    public void settCoachTeachStatus(Integer tCoachTeachStatus) {
        this.tCoachTeachStatus = tCoachTeachStatus;
    }

    public LocalDateTime gettCoachCreateTime() {
        return tCoachCreateTime;
    }

    public void settCoachCreateTime(LocalDateTime tCoachCreateTime) {
        this.tCoachCreateTime = tCoachCreateTime;
    }

    public String gettCoachSpare() {
        return tCoachSpare;
    }

    public void settCoachSpare(String tCoachSpare) {
        this.tCoachSpare = tCoachSpare;
    }

    public String gettCoachSect() {
        return tCoachSect;
    }

    public void settCoachSect(String tCoachSect) {
        this.tCoachSect = tCoachSect;
    }

    @Override
    public String toString() {
        return "TCoach{" +
        "tCoachId=" + tCoachId +
        ", tCoachName=" + tCoachName +
        ", tCoachPassword=" + tCoachPassword +
        ", tCoachTel=" + tCoachTel +
        ", tCoachMail=" + tCoachMail +
        ", tCoachOpenid=" + tCoachOpenid +
        ", tCoachImg=" + tCoachImg +
        ", tCoachSex=" + tCoachSex +
        ", tCoachAge=" + tCoachAge +
        ", tCoachAddress=" + tCoachAddress +
        ", tCoachInfoLevel=" + tCoachInfoLevel +
        ", tCoachBalance=" + tCoachBalance +
        ", tCoachStatus=" + tCoachStatus +
        ", tCoachTeachStatus=" + tCoachTeachStatus +
        ", tCoachCreateTime=" + tCoachCreateTime +
        ", tCoachSpare=" + tCoachSpare +
        ", tCoachSect=" + tCoachSect +
        "}";
    }
}
