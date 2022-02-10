package com.tencentcloudapi.thpc.v20211109;
public enum ThpcErrorCode {
    // cvm调用失败。
     INTERNALERROR_CALLCVM("InternalError.CallCvm"),
     
    // 参数格式有误。
     INVALIDPARAMETER_MALFORMED("InvalidParameter.Malformed"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 不支持该参数值。
     INVALIDPARAMETERVALUE_NOTSUPPORTED("InvalidParameterValue.NotSupported"),
     
    // 参数值过大。
     INVALIDPARAMETERVALUE_TOOLARGE("InvalidParameterValue.TooLarge"),
     
    // 参数长度过长。
     INVALIDPARAMETERVALUE_TOOLONG("InvalidParameterValue.TooLong"),
     
    // 参数值过小。
     INVALIDPARAMETERVALUE_TOOSMALL("InvalidParameterValue.TooSmall"),
     
    // 集群不存在。
     RESOURCENOTFOUND_CLUSTERID("ResourceNotFound.ClusterId"),
     
    // 无法找到ID对应的弹性伸缩启动配置。
     RESOURCENOTFOUND_LAUNCHCONFIGURATIONID("ResourceNotFound.LaunchConfigurationId"),
     
    // 该伸缩组已绑定集群，请更换伸缩组。
     UNSUPPORTEDOPERATION_AUTOSCALINGGROUPALREADYBINDED("UnsupportedOperation.AutoScalingGroupAlreadyBinded");
     
    private String value;
    private ThpcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}
