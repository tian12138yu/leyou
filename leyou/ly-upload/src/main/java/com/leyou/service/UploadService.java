package com.leyou.service;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.leyou.common.exception.Enum;
import com.leyou.common.exception.LyException;
import com.leyou.config.UploadProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Author tjy
 * @Date 2020/4/3 15:22
 */
@Service
@Slf4j
@EnableConfigurationProperties(UploadProperties.class)
public class UploadService {
    @Autowired
    private UploadProperties properties;

    @Autowired
    private FastFileStorageClient fileStorageClient;

    //private static final List<String> allwoType = Arrays.asList("image/jpeg","image/png","image/bmp");
    public String uploadImage(MultipartFile file) {
        //保存文件到本地
        try {
            String contentType = file.getContentType();
            if(!properties.getAllowTypes().contains(contentType)){
                throw new LyException(Enum.INVALID_FILE_TYPE);
            }

            BufferedImage image = ImageIO.read(file.getInputStream());
            if(image==null){
                throw new LyException(Enum.INVALID_FILE_TYPE);
            }

            String substring = StringUtils.substringAfterLast(file.getOriginalFilename(),".");
            StorePath storePath = fileStorageClient.uploadFile(file.getInputStream(), file.getSize(), substring, null);
            //返回路径
            return properties.getBaseUrl() + storePath.getFullPath();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("上传文件失败！",e);
            throw new LyException(Enum.UPLOAD_FILE_ERROR);
        }



    }
}
