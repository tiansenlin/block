package com.bwei.demo.service;

import org.springframework.scheduling.annotation.Async;

/**
 * Created by 田森林 on 2019/4/18.
 */
public interface MiscService {
    @Async
    void importFromHash(String blockHash, Boolean isClean) throws Throwable;

    void importFromHeight(Integer blockHeight, Boolean isClean);
}
