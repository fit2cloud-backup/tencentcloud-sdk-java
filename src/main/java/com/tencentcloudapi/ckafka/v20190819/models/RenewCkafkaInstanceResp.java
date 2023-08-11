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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewCkafkaInstanceResp extends AbstractModel{

    /**
    * 订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * 子订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
     * Get 订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigDealId 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set 订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDealId 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get 子订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealName 子订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 子订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealName 子订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    public RenewCkafkaInstanceResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewCkafkaInstanceResp(RenewCkafkaInstanceResp source) {
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);

    }
}

