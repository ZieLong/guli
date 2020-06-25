package com.hqu.eduservice.entity.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeacherQuery {
    @ApiModelProperty(value = "教师名称")
    private String name;

    @ApiModelProperty(value = "等级")
    private Integer level;

    @ApiModelProperty(value = "查询起始时间")
    private String begin;

    @ApiModelProperty(value = "查询结束时间")
    private  String end;
}
