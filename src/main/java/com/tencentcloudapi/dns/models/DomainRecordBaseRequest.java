package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.dns.baseModel.DnsAbstractModel;

import java.util.HashMap;

/**
 * @author 范恩华
 * @date 2020-07-08 10:10
 */
public class DomainRecordBaseRequest extends DnsAbstractModel {
    //    domain	是	String	要添加解析记录的域名（主域名，不包括 www，例如：qcloud.com）
    @SerializedName("domain")
    @Expose
    private String domain;

//    subDomain	是	String	子域名，例如：www

    @SerializedName("subDomain")
    @Expose
    private String subDomain;

    //    recordType	是	String	记录类型，可选的记录类型为："A", "CNAME", "MX", "TXT", "NS", "AAAA", "SRV"
    @SerializedName("recordType")
    @Expose
    private String recordType;

    //    recordLine	是	String	记录的线路名称，例如："默认"
    @SerializedName("recordLine")
    @Expose
    private String recordLine;
    //    value	是	String	记录值，例如 IP：192.168.10.2，CNAME：cname.dnspod.com.，MX：mail.dnspod.com.
    @SerializedName("value")
    @Expose
    private String value;
    //    ttl	否	Int	TTL 值，范围1 - 604800，不同等级域名最小值不同，默认为 600
    @SerializedName("ttl")
    @Expose
    private Integer ttl;
    //    mx	否	Int	MX 优先级，范围为0 - 50，当 recordType 选择 MX 时，mx 参数必选
    @SerializedName("mx")
    @Expose
    private Integer mx;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getRecordLine() {
        return recordLine;
    }

    public void setRecordLine(String recordLine) {
        this.recordLine = recordLine;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public Integer getMx() {
        return mx;
    }

    public void setMx(Integer mx) {
        this.mx = mx;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "domain", this.domain);
        this.setParamSimple(map, prefix + "subDomain", this.subDomain);
        this.setParamSimple(map, prefix + "recordType", this.recordType);
        this.setParamSimple(map, prefix + "recordLine", this.recordLine);
        this.setParamSimple(map, prefix + "value", this.value);
        this.setParamSimple(map, prefix + "ttl", this.ttl);
        this.setParamSimple(map, prefix + "mx", this.mx);
    }
}
