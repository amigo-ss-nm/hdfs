package com.qingruan;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.net.URI;

public class HdfsClient {

    /*
    上传文件
    */
    @Test
    public void putFile(){

        try {
            Configuration conf = new Configuration();
            //获取FileSsystem
            FileSystem fs = FileSystem.get(new URI("hdfs://192.168.22.78:9000"), conf, "hadoop");

            //上传文件
            fs.copyFromLocalFile(new Path("E:\\input\\studentInfo.txt"), new Path("/0605"));
            fs.close();
            System.out.println("执行完成！");
        }catch (Exception e){
            e.fillInStackTrace();
        }
    }
    /*
    *下载文件
    * */
    public void getFile(){

    }
}
