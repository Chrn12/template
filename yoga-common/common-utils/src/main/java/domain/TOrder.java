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
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_order_id", type = IdType.AUTO)
    private Integer tOrderId;

    private LocalDateTime tOrderTime;

    private Double tOrderMoney;

    /**
     * 0提交1通过2拒绝3付款4退款
     */
    private Integer tOrderStatus;

    /**
     * 0好评1中评2差评
     */
    private Integer tOrderComment;

    private Integer tOrderSid;

    private Integer tOrderVid;

    private Integer tOrderCid;

    private LocalDateTime tOrderStart;

    private LocalDateTime tOrderEnd;

    private String tOrderDuration;

    private String tSpare;


    public Integer gettOrderId() {
        return tOrderId;
    }

    public void settOrderId(Integer tOrderId) {
        this.tOrderId = tOrderId;
    }

    public LocalDateTime gettOrderTime() {
        return tOrderTime;
    }

    public void settOrderTime(LocalDateTime tOrderTime) {
        this.tOrderTime = tOrderTime;
    }

    public Double gettOrderMoney() {
        return tOrderMoney;
    }

    public void settOrderMoney(Double tOrderMoney) {
        this.tOrderMoney = tOrderMoney;
    }

    public Integer gettOrderStatus() {
        return tOrderStatus;
    }

    public void settOrderStatus(Integer tOrderStatus) {
        this.tOrderStatus = tOrderStatus;
    }

    public Integer gettOrderComment() {
        return tOrderComment;
    }

    public void settOrderComment(Integer tOrderComment) {
        this.tOrderComment = tOrderComment;
    }

    public Integer gettOrderSid() {
        return tOrderSid;
    }

    public void settOrderSid(Integer tOrderSid) {
        this.tOrderSid = tOrderSid;
    }

    public Integer gettOrderVid() {
        return tOrderVid;
    }

    public void settOrderVid(Integer tOrderVid) {
        this.tOrderVid = tOrderVid;
    }

    public Integer gettOrderCid() {
        return tOrderCid;
    }

    public void settOrderCid(Integer tOrderCid) {
        this.tOrderCid = tOrderCid;
    }

    public LocalDateTime gettOrderStart() {
        return tOrderStart;
    }

    public void settOrderStart(LocalDateTime tOrderStart) {
        this.tOrderStart = tOrderStart;
    }

    public LocalDateTime gettOrderEnd() {
        return tOrderEnd;
    }

    public void settOrderEnd(LocalDateTime tOrderEnd) {
        this.tOrderEnd = tOrderEnd;
    }

    public String gettOrderDuration() {
        return tOrderDuration;
    }

    public void settOrderDuration(String tOrderDuration) {
        this.tOrderDuration = tOrderDuration;
    }

    public String gettSpare() {
        return tSpare;
    }

    public void settSpare(String tSpare) {
        this.tSpare = tSpare;
    }

    @Override
    public String toString() {
        return "TOrder{" +
        "tOrderId=" + tOrderId +
        ", tOrderTime=" + tOrderTime +
        ", tOrderMoney=" + tOrderMoney +
        ", tOrderStatus=" + tOrderStatus +
        ", tOrderComment=" + tOrderComment +
        ", tOrderSid=" + tOrderSid +
        ", tOrderVid=" + tOrderVid +
        ", tOrderCid=" + tOrderCid +
        ", tOrderStart=" + tOrderStart +
        ", tOrderEnd=" + tOrderEnd +
        ", tOrderDuration=" + tOrderDuration +
        ", tSpare=" + tSpare +
        "}";
    }
}
