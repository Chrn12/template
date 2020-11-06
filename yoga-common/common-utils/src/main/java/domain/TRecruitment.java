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
public class TRecruitment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String tRecruitmentSect;

    private Integer tRecruitmentSalary;

    private String tRecruitmentDescribe;

    private String tSpare;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettRecruitmentSect() {
        return tRecruitmentSect;
    }

    public void settRecruitmentSect(String tRecruitmentSect) {
        this.tRecruitmentSect = tRecruitmentSect;
    }

    public Integer gettRecruitmentSalary() {
        return tRecruitmentSalary;
    }

    public void settRecruitmentSalary(Integer tRecruitmentSalary) {
        this.tRecruitmentSalary = tRecruitmentSalary;
    }

    public String gettRecruitmentDescribe() {
        return tRecruitmentDescribe;
    }

    public void settRecruitmentDescribe(String tRecruitmentDescribe) {
        this.tRecruitmentDescribe = tRecruitmentDescribe;
    }

    public String gettSpare() {
        return tSpare;
    }

    public void settSpare(String tSpare) {
        this.tSpare = tSpare;
    }

    @Override
    public String toString() {
        return "TRecruitment{" +
        "id=" + id +
        ", tRecruitmentSect=" + tRecruitmentSect +
        ", tRecruitmentSalary=" + tRecruitmentSalary +
        ", tRecruitmentDescribe=" + tRecruitmentDescribe +
        ", tSpare=" + tSpare +
        "}";
    }
}
