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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Application extends AbstractModel{

    /**
    * 应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliveryForm")
    @Expose
    private String DeliveryForm;

    /**
    * 任务执行命令。与Commands不能同时指定。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 应用程序软件包的远程存储路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackagePath")
    @Expose
    private String PackagePath;

    /**
    * 应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Docker")
    @Expose
    private Docker Docker;

    /**
     * Get 应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliveryForm 应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliveryForm() {
        return this.DeliveryForm;
    }

    /**
     * Set 应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliveryForm 应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliveryForm(String DeliveryForm) {
        this.DeliveryForm = DeliveryForm;
    }

    /**
     * Get 任务执行命令。与Commands不能同时指定。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Command 任务执行命令。与Commands不能同时指定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 任务执行命令。与Commands不能同时指定。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Command 任务执行命令。与Commands不能同时指定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 应用程序软件包的远程存储路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackagePath 应用程序软件包的远程存储路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackagePath() {
        return this.PackagePath;
    }

    /**
     * Set 应用程序软件包的远程存储路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackagePath 应用程序软件包的远程存储路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackagePath(String PackagePath) {
        this.PackagePath = PackagePath;
    }

    /**
     * Get 应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Docker 应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Docker getDocker() {
        return this.Docker;
    }

    /**
     * Set 应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Docker 应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocker(Docker Docker) {
        this.Docker = Docker;
    }

    public Application() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Application(Application source) {
        if (source.DeliveryForm != null) {
            this.DeliveryForm = new String(source.DeliveryForm);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.PackagePath != null) {
            this.PackagePath = new String(source.PackagePath);
        }
        if (source.Docker != null) {
            this.Docker = new Docker(source.Docker);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliveryForm", this.DeliveryForm);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "PackagePath", this.PackagePath);
        this.setParamObj(map, prefix + "Docker.", this.Docker);

    }
}

