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

package io.shulie.tro.web.auth.api.exception;

import io.shulie.tro.exception.entity.ExceptionReadable;
import io.shulie.tro.exception.entity.TroException;

/**
 * @Author: fanxx
 * @Date: 2020/9/8 3:44 PM
 * @Description:
 */
public class TroAuthException extends TroException {
    public TroAuthException(ExceptionReadable ex, Object source) {
        super(ex, source);
    }
}
