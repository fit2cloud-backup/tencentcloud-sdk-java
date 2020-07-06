package com.tencentcloudapi.dns.models;

import com.tencentcloudapi.common.AbstractModel;

import java.util.HashMap;

/**
 * @author 范恩华
 * @date 2020-07-06 16:06
 */
public class GetDomainReqeuest extends AbstractModel {

    private Integer offset;
    private Integer length;
    private String keyword;

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
