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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferGatewayCallInfo extends AbstractModel{

    /**
    * 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcHttpAddr")
    @Expose
    private String VpcHttpAddr;

    /**
    * 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcHttpsAddr")
    @Expose
    private String VpcHttpsAddr;

    /**
    * 内网grpc调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcGrpcTlsAddr")
    @Expose
    private String VpcGrpcTlsAddr;

    /**
    * 可访问的vpcid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 后端ip对应的子网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcHttpAddr 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcHttpAddr() {
        return this.VpcHttpAddr;
    }

    /**
     * Set 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcHttpAddr 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcHttpAddr(String VpcHttpAddr) {
        this.VpcHttpAddr = VpcHttpAddr;
    }

    /**
     * Get 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcHttpsAddr 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcHttpsAddr() {
        return this.VpcHttpsAddr;
    }

    /**
     * Set 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcHttpsAddr 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcHttpsAddr(String VpcHttpsAddr) {
        this.VpcHttpsAddr = VpcHttpsAddr;
    }

    /**
     * Get 内网grpc调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcGrpcTlsAddr 内网grpc调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcGrpcTlsAddr() {
        return this.VpcGrpcTlsAddr;
    }

    /**
     * Set 内网grpc调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcGrpcTlsAddr 内网grpc调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcGrpcTlsAddr(String VpcGrpcTlsAddr) {
        this.VpcGrpcTlsAddr = VpcGrpcTlsAddr;
    }

    /**
     * Get 可访问的vpcid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 可访问的vpcid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 可访问的vpcid
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 可访问的vpcid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 后端ip对应的子网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 后端ip对应的子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 后端ip对应的子网
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 后端ip对应的子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public InferGatewayCallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferGatewayCallInfo(InferGatewayCallInfo source) {
        if (source.VpcHttpAddr != null) {
            this.VpcHttpAddr = new String(source.VpcHttpAddr);
        }
        if (source.VpcHttpsAddr != null) {
            this.VpcHttpsAddr = new String(source.VpcHttpsAddr);
        }
        if (source.VpcGrpcTlsAddr != null) {
            this.VpcGrpcTlsAddr = new String(source.VpcGrpcTlsAddr);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcHttpAddr", this.VpcHttpAddr);
        this.setParamSimple(map, prefix + "VpcHttpsAddr", this.VpcHttpsAddr);
        this.setParamSimple(map, prefix + "VpcGrpcTlsAddr", this.VpcGrpcTlsAddr);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

