package com.duilie.heshu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @description:经销贷决策结果表
 * @author: zeng
 * @modified By:
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_appr_prepare_distib")
public class PrepareDistrubExcel {
    private static final long serialVersionUID = 1L;

    @TableId(value = "APP_NO")
    private String appNo;
    private String appType;
    private String contractNo;
    private String cino;
}
