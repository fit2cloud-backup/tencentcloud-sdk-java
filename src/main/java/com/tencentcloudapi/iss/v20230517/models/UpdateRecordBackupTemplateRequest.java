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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordBackupTemplateRequest extends AbstractModel{

    /**
    * 模板ID（从查询录像上云模板列表接口ListRecordBackupTemplates中获取）
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 修改录像上云模板数据
    */
    @SerializedName("Mod")
    @Expose
    private UpdateRecordBackupTemplateModify Mod;

    /**
     * Get 模板ID（从查询录像上云模板列表接口ListRecordBackupTemplates中获取） 
     * @return TemplateId 模板ID（从查询录像上云模板列表接口ListRecordBackupTemplates中获取）
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID（从查询录像上云模板列表接口ListRecordBackupTemplates中获取）
     * @param TemplateId 模板ID（从查询录像上云模板列表接口ListRecordBackupTemplates中获取）
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 修改录像上云模板数据 
     * @return Mod 修改录像上云模板数据
     */
    public UpdateRecordBackupTemplateModify getMod() {
        return this.Mod;
    }

    /**
     * Set 修改录像上云模板数据
     * @param Mod 修改录像上云模板数据
     */
    public void setMod(UpdateRecordBackupTemplateModify Mod) {
        this.Mod = Mod;
    }

    public UpdateRecordBackupTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordBackupTemplateRequest(UpdateRecordBackupTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Mod != null) {
            this.Mod = new UpdateRecordBackupTemplateModify(source.Mod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamObj(map, prefix + "Mod.", this.Mod);

    }
}

