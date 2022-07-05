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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDosAttackEventRequest extends AbstractModel{

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前页
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * ddos策略组id 集合
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * 站点集合
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 协议类型,{tcp,udp,all}
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * 选填{Y、N},默认为Y；Y：展示，N：不展示
    */
    @SerializedName("IsShowDetail")
    @Expose
    private String IsShowDetail;

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 条数 
     * @return PageSize 条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 条数
     * @param PageSize 条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前页 
     * @return PageNo 当前页
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 当前页
     * @param PageNo 当前页
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get ddos策略组id 集合 
     * @return PolicyIds ddos策略组id 集合
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set ddos策略组id 集合
     * @param PolicyIds ddos策略组id 集合
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 站点集合 
     * @return ZoneIds 站点集合
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点集合
     * @param ZoneIds 站点集合
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 协议类型,{tcp,udp,all} 
     * @return ProtocolType 协议类型,{tcp,udp,all}
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 协议类型,{tcp,udp,all}
     * @param ProtocolType 协议类型,{tcp,udp,all}
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 选填{Y、N},默认为Y；Y：展示，N：不展示 
     * @return IsShowDetail 选填{Y、N},默认为Y；Y：展示，N：不展示
     */
    public String getIsShowDetail() {
        return this.IsShowDetail;
    }

    /**
     * Set 选填{Y、N},默认为Y；Y：展示，N：不展示
     * @param IsShowDetail 选填{Y、N},默认为Y；Y：展示，N：不展示
     */
    public void setIsShowDetail(String IsShowDetail) {
        this.IsShowDetail = IsShowDetail;
    }

    public DescribeDDosAttackEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDosAttackEventRequest(DescribeDDosAttackEventRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.IsShowDetail != null) {
            this.IsShowDetail = new String(source.IsShowDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "IsShowDetail", this.IsShowDetail);

    }
}

