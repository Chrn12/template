package domain;

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
public class TAdvertising implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer tAdvertisingVid;

    private String tAdvertisingUrl;

    private String tAdvertisingText;

    private LocalDateTime tAdvertisingTime;

    private String tSpare;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettAdvertisingVid() {
        return tAdvertisingVid;
    }

    public void settAdvertisingVid(Integer tAdvertisingVid) {
        this.tAdvertisingVid = tAdvertisingVid;
    }

    public String gettAdvertisingUrl() {
        return tAdvertisingUrl;
    }

    public void settAdvertisingUrl(String tAdvertisingUrl) {
        this.tAdvertisingUrl = tAdvertisingUrl;
    }

    public String gettAdvertisingText() {
        return tAdvertisingText;
    }

    public void settAdvertisingText(String tAdvertisingText) {
        this.tAdvertisingText = tAdvertisingText;
    }

    public LocalDateTime gettAdvertisingTime() {
        return tAdvertisingTime;
    }

    public void settAdvertisingTime(LocalDateTime tAdvertisingTime) {
        this.tAdvertisingTime = tAdvertisingTime;
    }

    public String gettSpare() {
        return tSpare;
    }

    public void settSpare(String tSpare) {
        this.tSpare = tSpare;
    }

    @Override
    public String toString() {
        return "TAdvertising{" +
        "id=" + id +
        ", tAdvertisingVid=" + tAdvertisingVid +
        ", tAdvertisingUrl=" + tAdvertisingUrl +
        ", tAdvertisingText=" + tAdvertisingText +
        ", tAdvertisingTime=" + tAdvertisingTime +
        ", tSpare=" + tSpare +
        "}";
    }
}
