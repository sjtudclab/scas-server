package com.dclab.util;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Huiyi on 2015/4/1.
 */
public class FileUtil {

    private static final Logger LOG = LoggerFactory.getLogger(FileUtil.class);

    public static String uploadFile(MultipartFile file, HttpServletRequest request) {
        String attachment = null;
        if (!file.isEmpty()) {
            ServletContext sc = request.getSession().getServletContext();
            String dir = sc.getRealPath("/WEB-INF/statics/upload_attachment");    //设定文件保存的目录

            String filename = file.getOriginalFilename();    //得到上传时的文件名

            String newFilename =  getFileNameWithoutExt(filename) + System.currentTimeMillis() + "." + getFileType(filename);
            attachment = "upload_attachment/" + newFilename;

            try {
                FileUtils.writeByteArrayToFile(new File(dir, newFilename), file.getBytes());
            } catch (IOException ex) {
                LOG.info("upload attachment failed.");
            }
        }

        return attachment;
    }

    private static String getFileNameWithoutExt(String filename) {
        return filename.split("\\.")[0];
    }

    private static String getFileType(String filename){
        String[] arr = filename.split("\\.");
        return arr[1];
    }
}
