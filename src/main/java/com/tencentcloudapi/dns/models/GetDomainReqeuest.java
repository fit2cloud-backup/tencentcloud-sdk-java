package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.dns.baseModel.DnsAbstractModel;

import java.util.HashMap;

/**
 * @author 范恩华
 * @date 2020-07-06 16:06
 */
public class GetDomainReqeuest extends DnsAbstractModel {
    @SerializedName("offset")
    @Expose
    private long offset;
    @SerializedName("length")
    @Expose
    private long length;

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    @SerializedName("Action")
    @Expose
    private String Action = "DomainLst";
    private String keyword;

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getqProjectId() {
        return qProjectId;
    }

    public void setqProjectId(Integer qProjectId) {
        this.qProjectId = qProjectId;
    }

    private Integer qProjectId;
    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "offset", this.offset);
        this.setParamSimple(map, prefix + "length", this.length);
    }
}
