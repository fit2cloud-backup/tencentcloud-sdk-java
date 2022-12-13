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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodes extends AbstractModel{

    /**
    * 节点 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 可用区 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
     * Get 节点 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 节点 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 节点 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 可用区 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 可用区 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 可用区 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    public ProxyNodes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNodes(ProxyNodes source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

