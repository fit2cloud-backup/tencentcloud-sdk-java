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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportVirusListRequest extends AbstractModel{

    /**
    * 过滤条件。
<li>FileName - String - 是否必填：否 - 文件名称</li>
<li>FilePath - String - 是否必填：否 - 文件路径</li>
<li>VirusName - String - 是否必填：否 - 病毒名称</li>
<li>ContainerName- String - 是否必填：是 - 容器名称</li>
<li>ContainerId- string - 是否必填：否 - 容器id</li>
<li>ImageName- string - 是否必填：否 - 镜像名称</li>
<li>ImageId- string - 是否必填：否 - 镜像id</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * 排序方式
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 导出字段
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
     * Get 过滤条件。
<li>FileName - String - 是否必填：否 - 文件名称</li>
<li>FilePath - String - 是否必填：否 - 文件路径</li>
<li>VirusName - String - 是否必填：否 - 病毒名称</li>
<li>ContainerName- String - 是否必填：是 - 容器名称</li>
<li>ContainerId- string - 是否必填：否 - 容器id</li>
<li>ImageName- string - 是否必填：否 - 镜像名称</li>
<li>ImageId- string - 是否必填：否 - 镜像id</li> 
     * @return Filters 过滤条件。
<li>FileName - String - 是否必填：否 - 文件名称</li>
<li>FilePath - String - 是否必填：否 - 文件路径</li>
<li>VirusName - String - 是否必填：否 - 病毒名称</li>
<li>ContainerName- String - 是否必填：是 - 容器名称</li>
<li>ContainerId- string - 是否必填：否 - 容器id</li>
<li>ImageName- string - 是否必填：否 - 镜像名称</li>
<li>ImageId- string - 是否必填：否 - 镜像id</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>FileName - String - 是否必填：否 - 文件名称</li>
<li>FilePath - String - 是否必填：否 - 文件路径</li>
<li>VirusName - String - 是否必填：否 - 病毒名称</li>
<li>ContainerName- String - 是否必填：是 - 容器名称</li>
<li>ContainerId- string - 是否必填：否 - 容器id</li>
<li>ImageName- string - 是否必填：否 - 镜像名称</li>
<li>ImageId- string - 是否必填：否 - 镜像id</li>
     * @param Filters 过滤条件。
<li>FileName - String - 是否必填：否 - 文件名称</li>
<li>FilePath - String - 是否必填：否 - 文件路径</li>
<li>VirusName - String - 是否必填：否 - 病毒名称</li>
<li>ContainerName- String - 是否必填：是 - 容器名称</li>
<li>ContainerId- string - 是否必填：否 - 容器id</li>
<li>ImageName- string - 是否必填：否 - 镜像名称</li>
<li>ImageId- string - 是否必填：否 - 镜像id</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式 
     * @return Order 排序方式
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式
     * @param Order 排序方式
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 导出字段 
     * @return ExportField 导出字段
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set 导出字段
     * @param ExportField 导出字段
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    public ExportVirusListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportVirusListRequest(ExportVirusListRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);

    }
}

