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

package io.shulie.tro.web.app.input.user;

import java.util.List;

import lombok.Data;

/**
 * @Author ZhangXT
 * @Description 给用户分配角色
 * @Date 2020/11/5 10:02
 */
@Data
public class UserRoleRelationCreateInput {

    /**
     * 用户ID
     */
    private List<String> userId;

    /**
     * 角色ID
     */
    private List<String> roleId;
}
