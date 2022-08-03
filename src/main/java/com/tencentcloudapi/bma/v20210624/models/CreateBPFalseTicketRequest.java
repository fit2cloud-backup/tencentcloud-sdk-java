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

public class CreateBPFalseTicketRequest extends AbstractModel{

    /**
    * xxx
    */
    @SerializedName("FakeURL")
    @Expose
    private String FakeURL;

    /**
     * Get xxx 
     * @return FakeURL xxx
     */
    public String getFakeURL() {
        return this.FakeURL;
    }

    /**
     * Set xxx
     * @param FakeURL xxx
     */
    public void setFakeURL(String FakeURL) {
        this.FakeURL = FakeURL;
    }

    public CreateBPFalseTicketRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPFalseTicketRequest(CreateBPFalseTicketRequest source) {
        if (source.FakeURL != null) {
            this.FakeURL = new String(source.FakeURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FakeURL", this.FakeURL);

    }
}

