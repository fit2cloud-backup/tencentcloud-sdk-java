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

public class ModifyVPCSwitchStatusRequest extends AbstractModel{

    /**
    * 公网IP
    */
    @SerializedName("FirewallVpcId")
    @Expose
    private String FirewallVpcId;

    /**
    * 状态值，0: 关闭 ,1:开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 公网IP 
     * @return FirewallVpcId 公网IP
     */
    public String getFirewallVpcId() {
        return this.FirewallVpcId;
    }

    /**
     * Set 公网IP
     * @param FirewallVpcId 公网IP
     */
    public void setFirewallVpcId(String FirewallVpcId) {
        this.FirewallVpcId = FirewallVpcId;
    }

    /**
     * Get 状态值，0: 关闭 ,1:开启 
     * @return Status 状态值，0: 关闭 ,1:开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值，0: 关闭 ,1:开启
     * @param Status 状态值，0: 关闭 ,1:开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyVPCSwitchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVPCSwitchStatusRequest(ModifyVPCSwitchStatusRequest source) {
        if (source.FirewallVpcId != null) {
            this.FirewallVpcId = new String(source.FirewallVpcId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirewallVpcId", this.FirewallVpcId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

