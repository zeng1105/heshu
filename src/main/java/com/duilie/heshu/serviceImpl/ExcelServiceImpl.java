package com.duilie.heshu.serviceImpl;

import com.duilie.heshu.entity.PrepareDistrubExcel;
import com.duilie.heshu.mapper.ExcelMapper;
import com.duilie.heshu.service.ExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.util.logging.Logger;

/**
 * @description:
 * @author: zeng
 * @modified By:
 */
@Slf4j//lombok简化Logger对象创建
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private ExcelMapper excelMapper;

    @Override
    public PrepareDistrubExcel compareExcel(MultipartFile file, String column, String appNo, String prdType) {

        log.info("-----日志打印-----");
        PrepareDistrubExcel result = excelMapper.selectExcel(appNo);

        return null;
    }
}
