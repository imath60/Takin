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

package io.shulie.tro.cloud.data.model.mysql;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_tro_user")
public class TroUserEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 登录账号
     */
    @TableField(value = "name")
    private String name;

    /**
     * 用户名称
     */
    @TableField(value = "nick")
    private String nick;

    /**
     * 用户key
     */
    @TableField(value = "key")
    private String key;

    /**
     * 盐值
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 登录密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 状态 0:启用  1： 冻结
     */
    @TableField(value = "status")
    private Boolean status;

    /**
     * 模式 0:体验模式，1:正式模式
     */
    @TableField(value = "model")
    private Boolean model;

    /**
     * 角色 0:管理员，1:体验用户 2:正式用户
     */
    @TableField(value = "role")
    private Boolean role;

    /**
     * 客户端版本号 4.2.1
     */
    @TableField(value = "version")
    private String version;

    /**
     * 状态 0: 正常 1： 删除
     */
    @TableField(value = "is_delete")
    private Boolean isDelete;

    /**
     * 创建时间
     */
    @TableField(value = "gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    @TableField(value = "gmt_update")
    private LocalDateTime gmtUpdate;
}
