package com.gokuai.yunku.demo.file;

import com.gokuai.base.DebugConfig;
import com.gokuai.base.ReturnResult;
import com.gokuai.yunku.demo.helper.DeserializeHelper;
import com.gokuai.yunku.demo.helper.EntFileManagerHelper;

/**
 * Created by qp on 2017/5/18.
 * <p>
 * 彻底删除文件
 */
public class DelCompletely {

    public static void main(String[] args) {

        DebugConfig.DEBUG = true;
//        DebugConfig.LOG_PATH="LogPath/";

        ReturnResult result = EntFileManagerHelper.getInstance().delCompletely(new String[]{"aaa.jpg"}, "Brandon");

        DeserializeHelper.getInstance().deserializeReturn(result);
    }
}
