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
public class TStudentMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_message_id", type = IdType.AUTO)
    private Integer tMessageId;

    private Integer tMessageSid;

    private Integer tMessageUid;

    /**
     * 1学生，2场馆，3教练
     */
    private Integer tMessageRole;

    private String tMessageContent;

    /**
     * 0未读1已读
     */
    private Integer tMessageStatus;

    private LocalDateTime tMessageTime;


    public Integer gettMessageId() {
        return tMessageId;
    }

    public void settMessageId(Integer tMessageId) {
        this.tMessageId = tMessageId;
    }

    public Integer gettMessageSid() {
        return tMessageSid;
    }

    public void settMessageSid(Integer tMessageSid) {
        this.tMessageSid = tMessageSid;
    }

    public Integer gettMessageUid() {
        return tMessageUid;
    }

    public void settMessageUid(Integer tMessageUid) {
        this.tMessageUid = tMessageUid;
    }

    public Integer gettMessageRole() {
        return tMessageRole;
    }

    public void settMessageRole(Integer tMessageRole) {
        this.tMessageRole = tMessageRole;
    }

    public String gettMessageContent() {
        return tMessageContent;
    }

    public void settMessageContent(String tMessageContent) {
        this.tMessageContent = tMessageContent;
    }

    public Integer gettMessageStatus() {
        return tMessageStatus;
    }

    public void settMessageStatus(Integer tMessageStatus) {
        this.tMessageStatus = tMessageStatus;
    }

    public LocalDateTime gettMessageTime() {
        return tMessageTime;
    }

    public void settMessageTime(LocalDateTime tMessageTime) {
        this.tMessageTime = tMessageTime;
    }

    @Override
    public String toString() {
        return "TStudentMessage{" +
        "tMessageId=" + tMessageId +
        ", tMessageSid=" + tMessageSid +
        ", tMessageUid=" + tMessageUid +
        ", tMessageRole=" + tMessageRole +
        ", tMessageContent=" + tMessageContent +
        ", tMessageStatus=" + tMessageStatus +
        ", tMessageTime=" + tMessageTime +
        "}";
    }
}
