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
public class TProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_product_id", type = IdType.AUTO)
    private Integer tProductId;

    private String tProductName;

    private Integer tProductCount;

    private Integer tProductSold;

    private Integer tProductValidity;

    private String tProductRules;

    private String tProductDetails;

    private String tSpare;

    private Integer tVenueId;


    public Integer gettProductId() {
        return tProductId;
    }

    public void settProductId(Integer tProductId) {
        this.tProductId = tProductId;
    }

    public String gettProductName() {
        return tProductName;
    }

    public void settProductName(String tProductName) {
        this.tProductName = tProductName;
    }

    public Integer gettProductCount() {
        return tProductCount;
    }

    public void settProductCount(Integer tProductCount) {
        this.tProductCount = tProductCount;
    }

    public Integer gettProductSold() {
        return tProductSold;
    }

    public void settProductSold(Integer tProductSold) {
        this.tProductSold = tProductSold;
    }

    public Integer gettProductValidity() {
        return tProductValidity;
    }

    public void settProductValidity(Integer tProductValidity) {
        this.tProductValidity = tProductValidity;
    }

    public String gettProductRules() {
        return tProductRules;
    }

    public void settProductRules(String tProductRules) {
        this.tProductRules = tProductRules;
    }

    public String gettProductDetails() {
        return tProductDetails;
    }

    public void settProductDetails(String tProductDetails) {
        this.tProductDetails = tProductDetails;
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
        return "TProduct{" +
        "tProductId=" + tProductId +
        ", tProductName=" + tProductName +
        ", tProductCount=" + tProductCount +
        ", tProductSold=" + tProductSold +
        ", tProductValidity=" + tProductValidity +
        ", tProductRules=" + tProductRules +
        ", tProductDetails=" + tProductDetails +
        ", tSpare=" + tSpare +
        ", tVenueId=" + tVenueId +
        "}";
    }
}
