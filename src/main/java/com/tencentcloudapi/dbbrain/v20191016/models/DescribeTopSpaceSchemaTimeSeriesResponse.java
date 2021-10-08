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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopSpaceSchemaTimeSeriesResponse extends AbstractModel{

    /**
    * 返回的Top库空间统计信息的时序数据列表。
    */
    @SerializedName("TopSpaceSchemaTimeSeries")
    @Expose
    private SchemaSpaceTimeSeries [] TopSpaceSchemaTimeSeries;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的Top库空间统计信息的时序数据列表。 
     * @return TopSpaceSchemaTimeSeries 返回的Top库空间统计信息的时序数据列表。
     */
    public SchemaSpaceTimeSeries [] getTopSpaceSchemaTimeSeries() {
        return this.TopSpaceSchemaTimeSeries;
    }

    /**
     * Set 返回的Top库空间统计信息的时序数据列表。
     * @param TopSpaceSchemaTimeSeries 返回的Top库空间统计信息的时序数据列表。
     */
    public void setTopSpaceSchemaTimeSeries(SchemaSpaceTimeSeries [] TopSpaceSchemaTimeSeries) {
        this.TopSpaceSchemaTimeSeries = TopSpaceSchemaTimeSeries;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTopSpaceSchemaTimeSeriesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopSpaceSchemaTimeSeriesResponse(DescribeTopSpaceSchemaTimeSeriesResponse source) {
        if (source.TopSpaceSchemaTimeSeries != null) {
            this.TopSpaceSchemaTimeSeries = new SchemaSpaceTimeSeries[source.TopSpaceSchemaTimeSeries.length];
            for (int i = 0; i < source.TopSpaceSchemaTimeSeries.length; i++) {
                this.TopSpaceSchemaTimeSeries[i] = new SchemaSpaceTimeSeries(source.TopSpaceSchemaTimeSeries[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopSpaceSchemaTimeSeries.", this.TopSpaceSchemaTimeSeries);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

