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
public class TVenue implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_venue_id", type = IdType.AUTO)
    private Integer tVenueId;

    private String tVenueName;

    private String tVenuePassword;

    private String tVenueTel;

    private String tVenueMail;

    private String tVenueOpenid;

    private String tVenueImg;

    private String tVenueAddress;

    private String tVenueDescribe;

    private Double tVenueBalance;

    private Integer tVenueStatus;

    private LocalDateTime tVenueCreateTime;

    private String tVenueSpare;


    public Integer gettVenueId() {
        return tVenueId;
    }

    public void settVenueId(Integer tVenueId) {
        this.tVenueId = tVenueId;
    }

    public String gettVenueName() {
        return tVenueName;
    }

    public void settVenueName(String tVenueName) {
        this.tVenueName = tVenueName;
    }

    public String gettVenuePassword() {
        return tVenuePassword;
    }

    public void settVenuePassword(String tVenuePassword) {
        this.tVenuePassword = tVenuePassword;
    }

    public String gettVenueTel() {
        return tVenueTel;
    }

    public void settVenueTel(String tVenueTel) {
        this.tVenueTel = tVenueTel;
    }

    public String gettVenueMail() {
        return tVenueMail;
    }

    public void settVenueMail(String tVenueMail) {
        this.tVenueMail = tVenueMail;
    }

    public String gettVenueOpenid() {
        return tVenueOpenid;
    }

    public void settVenueOpenid(String tVenueOpenid) {
        this.tVenueOpenid = tVenueOpenid;
    }

    public String gettVenueImg() {
        return tVenueImg;
    }

    public void settVenueImg(String tVenueImg) {
        this.tVenueImg = tVenueImg;
    }

    public String gettVenueAddress() {
        return tVenueAddress;
    }

    public void settVenueAddress(String tVenueAddress) {
        this.tVenueAddress = tVenueAddress;
    }

    public String gettVenueDescribe() {
        return tVenueDescribe;
    }

    public void settVenueDescribe(String tVenueDescribe) {
        this.tVenueDescribe = tVenueDescribe;
    }

    public Double gettVenueBalance() {
        return tVenueBalance;
    }

    public void settVenueBalance(Double tVenueBalance) {
        this.tVenueBalance = tVenueBalance;
    }

    public Integer gettVenueStatus() {
        return tVenueStatus;
    }

    public void settVenueStatus(Integer tVenueStatus) {
        this.tVenueStatus = tVenueStatus;
    }

    public LocalDateTime gettVenueCreateTime() {
        return tVenueCreateTime;
    }

    public void settVenueCreateTime(LocalDateTime tVenueCreateTime) {
        this.tVenueCreateTime = tVenueCreateTime;
    }

    public String gettVenueSpare() {
        return tVenueSpare;
    }

    public void settVenueSpare(String tVenueSpare) {
        this.tVenueSpare = tVenueSpare;
    }

    @Override
    public String toString() {
        return "TVenue{" +
        "tVenueId=" + tVenueId +
        ", tVenueName=" + tVenueName +
        ", tVenuePassword=" + tVenuePassword +
        ", tVenueTel=" + tVenueTel +
        ", tVenueMail=" + tVenueMail +
        ", tVenueOpenid=" + tVenueOpenid +
        ", tVenueImg=" + tVenueImg +
        ", tVenueAddress=" + tVenueAddress +
        ", tVenueDescribe=" + tVenueDescribe +
        ", tVenueBalance=" + tVenueBalance +
        ", tVenueStatus=" + tVenueStatus +
        ", tVenueCreateTime=" + tVenueCreateTime +
        ", tVenueSpare=" + tVenueSpare +
        "}";
    }
}
