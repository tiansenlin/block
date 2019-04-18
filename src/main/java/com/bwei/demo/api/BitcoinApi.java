package com.bwei.demo.api;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by 田森林 on 2019/4/18.
 */
public interface BitcoinApi {
    JSONObject getBlock(String temphash);
}
