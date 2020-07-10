package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author 范恩华
 * @date 2020-07-10 10:52
 */
public class DomainRecordEditResponse {
    @SerializedName("record")
    @Expose
    private QRecord record;

    public QRecord getRecord() {
        return record;
    }

    public void setRecord(QRecord record) {
        this.record = record;
    }
}
