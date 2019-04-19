package com.bwei.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 田森林 on 2019/4/19.
 */
@Component
public class BlockScheduler {

    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Scheduled(fixedRate =3000)
    public void importBlockTransaction(){
        logger.info("start import block transactions");
    }

}
