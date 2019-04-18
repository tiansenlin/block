package com.bwei.demo.dto;

import java.util.Date;

/**
 * Created by 田森林 on 2019/4/17.
 */
public class TransactionInBlockDTO {
    private String txid;

    private String txhash;

    private Long size;

    private Date time;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
