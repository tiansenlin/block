package com.bwei.demo.api;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 田森林 on 2019/4/18.
 */
@FeignClient(name = "bitcin",url ="http://localhost:18332")
public interface BitcoinApi {


    @GetMapping("/rest/block/{blockhash}.json")
    JSONObject getBlock(String temphash);
}
