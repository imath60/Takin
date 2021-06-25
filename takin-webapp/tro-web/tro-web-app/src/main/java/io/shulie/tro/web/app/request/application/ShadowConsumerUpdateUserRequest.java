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

package io.shulie.tro.web.app.request.application;

import lombok.Data;

/**
 * @Author: fanxx
 * @Date: 2021/2/19 11:33 上午
 * @Description:
 */
@Data
public class ShadowConsumerUpdateUserRequest {
    private Long applicationId;
    private Long userId;

    public ShadowConsumerUpdateUserRequest() {
    }

    public ShadowConsumerUpdateUserRequest(Long applicationId, Long userId) {
        this.applicationId = applicationId;
        this.userId = userId;
    }
}
