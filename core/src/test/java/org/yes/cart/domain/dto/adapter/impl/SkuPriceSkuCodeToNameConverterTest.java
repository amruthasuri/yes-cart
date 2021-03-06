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

package org.yes.cart.domain.dto.adapter.impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * User: denispavlov
 * Date: 27/02/2017
 * Time: 19:37
 */
public class SkuPriceSkuCodeToNameConverterTest {

    @Test
    public void testSlaCode() throws Exception {

        assertEquals("ABC", new SkuPriceSkuCodeToNameConverter(null).slaCode("ABC"));
        assertEquals("ABC", new SkuPriceSkuCodeToNameConverter(null).slaCode("ABC_KG"));
        assertEquals("ABC", new SkuPriceSkuCodeToNameConverter(null).slaCode("ABC_KGMAX"));
        assertEquals("ABC", new SkuPriceSkuCodeToNameConverter(null).slaCode("ABC_M3"));
        assertEquals("ABC", new SkuPriceSkuCodeToNameConverter(null).slaCode("ABC_M3MAX"));

        assertEquals("CDE", new SkuPriceSkuCodeToNameConverter(null).slaCode("CDE"));
        assertEquals("CDE", new SkuPriceSkuCodeToNameConverter(null).slaCode("CDE_KG"));
        assertEquals("CDE", new SkuPriceSkuCodeToNameConverter(null).slaCode("CDE_KGMAX"));
        assertEquals("CDE", new SkuPriceSkuCodeToNameConverter(null).slaCode("CDE_M3"));
        assertEquals("CDE", new SkuPriceSkuCodeToNameConverter(null).slaCode("CDE_M3MAX"));

    }
}