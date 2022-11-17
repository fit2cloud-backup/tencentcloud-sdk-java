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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomizationRequest extends AbstractModel{

    /**
    * 应用 ID，登录控制台创建应用得到的AppID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos
    */
    @SerializedName("TextUrl")
    @Expose
    private String TextUrl;

    /**
    * 要修改的模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
     * Get 应用 ID，登录控制台创建应用得到的AppID 
     * @return BizId 应用 ID，登录控制台创建应用得到的AppID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用 ID，登录控制台创建应用得到的AppID
     * @param BizId 应用 ID，登录控制台创建应用得到的AppID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos 
     * @return TextUrl 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos
     */
    public String getTextUrl() {
        return this.TextUrl;
    }

    /**
     * Set 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos
     * @param TextUrl 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos
     */
    public void setTextUrl(String TextUrl) {
        this.TextUrl = TextUrl;
    }

    /**
     * Get 要修改的模型ID 
     * @return ModelId 要修改的模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 要修改的模型ID
     * @param ModelId 要修改的模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    public ModifyCustomizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomizationRequest(ModifyCustomizationRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.TextUrl != null) {
            this.TextUrl = new String(source.TextUrl);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "TextUrl", this.TextUrl);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);

    }
}

