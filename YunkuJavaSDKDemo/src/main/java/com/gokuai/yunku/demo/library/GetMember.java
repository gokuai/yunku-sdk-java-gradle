package com.gokuai.yunku.demo.library;

import com.gokuai.base.DebugConfig;
import com.gokuai.base.ReturnResult;
import com.gokuai.yunku.demo.helper.DeserializeHelper;
import com.gokuai.yunku.demo.helper.EntLibraryManagerHelper;
import com.yunkuent.sdk.MemberType;

/**
 * Created by qp on 2017/3/2.
 *
 * 查询库成员信息
 */
public class GetMember {

    public static void main(String[] args) {

        DebugConfig.DEBUG = true;

        ReturnResult result = EntLibraryManagerHelper.getInstance().getMember(1271496, MemberType.MEMBER_ID,new String[]{"4"});

        DeserializeHelper.getInstance().deserializeReturn(result);
    }
}
