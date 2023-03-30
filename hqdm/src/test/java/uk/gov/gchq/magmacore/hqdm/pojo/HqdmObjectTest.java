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

package uk.gov.gchq.magmacore.hqdm.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import uk.gov.gchq.magmacore.hqdm.model.PointInTime;
import uk.gov.gchq.magmacore.hqdm.model.PossibleWorld;
import uk.gov.gchq.magmacore.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.magmacore.hqdm.model.Thing;
import uk.gov.gchq.magmacore.hqdm.model.impl.PointInTimeImpl;
import uk.gov.gchq.magmacore.hqdm.model.impl.PossibleWorldImpl;
import uk.gov.gchq.magmacore.hqdm.model.impl.SpatioTemporalExtentImpl;
import uk.gov.gchq.magmacore.hqdm.model.impl.ThingImpl;

/**
 * HqdmObject tests.
 */
public class HqdmObjectTest {

    @Test
    public void testDateTimeFormattingForTriples() {
        final PossibleWorld<String> possibleWorld = new PossibleWorldImpl<String>("World");
        final String beginDateTime = Instant.now().toString();
        final String endDate = Instant.now().toString();

        final PointInTime<String> beginEvent = new PointInTimeImpl<String>(beginDateTime);

        beginEvent.addValue("HQDM.PART_OF_POSSIBLE_WORLD", possibleWorld.getId());

        final PointInTime<String> endEvent = new PointInTimeImpl<String>(endDate);

        endEvent.addValue("HQDM.PART_OF_POSSIBLE_WORLD", possibleWorld.getId());

        final SpatioTemporalExtent<String> object1 = new SpatioTemporalExtentImpl<String>("Object1");

        object1.addValue("HQDM.BEGINNING", beginEvent.getId());
        object1.addValue("HQDM.ENDING", endEvent.getId());
        object1.addValue("HQDM.PART_OF_POSSIBLE_WORLD", possibleWorld.getId());

        Assert.assertEquals(beginDateTime, beginEvent.getId());
        Assert.assertEquals(endDate, endEvent.getId());
    }

    @Test
    public void testDeleteValueFromThing() {
        final var thing = new ThingImpl<String>("test");

        // Add a predicate and confirm it is present.
        thing.addValue("test-predicate", "test-value");
        Assert.assertTrue(thing.hasThisValue("test-predicate", "test-value"));

        // Delete a non-existent predicate and make sure the test predicate is still present.
        thing.removeValue("test-predicate-2", "test-value-2");
        Assert.assertTrue(thing.hasThisValue("test-predicate", "test-value"));

        // Delete a non-existent value for the predicate and make sure the test value is still present.
        thing.removeValue("test-predicate", "test-value-3");
        Assert.assertTrue(thing.hasThisValue("test-predicate", "test-value"));

        // Remove the test predicate and make sure it is no longer present.
        thing.removeValue("test-predicate", "test-value");
        Assert.assertFalse(thing.hasThisValue("test-predicate", "test-value"));
    }

    /**
     * Confirm that to objects with the same IDs are considered the same thing.
     */
    @Test
    public void testTwoObjectsAreEqual() {
        final Thing<String> thing1 = new ThingImpl<String>("thing1");
        thing1.addValue("test-predicate", "test-value");

        final Thing<String> thing2 = new ThingImpl<String>("thing1");
        thing2.addValue("test-predicate2", "test-value2");

        assertEquals(thing1, thing2);
    }

    /**
     * Test that a {@link Set} that contains a {@link Thing} with the same ID is found by the contains
     * method.
     */
    @Test
    public void testSetContainsHqdmObject() {
        final Thing<String> thing1 = new ThingImpl<String>("thing1");
        thing1.addValue("test-predicate", "test-value");

        final SpatioTemporalExtent<String> thing2 = new SpatioTemporalExtentImpl<String>("thing1");
        thing2.addValue("test-predicate2", "test-value2");

        final Set<Thing<String>> things = new HashSet<>();
        things.add(thing2);

        assertTrue(things.contains(thing1));
    }
}
