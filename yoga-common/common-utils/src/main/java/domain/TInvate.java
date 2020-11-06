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
public class TInvate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer tVenueId;

    private Integer tInvateCoachId;

    private LocalDateTime tInvateTime;

    private String tInvateNote;

    private Integer tInvateStatus;

    private String tSpare;

    private String tInvateCoachName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettVenueId() {
        return tVenueId;
    }

    public void settVenueId(Integer tVenueId) {
        this.tVenueId = tVenueId;
    }

    public Integer gettInvateCoachId() {
        return tInvateCoachId;
    }

    public void settInvateCoachId(Integer tInvateCoachId) {
        this.tInvateCoachId = tInvateCoachId;
    }

    public LocalDateTime gettInvateTime() {
        return tInvateTime;
    }

    public void settInvateTime(LocalDateTime tInvateTime) {
        this.tInvateTime = tInvateTime;
    }

    public String gettInvateNote() {
        return tInvateNote;
    }

    public void settInvateNote(String tInvateNote) {
        this.tInvateNote = tInvateNote;
    }

    public Integer gettInvateStatus() {
        return tInvateStatus;
    }

    public void settInvateStatus(Integer tInvateStatus) {
        this.tInvateStatus = tInvateStatus;
    }

    public String gettSpare() {
        return tSpare;
    }

    public void settSpare(String tSpare) {
        this.tSpare = tSpare;
    }

    public String gettInvateCoachName() {
        return tInvateCoachName;
    }

    public void settInvateCoachName(String tInvateCoachName) {
        this.tInvateCoachName = tInvateCoachName;
    }

    @Override
    public String toString() {
        return "TInvate{" +
        "id=" + id +
        ", tVenueId=" + tVenueId +
        ", tInvateCoachId=" + tInvateCoachId +
        ", tInvateTime=" + tInvateTime +
        ", tInvateNote=" + tInvateNote +
        ", tInvateStatus=" + tInvateStatus +
        ", tSpare=" + tSpare +
        ", tInvateCoachName=" + tInvateCoachName +
        "}";
    }
}
