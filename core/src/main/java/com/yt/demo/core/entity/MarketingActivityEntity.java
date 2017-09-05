package com.yt.demo.core.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 营销活动定义
 * Created by jackdeng on 2017/8/3.
 */
@Entity
@Table(name = "marketing_activity_define")
public class MarketingActivityEntity implements Serializable {

    //主键、自动生成
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",insertable = false, updatable = false)
    private Long id;
    @Column(name = "mkt_tool_id" )
    private Long mktToolId;

    //活动标题
    @Column(name = "title")
    private String title;

    //开始时间，只支持到分钟，且只支持00、30
    @Column(name = "start_time")
    private Date startTime;
    //结束时间，只支持到分钟，且只支持00、30
    @Column(name = "end_time")
    private Date endTime;
    //活动价，单位元
    @Column(name = "act_price")
    private BigDecimal actPrice;
    //单买价、销售价，单位元
    @Column(name = "sale_price")
    private BigDecimal salePrice;
    //活动备注
    @Column(name = "remark",length = 500)
    private String remark;
    //活动图片
    @Column(name = "act_image_url")
    private String actImageUrl;
    //活动详情图片
    @Column(name = "act_detail_image_url")
    private String actDetailUrl;
    //商品ID
    @Column(name = "item_id")
    private Long itemId;
    //商品名称
    @Column(name = "item_name")
    private String itemName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMktToolId() {
        return mktToolId;
    }

    public void setMktToolId(Long mktToolId) {
        this.mktToolId = mktToolId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getActPrice() {
        return actPrice;
    }

    public void setActPrice(BigDecimal actPrice) {
        this.actPrice = actPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getActImageUrl() {
        return actImageUrl;
    }

    public void setActImageUrl(String actImageUrl) {
        this.actImageUrl = actImageUrl;
    }

    public String getActDetailUrl() {
        return actDetailUrl;
    }

    public void setActDetailUrl(String actDetailUrl) {
        this.actDetailUrl = actDetailUrl;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
