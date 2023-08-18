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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FwVpcCidr extends AbstractModel{

    /**
    * vpc的id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 防火墙网段，最少/24的网段
    */
    @SerializedName("FwCidr")
    @Expose
    private String FwCidr;

    /**
     * Get vpc的id 
     * @return VpcId vpc的id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc的id
     * @param VpcId vpc的id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 防火墙网段，最少/24的网段 
     * @return FwCidr 防火墙网段，最少/24的网段
     */
    public String getFwCidr() {
        return this.FwCidr;
    }

    /**
     * Set 防火墙网段，最少/24的网段
     * @param FwCidr 防火墙网段，最少/24的网段
     */
    public void setFwCidr(String FwCidr) {
        this.FwCidr = FwCidr;
    }

    public FwVpcCidr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwVpcCidr(FwVpcCidr source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.FwCidr != null) {
            this.FwCidr = new String(source.FwCidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FwCidr", this.FwCidr);

    }
}

