package com.myproject.examples.lambdas.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class Trade {

    private AtomicInteger tradeId = new AtomicInteger();

    private int id  = 0;
    private String instrument = null;

    private String status = null;
    private int quantity = 0;

    public Trade(int id) {
       setId(tradeId.getAndIncrement());
    }

    public Trade(String instrument, int quantity, String status) {
        setId(tradeId.getAndIncrement());
        this.instrument = instrument;
        this.status = status;
        this.quantity = quantity;
    }

    public Trade(int id, String instrument, int quantity, String status) {
        setId(id);
        this.instrument = instrument;
        this.status = status;
        this.quantity = quantity;
    }

    public Trade() {
        tradeId.getAndIncrement();
    }

    public Trade(Trade t) {

    }

    public int getTradeId() {
        return tradeId.intValue();
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTradeId(AtomicInteger tradeId) {
        this.tradeId = tradeId;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeId=" + tradeId +
                ", id=" + id +
                ", instrument='" + instrument + '\'' +
                ", status='" + status + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void setPrice(double price){

    }

    public boolean isOpen(){
        return true;
    }

    public boolean isBigTrade(){
        return getQuantity() > 1000000;
    }

    public boolean isNew(){
        return getStatus().equals("NEW");
    }

    public boolean isPending(){
        return getStatus().equals("PENDING");
    }

    public boolean isCancelledTrade(){
        return getStatus().equals("CANCEL");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trade other = (Trade) obj;
        if (instrument == null) {
            if (other.instrument != null)
                return false;
        } else if (!instrument.equals(other.instrument))
            return false;
        if (quantity != other.quantity)
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((instrument == null) ? 0 : instrument.hashCode());
        result = prime * result + quantity;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean copy(EncryptedTrade t1){
        // Copy t1 to this trade
        //logic of copying the Encrpted trade to this trade goes here
        return true;
    }
}
