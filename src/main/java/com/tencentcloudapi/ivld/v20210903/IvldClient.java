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
package com.tencentcloudapi.ivld.v20210903;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ivld.v20210903.models.*;

public class IvldClient extends AbstractClient{
    private static String endpoint = "ivld.tencentcloudapi.com";
    private static String service = "ivld";
    private static String version = "2021-09-03";

    public IvldClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IvldClient(Credential credential, String region, ClientProfile profile) {
        super(IvldClient.endpoint, IvldClient.version, credential, region, profile);
    }

    /**
     *增加自定义人脸图片，每个自定义人物最多可包含5张人脸图片

请注意，与创建自定义人物一样，图片数据优先级优于图片URL优先级
     * @param req AddCustomPersonImageRequest
     * @return AddCustomPersonImageResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomPersonImageResponse AddCustomPersonImage(AddCustomPersonImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCustomPersonImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddCustomPersonImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCustomPersonImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自定义人物分类信息

当L2Category为空时，将创建一级自定义分类。
当L1Category与L2Category均不为空时，将创建二级自定义分类。请注意，**只有当一级自定义分类存在时，才可创建二级自定义分类**。
     * @param req CreateCustomCategoryRequest
     * @return CreateCustomCategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomCategoryResponse CreateCustomCategory(CreateCustomCategoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomCategoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomCategoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomCategory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自定义人物库

Bucket的格式参考为 `bucketName-123456.cos.ap-shanghai.myqcloud.com`

在调用CreateCustomPerson和AddCustomPersonImage接口之前，请先确保本接口成功调用。当前每个用户只支持一个自定义人物库，一旦自定义人物库创建成功，后续接口调用均会返回人物库已存在错误。

由于人脸图片对于自定义人物识别至关重要，因此自定义人物识别功能需要用户显式指定COS存储桶方可使用。具体来说，自定义人物识别功能接口(主要是CreateCustomPerson和AddCustomPersonImage)会在此COS桶下面新建IVLDCustomPersonImage目录，并在此目录下存储自定义人物图片数据以支持后续潜在的特征更新。

请注意：本接口指定的COS桶仅用于**备份存储自定义人物图片**，CreateCustomPerson和AddCustomPersonImage接口入参URL可使用任意COS存储桶下的任意图片。

**重要**：请务必确保本接口指定的COS存储桶存在(不要手动删除COS桶)。COS存储桶一旦指定，将不能修改。

     * @param req CreateCustomGroupRequest
     * @return CreateCustomGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomGroupResponse CreateCustomGroup(CreateCustomGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自定义人物。

输入人物名称，基本信息，分类信息与人脸图片，创建自定义人物

人脸图片可使用图片数据(base64编码的图片数据)或者图片URL(推荐使用COS以减少下载时间，其他地址也支持)，原始图片优先，也即如果同时指定了图片数据和图片URL，接口将仅使用图片数据

     * @param req CreateCustomPersonRequest
     * @return CreateCustomPersonResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomPersonResponse CreateCustomPerson(CreateCustomPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomPersonResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomPersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomPerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建默认自定义人物类型
     * @param req CreateDefaultCategoriesRequest
     * @return CreateDefaultCategoriesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultCategoriesResponse CreateDefaultCategories(CreateDefaultCategoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefaultCategoriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDefaultCategoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDefaultCategories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建智能标签任务。

请注意，本接口为异步接口，**返回TaskId只代表任务创建成功，不代表任务执行成功**。

     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义分类信息
     * @param req DeleteCustomCategoryRequest
     * @return DeleteCustomCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomCategoryResponse DeleteCustomCategory(DeleteCustomCategoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomCategoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomCategoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomCategory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义人物
     * @param req DeleteCustomPersonRequest
     * @return DeleteCustomPersonResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomPersonResponse DeleteCustomPerson(DeleteCustomPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomPersonResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomPersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomPerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义人脸数据
     * @param req DeleteCustomPersonImageRequest
     * @return DeleteCustomPersonImageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomPersonImageResponse DeleteCustomPersonImage(DeleteCustomPersonImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomPersonImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomPersonImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomPersonImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将MediaId对应的媒资文件从系统中删除。

**请注意，本接口仅删除媒资文件，媒资文件对应的视频分析结果不会被删除**。如您需要删除结构化分析结果，请调用DeleteTask接口。
     * @param req DeleteMediaRequest
     * @return DeleteMediaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaResponse DeleteMedia(DeleteMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMedia");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量描述自定义人物分类信息
     * @param req DescribeCustomCategoriesRequest
     * @return DescribeCustomCategoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomCategoriesResponse DescribeCustomCategories(DescribeCustomCategoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomCategoriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomCategoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomCategories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述自定义人物库信息，当前库大小(库中有多少人脸)，以及库中的存储桶
     * @param req DescribeCustomGroupRequest
     * @return DescribeCustomGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomGroupResponse DescribeCustomGroup(DescribeCustomGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述自定义人物详细信息，包括人物信息与人物信息
     * @param req DescribeCustomPersonDetailRequest
     * @return DescribeCustomPersonDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomPersonDetailResponse DescribeCustomPersonDetail(DescribeCustomPersonDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomPersonDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomPersonDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomPersonDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量描述自定义人物


     * @param req DescribeCustomPersonsRequest
     * @return DescribeCustomPersonsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomPersonsResponse DescribeCustomPersons(DescribeCustomPersonsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomPersonsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomPersonsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomPersons");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述媒资文件信息，包括媒资状态，分辨率，帧率等。

如果媒资文件未完成导入，本接口将仅输出媒资文件的状态信息；导入完成后，本接口还将输出媒资文件的其他元信息。
     * @param req DescribeMediaRequest
     * @return DescribeMediaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaResponse DescribeMedia(DescribeMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMedia");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *依照输入条件，描述命中的媒资文件信息，包括媒资状态，分辨率，帧率等。

请注意，本接口最多支持同时描述**50**个媒资文件

如果媒资文件未完成导入，本接口将仅输出媒资文件的状态信息；导入完成后，本接口还将输出媒资文件的其他元信息。
     * @param req DescribeMediasRequest
     * @return DescribeMediasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediasResponse DescribeMedias(DescribeMediasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMedias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述智能标签任务进度。

请注意，**此接口仅返回任务执行状态信息，不返回任务执行结果**


     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述任务信息，如果任务成功完成，还将返回任务结果
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *依照输入条件，描述命中的任务信息，包括任务创建时间，处理时间信息等。

请注意，本接口最多支持同时描述**50**个任务信息
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将URL指向的媒资视频文件导入系统之中。

**请注意，本接口为异步接口**。接口返回MediaId仅代表导入视频任务发起，不代表任务完成，您可调用读接口(DescribeMedia/DescribeMedias)接口查询MediaId对应的媒资文件的状态。

当前URL只支持COS地址，其形式为`https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${ObjectKey}`，其中`${Bucket}`为您的COS桶名称，Region为COS桶所在[可用区](https://cloud.tencent.com/document/product/213/6091)，`${ObjectKey}`为指向存储在COS桶内的待分析的视频的[ObjectKey](https://cloud.tencent.com/document/product/436/13324)

分析完成后，本产品将在您的`${Bucket}`桶内创建名为`${ObjectKey}-${task-start-time}`的目录(`task-start-time`形式为1970-01-01T08:08:08)并将分析结果将回传回该目录，也即，结构化分析结果(包括图片，JSON等数据)将会写回`https://${Bucket}-${AppId}.cos.${Region}.myqcloud.com/${ObjectKey}-${task-start-time}`目录

     * @param req ImportMediaRequest
     * @return ImportMediaResponse
     * @throws TencentCloudSDKException
     */
    public ImportMediaResponse ImportMedia(ImportMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportMediaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImportMediaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportMedia");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新自定义人物分类

当L2Category为空时，代表更新CategoryId对应的一级自定义人物类型以及所有二级自定义人物类型所从属的一级自定义人物类型；
当L2Category非空时，仅更新CategoryId对应的二级自定义人物类型
     * @param req UpdateCustomCategoryRequest
     * @return UpdateCustomCategoryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCustomCategoryResponse UpdateCustomCategory(UpdateCustomCategoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCustomCategoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCustomCategoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCustomCategory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新自定义人物信息，包括姓名，简要信息，分类信息等
     * @param req UpdateCustomPersonRequest
     * @return UpdateCustomPersonResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCustomPersonResponse UpdateCustomPerson(UpdateCustomPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCustomPersonResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCustomPersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCustomPerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}