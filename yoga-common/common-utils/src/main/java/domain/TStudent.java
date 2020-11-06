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
public class TStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_student_id", type = IdType.AUTO)
    private Integer tStudentId;

    private String tStudentName;

    private String tStudentPassword;

    private String tStudentTel;

    private String tStudentMail;

    private String tStudentOpenid;

    private String tStudentImg;

    private Integer tStudentSex;

    private Integer tStudentAge;

    private Integer tStudentInfoLevel;

    private Double tStudentBalance;

    private Integer tStudentStatus;

    private LocalDateTime tStudentCreateTime;

    private String tStudentSpare;


    public Integer gettStudentId() {
        return tStudentId;
    }

    public void settStudentId(Integer tStudentId) {
        this.tStudentId = tStudentId;
    }

    public String gettStudentName() {
        return tStudentName;
    }

    public void settStudentName(String tStudentName) {
        this.tStudentName = tStudentName;
    }

    public String gettStudentPassword() {
        return tStudentPassword;
    }

    public void settStudentPassword(String tStudentPassword) {
        this.tStudentPassword = tStudentPassword;
    }

    public String gettStudentTel() {
        return tStudentTel;
    }

    public void settStudentTel(String tStudentTel) {
        this.tStudentTel = tStudentTel;
    }

    public String gettStudentMail() {
        return tStudentMail;
    }

    public void settStudentMail(String tStudentMail) {
        this.tStudentMail = tStudentMail;
    }

    public String gettStudentOpenid() {
        return tStudentOpenid;
    }

    public void settStudentOpenid(String tStudentOpenid) {
        this.tStudentOpenid = tStudentOpenid;
    }

    public String gettStudentImg() {
        return tStudentImg;
    }

    public void settStudentImg(String tStudentImg) {
        this.tStudentImg = tStudentImg;
    }

    public Integer gettStudentSex() {
        return tStudentSex;
    }

    public void settStudentSex(Integer tStudentSex) {
        this.tStudentSex = tStudentSex;
    }

    public Integer gettStudentAge() {
        return tStudentAge;
    }

    public void settStudentAge(Integer tStudentAge) {
        this.tStudentAge = tStudentAge;
    }

    public Integer gettStudentInfoLevel() {
        return tStudentInfoLevel;
    }

    public void settStudentInfoLevel(Integer tStudentInfoLevel) {
        this.tStudentInfoLevel = tStudentInfoLevel;
    }

    public Double gettStudentBalance() {
        return tStudentBalance;
    }

    public void settStudentBalance(Double tStudentBalance) {
        this.tStudentBalance = tStudentBalance;
    }

    public Integer gettStudentStatus() {
        return tStudentStatus;
    }

    public void settStudentStatus(Integer tStudentStatus) {
        this.tStudentStatus = tStudentStatus;
    }

    public LocalDateTime gettStudentCreateTime() {
        return tStudentCreateTime;
    }

    public void settStudentCreateTime(LocalDateTime tStudentCreateTime) {
        this.tStudentCreateTime = tStudentCreateTime;
    }

    public String gettStudentSpare() {
        return tStudentSpare;
    }

    public void settStudentSpare(String tStudentSpare) {
        this.tStudentSpare = tStudentSpare;
    }

    @Override
    public String toString() {
        return "TStudent{" +
        "tStudentId=" + tStudentId +
        ", tStudentName=" + tStudentName +
        ", tStudentPassword=" + tStudentPassword +
        ", tStudentTel=" + tStudentTel +
        ", tStudentMail=" + tStudentMail +
        ", tStudentOpenid=" + tStudentOpenid +
        ", tStudentImg=" + tStudentImg +
        ", tStudentSex=" + tStudentSex +
        ", tStudentAge=" + tStudentAge +
        ", tStudentInfoLevel=" + tStudentInfoLevel +
        ", tStudentBalance=" + tStudentBalance +
        ", tStudentStatus=" + tStudentStatus +
        ", tStudentCreateTime=" + tStudentCreateTime +
        ", tStudentSpare=" + tStudentSpare +
        "}";
    }
}
