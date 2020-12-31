package com.duilie.heshu.controller;

import com.duilie.heshu.common.lang.Result;
import com.duilie.heshu.entity.PrepareDistrubExcel;
import com.duilie.heshu.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: zeng
 * @modified By:
 */
@Controller
public class CompareController {

    @Autowired
    private ExcelService excelService;

    @RequestMapping(value = "/compare", method = RequestMethod.POST)
    public Result compare(@RequestParam("file") MultipartFile file,
                          @RequestParam("column") String column,
                          @RequestParam("appNo") String appNo,
                          @RequestParam("prdType") String prdType){

        if (null == file) {
            return Result.fail("上传失败，无法找到文件！");
        }

        PrepareDistrubExcel prepareDistrubExcel = excelService.compareExcel(file,column,appNo,prdType);



        return Result.succ(prepareDistrubExcel);
    }
}
