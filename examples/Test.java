package com.baic.sdk;

public class Test {
    public static void main(String[] args) {
        System.out.println(NowPaySdk.getToken("999","23"));
        String token="6e2d3011178f439280f35b57e6b7187c";
        String porder="yh4ea65gh41ae65t4pxm-123123-23-1535079353318";
        String tr="1806288166116865522208";
        System.out.println(NowPaySdk.getPorder("999","30.151515","23re32rd23fd4","BAIC",token));
        System.out.println(NowPaySdk.selectOrderByNo("XXX","XXX","999"));
        System.out.println(NowPaySdk.selectOrderByPage(1,20,token,"999"));
        System.out.println(NowPaySdk.selectOrderByTime("ad","1534038254774","1534239254774",token,"999"));
        System.out.println(NowPaySdk.selectRefundByTransactionNo("XXX","XXX","999"));
        System.out.println(NowPaySdk.selectRefundRecordByPage(1,20,"XXX","999"));
        System.out.println(NowPaySdk.refundRequest("0.1", "asdsd", "1806530", "2cd3443d", "999"));

    }
}
