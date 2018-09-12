package com.baic.sdk;

import com.baic.sdk.conf.Config;
import com.baic.sdk.util.HttpClientUtil;

public class NowPaySdk {
    // 获取token
    public static String getToken(String sdkId,String appId) {
        return HttpClientUtil.sendGet(Config.GET_TOKEN_URL,
                "sdkId="+sdkId+"&appKey="+appId);
    }
    // 获取订单
    public static String getPorder(String sdkId,
                                   String orderAmount,
                                   String orderNo,
                                   String currencyType,
                                   String token) {
        return HttpClientUtil.sendPost(Config.GET_PORDER_URL,"sdkId="+sdkId+
                "&orderNo="+orderNo+
                "&orderAmount="+orderAmount+
                "&currencyType="+currencyType+
                "&token="+token);
    }
    // 根据交易流水号查询订单信息
    public static String selectOrderByNo(String transactionNo,
                                         String sdkId,
                                         String token
                                         ){
        return HttpClientUtil.sendPost(Config.SELECT_BY_TRANSACTIONNO_URL,"sdkId="+sdkId+
                "&transactionNo="+transactionNo+
                "&token="+token);
    }
    // 根据时间，商户id sdkid查询订单
    public static String selectOrderByTime(String merchantId,
                                           String beginTime,
                                           String endTime,
                                           String sdkId,
                                           String token){
        return HttpClientUtil.sendPost(Config.SELECT_ORDER_BY_TIME_URL,"sdkId="+sdkId+
                "&beginTime="+beginTime+
                "&endTime="+endTime+
                "&merchantId="+merchantId+
                "&token="+token);
    }
    // 根据交易流水号查询退款信息
    public static String selectRefundByTransactionNo(String transactionNo,
                                                     String sdkId,
                                                     String token
                                                     ){
        return HttpClientUtil.sendPost(Config.SELECT_REFUND_BY_TRANSACTIONNO_URL,"sdkId="+sdkId+
                "&transactionNo="+transactionNo+
                "&token="+token);
    }
    // 根据页数查询订单
    public static String selectOrderByPage(Integer page,
                                           Integer limit,
                                           String sdkId,
                                           String token
                                           ){
        return HttpClientUtil.sendPost(Config.SELECT_ORDER_BY_PAGE_URL,"page="+page+
                "&limit="+limit+
                "&sdkId="+sdkId+
                "&token="+token);
    }
    // 根据页数查询退款订单
    public static String selectRefundRecordByPage(Integer page,
                                                     Integer limit,
                                                     String sdkId,
                                                    String token){
        return HttpClientUtil.sendPost(Config.SELECT_REFUND_RECORD_BY_PAGE_URL,"page="+page+
                "&limit="+limit+
                "&sdkId="+sdkId+
                "&token="+token);
    }
    // 退款
    public static String refundRequest(String refundAmount,String merchantId,String transactionNo,String sdkId,String token) {
        return HttpClientUtil.sendPost(Config.REFUND_REQUEST,
                "refundAmount="+refundAmount+
                "&merchantId="+merchantId+
                "&transactionNo="+transactionNo+
                "&token="+token+
                "&sdkId="+sdkId);
    }
}
