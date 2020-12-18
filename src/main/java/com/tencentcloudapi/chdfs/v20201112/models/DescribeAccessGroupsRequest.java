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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessGroupsRequest extends AbstractModel{

    /**
    * VPC网络ID
备注：入参只能指定VpcId和OwnerUin的其中一个
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 资源所属者Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
     * Get VPC网络ID
备注：入参只能指定VpcId和OwnerUin的其中一个 
     * @return VpcId VPC网络ID
备注：入参只能指定VpcId和OwnerUin的其中一个
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC网络ID
备注：入参只能指定VpcId和OwnerUin的其中一个
     * @param VpcId VPC网络ID
备注：入参只能指定VpcId和OwnerUin的其中一个
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 资源所属者Uin 
     * @return OwnerUin 资源所属者Uin
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 资源所属者Uin
     * @param OwnerUin 资源所属者Uin
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

