/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pamirs.tro.entity.domain.dto.report;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author 莫问
 * @Date 2020-04-17
 */
@Data
public class ReportDTO implements Serializable {

    private static final long serialVersionUID = 4235565595934721788L;

    @ApiModelProperty(value = "报告ID")
    private Long id;

    @ApiModelProperty(value = "消耗流量")
    private BigDecimal amount;

    @ApiModelProperty(value = "客户ID")
    private Long customId;

    @ApiModelProperty(value = "客户名称")
    private String customName;

    @ApiModelProperty(value = "场景ID")
    private Long sceneId;

    @ApiModelProperty(value = "场景名称")
    private String sceneName;

    @ApiModelProperty(value = "并发数")
    private Integer concurrent;

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "结束时间")
    private Date endTime;

    @ApiModelProperty(value = "压测结果")
    private int conclusion;

    @ApiModelProperty(value = "压测总计时")
    private String totalTime;

    // private String features

    @ApiModelProperty(value = "压测不通过的原因")
    private String errorMsg;

    @ApiModelProperty(value = "负责人ID")
    private Long userId;

}
