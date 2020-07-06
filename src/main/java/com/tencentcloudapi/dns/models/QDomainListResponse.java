package com.tencentcloudapi.dns.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.live.v20180801.models.DomainInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 范恩华
 * @date 2020-07-06 16:35
 */
public class QDomainListResponse extends AbstractModel {

//    code	Int	公共错误码, 0表示成功，其他值表示失败。详见错误码页面的 公共错误码
//    message	String	模块错误信息描述，与接口相关
//    data	Array	API 返回的数据
    /**
     * 需要共享的镜像Id
     */
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private DomainInfo[] data;
    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "data.", this.data);
        this.setParamSimple(map, prefix + "code", this.code);
        this.setParamSimple(map, prefix + "message", this.message);
    }
    class DomianInfo extends AbstractModel{
        private Map<String,Integer> info;

        private List<QDomain> domains;

        @Override
        protected void toMap(HashMap<String, String> map, String prefix) {
        }
        public Map<String, Integer> getInfo() {
            return info;
        }

        public void setInfo(Map<String, Integer> info) {
            this.info = info;
        }

        public List<QDomain> getDomains() {
            return domains;
        }

        public void setDomains(List<QDomain> domains) {
            this.domains = domains;
        }
    }

}
