package com.gokuai.yunku.demo.file;

import com.gokuai.base.DebugConfig;
import com.gokuai.base.ReturnResult;
import com.gokuai.yunku.demo.helper.EntFileManagerHelper;
import com.yunkuent.sdk.data.FileInfo;
import com.yunkuent.sdk.data.YunkuException;
import com.yunkuent.sdk.upload.UploadCallback;

/**
 * Created by qp on 2017/3/2.
 *
 * 文件分块上传
 */
public class UploadByBlockAsync {

    public static void main(String[] args) {

        DebugConfig.PRINT_LOG = true;
//        DebugConfig.LOG_PATH="LogPath/";

        //overwrite=false, 如果有重名返回的 file.fullpath 的文件会自动追加(2), (3)...
        EntFileManagerHelper.getInstance().uploadByBlockAsync("ArcticFoxPups_FramepoolRM_372-581-588_1080_HD_ZH-CN.mp4", "", 0, "/Pictures/ArcticFoxPups_FramepoolRM_372-581-588_1080_HD_ZH-CN.mp4", true, new UploadCallback() {

            @Override
            public void onSuccess(String fullpath, FileInfo file) {
                System.out.println(fullpath + " upload success");
            }

            @Override
            public void onFail(String fullpath, YunkuException e) {
                System.out.println("upload fail");
                e.printStackTrace();

                ReturnResult result = e.getReturnResult();
                if (result != null) {
                    if (result.getException() != null) {
                        //出现网络或IO错误
                        result.getException().printStackTrace();
                    } else {
                        //如果API接口返回异常, 获取最后一次API请求的结果
                        System.out.println("http response code: " + result.getCode() + ", body: " + result.getBody());
                    }
                }
            }

            @Override
            public void onProgress(String fullpath, float percent) {
                System.out.println(fullpath + ": "  + percent * 100 + "%");
            }
        });
    }
}
