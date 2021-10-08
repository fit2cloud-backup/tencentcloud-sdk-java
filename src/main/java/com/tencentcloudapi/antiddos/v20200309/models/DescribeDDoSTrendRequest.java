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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSTrendRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源实例的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 统计开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指标，取值[bps(攻击流量带宽，pps(攻击包速率))]
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例）
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源实例的IP 
     * @return Ip 资源实例的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 资源实例的IP
     * @param Ip 资源实例的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)] 
     * @return Period 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)]
     * @param Period 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 统计开始时间 
     * @return StartTime 统计开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 统计开始时间
     * @param StartTime 统计开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 统计结束时间 
     * @return EndTime 统计结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间
     * @param EndTime 统计结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指标，取值[bps(攻击流量带宽，pps(攻击包速率))] 
     * @return MetricName 指标，取值[bps(攻击流量带宽，pps(攻击包速率))]
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标，取值[bps(攻击流量带宽，pps(攻击包速率))]
     * @param MetricName 指标，取值[bps(攻击流量带宽，pps(攻击包速率))]
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例） 
     * @return Id 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例）
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例）
     * @param Id 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例）
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeDDoSTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSTrendRequest(DescribeDDoSTrendRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

