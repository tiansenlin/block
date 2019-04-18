package com.bwei.demo.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by 田森林 on 2019/4/17.
 */
public class BlockDetailDTO {
    private String blockhash;
    private Integer height;
    private Date time;
    private Integer txSize;
    private Long sizeOnDisk;
    private Double difficulty;
    private String prevBlockhash;
    private String nextBlockhash;
    private Double outputTotal;
    private Double transactionFees;
    private String merleRoot;
    private List<TransactionInBlockDTO> transactions;

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getTxSize() {
        return txSize;
    }

    public void setTxSize(Integer txSize) {
        this.txSize = txSize;
    }

    public Long getSizeOnDisk() {
        return sizeOnDisk;
    }

    public void setSizeOnDisk(Long sizeOnDisk) {
        this.sizeOnDisk = sizeOnDisk;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public String getPrevBlockhash() {
        return prevBlockhash;
    }

    public void setPrevBlockhash(String prevBlockhash) {
        this.prevBlockhash = prevBlockhash;
    }

    public String getNextBlockhash() {
        return nextBlockhash;
    }

    public void setNextBlockhash(String nextBlockhash) {
        this.nextBlockhash = nextBlockhash;
    }

    public Double getOutputTotal() {
        return outputTotal;
    }

    public void setOutputTotal(Double outputTotal) {
        this.outputTotal = outputTotal;
    }

    public Double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(Double transactionFees) {
        this.transactionFees = transactionFees;
    }

    public String getMerleRoot() {
        return merleRoot;
    }

    public void setMerleRoot(String merleRoot) {
        this.merleRoot = merleRoot;
    }

    public List<TransactionInBlockDTO> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionInBlockDTO> transactions) {
        this.transactions = transactions;
    }
}
