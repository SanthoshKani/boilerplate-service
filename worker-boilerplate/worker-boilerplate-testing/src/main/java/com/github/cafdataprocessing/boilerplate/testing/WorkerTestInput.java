/*
 * Copyright 2015-2017 Hewlett Packard Enterprise Development LP.
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
package com.github.cafdataprocessing.boilerplate.testing;

import com.hpe.caf.worker.document.DocumentWorkerTask;
import com.hpe.caf.worker.testing.FileTestInputData;

public class WorkerTestInput extends FileTestInputData
{
    private DocumentWorkerTask task;

    public WorkerTestInput() {
    }

    public DocumentWorkerTask getTask() {
        return task;
    }

    public void setTask(DocumentWorkerTask task) {
        this.task = task;
    }
}