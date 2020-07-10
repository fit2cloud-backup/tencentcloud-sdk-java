package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.common.AbstractModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 范恩华
 * @date 2020-07-08 09:43
 */
public class QDnsRecordListRespon extends AbstractModel {

    @SerializedName("info")
    @Expose
    private Map<String,String> info;
    @SerializedName("domains")
    @Expose
    private List<QDomain> domains;

    @SerializedName("records")
    @Expose
    private List<QRecord> records;

    public List<QRecord> getRecords() {
        return records;
    }

    public void setRecords(List<QRecord> records) {
        this.records = records;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    public List<QDomain> getDomains() {
        return domains;
    }

    public void setDomains(List<QDomain> domains) {
        this.domains = domains;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {

    }
}
