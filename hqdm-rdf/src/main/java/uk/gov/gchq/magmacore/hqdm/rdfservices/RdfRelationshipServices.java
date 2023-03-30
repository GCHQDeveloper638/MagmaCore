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

package uk.gov.gchq.magmacore.hqdm.rdfservices;

import uk.gov.gchq.magmacore.hqdm.model.Aggregation;
import uk.gov.gchq.magmacore.hqdm.model.Classification;
import uk.gov.gchq.magmacore.hqdm.model.Composition;
import uk.gov.gchq.magmacore.hqdm.model.DefinedRelationship;
import uk.gov.gchq.magmacore.hqdm.model.Function_;
import uk.gov.gchq.magmacore.hqdm.model.Relationship;
import uk.gov.gchq.magmacore.hqdm.model.Scale;
import uk.gov.gchq.magmacore.hqdm.model.Specialization;
import uk.gov.gchq.magmacore.hqdm.model.TemporalComposition;
import uk.gov.gchq.magmacore.hqdm.model.UnitOfMeasure;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.RDFS;
import uk.gov.gchq.magmacore.hqdm.services.RelationshipServices;

/**
 * Service for creating HQDM Relationships.
 */
public class RdfRelationshipServices {
    /**
     * Create a {@link Specialization} with an IRI.
     *
     * @param id ID of the Specialization.
     * @return A Specialization instance.
     */
    public static Specialization<IRI> createSpecialization(final IRI id) {
        final Specialization<IRI> result = RelationshipServices.createSpecialization(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SPECIALIZATION);
        return result;
    }

    /**
     * Create a {@link Scale} with an IRI.
     *
     * @param id ID of the Scale.
     * @return A Scale instance.
     */
    public static Scale<IRI> createScale(final IRI id) {
        final Scale<IRI> result = RelationshipServices.createScale(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SCALE);
        return result;
    }

    /**
     * Create a {@link UnitOfMeasure} with an IRI.
     *
     * @param id ID of the UnitOfMeasure.
     * @return A UnitOfMeasure instance.
     */
    public static UnitOfMeasure<IRI> createUnitOfMeasure(final IRI id) {
        final UnitOfMeasure<IRI> result = RelationshipServices.createUnitOfMeasure(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.UNIT_OF_MEASURE);
        return result;
    }

    /**
     * Create a {@link Function_} with an IRI.
     *
     * @param id ID of the Function_.
     * @return A Function_ instance.
     */
    public static Function_<IRI> createFunction(final IRI id) {
        final Function_<IRI> result = RelationshipServices.createFunction(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.FUNCTION_);
        return result;
    }

    /**
     * Create a {@link Classification} with an IRI.
     *
     * @param id ID of the Classification.
     * @return A Classification instance.
     */
    public static Classification<IRI> createClassification(final IRI id) {
        final Classification<IRI> result = RelationshipServices.createClassification(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASSIFICATION);
        return result;
    }

    /**
     * Create a {@link TemporalComposition} with an IRI.
     *
     * @param id ID of the TemporalComposition.
     * @return A TemporalComposition instance.
     */
    public static TemporalComposition<IRI> createTemporalComposition(final IRI id) {
        final TemporalComposition<IRI> result = RelationshipServices.createTemporalComposition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.TEMPORAL_COMPOSITION);
        return result;
    }

    /**
     * Create a {@link Composition} with an IRI.
     *
     * @param id ID of the Composition.
     * @return A Composition instance.
     */
    public static Composition<IRI> createComposition(final IRI id) {
        final Composition<IRI> result = RelationshipServices.createComposition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.COMPOSITION);
        return result;
    }

    /**
     * Create a {@link Aggregation} with an IRI.
     *
     * @param id ID of the Aggregation.
     * @return A Aggregation instance.
     */
    public static Aggregation<IRI> createAggregation(final IRI id) {
        final Aggregation<IRI> result = RelationshipServices.createAggregation(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.AGGREGATION);
        return result;
    }

    /**
     * Create a {@link Relationship} with an IRI.
     *
     * @param id ID of the Relationship.
     * @return A Relationship instance.
     */
    public static Relationship<IRI> createRelationship(final IRI id) {
        final Relationship<IRI> result = RelationshipServices.createRelationship(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.RELATIONSHIP);
        return result;
    }

    /**
     * Create a {@link DefinedRelationship} with an IRI.
     *
     * @param id ID of the DefinedRelationship.
     * @return A DefinedRelationship instance.
     */
    public static DefinedRelationship<IRI> createDefinedRelationship(final IRI id) {
        final DefinedRelationship<IRI> result = RelationshipServices.createDefinedRelationship(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.DEFINED_RELATIONSHIP);
        return result;
    }
}
