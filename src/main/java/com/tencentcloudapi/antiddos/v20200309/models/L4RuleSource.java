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

public class L4RuleSource extends AbstractModel{

    /**
    * 回源IP或域名
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 权重值，取值[0,100]
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 8000
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 回源IP或域名 
     * @return Source 回源IP或域名
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 回源IP或域名
     * @param Source 回源IP或域名
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 权重值，取值[0,100] 
     * @return Weight 权重值，取值[0,100]
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重值，取值[0,100]
     * @param Weight 权重值，取值[0,100]
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 8000
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 8000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 8000
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 8000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public L4RuleSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4RuleSource(L4RuleSource source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

