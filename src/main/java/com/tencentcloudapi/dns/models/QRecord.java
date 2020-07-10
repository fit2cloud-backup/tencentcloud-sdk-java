package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author 范恩华
 * @date 2020-07-08 09:44
 */
public class QRecord {


//    参数名称	类型	描述
//    id	Int	解析记录的ID
    @SerializedName("id")
    @Expose
    private Integer id;
//    ttl	Int	记录的 TTL 值
    @SerializedName("ttl")
    @Expose
    private Integer ttl;
//    value	String	记录的值
    @SerializedName("value")
    @Expose
    private String value;

    //enabled	Int	记录的暂停、启用状态，1和0分别代表启用和暂停
    @SerializedName("enabled")
    @Expose
    private Integer enabled;
  //  updated_on	String	解析记录的最后修改时间
    @SerializedName("updated_on")
    @Expose
    private String updatedOn;
 //   q_project_id	Int	解析记录所属的项目 ID
    @SerializedName("q_project_id")
    @Expose
    private Integer qProjectId;
  //  name	String	子域名
    @SerializedName("name")
    @Expose
    private String name;
 //   line	String	解析记录的线路名称
    @SerializedName("line")
    @Expose
    private String line;
 //   line_id	String	解析记录的线路编号
    @SerializedName("line_id")
    @Expose
    private String lineId;
 //   type	String	解析记录的类型
    @SerializedName("type")
    @Expose
    private String type;
  //  remark	String	解析记录的备注信息
    @SerializedName("remark")
    @Expose
    private String remark;
    //  mx	Int	MX 记录的优先级，非 MX 记录的话，该值为0
    @SerializedName("mx")
    @Expose
    private Integer mx;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getqProjectId() {
        return qProjectId;
    }

    public void setqProjectId(Integer qProjectId) {
        this.qProjectId = qProjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getMx() {
        return mx;
    }

    public void setMx(Integer mx) {
        this.mx = mx;
    }
}

