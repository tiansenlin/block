package com.bwei.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bwei.demo.api.BitcoinApi;
import com.bwei.demo.api.BitcoinJsonRpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 田森林 on 2019/4/17.
 */
@RestController
@RequestMapping("/temp")
public class TempController {

    @Autowired
    private BitcoinApi bitcoinApi;

    @Autowired
    private BitcoinJsonRpcClient bitcoinJsonRpcClient;
    @GetMapping("/test")
    public void test() throws Throwable {
                JSONObject chainInfo = bitcoinApi.getChainInfo();
        String txhash = "54defa106859dad7f96edc1c7ab84d25b43a9ab9e670dace62f1061679be7499";
       JSONObject transaction = bitcoinApi.getTransaction(txhash);
        String blockhash = "000000000000003291759b9da399050239657a65c92abc8602747c6d9c79f7f7";
        JSONObject block = bitcoinApi.getBlock(blockhash);
        JSONObject noTxBlock = bitcoinApi.getNoTxBlock(blockhash);
        String blockhash2 = "0000000000000027d5774b888920238f8e8aa395afd7e04100cc156f1e7bd82a";
        JSONArray blockHeaders = bitcoinApi.getBlockHeaders(10, blockhash2);
        JSONObject mempoolInfo = bitcoinApi.getMempoolInfo();
        JSONObject mempoolContents = bitcoinApi.getMempoolContents();
        String blockHashByHeight = bitcoinJsonRpcClient.getBlockHashByHeight(1489445);
        String address = "mwt9LmdatUcksGQ8eEbKbbPnczUmTq4G9h";
        Double balanceAmount = bitcoinJsonRpcClient.getBalance(address);
        String txid="";
        Integer n=0;
        JSONObject utxo=bitcoinApi.getUTXO(txid,n);
        JSONObject rawTransaxtion = bitcoinJsonRpcClient.getRawTransaxtion(txid);
    }
}
