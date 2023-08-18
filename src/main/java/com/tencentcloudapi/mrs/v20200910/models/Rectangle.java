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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rectangle extends AbstractModel{

    /**
    * x坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * y坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("W")
    @Expose
    private Long W;

    /**
    * 高
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("H")
    @Expose
    private Long H;

    /**
     * Get x坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return X x坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set x坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param X x坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get y坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Y y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set y坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Y y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return W 宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getW() {
        return this.W;
    }

    /**
     * Set 宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param W 宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setW(Long W) {
        this.W = W;
    }

    /**
     * Get 高
注意：此字段可能返回 null，表示取不到有效值。 
     * @return H 高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getH() {
        return this.H;
    }

    /**
     * Set 高
注意：此字段可能返回 null，表示取不到有效值。
     * @param H 高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setH(Long H) {
        this.H = H;
    }

    public Rectangle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rectangle(Rectangle source) {
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
        if (source.W != null) {
            this.W = new Long(source.W);
        }
        if (source.H != null) {
            this.H = new Long(source.H);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "W", this.W);
        this.setParamSimple(map, prefix + "H", this.H);

    }
}

