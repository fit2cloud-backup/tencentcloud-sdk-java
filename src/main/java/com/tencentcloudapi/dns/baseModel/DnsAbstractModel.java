package com.tencentcloudapi.dns.baseModel;

import com.tencentcloudapi.common.AbstractModel;

import java.util.HashMap;

/**
 * @author 范恩华
 * @date 2020-07-08 15:28
 */
public class DnsAbstractModel extends AbstractModel {
    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {

    }
    @Override
    protected <V> void setParamSimple(HashMap<String, String> map, String key, V value) {
        if (value != null) {
            map.put(key, String.valueOf(value));
        }
    }

}
