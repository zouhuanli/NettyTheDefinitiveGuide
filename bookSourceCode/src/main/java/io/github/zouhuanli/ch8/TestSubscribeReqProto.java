package io.github.zouhuanli.ch8;

import java.util.List;

public class TestSubscribeReqProto {

    private static byte[] encode(SubscribeReqProto.SubscribeReq req) throws Exception {
        return req.toByteArray();
    }

    private static SubscribeReqProto.SubscribeReq decode(byte[] data) throws Exception {
        return SubscribeReqProto.SubscribeReq.parseFrom(data);
    }

    private static SubscribeReqProto.SubscribeReq createSubscribeReq() {
        SubscribeReqProto.SubscribeReq.Builder builder = SubscribeReqProto.SubscribeReq.newBuilder();
        builder.setSubReqID(1);
        builder.setUserName("zouhuanli");
        builder.setProductName("Netty Book");
        List<String> addressList = builder.getAddressList();
        addressList.add("NanJing");
        addressList.add("BeiJing");
        builder.addAllAddress(addressList);
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        SubscribeReqProto.SubscribeReq req = createSubscribeReq();
        System.out.println("Before encode : " + req);
        byte[] encode = encode(req);
        SubscribeReqProto.SubscribeReq req2 = decode(encode);
        System.out.println("After decode : " + req2);
        System.out.println("Assert equal : --> " + req2.equals(req));
    }


}
