package com.xuecheng;
/*
 * @  Author  mikasa
 * @  Date  2023/04/06 22:04
 * @  Version 1.0
 */


import com.xuecheng.base.utils.Mp4VideoUtil;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        //ffmpeg的路径
        String ffmpeg_path = "D:\\program\\not stall\\ffmpeg\\bin\\ffmpeg.exe";//ffmpeg的安装位置
        //源avi视频的路径
        String video_path = "C:\\Users\\Administrator\\Pictures\\韩立的视频 (1).mp4";
        //转换后mp4文件的名称
        String mp4_name = "nacos01.mp4";
        //转换后mp4文件的路径
        String mp4_path = "C:\\Users\\Administrator\\Pictures\\nacos01.mp4";
        //创建工具类对象
        Mp4VideoUtil videoUtil = new Mp4VideoUtil(ffmpeg_path,video_path,mp4_name,mp4_path);
        //开始视频转换，成功将返回success
        String s = videoUtil.generateMp4();
        System.out.println(s);
    }
}
