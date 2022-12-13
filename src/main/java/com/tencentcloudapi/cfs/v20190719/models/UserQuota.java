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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserQuota extends AbstractModel{

    /**
    * 指定配额类型，包括Uid、Gid
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * UID/GID信息
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 容量硬限制，单位GiB
    */
    @SerializedName("CapacityHardLimit")
    @Expose
    private Long CapacityHardLimit;

    /**
    * 文件硬限制，单位个
    */
    @SerializedName("FileHardLimit")
    @Expose
    private Long FileHardLimit;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get 指定配额类型，包括Uid、Gid 
     * @return UserType 指定配额类型，包括Uid、Gid
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 指定配额类型，包括Uid、Gid
     * @param UserType 指定配额类型，包括Uid、Gid
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get UID/GID信息 
     * @return UserId UID/GID信息
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set UID/GID信息
     * @param UserId UID/GID信息
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 容量硬限制，单位GiB 
     * @return CapacityHardLimit 容量硬限制，单位GiB
     */
    public Long getCapacityHardLimit() {
        return this.CapacityHardLimit;
    }

    /**
     * Set 容量硬限制，单位GiB
     * @param CapacityHardLimit 容量硬限制，单位GiB
     */
    public void setCapacityHardLimit(Long CapacityHardLimit) {
        this.CapacityHardLimit = CapacityHardLimit;
    }

    /**
     * Get 文件硬限制，单位个 
     * @return FileHardLimit 文件硬限制，单位个
     */
    public Long getFileHardLimit() {
        return this.FileHardLimit;
    }

    /**
     * Set 文件硬限制，单位个
     * @param FileHardLimit 文件硬限制，单位个
     */
    public void setFileHardLimit(Long FileHardLimit) {
        this.FileHardLimit = FileHardLimit;
    }

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    public UserQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserQuota(UserQuota source) {
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.CapacityHardLimit != null) {
            this.CapacityHardLimit = new Long(source.CapacityHardLimit);
        }
        if (source.FileHardLimit != null) {
            this.FileHardLimit = new Long(source.FileHardLimit);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CapacityHardLimit", this.CapacityHardLimit);
        this.setParamSimple(map, prefix + "FileHardLimit", this.FileHardLimit);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

