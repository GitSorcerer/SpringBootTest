package com.gaoh.consumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author gaoh
 * @version 1.0
 * @date 2019/7/15 10:30
 */
//文件上传
@Api(value = "文件上传", description = "文件上传API")
@RestController
public class UploadController {

//    @Autowired
//    private FileUploadService fileUploadService;

    @ApiOperation(value = "文件上传", notes = "文件上传")
    @RequestMapping(value = "/api/upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public String upload(@RequestParam MultipartFile file) {
//        String fileFullPath = fileUploadService.upload(file);
//        return RestResultGenerator.getSuccessResult(fileFullPath);
        return "success";
    }

}
