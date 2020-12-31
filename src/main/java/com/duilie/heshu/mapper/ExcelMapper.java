package com.duilie.heshu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.duilie.heshu.entity.PrepareDistrubExcel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: zeng
 * @modified By:
 */
public interface ExcelMapper extends BaseMapper<PrepareDistrubExcel> {

    @Select("SELECT * FROM BIZ_APPR_PREPARE_DISTURB WHERE APP_NO = #{appNo}")
    PrepareDistrubExcel selectExcel(@Param("appNo") String appNo);

}
