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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSSOAccountRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户账号ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 权限
    */
    @SerializedName("Role")
    @Expose
    private GrafanaAccountRole [] Role;

    /**
    * 备注
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户账号ID 
     * @return UserId 用户账号ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户账号ID
     * @param UserId 用户账号ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 权限 
     * @return Role 权限
     */
    public GrafanaAccountRole [] getRole() {
        return this.Role;
    }

    /**
     * Set 权限
     * @param Role 权限
     */
    public void setRole(GrafanaAccountRole [] Role) {
        this.Role = Role;
    }

    /**
     * Get 备注 
     * @return Notes 备注
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 备注
     * @param Notes 备注
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public CreateSSOAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSSOAccountRequest(CreateSSOAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Role != null) {
            this.Role = new GrafanaAccountRole[source.Role.length];
            for (int i = 0; i < source.Role.length; i++) {
                this.Role[i] = new GrafanaAccountRole(source.Role[i]);
            }
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "Role.", this.Role);
        this.setParamSimple(map, prefix + "Notes", this.Notes);

    }
}

