/*
 * Copyright 2015-2018 Micro Focus or one of its affiliates.
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

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.hpe.caf.util.ref.ReferencedData;
import com.hpe.caf.worker.boilerplateshared.RedactionType;
import com.hpe.caf.worker.boilerplateshared.SelectedItems;
import com.hpe.caf.worker.boilerplateshared.response.BoilerplateMatch;
import com.hpe.caf.worker.testing.FileTestInputData;

import java.util.Collection;

/**
 * Created by Michael.McAlynn on 12/01/2016.
 */
public class BoilerplateTestInput extends FileTestInputData{
    private String tenantId;
    private SelectedItems expressions;
    private Multimap<String, ReferencedData> sourceData = ArrayListMultimap.create();
    private RedactionType redactionType;
    private boolean returnMatches;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public SelectedItems getExpressions() {
        return expressions;
    }

    public void setExpressions(SelectedItems expressions) {
        this.expressions = expressions;
    }

    public Multimap<String, ReferencedData> getSourceData() {
        return sourceData;
    }

    public void setSourceData(Multimap<String, ReferencedData> sourceData) {
        this.sourceData = sourceData;
    }

    public RedactionType getRedactionType() {
        return redactionType;
    }

    public void setRedactionType(RedactionType redactionType) {
        this.redactionType = redactionType;
    }

    public boolean getReturnMatches(){
        return returnMatches;
    }
    public void setReturnMatches(boolean returnMatches){
        this.returnMatches = returnMatches;
    }
}
