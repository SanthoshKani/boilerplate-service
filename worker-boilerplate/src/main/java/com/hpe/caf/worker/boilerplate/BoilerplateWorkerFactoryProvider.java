/*
 * Copyright 2015-2017 EntIT Software LLC, a Micro Focus company.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hpe.caf.worker.boilerplate;

import com.hpe.caf.api.Codec;
import com.hpe.caf.api.ConfigurationSource;
import com.hpe.caf.api.worker.DataStore;
import com.hpe.caf.api.worker.WorkerException;
import com.hpe.caf.api.worker.WorkerFactory;
import com.hpe.caf.api.worker.WorkerFactoryProvider;
import com.hpe.caf.worker.boilerplateshared.BoilerplateWorkerTask;

/**
 * Created by Jason.Quinn on 04/01/2016.
 */
public class BoilerplateWorkerFactoryProvider implements WorkerFactoryProvider {
    @Override
    public WorkerFactory getWorkerFactory(ConfigurationSource configurationSource, DataStore dataStore, Codec codec) throws WorkerException {
        return new BoilerplateWorkerFactory(configurationSource, dataStore, codec, BoilerplateWorkerConfiguration.class, BoilerplateWorkerTask.class);
    }
}