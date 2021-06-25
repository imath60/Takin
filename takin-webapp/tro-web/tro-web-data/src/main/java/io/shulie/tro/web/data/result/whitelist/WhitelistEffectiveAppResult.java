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

package io.shulie.tro.web.data.result.whitelist;

import java.util.Date;

import lombok.Data;

/**
* @Package io.shulie.tro.web.data.result.whitelist
* @author 无涯
* @description:
* @date 2021/4/14 10:16 上午
*/
@Data
public class WhitelistEffectiveAppResult {
    private Long id;

    /**
     * 白名单id
     */
    private Long wlistId;
    /**
     * 接口名
     */
    private String interfaceName;

    /**
     * 类型
     */
    private String type;

    /**
     * 生效应用
     */
    private String effectiveAppName;

    /**
     * 租户id
     */
    private Long customerId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 软删
     */
    private Boolean isDeleted;

}