package com.bwei.demo.controller;

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
        //        JSONObject chainInfo = bitcoinApi.getChainInfo();
//        String txhash = "21c6f7de3fb8ad3e5e034b85b9ac80cdc51214bcbe5ebfed9267dd8a19e239ea";
//        JSONObject transaction = bitcoinApi.getTransaction(txhash);
//        String blockhash = "000000000000004b1aecd12119a19e38efdce8c385f89a5d3a7698427108a2ee";
//        JSONObject block = bitcoinApi.getBlock(blockhash);
//        JSONObject noTxBlock = bitcoinApi.getNoTxBlock(blockhash);
//        String blockhash2 = "00000000000000a727d074e9d1cc0a225540eb40693d6aa15d702b0bd96d378b";
//        JSONArray blockHeaders = bitcoinApi.getBlockHeaders(10, blockhash2);
//        JSONObject mempoolInfo = bitcoinApi.getMempoolInfo();
//        JSONObject mempoolContents = bitcoinApi.getMempoolContents();
//        String blockHashByHeight = bitcoinJsonRpcClient.getBlockHashByHeight(1489445);
        String address = "mwt9LmdatUcksGQ8eEbKbbPnczUmTq4G9h";
        Double balanceAmount = bitcoinJsonRpcClient.getBalance(address);
    }
}
