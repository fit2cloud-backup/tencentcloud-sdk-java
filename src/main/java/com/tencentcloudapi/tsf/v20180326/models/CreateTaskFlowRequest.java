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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskFlowRequest extends AbstractModel{

    /**
    * 工作流名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 触发方式
    */
    @SerializedName("TriggerRule")
    @Expose
    private TaskRule TriggerRule;

    /**
    * 工作流任务节点列表
    */
    @SerializedName("FlowEdges")
    @Expose
    private TaskFlowEdge [] FlowEdges;

    /**
    * 工作流执行超时时间
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
     * Get 工作流名称 
     * @return FlowName 工作流名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 工作流名称
     * @param FlowName 工作流名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 触发方式 
     * @return TriggerRule 触发方式
     */
    public TaskRule getTriggerRule() {
        return this.TriggerRule;
    }

    /**
     * Set 触发方式
     * @param TriggerRule 触发方式
     */
    public void setTriggerRule(TaskRule TriggerRule) {
        this.TriggerRule = TriggerRule;
    }

    /**
     * Get 工作流任务节点列表 
     * @return FlowEdges 工作流任务节点列表
     */
    public TaskFlowEdge [] getFlowEdges() {
        return this.FlowEdges;
    }

    /**
     * Set 工作流任务节点列表
     * @param FlowEdges 工作流任务节点列表
     */
    public void setFlowEdges(TaskFlowEdge [] FlowEdges) {
        this.FlowEdges = FlowEdges;
    }

    /**
     * Get 工作流执行超时时间 
     * @return TimeOut 工作流执行超时时间
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 工作流执行超时时间
     * @param TimeOut 工作流执行超时时间
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamObj(map, prefix + "TriggerRule.", this.TriggerRule);
        this.setParamArrayObj(map, prefix + "FlowEdges.", this.FlowEdges);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);

    }
}
