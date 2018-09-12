package com.baic.sdk.conf;

public class Config {
    public static final String IP                                           =       "http://10.132.4.65:8080/paygateway";
    public static final String GET_TOKEN_URL                                =       IP+"/sdk/getToken";
    public static final String GET_PORDER_URL                               =       IP+"/sdk/getPorder";
    public static final String SELECT_ORDER_BY_PAGE_URL                     =       IP+"/sdk/selectOrderByPage";
    public static final String SELECT_REFUND_RECORD_BY_PAGE_URL             =       IP+"/sdk/selectRefundRecordByPage";
    public static final String SELECT_REFUND_BY_TRANSACTIONNO_URL           =       IP+"/sdk/selectRefundByTransactionNo";
    public static final String SELECT_BY_TRANSACTIONNO_URL                  =       IP+"/sdk/selectByTransactionNo";
    public static final String SELECT_ORDER_BY_TIME_URL                     =       IP+"/sdk/selectOrderByTime";
    public static final String REFUND_REQUEST                         		=       IP+"/sdk/sdkRefundRequest";
}
