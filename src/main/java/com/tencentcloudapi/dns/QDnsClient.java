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
package com.tencentcloudapi.cvm.v20170312;

import java.lang.reflect.Type;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cvm.v20170312.models.*;
import com.tencentcloudapi.dns.models.GetDomainReqeuest;
import com.tencentcloudapi.dns.models.QDomainListResponse;

public class QDnsClient extends AbstractClient{
    private static String endpoint = "cns.api.qcloud.com";
    private static String version = "2020-03-12";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public QDnsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public QDnsClient(Credential credential, String region, ClientProfile profile) {
        super(QDnsClient.endpoint, QDnsClient.version, credential, region, profile);
    }

    /**
     *  本接口用户获取所有的域名列表
     * @param req
     * @return
     * @throws TencentCloudSDKException
     */
    public QDomainListResponse getDomainList(GetDomainReqeuest req) throws TencentCloudSDKException{
        JsonResponseModel<QDomainListResponse> rsp = null;
        try {
            Type type = new TypeToken<JsonResponseModel<AllocateHostsResponse>>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "DomainList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
