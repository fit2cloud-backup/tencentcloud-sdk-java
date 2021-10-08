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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGencodeRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 物模型发布版本号,-1代表未发布的，保存的是草稿箱的版本。1代表已发布的物模型。
    */
    @SerializedName("Revision")
    @Expose
    private Long Revision;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 物模型发布版本号,-1代表未发布的，保存的是草稿箱的版本。1代表已发布的物模型。 
     * @return Revision 物模型发布版本号,-1代表未发布的，保存的是草稿箱的版本。1代表已发布的物模型。
     */
    public Long getRevision() {
        return this.Revision;
    }

    /**
     * Set 物模型发布版本号,-1代表未发布的，保存的是草稿箱的版本。1代表已发布的物模型。
     * @param Revision 物模型发布版本号,-1代表未发布的，保存的是草稿箱的版本。1代表已发布的物模型。
     */
    public void setRevision(Long Revision) {
        this.Revision = Revision;
    }

    public CreateGencodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGencodeRequest(CreateGencodeRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Revision != null) {
            this.Revision = new Long(source.Revision);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Revision", this.Revision);

    }
}

