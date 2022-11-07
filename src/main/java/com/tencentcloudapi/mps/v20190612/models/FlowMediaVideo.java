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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowMediaVideo extends AbstractModel{

    /**
    * 帧率。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 码率，单位是bps。
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * 视频Pid。
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 标志同一次推流。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get 帧率。 
     * @return Fps 帧率。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率。
     * @param Fps 帧率。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 码率，单位是bps。 
     * @return Rate 码率，单位是bps。
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set 码率，单位是bps。
     * @param Rate 码率，单位是bps。
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 视频Pid。 
     * @return Pid 视频Pid。
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 视频Pid。
     * @param Pid 视频Pid。
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 标志同一次推流。 
     * @return SessionId 标志同一次推流。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 标志同一次推流。
     * @param SessionId 标志同一次推流。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public FlowMediaVideo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowMediaVideo(FlowMediaVideo source) {
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

