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
public class TCoachConcern implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer cid;

    private String tSidList;

    private String tVidList;

    private String tCidList;

    private String tSpare;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String gettSidList() {
        return tSidList;
    }

    public void settSidList(String tSidList) {
        this.tSidList = tSidList;
    }

    public String gettVidList() {
        return tVidList;
    }

    public void settVidList(String tVidList) {
        this.tVidList = tVidList;
    }

    public String gettCidList() {
        return tCidList;
    }

    public void settCidList(String tCidList) {
        this.tCidList = tCidList;
    }

    public String gettSpare() {
        return tSpare;
    }

    public void settSpare(String tSpare) {
        this.tSpare = tSpare;
    }

    @Override
    public String toString() {
        return "TCoachConcern{" +
        "id=" + id +
        ", cid=" + cid +
        ", tSidList=" + tSidList +
        ", tVidList=" + tVidList +
        ", tCidList=" + tCidList +
        ", tSpare=" + tSpare +
        "}";
    }
}
