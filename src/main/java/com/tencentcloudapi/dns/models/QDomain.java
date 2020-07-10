package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author 范恩华
 * @date 2020-07-06 16:51
 */

public class QDomain {

    @SerializedName("domain_total")
    @Expose
    private String domainTotal;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("group_id")
    @Expose
    private String groupId;
    @SerializedName("searchengine_push")
    @Expose
    private String searchenginePush;
    @SerializedName("is_mark")
    @Expose
    private String isMark;
    @SerializedName("ttl")
    @Expose
    private Integer ttl;
    @SerializedName("cname_speedup")
    @Expose
    private String cnameSpeedup;
    @SerializedName("remark")
    @Expose
    private String remark;
    @SerializedName("created_on")
    @Expose
    private String createdon;
    @SerializedName("updated_on")
    @Expose
    private String updated_on;
    @SerializedName("q_project_id")
    @Expose
    private String qProjectId;
    @SerializedName("punycode")
    @Expose
    private String punycode;
    // ext_status	String	域名扩展的状态信息，"notexist"、"dnserror"、"" 分别代表"域名未注册"、"DNS 设置错误"、"正常"
    @SerializedName("ext_status")
    @Expose
    private String extStatus;

    //   src_flag	String	域名的来源标记，"QCLOUD"、"DNSPOD" 分别代表 "腾讯云解析"、"DNSPod"
    @SerializedName("src_flag")
    @Expose
    private String srcFlag;
    // name	String	域名
    @SerializedName("name")
    @Expose
    private String name;
    //grade	String	域名的等级
    @SerializedName("grade")
    @Expose
    private String grade;

    //grade_title	String	域名等级的名称
    @SerializedName("grade_title")
    @Expose
    private String gradeTitle;
    //is_vip	String	是否为 VIP 域名，"yes" 和 "no" 分别代表 "是" 和 "否"'
    @SerializedName("is_vip")
    @Expose
    private String isVip;
    //  owner	String	域名所有者对应的邮箱帐号
    @SerializedName("owner")
    @Expose
    private String owner;
    // records	String	域名下的解析记录条数
    @SerializedName("records")
    @Expose
    private String records;

    public String getDomainTotal() {
        return domainTotal;
    }

    public void setDomainTotal(String domainTotal) {
        this.domainTotal = domainTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSearchenginePush() {
        return searchenginePush;
    }

    public void setSearchenginePush(String searchenginePush) {
        this.searchenginePush = searchenginePush;
    }

    public String getIsMark() {
        return isMark;
    }

    public void setIsMark(String isMark) {
        this.isMark = isMark;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public String getCnameSpeedup() {
        return cnameSpeedup;
    }

    public void setCnameSpeedup(String cnameSpeedup) {
        this.cnameSpeedup = cnameSpeedup;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatedon() {
        return createdon;
    }

    public void setCreatedon(String createdon) {
        this.createdon = createdon;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public String getqProjectId() {
        return qProjectId;
    }

    public void setqProjectId(String qProjectId) {
        this.qProjectId = qProjectId;
    }

    public String getPunycode() {
        return punycode;
    }

    public void setPunycode(String punycode) {
        this.punycode = punycode;
    }

    public String getExtStatus() {
        return extStatus;
    }

    public void setExtStatus(String extStatus) {
        this.extStatus = extStatus;
    }

    public String getSrcFlag() {
        return srcFlag;
    }

    public void setSrcFlag(String srcFlag) {
        this.srcFlag = srcFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGradeTitle() {
        return gradeTitle;
    }

    public void setGradeTitle(String gradeTitle) {
        this.gradeTitle = gradeTitle;
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public Integer getMinTtl() {
        return minTtl;
    }

    public void setMinTtl(Integer minTtl) {
        this.minTtl = minTtl;
    }

    //  min_ttl	Int	当前域名允许的最小的 TTL
    @SerializedName("min_ttl")
    @Expose
    private Integer minTtl;

}
