package com.duilie.heshu.service;

import com.duilie.heshu.entity.PrepareDistrubExcel;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: zeng
 * @modified By:
 */
public interface ExcelService {

    public PrepareDistrubExcel compareExcel(MultipartFile file, String column, String appNo, String prdType);
}
