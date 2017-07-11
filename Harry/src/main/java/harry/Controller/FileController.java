package harry.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping(value = "/upload")
public class FileController {
   private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @RequestMapping(value = "/upLoadFile")
    public String upLoadFile(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        logger.info("upLoadFile start ...");
//        一种方法
        if (file != null && file.getSize() > 0) {
            String path = "D:/" + new Date().getTime() + file.getOriginalFilename();
            File newFile = new File(path);
            //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
            file.transferTo(newFile);
        }
////        第二种方法
//        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
//        MultipartFile multipartFile = multipartHttpServletRequest.getFile("file");
        logger.info("upLoadFile end ...");
        return "ok";
    }

    @RequestMapping(value = "/upLoadFiles")
    public String upLoadFiles(@RequestParam("file") MultipartFile[] multipartFiles) throws IOException {
        if (multipartFiles != null && multipartFiles.length>0){
            for (int i = 0;i<multipartFiles.length;i++){
                MultipartFile file = multipartFiles[i];
                String path = "D:/" + new Date().getTime() + file.getOriginalFilename();
                File newFile = new File(path);
                //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
                file.transferTo(newFile);
            }
        }
        return "ok";
    }

}
