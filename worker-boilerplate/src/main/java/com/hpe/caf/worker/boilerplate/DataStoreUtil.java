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

import com.hpe.caf.api.worker.DataStore;
import com.hpe.caf.api.worker.DataStoreException;
import com.hpe.caf.util.ref.ReferencedData;

/**
 */
public class DataStoreUtil {

    private DataStore dataStore;
    private String dataStoreReference;
    private int resultSizeLimit = 1000;

    public DataStoreUtil(DataStore dataStore, String dataStoreReference){
        this.dataStore = dataStore;
        this.dataStoreReference = dataStoreReference;
    }

    public DataStoreUtil(DataStore dataStore, String dataStoreReference, int resultSizeLimit){
        this.dataStore = dataStore;
        this.dataStoreReference = dataStoreReference;
        this.resultSizeLimit = resultSizeLimit;
    }

    /**
     * Either wraps or store in the data store the selected content.
     *
     * @param content the content to wrap or store.
     * @return A ReferencedData object containing either the wrapped bytes or data store reference.
     * @throws DataStoreException
     */
    public ReferencedData wrapOrStoreData(byte[] content) throws DataStoreException {
        if (content.length > resultSizeLimit) {
            return ReferencedData.getReferencedData(dataStore.store(content, dataStoreReference));
        } else {
            return ReferencedData.getWrappedData(content);
        }
    }

}