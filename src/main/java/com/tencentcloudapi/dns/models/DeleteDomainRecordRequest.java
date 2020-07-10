package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

/**
 * @author 范恩华
 * @date 2020-07-08 10:13
 */
public class DeleteDomainRecordRequest extends DomainRecordBaseRequest {
    //   recordId	是	Int	解析记录的 ID，可通过 RecordList 接口返回值中的 ID 获取
    @SerializedName("recordId")
    @Expose
    private Integer recordId;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "recordId", this.recordId);
        super.toMap(map,prefix);
    }
}
