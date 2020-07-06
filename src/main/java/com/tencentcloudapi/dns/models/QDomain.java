package com.tencentcloudapi.dns.models;

/**
 * @author 范恩华
 * @date 2020-07-06 16:51
 */
public class QDomain {

    private String domain_total;
    private Integer id;
    private String status;
    private String group_id;
    private String searchengine_push;
    private String is_mark;
    private Integer ttl;
    private String cname_speedup;
    private String remark;
    private String created_on;
    private String updated_on;
    private String q_project_id;
    private String punycode;
   // ext_status	String	域名扩展的状态信息，"notexist"、"dnserror"、"" 分别代表"域名未注册"、"DNS 设置错误"、"正常"
    private String ext_status;

 //   src_flag	String	域名的来源标记，"QCLOUD"、"DNSPOD" 分别代表 "腾讯云解析"、"DNSPod"
    private String src_flag;
    // name	String	域名
    private String name;
    //grade	String	域名的等级
    private String grade;

    //grade_title	String	域名等级的名称
    private String grade_title;
    //is_vip	String	是否为 VIP 域名，"yes" 和 "no" 分别代表 "是" 和 "否"'
    private String is_vip;
  //  owner	String	域名所有者对应的邮箱帐号
    private String owner;
    // records	String	域名下的解析记录条数
    private String records;
  //  min_ttl	Int	当前域名允许的最小的 TTL
    private Integer min_ttl;

    public String getDomain_total() {
        return domain_total;
    }

    public void setDomain_total(String domain_total) {
        this.domain_total = domain_total;
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

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getSearchengine_push() {
        return searchengine_push;
    }

    public void setSearchengine_push(String searchengine_push) {
        this.searchengine_push = searchengine_push;
    }

    public String getIs_mark() {
        return is_mark;
    }

    public void setIs_mark(String is_mark) {
        this.is_mark = is_mark;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public String getCname_speedup() {
        return cname_speedup;
    }

    public void setCname_speedup(String cname_speedup) {
        this.cname_speedup = cname_speedup;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public String getQ_project_id() {
        return q_project_id;
    }

    public void setQ_project_id(String q_project_id) {
        this.q_project_id = q_project_id;
    }

    public String getPunycode() {
        return punycode;
    }

    public void setPunycode(String punycode) {
        this.punycode = punycode;
    }

    public String getExt_status() {
        return ext_status;
    }

    public void setExt_status(String ext_status) {
        this.ext_status = ext_status;
    }

    public String getSrc_flag() {
        return src_flag;
    }

    public void setSrc_flag(String src_flag) {
        this.src_flag = src_flag;
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

    public String getGrade_title() {
        return grade_title;
    }

    public void setGrade_title(String grade_title) {
        this.grade_title = grade_title;
    }

    public String getIs_vip() {
        return is_vip;
    }

    public void setIs_vip(String is_vip) {
        this.is_vip = is_vip;
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

    public Integer getMin_ttl() {
        return min_ttl;
    }

    public void setMin_ttl(Integer min_ttl) {
        this.min_ttl = min_ttl;
    }
}
