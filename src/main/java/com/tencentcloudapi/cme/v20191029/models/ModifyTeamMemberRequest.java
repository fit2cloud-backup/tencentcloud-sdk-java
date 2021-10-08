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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTeamMemberRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 团队 ID。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * 团队成员 ID。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 成员备注，允许设置备注为空，不为空时长度不能超过15个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 成员角色，取值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 团队 ID。 
     * @return TeamId 团队 ID。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 团队 ID。
     * @param TeamId 团队 ID。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get 团队成员 ID。 
     * @return MemberId 团队成员 ID。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 团队成员 ID。
     * @param MemberId 团队成员 ID。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 成员备注，允许设置备注为空，不为空时长度不能超过15个字符。 
     * @return Remark 成员备注，允许设置备注为空，不为空时长度不能超过15个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 成员备注，允许设置备注为空，不为空时长度不能超过15个字符。
     * @param Remark 成员备注，允许设置备注为空，不为空时长度不能超过15个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 成员角色，取值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li> 
     * @return Role 成员角色，取值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 成员角色，取值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     * @param Role 成员角色，取值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验操作权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public ModifyTeamMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTeamMemberRequest(ModifyTeamMemberRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

