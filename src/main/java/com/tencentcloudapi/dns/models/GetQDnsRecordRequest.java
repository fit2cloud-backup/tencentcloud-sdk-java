package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.dns.baseModel.DnsAbstractModel;
import sun.security.util.Length;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 范恩华
 * @date 2020-07-08 09:52
 */
public class GetQDnsRecordRequest extends DnsAbstractModel {

  //  domain	是	String	要操作的域名（主域名，不包括 www，例如：qcloud.com）
    @SerializedName("domain")
    @Expose
    private String domain;
  //  offset	否	Int	偏移量，默认为0。关于offset的更进一步介绍参考 接口请求参数
    @SerializedName("offset")
    @Expose
    private Integer offset;
  //  length	否	Int	返回数量，默认20，最大值100
    @SerializedName("length")
    @Expose
    private Integer length;
  //  subDomain	否	String	（过滤条件）根据子域名进行过滤
    @SerializedName("subDomain")
    @Expose
    private String subDomain;
  //  recordType	否	String	（过滤条件）根据记录类型进行过滤
    @SerializedName("recordType")
    @Expose
    private Integer recordType;
  //  qProjectId	否	Int	（过滤条件）项目 ID
    @SerializedName("qProjectId")
    @Expose
    private Integer qProjectId;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public Integer getqProjectId() {
        return qProjectId;
    }

    public void setqProjectId(Integer qProjectId) {
        this.qProjectId = qProjectId;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "offset", this.offset);
        this.setParamSimple(map, prefix + "length", this.length);
        this.setParamSimple(map, prefix + "domain", this.domain);
        this.setParamSimple(map, prefix + "subDomain", this.subDomain);
        this.setParamSimple(map, prefix + "recordType", this.recordType);
        this.setParamSimple(map, prefix + "qProjectId", this.qProjectId);
    }
}
