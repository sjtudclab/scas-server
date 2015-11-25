package com.dclab.util;

import org.apache.commons.io.FilenameUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.net.URI;

/**
 * Created by Yongfeng on 10/31/15.
 */
public class HDFSUtil {
    private static final Logger LOG = LoggerFactory.getLogger(FileUtil.class);

    private final static String HDFS_URI = "hdfs://192.168.1.108:9000";
    public final static String UPLOAD_PATH = "/messages";
    public static String uploadFile(MultipartFile file) {
        String uploadedPath = UPLOAD_PATH;
        String fileName = file.getOriginalFilename();

        try {
            Configuration conf = new Configuration();
            System.setProperty("HADOOP_USER_NAME", "hadoop");
            System.setProperty("hadoop.home.dir", "/");
            FileSystem fs = FileSystem.get(new URI(HDFS_URI), conf);
            uploadedPath += File.separator + getFileNameWithoutExt(fileName) + "_" + System.currentTimeMillis() + "." + getFileType(fileName);
            Path outFile = new Path(uploadedPath);
            FSDataOutputStream out = fs.create(outFile);
            out.write(file.getBytes());
            out.close();
            fs.close();
        } catch (Exception e) {
            LOG.info("HDFS upload attachment failed.");
            return "";
        }
        return uploadedPath;
    }

    public static InputStream getFileFromPath(String path) throws Exception{
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.1.108:9000"), conf);
        Path file = new Path(path);
        return fs.open(file);
    }
    private static String getFileNameWithoutExt(String filename) {
       return FilenameUtils.getBaseName(filename);
    }

    private static String getFileType(String filename){
        return FilenameUtils.getExtension(filename);
    }
}
