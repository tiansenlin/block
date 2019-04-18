package com.bwei.demo.controller;

import com.bwei.demo.dto.ImportStateDTO;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 田森林 on 2019/4/17.
 */
@RestController
@RequestMapping("/misc")
@EnableAutoConfiguration
public class MiscController {

    @GetMapping("/search")
    public Object search(@RequestParam String keyword){
        return null;
    }
    @GetMapping("/importFromHeight")
    public void importFromHeight(@RequestParam Integer blockHeight,
                                 @RequestParam(required =false,defaultValue ="false")Boolean isClean){

    }
    @GetMapping("/getImportState")
    public ImportStateDTO getImportState(){
        return null;
    }

}
