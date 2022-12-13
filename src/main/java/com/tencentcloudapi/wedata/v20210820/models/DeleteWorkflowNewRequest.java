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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWorkflowNewRequest extends AbstractModel{

    /**
    * 工作流id
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * true : 删除后下游任务可正常运行
false：删除后下游任务不可运行
    */
    @SerializedName("DeleteMode")
    @Expose
    private Boolean DeleteMode;

    /**
    * true：通知下游任务责任人
false:  不通知下游任务责任人
    */
    @SerializedName("EnableNotify")
    @Expose
    private Boolean EnableNotify;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 工作流id 
     * @return WorkFlowId 工作流id
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set 工作流id
     * @param WorkFlowId 工作流id
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    /**
     * Get true : 删除后下游任务可正常运行
false：删除后下游任务不可运行 
     * @return DeleteMode true : 删除后下游任务可正常运行
false：删除后下游任务不可运行
     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set true : 删除后下游任务可正常运行
false：删除后下游任务不可运行
     * @param DeleteMode true : 删除后下游任务可正常运行
false：删除后下游任务不可运行
     */
    public void setDeleteMode(Boolean DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    /**
     * Get true：通知下游任务责任人
false:  不通知下游任务责任人 
     * @return EnableNotify true：通知下游任务责任人
false:  不通知下游任务责任人
     */
    public Boolean getEnableNotify() {
        return this.EnableNotify;
    }

    /**
     * Set true：通知下游任务责任人
false:  不通知下游任务责任人
     * @param EnableNotify true：通知下游任务责任人
false:  不通知下游任务责任人
     */
    public void setEnableNotify(Boolean EnableNotify) {
        this.EnableNotify = EnableNotify;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DeleteWorkflowNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWorkflowNewRequest(DeleteWorkflowNewRequest source) {
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new Boolean(source.DeleteMode);
        }
        if (source.EnableNotify != null) {
            this.EnableNotify = new Boolean(source.EnableNotify);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);
        this.setParamSimple(map, prefix + "EnableNotify", this.EnableNotify);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

