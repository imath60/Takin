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

package io.shulie.tro.web.config.sync.zk.impl;

import java.util.Comparator;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.google.common.collect.Lists;
import io.shulie.tro.web.config.entity.ShadowJob;
import io.shulie.tro.web.config.sync.api.ShadowJobSyncService;
import io.shulie.tro.web.config.sync.zk.constants.ZkConfigPathConstants;
import io.shulie.tro.web.config.sync.zk.impl.client.ZkClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/**
 * @author shiyajian
 * create: 2020-09-17
 */
@Component
public class ShadowJobSyncServiceImpl implements ShadowJobSyncService {

    @Autowired
    private ZkClient zkClient;

    @Override
    public void syncShadowJob(String namespace, String applicationName, List<ShadowJob> newShadowJobs) {
        if (newShadowJobs == null) {
            throw new RuntimeException("传入的数据为空");
        }
        String path = "/" + namespace + ZkConfigPathConstants.SHADOW_JOB_PARENT_PATH + "/" + applicationName;
        // 空数组，我们认为是清空
        if (CollectionUtils.isEmpty(newShadowJobs)) {
            zkClient.syncNode(path, JSONObject.toJSONString(Lists.newArrayList()));
            return;
        }
        // 如果新更新的和已有的一样，不更新，降低ZK压力
        String existsStr = zkClient.getNode(path);
        newShadowJobs.sort(Comparator.comparing(ShadowJob::getId));
        String newShadowJobsStr = JSON.toJSONString(newShadowJobs);
        if (newShadowJobsStr.equals(existsStr)) {
            return;
        }
        zkClient.syncNode(path, newShadowJobsStr);
    }
}
