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
public class TVenueCoach implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer tVenueId;

    private Integer tCoachId;

    private String tCoachName;

    private String tSpare;


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

    public String gettSpare() {
        return tSpare;
    }

    public void settSpare(String tSpare) {
        this.tSpare = tSpare;
    }

    @Override
    public String toString() {
        return "TVenueCoach{" +
        "id=" + id +
        ", tVenueId=" + tVenueId +
        ", tCoachId=" + tCoachId +
        ", tCoachName=" + tCoachName +
        ", tSpare=" + tSpare +
        "}";
    }
}
