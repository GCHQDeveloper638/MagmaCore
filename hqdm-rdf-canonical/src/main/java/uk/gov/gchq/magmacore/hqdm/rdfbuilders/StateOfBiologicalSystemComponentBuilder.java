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

package uk.gov.gchq.magmacore.hqdm.rdfbuilders;

import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.AGGREGATED_INTO;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.BEGINNING;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.CONSISTS__OF;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.ENDING;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.MEMBER_OF;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.MEMBER__OF;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.PART_OF_POSSIBLE_WORLD;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.PART__OF;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.TEMPORAL_PART_OF;
import static uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM.TEMPORAL__PART_OF;

import uk.gov.gchq.magmacore.hqdm.exception.HqdmException;
import uk.gov.gchq.magmacore.hqdm.model.BiologicalSystemComponent;
import uk.gov.gchq.magmacore.hqdm.model.Class;
import uk.gov.gchq.magmacore.hqdm.model.ClassOfStateOfBiologicalSystemComponent;
import uk.gov.gchq.magmacore.hqdm.model.Event;
import uk.gov.gchq.magmacore.hqdm.model.PossibleWorld;
import uk.gov.gchq.magmacore.hqdm.model.SpatioTemporalExtent;
import uk.gov.gchq.magmacore.hqdm.model.StateOfBiologicalSystemComponent;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI;
import uk.gov.gchq.magmacore.hqdm.rdfservices.RdfSpatioTemporalExtentServices;

/**
 * Builder for constructing instances of StateOfBiologicalSystemComponent.
 */
public class StateOfBiologicalSystemComponentBuilder {

    private final StateOfBiologicalSystemComponent stateOfBiologicalSystemComponent;

    /**
     * Constructs a Builder for a new StateOfBiologicalSystemComponent.
     *
     * @param iri IRI of the StateOfBiologicalSystemComponent.
     */
    public StateOfBiologicalSystemComponentBuilder(final IRI iri) {
        stateOfBiologicalSystemComponent = RdfSpatioTemporalExtentServices
                .createStateOfBiologicalSystemComponent(iri.getIri());
    }

    /**
     * A relationship type where a {@link SpatioTemporalExtent} may be aggregated into one or more
     * others.
     * <p>
     * Note: This has the same meaning as, but different representation to, the
     * {@link uk.gov.gchq.magmacore.hqdm.model.Aggregation} entity type.
     * </p>
     *
     * @param spatioTemporalExtent The SpatioTemporalExtent.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder aggregated_Into(
            final SpatioTemporalExtent spatioTemporalExtent) {
        stateOfBiologicalSystemComponent.addValue(AGGREGATED_INTO,
                new IRI(spatioTemporalExtent.getId()));
        return this;
    }

    /**
     * A {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#PART_OF} relationship type where a
     * {@link SpatioTemporalExtent} has exactly one {@link Event} that is its beginning.
     *
     * @param event The Event.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder beginning(final Event event) {
        stateOfBiologicalSystemComponent.addValue(BEGINNING, new IRI(event.getId()));
        return this;
    }

    /**
     * A relationship type where a {@link SpatioTemporalExtent} may consist of one or more others.
     *
     * <p>
     * Note: This is the inverse of {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#PART__OF}.
     * </p>
     *
     * @param spatioTemporalExtent The SpatioTemporalExtent.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder consists__Of(final SpatioTemporalExtent spatioTemporalExtent) {
        stateOfBiologicalSystemComponent.addValue(CONSISTS__OF,
                new IRI(spatioTemporalExtent.getId()));
        return this;
    }

    /**
     * A {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#PART_OF} relationship type where a
     * {@link SpatioTemporalExtent} has exactly one {@link Event} that is its ending.
     *
     * @param event The Event.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder ending(final Event event) {
        stateOfBiologicalSystemComponent.addValue(ENDING, new IRI(event.getId()));
        return this;
    }

    /**
     * A relationship type where a {@link uk.gov.gchq.magmacore.hqdm.model.Thing} may be a member of one
     * or more {@link Class}.
     *
     * @param clazz The Class.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder member__Of(final Class clazz) {
        stateOfBiologicalSystemComponent.addValue(MEMBER__OF, new IRI(clazz.getId()));
        return this;
    }

    /**
     * A {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#MEMBER_OF} relationship type where a
     * {@link StateOfBiologicalSystemComponent} may be a
     * {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#MEMBER_OF} one or more
     * {@link ClassOfStateOfBiologicalSystemComponent}.
     *
     * @param classOfStateOfBiologicalSystemComponent The classOfStateOfBiologicalSystemComponent.
     * @return This builder.
     */
    @SuppressWarnings("LineLength")
    public final StateOfBiologicalSystemComponentBuilder member_Of(
            final ClassOfStateOfBiologicalSystemComponent classOfStateOfBiologicalSystemComponent) {
        stateOfBiologicalSystemComponent.addValue(MEMBER_OF,
                new IRI(classOfStateOfBiologicalSystemComponent.getId()));
        return this;
    }

