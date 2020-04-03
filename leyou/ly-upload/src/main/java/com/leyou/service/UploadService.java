package com.leyou.service;

import com.leyou.common.exception.Enum;
import com.leyou.common.exception.LyException;
import lombok.extern.slf4j.Slf4j;
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
public class UploadService {
    private static final List<String> allwoType = Arrays.asList("image/jpeg","image/png","image/bmp");
    public String uploadImage(MultipartFile file) {
        //保存文件到本地
        try {
            String contentType = file.getContentType();
            if(!allwoType.contains(contentType)){
                throw new LyException(Enum.INVALID_FILE_TYPE);
            }

            BufferedImage image = ImageIO.read(file.getInputStream());
            if(image==null){
                throw new LyException(Enum.INVALID_FILE_TYPE);
            }

            File dest = new File("D:\\idea\\leyou\\image", file.getOriginalFilename());
        //返回路径
            file.transferTo(dest);
            return file.getOriginalFilename();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("上传文件失败！");
            throw new LyException(Enum.UPLOAD_FILE_ERROR);
        }



    }
}
