package com.bwei.demo.controller;

import com.bwei.demo.dto.AddressInfo;
import com.bwei.demo.dto.TransactionInBlockDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 田森林 on 2019/4/17.
 */
@RestController
@RequestMapping("/address")
public class AddressController {
@GetMapping("/getAddressInfo")
    public AddressInfo getAddressInfo(@RequestParam String address){
    return null;
}

    @GetMapping("/getAddressTransactions")
    public List<TransactionInBlockDTO> getAddressTransactions(@RequestParam String address,
                                                              @RequestParam(required =false,defaultValue ="1")Integer pageNum){
    return null;
    }
}