    /**
     * An {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#AGGREGATED_INTO} relationship type where a
     * {@link SpatioTemporalExtent} may be part of another and the whole has emergent properties and is
     * more than just the sum of its parts.
     *
     * @param spatioTemporalExtent The SpatioTemporalExtent.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder part__Of(final SpatioTemporalExtent spatioTemporalExtent) {
        stateOfBiologicalSystemComponent.addValue(PART__OF, new IRI(spatioTemporalExtent.getId()));
        return this;
    }

    /**
     * A {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#PART_OF} relationship type where a
     * {@link SpatioTemporalExtent} may be {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#PART_OF}
     * one or more {@link PossibleWorld}.
     *
     * <p>
     * Note: The relationship is optional because a {@link PossibleWorld} is not
     * {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#PART_OF} any other
     * {@link SpatioTemporalExtent}.
     * </p>
     *
     * @param possibleWorld The PossibleWorld.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder part_Of_Possible_World_M(final PossibleWorld possibleWorld) {
        stateOfBiologicalSystemComponent.addValue(PART_OF_POSSIBLE_WORLD,
                new IRI(possibleWorld.getId()));
        return this;
    }

    /**
     * A {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#PART_OF} relationship type where a
     * {@link SpatioTemporalExtent} may be a temporal part of one or more other
     * {@link SpatioTemporalExtent}.
     *
     * @param spatioTemporalExtent The SpatioTemporalExtent.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder temporal__Part_Of(
            final SpatioTemporalExtent spatioTemporalExtent) {
        stateOfBiologicalSystemComponent.addValue(TEMPORAL__PART_OF,
                new IRI(spatioTemporalExtent.getId()));
        return this;
    }

    /**
     * A {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#TEMPORAL_PART_OF} relationship type where a
     * {@link StateOfBiologicalSystemComponent} may be a
     * {@link uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI.HQDM#TEMPORAL_PART_OF} one or more
     * {@link BiologicalSystemComponent}.
     *
     * @param biologicalSystemComponent The BiologicalSystemComponent.
     * @return This builder.
     */
    public final StateOfBiologicalSystemComponentBuilder temporal_Part_Of(
            final BiologicalSystemComponent biologicalSystemComponent) {
        stateOfBiologicalSystemComponent.addValue(TEMPORAL_PART_OF,
                new IRI(biologicalSystemComponent.getId()));
        return this;
    }

    /**
     * Returns an instance of StateOfBiologicalSystemComponent created from the properties set on this
     * builder.
     *
     * @return The built StateOfBiologicalSystemComponent.
     * @throws HqdmException If the StateOfBiologicalSystemComponent is missing any mandatory
     *                       properties.
     */
    public StateOfBiologicalSystemComponent build() throws HqdmException {
        if (stateOfBiologicalSystemComponent.hasValue(AGGREGATED_INTO)
                && stateOfBiologicalSystemComponent.value(AGGREGATED_INTO).isEmpty()) {
            throw new HqdmException("Property Not Set: aggregated_into");
        }
        if (stateOfBiologicalSystemComponent.hasValue(BEGINNING)
                && stateOfBiologicalSystemComponent.value(BEGINNING).isEmpty()) {
            throw new HqdmException("Property Not Set: beginning");
        }
        if (stateOfBiologicalSystemComponent.hasValue(ENDING)
                && stateOfBiologicalSystemComponent.value(ENDING).isEmpty()) {
            throw new HqdmException("Property Not Set: ending");
        }
        if (stateOfBiologicalSystemComponent.hasValue(MEMBER__OF)
                && stateOfBiologicalSystemComponent.value(MEMBER__OF).isEmpty()) {
            throw new HqdmException("Property Not Set: member__of");
        }
        if (stateOfBiologicalSystemComponent.hasValue(MEMBER_OF)
                && stateOfBiologicalSystemComponent.value(MEMBER_OF).isEmpty()) {
            throw new HqdmException("Property Not Set: member_of");
        }
        if (stateOfBiologicalSystemComponent.hasValue(PART__OF)
                && stateOfBiologicalSystemComponent.value(PART__OF).isEmpty()) {
            throw new HqdmException("Property Not Set: part__of");
        }
        if (!stateOfBiologicalSystemComponent.hasValue(PART_OF_POSSIBLE_WORLD)) {
            throw new HqdmException("Property Not Set: part_of_possible_world");
        }
        if (stateOfBiologicalSystemComponent.hasValue(TEMPORAL__PART_OF)
                && stateOfBiologicalSystemComponent.value(TEMPORAL__PART_OF).isEmpty()) {
            throw new HqdmException("Property Not Set: temporal__part_of");
        }
        if (stateOfBiologicalSystemComponent.hasValue(TEMPORAL_PART_OF)
                && stateOfBiologicalSystemComponent.value(TEMPORAL_PART_OF).isEmpty()) {
            throw new HqdmException("Property Not Set: temporal_part_of");
        }
        return stateOfBiologicalSystemComponent;
    }
}