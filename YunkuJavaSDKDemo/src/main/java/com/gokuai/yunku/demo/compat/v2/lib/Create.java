package com.gokuai.yunku.demo.compat.v2.lib;

import com.gokuai.base.DebugConfig;
import com.gokuai.base.ReturnResult;
import com.gokuai.yunku.demo.compat.v2.helper.EntLibraryManagerHelper;
import com.gokuai.yunku.demo.helper.DeserializeHelper;

/**
 * Created by qp on 2017/3/2.
 *
 * 创建库
 * 1T="1099511627776" 1G＝“1073741824”；
 */
public class Create {

    public static void main(String[] args) {

        DebugConfig.DEBUG = true;
//        DebugConfig.LOG_PATH="LogPath/";

        ReturnResult result = EntLibraryManagerHelper.getInstance().create("compatV3", "1073741824", "destroy", "test lib");

        DeserializeHelper.getInstance().deserializeReturn(result);
    }
}
