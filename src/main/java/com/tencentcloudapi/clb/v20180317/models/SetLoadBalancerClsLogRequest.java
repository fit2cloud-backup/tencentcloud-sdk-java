/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetLoadBalancerClsLogRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 日志服务(CLS)的日志集ID。
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 日志服务(CLS)的日志主题ID。
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerId 负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerId 负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 日志服务(CLS)的日志集ID。 
     * @return LogSetId 日志服务(CLS)的日志集ID。
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 日志服务(CLS)的日志集ID。
     * @param LogSetId 日志服务(CLS)的日志集ID。
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 日志服务(CLS)的日志主题ID。 
     * @return LogTopicId 日志服务(CLS)的日志主题ID。
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set 日志服务(CLS)的日志主题ID。
     * @param LogTopicId 日志服务(CLS)的日志主题ID。
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。 
     * @return LogType 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     * @param LogType 日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public SetLoadBalancerClsLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetLoadBalancerClsLogRequest(SetLoadBalancerClsLogRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

