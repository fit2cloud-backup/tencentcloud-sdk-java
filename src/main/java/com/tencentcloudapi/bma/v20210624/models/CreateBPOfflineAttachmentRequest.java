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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBPOfflineAttachmentRequest extends AbstractModel{

    /**
    * xxx
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * xx
    */
    @SerializedName("BrandCertificateName")
    @Expose
    private String BrandCertificateName;

    /**
    * xx
    */
    @SerializedName("TransferName")
    @Expose
    private String TransferName;

    /**
    * xx
    */
    @SerializedName("AuthorizationName")
    @Expose
    private String AuthorizationName;

    /**
     * Get xxx 
     * @return BrandName xxx
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set xxx
     * @param BrandName xxx
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get xx 
     * @return BrandCertificateName xx
     */
    public String getBrandCertificateName() {
        return this.BrandCertificateName;
    }

    /**
     * Set xx
     * @param BrandCertificateName xx
     */
    public void setBrandCertificateName(String BrandCertificateName) {
        this.BrandCertificateName = BrandCertificateName;
    }

    /**
     * Get xx 
     * @return TransferName xx
     */
    public String getTransferName() {
        return this.TransferName;
    }

    /**
     * Set xx
     * @param TransferName xx
     */
    public void setTransferName(String TransferName) {
        this.TransferName = TransferName;
    }

    /**
     * Get xx 
     * @return AuthorizationName xx
     */
    public String getAuthorizationName() {
        return this.AuthorizationName;
    }

    /**
     * Set xx
     * @param AuthorizationName xx
     */
    public void setAuthorizationName(String AuthorizationName) {
        this.AuthorizationName = AuthorizationName;
    }

    public CreateBPOfflineAttachmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPOfflineAttachmentRequest(CreateBPOfflineAttachmentRequest source) {
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.BrandCertificateName != null) {
            this.BrandCertificateName = new String(source.BrandCertificateName);
        }
        if (source.TransferName != null) {
            this.TransferName = new String(source.TransferName);
        }
        if (source.AuthorizationName != null) {
            this.AuthorizationName = new String(source.AuthorizationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "BrandCertificateName", this.BrandCertificateName);
        this.setParamSimple(map, prefix + "TransferName", this.TransferName);
        this.setParamSimple(map, prefix + "AuthorizationName", this.AuthorizationName);

    }
}

