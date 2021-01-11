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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartMCUMixTranscodeByStrRoomIdRequest extends AbstractModel{

    /**
    * TRTC的SDKAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 字符串房间号。
    */
    @SerializedName("StrRoomId")
    @Expose
    private String StrRoomId;

    /**
    * 混流输出控制参数。
    */
    @SerializedName("OutputParams")
    @Expose
    private OutputParams OutputParams;

    /**
    * 混流输出编码参数。
    */
    @SerializedName("EncodeParams")
    @Expose
    private EncodeParams EncodeParams;

    /**
    * 混流输出布局参数。
    */
    @SerializedName("LayoutParams")
    @Expose
    private LayoutParams LayoutParams;

    /**
    * 第三方CDN转推参数。
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private PublishCdnParams PublishCdnParams;

    /**
     * Get TRTC的SDKAppId。 
     * @return SdkAppId TRTC的SDKAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的SDKAppId。
     * @param SdkAppId TRTC的SDKAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 字符串房间号。 
     * @return StrRoomId 字符串房间号。
     */
    public String getStrRoomId() {
        return this.StrRoomId;
    }

    /**
     * Set 字符串房间号。
     * @param StrRoomId 字符串房间号。
     */
    public void setStrRoomId(String StrRoomId) {
        this.StrRoomId = StrRoomId;
    }

    /**
     * Get 混流输出控制参数。 
     * @return OutputParams 混流输出控制参数。
     */
    public OutputParams getOutputParams() {
        return this.OutputParams;
    }

    /**
     * Set 混流输出控制参数。
     * @param OutputParams 混流输出控制参数。
     */
    public void setOutputParams(OutputParams OutputParams) {
        this.OutputParams = OutputParams;
    }

    /**
     * Get 混流输出编码参数。 
     * @return EncodeParams 混流输出编码参数。
     */
    public EncodeParams getEncodeParams() {
        return this.EncodeParams;
    }

    /**
     * Set 混流输出编码参数。
     * @param EncodeParams 混流输出编码参数。
     */
    public void setEncodeParams(EncodeParams EncodeParams) {
        this.EncodeParams = EncodeParams;
    }

    /**
     * Get 混流输出布局参数。 
     * @return LayoutParams 混流输出布局参数。
     */
    public LayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set 混流输出布局参数。
     * @param LayoutParams 混流输出布局参数。
     */
    public void setLayoutParams(LayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get 第三方CDN转推参数。 
     * @return PublishCdnParams 第三方CDN转推参数。
     */
    public PublishCdnParams getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set 第三方CDN转推参数。
     * @param PublishCdnParams 第三方CDN转推参数。
     */
    public void setPublishCdnParams(PublishCdnParams PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StrRoomId", this.StrRoomId);
        this.setParamObj(map, prefix + "OutputParams.", this.OutputParams);
        this.setParamObj(map, prefix + "EncodeParams.", this.EncodeParams);
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);

    }
}

