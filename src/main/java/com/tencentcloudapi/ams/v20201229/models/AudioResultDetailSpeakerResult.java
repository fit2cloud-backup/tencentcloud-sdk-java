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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResultDetailSpeakerResult extends AbstractModel{

    /**
    * 该字段用于返回检测结果需要检测的内容类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 该字段用于返回呻吟检测的置信度，取值范围：0（置信度最低）-100（置信度最高），越高代表音频越有可能属于说话人声纹。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该字段用于返回对应说话人的片段在音频文件内的开始时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * 该字段用于返回对应说话人的片段在音频文件内的结束时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
     * Get 该字段用于返回检测结果需要检测的内容类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 该字段用于返回检测结果需要检测的内容类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果需要检测的内容类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 该字段用于返回检测结果需要检测的内容类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 该字段用于返回呻吟检测的置信度，取值范围：0（置信度最低）-100（置信度最高），越高代表音频越有可能属于说话人声纹。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 该字段用于返回呻吟检测的置信度，取值范围：0（置信度最低）-100（置信度最高），越高代表音频越有可能属于说话人声纹。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段用于返回呻吟检测的置信度，取值范围：0（置信度最低）-100（置信度最高），越高代表音频越有可能属于说话人声纹。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 该字段用于返回呻吟检测的置信度，取值范围：0（置信度最低）-100（置信度最高），越高代表音频越有可能属于说话人声纹。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该字段用于返回对应说话人的片段在音频文件内的开始时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 该字段用于返回对应说话人的片段在音频文件内的开始时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 该字段用于返回对应说话人的片段在音频文件内的开始时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 该字段用于返回对应说话人的片段在音频文件内的开始时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 该字段用于返回对应说话人的片段在音频文件内的结束时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 该字段用于返回对应说话人的片段在音频文件内的结束时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 该字段用于返回对应说话人的片段在音频文件内的结束时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 该字段用于返回对应说话人的片段在音频文件内的结束时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    public AudioResultDetailSpeakerResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioResultDetailSpeakerResult(AudioResultDetailSpeakerResult source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Float(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

