/*
 * Copyright 2009 Denys Pavlov, Igor Azarnyi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.yes.cart.domain.vo;

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

import java.time.Instant;

/**
 * User: denispavlov
 * Date: 21/03/2018
 * Time: 22:52
 */
@Dto
public class VoModule {

    @DtoField(readOnly = true)
    private String functionalArea;
    @DtoField(readOnly = true)
    private String name;
    @DtoField(readOnly = true)
    private String subName;
    @DtoField(readOnly = true)
    private Instant loaded;

    public String getFunctionalArea() {
        return functionalArea;
    }

    public void setFunctionalArea(final String functionalArea) {
        this.functionalArea = functionalArea;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(final String subName) {
        this.subName = subName;
    }

    public Instant getLoaded() {
        return loaded;
    }

    public void setLoaded(final Instant loaded) {
        this.loaded = loaded;
    }
}
