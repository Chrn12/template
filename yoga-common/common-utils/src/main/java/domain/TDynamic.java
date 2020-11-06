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
public class TDynamic implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_dynamic_id", type = IdType.AUTO)
    private Integer tDynamicId;

    private Integer tDynamicAuthor;

    /**
     * 1学生，2场馆，3教练
     */
    private Integer tDynamicRole;

    private String tDynamicContext;

    private String tDynamicImg;

    private LocalDateTime tDynamicTime;

    private String tSpare;


    public Integer gettDynamicId() {
        return tDynamicId;
    }

    public void settDynamicId(Integer tDynamicId) {
        this.tDynamicId = tDynamicId;
    }

    public Integer gettDynamicAuthor() {
        return tDynamicAuthor;
    }

    public void settDynamicAuthor(Integer tDynamicAuthor) {
        this.tDynamicAuthor = tDynamicAuthor;
    }

    public Integer gettDynamicRole() {
        return tDynamicRole;
    }

    public void settDynamicRole(Integer tDynamicRole) {
        this.tDynamicRole = tDynamicRole;
    }

    public String gettDynamicContext() {
        return tDynamicContext;
    }

    public void settDynamicContext(String tDynamicContext) {
        this.tDynamicContext = tDynamicContext;
    }

    public String gettDynamicImg() {
        return tDynamicImg;
    }

    public void settDynamicImg(String tDynamicImg) {
        this.tDynamicImg = tDynamicImg;
    }

    public LocalDateTime gettDynamicTime() {
        return tDynamicTime;
    }

    public void settDynamicTime(LocalDateTime tDynamicTime) {
        this.tDynamicTime = tDynamicTime;
    }

    public String gettSpare() {
        return tSpare;
    }

    public void settSpare(String tSpare) {
        this.tSpare = tSpare;
    }

    @Override
    public String toString() {
        return "TDynamic{" +
        "tDynamicId=" + tDynamicId +
        ", tDynamicAuthor=" + tDynamicAuthor +
        ", tDynamicRole=" + tDynamicRole +
        ", tDynamicContext=" + tDynamicContext +
        ", tDynamicImg=" + tDynamicImg +
        ", tDynamicTime=" + tDynamicTime +
        ", tSpare=" + tSpare +
        "}";
    }
}
