package domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fei
 * @since 2020-11-06
 */
public class TForjob implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String tForjobSect;

    private Integer tForjobMoney;

    private String tInvateNote;

    private String tSpare;

    private Integer tVenueId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettForjobSect() {
        return tForjobSect;
    }

    public void settForjobSect(String tForjobSect) {
        this.tForjobSect = tForjobSect;
    }

    public Integer gettForjobMoney() {
        return tForjobMoney;
    }

    public void settForjobMoney(Integer tForjobMoney) {
        this.tForjobMoney = tForjobMoney;
    }

    public String gettInvateNote() {
        return tInvateNote;
    }

    public void settInvateNote(String tInvateNote) {
        this.tInvateNote = tInvateNote;
    }

    public String gettSpare() {
        return tSpare;
    }

    public void settSpare(String tSpare) {
        this.tSpare = tSpare;
    }

    public Integer gettVenueId() {
        return tVenueId;
    }

    public void settVenueId(Integer tVenueId) {
        this.tVenueId = tVenueId;
    }

    @Override
    public String toString() {
        return "TForjob{" +
        "id=" + id +
        ", tForjobSect=" + tForjobSect +
        ", tForjobMoney=" + tForjobMoney +
        ", tInvateNote=" + tInvateNote +
        ", tSpare=" + tSpare +
        ", tVenueId=" + tVenueId +
        "}";
    }
}
