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

public class RuleFilter extends AbstractModel{

    /**
    * 过滤参数，取值有：
<li> RULE_ID：规则 ID。 </li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 过滤参数，取值有：
<li> RULE_ID：规则 ID。 </li> 
     * @return Name 过滤参数，取值有：
<li> RULE_ID：规则 ID。 </li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤参数，取值有：
<li> RULE_ID：规则 ID。 </li>
     * @param Name 过滤参数，取值有：
<li> RULE_ID：规则 ID。 </li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数值。 
     * @return Values 参数值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 参数值。
     * @param Values 参数值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public RuleFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleFilter(RuleFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

