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
public class TCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 1-7 星期数
     */
    private Integer tCourseDay;

    /**
     * 0上午、1下午
     */
    private Integer tCourseTime;

    private Integer tCourseCid;

    private String tCourseCname;

    private String tSpare;

    private Integer tVenueId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettCourseDay() {
        return tCourseDay;
    }

    public void settCourseDay(Integer tCourseDay) {
        this.tCourseDay = tCourseDay;
    }

    public Integer gettCourseTime() {
        return tCourseTime;
    }

    public void settCourseTime(Integer tCourseTime) {
        this.tCourseTime = tCourseTime;
    }

    public Integer gettCourseCid() {
        return tCourseCid;
    }

    public void settCourseCid(Integer tCourseCid) {
        this.tCourseCid = tCourseCid;
    }

    public String gettCourseCname() {
        return tCourseCname;
    }

    public void settCourseCname(String tCourseCname) {
        this.tCourseCname = tCourseCname;
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
        return "TCourse{" +
        "id=" + id +
        ", tCourseDay=" + tCourseDay +
        ", tCourseTime=" + tCourseTime +
        ", tCourseCid=" + tCourseCid +
        ", tCourseCname=" + tCourseCname +
        ", tSpare=" + tSpare +
        ", tVenueId=" + tVenueId +
        "}";
    }
}
