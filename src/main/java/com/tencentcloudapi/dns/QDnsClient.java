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
package com.tencentcloudapi.dns;

import java.lang.reflect.Type;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.dns.baseModel.DnsResponseBase;
import com.tencentcloudapi.dns.models.*;

public class QDnsClient extends AbstractClient{
    private static String endpoint = "cns.api.qcloud.com";
    private static String version = "2020-03-12";
    private String path;
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
        super.path="/v2/index.php";
    }


    /**
     *  本接口用户获取所有的域名列表
     * @param req
     * @return
     * @throws TencentCloudSDKException
     */
    public QDomainListResponse getDomainList(GetDomainReqeuest req) throws TencentCloudSDKException{
        DnsResponseBase<QDomainListResponse> rsp = null;
        try {
            Type type = new TypeToken<DnsResponseBase<QDomainListResponse>>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "DomainList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        if(rsp.getCode() != null && rsp.getCode() != 0){
            throw new TencentCloudSDKException(rsp.getMessage());
        }
        return rsp.getData();
    }


    /**
     *  本接口用户获取所有的域名记录列表
     * @param req
     * @return
     * @throws TencentCloudSDKException
     */
    public QDnsRecordListRespon getDomainRecordList(GetQDnsRecordRequest req) throws TencentCloudSDKException{
        DnsResponseBase<QDnsRecordListRespon> rsp = null;
        try {
            Type type = new TypeToken<DnsResponseBase<QDnsRecordListRespon>>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "RecordList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        if(rsp.getCode() != null && rsp.getCode() != 0){
            throw new TencentCloudSDKException(rsp.getMessage());
        }
        return rsp.getData();
    }



    /**
     *  删除Dns记录
     * @param req
     * @return
     * @throws TencentCloudSDKException
     */
    public void deleteDnsRecord(DeleteDomainRecordRequest req) throws TencentCloudSDKException{
        DnsResponseBase<QDnsRecordListRespon> rsp = null;
        try {
            Type type = new TypeToken<DnsResponseBase<QDnsRecordListRespon>>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "RecordDelete"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        if(rsp.getCode() != null && rsp.getCode() != 0){
            throw new TencentCloudSDKException(rsp.getMessage());
        }
    }



    /**
     *  修改Dns记录
     * @param req
     * @return
     * @throws TencentCloudSDKException
     */
    public DomainRecordEditResponse editDnsRecord(EditDomainRecordRequest req) throws TencentCloudSDKException{
        DnsResponseBase<DomainRecordEditResponse> rsp = null;
        try {
            Type type = new TypeToken<DnsResponseBase<DomainRecordEditResponse>>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "RecordModify"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        if(rsp.getCode() != null && rsp.getCode() != 0){
            throw new TencentCloudSDKException(rsp.getMessage());
        }
        return rsp.getData();
    }

    /**
     *  修改Dns记录
     * @param req
     * @return
     * @throws TencentCloudSDKException
     */
    public DomainRecordEditResponse createDnsRecord(DomainRecordBaseRequest req) throws TencentCloudSDKException{
        DnsResponseBase<DomainRecordEditResponse> rsp = null;
        try {
            Type type = new TypeToken<DnsResponseBase<DomainRecordEditResponse>>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "RecordCreate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        if(rsp.getCode() != null && rsp.getCode() != 0){
            throw new TencentCloudSDKException(rsp.getMessage());
        }
        return rsp.getData();
    }


}
