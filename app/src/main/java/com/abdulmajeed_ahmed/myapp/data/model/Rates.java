package com.abdulmajeed_ahmed.myapp.data.model;

/**
 * Created by Eng. Abdulmajeed Ahmed on 8/15/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.TreeMap;

public class Rates { //to convert JSON to POJO (Plain Old Java Objects)...

    @SerializedName("AUD")
    @Expose
    private Double aUD;
    @SerializedName("BGN")
    @Expose
    private Double bGN;
    @SerializedName("BRL")
    @Expose
    private Double bRL;
    @SerializedName("CAD")
    @Expose
    private Double cAD;
    @SerializedName("CHF")
    @Expose
    private Double cHF;
    @SerializedName("CNY")
    @Expose
    private Double cNY;
    @SerializedName("CZK")
    @Expose
    private Double cZK;
    @SerializedName("DKK")
    @Expose
    private Double dKK;
    @SerializedName("GBP")
    @Expose
    private Double gBP;
    @SerializedName("HKD")
    @Expose
    private Double hKD;
    @SerializedName("HRK")
    @Expose
    private Double hRK;
    @SerializedName("HUF")
    @Expose
    private Double hUF;
    @SerializedName("IDR")
    @Expose
    private Double iDR;
    @SerializedName("ILS")
    @Expose
    private Double iLS;
    @SerializedName("INR")
    @Expose
    private Double iNR;
    @SerializedName("JPY")
    @Expose
    private Double jPY;
    @SerializedName("KRW")
    @Expose
    private Double kRW;
    @SerializedName("MXN")
    @Expose
    private Double mXN;
    @SerializedName("MYR")
    @Expose
    private Double mYR;
    @SerializedName("NOK")
    @Expose
    private Double nOK;
    @SerializedName("NZD")
    @Expose
    private Double nZD;
    @SerializedName("PHP")
    @Expose
    private Double pHP;
    @SerializedName("PLN")
    @Expose
    private Double pLN;
    @SerializedName("RON")
    @Expose
    private Double rON;
    @SerializedName("RUB")
    @Expose
    private Double rUB;
    @SerializedName("SEK")
    @Expose
    private Double sEK;
    @SerializedName("SGD")
    @Expose
    private Double sGD;
    @SerializedName("THB")
    @Expose
    private Double tHB;
    @SerializedName("TRY")
    @Expose
    private Double tRY;
    @SerializedName("USD")
    @Expose
    private Double uSD;
    @SerializedName("ZAR")
    @Expose
    private Double zAR;

    public Double getAUD() {
        return aUD;
    }

    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    public Double getBGN() {
        return bGN;
    }

    public void setBGN(Double bGN) {
        this.bGN = bGN;
    }

    public Double getBRL() {
        return bRL;
    }

    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    public Double getCAD() {
        return cAD;
    }

    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    public Double getCHF() {
        return cHF;
    }

    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    public Double getCNY() {
        return cNY;
    }

    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    public Double getCZK() {
        return cZK;
    }

    public void setCZK(Double cZK) {
        this.cZK = cZK;
    }

    public Double getDKK() {
        return dKK;
    }

    public void setDKK(Double dKK) {
        this.dKK = dKK;
    }

    public Double getGBP() {
        return gBP;
    }

    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    public Double getHKD() {
        return hKD;
    }

    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    public Double getHRK() {
        return hRK;
    }

    public void setHRK(Double hRK) {
        this.hRK = hRK;
    }

    public Double getHUF() {
        return hUF;
    }

    public void setHUF(Double hUF) {
        this.hUF = hUF;
    }

    public Double getIDR() {
        return iDR;
    }

    public void setIDR(Double iDR) {
        this.iDR = iDR;
    }

    public Double getILS() {
        return iLS;
    }

    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    public Double getINR() {
        return iNR;
    }

    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    public Double getJPY() {
        return jPY;
    }

    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    public Double getKRW() {
        return kRW;
    }

    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    public Double getMXN() {
        return mXN;
    }

    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    public Double getMYR() {
        return mYR;
    }

    public void setMYR(Double mYR) {
        this.mYR = mYR;
    }

    public Double getNOK() {
        return nOK;
    }

    public void setNOK(Double nOK) {
        this.nOK = nOK;
    }

    public Double getNZD() {
        return nZD;
    }

    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    public Double getPHP() {
        return pHP;
    }

    public void setPHP(Double pHP) {
        this.pHP = pHP;
    }

    public Double getPLN() {
        return pLN;
    }

    public void setPLN(Double pLN) {
        this.pLN = pLN;
    }

    public Double getRON() {
        return rON;
    }

    public void setRON(Double rON) {
        this.rON = rON;
    }

    public Double getRUB() {
        return rUB;
    }

    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    public Double getSEK() {
        return sEK;
    }

    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    public Double getSGD() {
        return sGD;
    }

    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    public Double getTHB() {
        return tHB;
    }

    public void setTHB(Double tHB) {
        this.tHB = tHB;
    }

    public Double getTRY() {
        return tRY;
    }

    public void setTRY(Double tRY) {
        this.tRY = tRY;
    }

    public Double getUSD() {
        return uSD;
    }

    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    public Double getZAR() {
        return zAR;
    }

    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    /**
     * To display the results in text, I used map tree to save time later.. Should be other way...
     * @return
     */
    public TreeMap<Double,String> getAttributesTreeMap(){
        TreeMap<Double,String> tree= new TreeMap();
        tree.put(aUD,"AUD");
        tree.put(bGN,"BGN");
        tree.put(bRL,"BRL");
        tree.put(cAD,"CAD");
        tree.put(cHF,"CHF");
        tree.put(cNY,"CNY");
        tree.put(cZK,"CZK");
        tree.put(dKK,"DKK");
        tree.put(gBP,"GBP");
        tree.put(hKD,"HKD");
        tree.put(hRK,"HRK");
        tree.put(hUF,"HUF");
        tree.put(iDR,"IDR");
        tree.put(iLS,"ILS");
        tree.put(iNR,"INR");
        tree.put(jPY,"JPY");
        tree.put(kRW,"KRW");
        tree.put(mXN,"MXN");
        tree.put(mYR,"MYR");
        tree.put(nOK,"NOK");
        tree.put(nZD,"NZD");
        tree.put(pHP,"PHP");
        tree.put(pLN,"PLN");
        tree.put(rON,"RON");
        tree.put(rUB,"RUB");
        tree.put(sEK,"SEK");
        tree.put(sGD,"SGD");
        tree.put(tHB,"THB");
        tree.put(tRY,"TRY");
        tree.put(uSD,"USD");
        tree.put(zAR,"ZAR");
        return tree;
    }

}
