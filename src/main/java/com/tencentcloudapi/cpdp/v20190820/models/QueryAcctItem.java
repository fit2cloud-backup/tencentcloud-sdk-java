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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAcctItem extends AbstractModel{

    /**
    * 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise
    */
    @SerializedName("SubMchType")
    @Expose
    private String SubMchType;

    /**
    * 子商户名称
    */
    @SerializedName("SubMchName")
    @Expose
    private String SubMchName;

    /**
    * 子账号号
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * 不填则默认子商户名称
    */
    @SerializedName("ShortName")
    @Expose
    private String ShortName;

    /**
    * 业务平台的子商户Id，唯一
    */
    @SerializedName("SubMchId")
    @Expose
    private String SubMchId;

    /**
    * 聚鑫计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 子商户联系人
<敏感信息>
    */
    @SerializedName("Contact")
    @Expose
    private String Contact;

    /**
    * 子商户地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 联系人手机号
<敏感信息>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 邮箱 
<敏感信息>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubMerchantMemberType")
    @Expose
    private String SubMerchantMemberType;

    /**
     * Get 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise 
     * @return SubMchType 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise
     */
    public String getSubMchType() {
        return this.SubMchType;
    }

    /**
     * Set 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise
     * @param SubMchType 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise
     */
    public void setSubMchType(String SubMchType) {
        this.SubMchType = SubMchType;
    }

    /**
     * Get 子商户名称 
     * @return SubMchName 子商户名称
     */
    public String getSubMchName() {
        return this.SubMchName;
    }

    /**
     * Set 子商户名称
     * @param SubMchName 子商户名称
     */
    public void setSubMchName(String SubMchName) {
        this.SubMchName = SubMchName;
    }

    /**
     * Get 子账号号 
     * @return SubAcctNo 子账号号
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set 子账号号
     * @param SubAcctNo 子账号号
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get 不填则默认子商户名称 
     * @return ShortName 不填则默认子商户名称
     */
    public String getShortName() {
        return this.ShortName;
    }

    /**
     * Set 不填则默认子商户名称
     * @param ShortName 不填则默认子商户名称
     */
    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    /**
     * Get 业务平台的子商户Id，唯一 
     * @return SubMchId 业务平台的子商户Id，唯一
     */
    public String getSubMchId() {
        return this.SubMchId;
    }

    /**
     * Set 业务平台的子商户Id，唯一
     * @param SubMchId 业务平台的子商户Id，唯一
     */
    public void setSubMchId(String SubMchId) {
        this.SubMchId = SubMchId;
    }

    /**
     * Get 聚鑫计费SubAppId，代表子商户 
     * @return SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 聚鑫计费SubAppId，代表子商户
     * @param SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 子商户联系人
<敏感信息> 
     * @return Contact 子商户联系人
<敏感信息>
     */
    public String getContact() {
        return this.Contact;
    }

    /**
     * Set 子商户联系人
<敏感信息>
     * @param Contact 子商户联系人
<敏感信息>
     */
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    /**
     * Get 子商户地址 
     * @return Address 子商户地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 子商户地址
     * @param Address 子商户地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 联系人手机号
<敏感信息> 
     * @return Mobile 联系人手机号
<敏感信息>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 联系人手机号
<敏感信息>
     * @param Mobile 联系人手机号
<敏感信息>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 邮箱 
<敏感信息> 
     * @return Email 邮箱 
<敏感信息>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱 
<敏感信息>
     * @param Email 邮箱 
<敏感信息>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubMerchantMemberType 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubMerchantMemberType() {
        return this.SubMerchantMemberType;
    }

    /**
     * Set 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubMerchantMemberType 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubMerchantMemberType(String SubMerchantMemberType) {
        this.SubMerchantMemberType = SubMerchantMemberType;
    }

    public QueryAcctItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAcctItem(QueryAcctItem source) {
        if (source.SubMchType != null) {
            this.SubMchType = new String(source.SubMchType);
        }
        if (source.SubMchName != null) {
            this.SubMchName = new String(source.SubMchName);
        }
        if (source.SubAcctNo != null) {
            this.SubAcctNo = new String(source.SubAcctNo);
        }
        if (source.ShortName != null) {
            this.ShortName = new String(source.ShortName);
        }
        if (source.SubMchId != null) {
            this.SubMchId = new String(source.SubMchId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.Contact != null) {
            this.Contact = new String(source.Contact);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.SubMerchantMemberType != null) {
            this.SubMerchantMemberType = new String(source.SubMerchantMemberType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubMchType", this.SubMchType);
        this.setParamSimple(map, prefix + "SubMchName", this.SubMchName);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "ShortName", this.ShortName);
        this.setParamSimple(map, prefix + "SubMchId", this.SubMchId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Contact", this.Contact);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "SubMerchantMemberType", this.SubMerchantMemberType);

    }
}

