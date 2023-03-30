/*
 * Copyright 2021 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package uk.gov.gchq.magmacore.hqdm.model.impl;

import uk.gov.gchq.magmacore.hqdm.model.ClassOfOrganization;
import uk.gov.gchq.magmacore.hqdm.pojo.HqdmObject;

/**
 * An implementation of ClassOfOrganization.
 */
public class ClassOfOrganizationImpl<T> extends HqdmObject<T> implements ClassOfOrganization<T> {
    /**
     * Constructs a new ClassOfOrganization.
     *
     * @param id String of the ClassOfOrganization.
     */
    public ClassOfOrganizationImpl(final T id) {
        super(id);
    }
}
