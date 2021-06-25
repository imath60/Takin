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

package com.pamirs.tro.entity.dao.isolation;

import java.util.List;

import com.pamirs.tro.entity.domain.dto.TIsolationAppRegConfigDTO;
import com.pamirs.tro.entity.domain.entity.TIsolationAppRegConfig;
import com.pamirs.tro.entity.domain.vo.TIsolationAppRegConfigVO;

public interface TIsolationAppRegConfigMapper {

    List<TIsolationAppRegConfigDTO> selectListByVO(TIsolationAppRegConfigVO tIsolationAppRegConfigVO);

    int deleteByRegIds(List<Long> regIds);

    int insert(TIsolationAppRegConfig tIsolationAppRegConfig);

    TIsolationAppRegConfig selectByRegId(Long regId);

    int updateByRegId(TIsolationAppRegConfig tIsolationAppRegConfig);

}
