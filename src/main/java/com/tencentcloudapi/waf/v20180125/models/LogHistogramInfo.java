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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogHistogramInfo extends AbstractModel{

    /**
    * 日志条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 时间戳
    */
    @SerializedName("TimeStamp")
    @Expose
    private Long TimeStamp;

    /**
     * Get 日志条数 
     * @return Count 日志条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志条数
     * @param Count 日志条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 时间戳 
     * @return TimeStamp 时间戳
     */
    public Long getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 时间戳
     * @param TimeStamp 时间戳
     */
    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public LogHistogramInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogHistogramInfo(LogHistogramInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.TimeStamp != null) {
            this.TimeStamp = new Long(source.TimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);

    }
}

