package com.tencentcloudapi.dns.baseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author 范恩华
 * @date 2020-07-07 19:13
 */
public class DnsResponseBase<T> {
    @SerializedName("code")
    @Expose
    private  Integer code;
    @SerializedName("codeDesc")
    @Expose
    private  String codeDesc;
    @SerializedName("message")
    @Expose
    private  String message;
    @SerializedName("data")
    @Expose
    public  T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
