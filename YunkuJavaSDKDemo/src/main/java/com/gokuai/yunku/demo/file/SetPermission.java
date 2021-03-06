package com.gokuai.yunku.demo.file;

import com.gokuai.base.DebugConfig;
import com.gokuai.base.ReturnResult;
import com.gokuai.yunku.demo.helper.DeserializeHelper;
import com.gokuai.yunku.demo.helper.EntFileManagerHelper;
import com.yunkuent.sdk.FilePermissions;

/**
 * Created by qp on 2017/5/17.
 * <p>
 * 修改文件夹权限
 */
public class SetPermission {

    public static void main(String[] args) {

        DebugConfig.DEBUG = true;

        ReturnResult result = EntFileManagerHelper.getInstance().setPermission("test", 4, "tom",
                FilePermissions.FILE_PREVIEW, FilePermissions.FILE_DELETE,
                FilePermissions.FILE_READ, FilePermissions.FILE_WRITE);

        DeserializeHelper.getInstance().deserializeReturn(result);
    }
}
