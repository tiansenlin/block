package com.bwei.demo.controller;

import com.bwei.demo.dto.BlockDetailDTO;
import com.bwei.demo.dto.BlockListDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 田森林 on 2019/4/17.
 */
@RestController
@RequestMapping("/block")
public class BlockController {
    @GetMapping("/getRecentBlocksById")
    public List<BlockListDTO> getRecentBlocksById(@RequestParam Integer blockchainId){
        return null;
    }

    @GetMapping("/getRecentBlocksByNameType")
    public List<BlockListDTO> getRecentBlocksByNameType(@RequestParam String name,
                    @RequestParam String type){
        System.out.println("1111111");
        return null;
    }
    @GetMapping("/getBlockDetailByHash")
    public BlockDetailDTO BlockDetailByHash(@RequestParam String blockhash){
     return null;
    }
    @GetMapping("getBlockDetailByHeight")
    public BlockDetailDTO getBlockDetailByHeight(@RequestParam Integer blockheight){
        return null;
    }
}
