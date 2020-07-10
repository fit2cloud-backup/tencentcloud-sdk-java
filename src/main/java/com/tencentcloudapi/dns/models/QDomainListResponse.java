package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.dns.baseModel.DnsAbstractModel;
import com.tencentcloudapi.live.v20180801.models.DomainInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 范恩华
 * @date 2020-07-06 16:35
 */
public class QDomainListResponse extends DnsAbstractModel {

//    code	Int	公共错误码, 0表示成功，其他值表示失败。详见错误码页面的 公共错误码
//    message	String	模块错误信息描述，与接口相关
//    data	Array	API 返回的数据
    @SerializedName("info")
    @Expose
    private Map<String,String> info;
    @SerializedName("domains")
    @Expose
    private List<QDomain> domains;

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
