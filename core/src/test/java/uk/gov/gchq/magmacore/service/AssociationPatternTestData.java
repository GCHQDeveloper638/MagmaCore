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

package uk.gov.gchq.magmacore.service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import uk.gov.gchq.magmacore.database.MagmaCoreDatabase;
import uk.gov.gchq.magmacore.hqdm.model.Association;
import uk.gov.gchq.magmacore.hqdm.model.FunctionalSystem;
import uk.gov.gchq.magmacore.hqdm.model.KindOfAssociation;
import uk.gov.gchq.magmacore.hqdm.model.Pattern;
import uk.gov.gchq.magmacore.hqdm.model.Person;
import uk.gov.gchq.magmacore.hqdm.model.PointInTime;
import uk.gov.gchq.magmacore.hqdm.model.RecognizingLanguageCommunity;
import uk.gov.gchq.magmacore.hqdm.model.RepresentationByPattern;
import uk.gov.gchq.magmacore.hqdm.model.RepresentationBySign;
import uk.gov.gchq.magmacore.hqdm.model.Role;
import uk.gov.gchq.magmacore.hqdm.model.Sign;
import uk.gov.gchq.magmacore.hqdm.model.StateOfFunctionalSystem;
import uk.gov.gchq.magmacore.hqdm.model.StateOfPerson;
import uk.gov.gchq.magmacore.hqdm.model.StateOfSign;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.IriBase;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.RDFS;
import uk.gov.gchq.magmacore.hqdm.rdfservices.RdfClassServices;
import uk.gov.gchq.magmacore.hqdm.rdfservices.RdfSpatioTemporalExtentServices;
import uk.gov.gchq.magmacore.util.UID;

/**
 * Data for unit tests.
 */
public class AssociationPatternTestData {

    static final IriBase TEST_BASE = new IriBase("test", "http://example.com/test#");
    static KindOfAssociation<IRI> userAssociationKind;
    static IRI userAssociationKindIri;
    static IRI possibleWorldIri;
    static Person<IRI> person1;
    static Person<IRI> person2;
    static FunctionalSystem<IRI> system1;
    static FunctionalSystem<IRI> system2;
    static IRI userRoleIri;
    static Role<IRI> userRole;
    static IRI systemRoleIri;
    static Role<IRI> systemRole;
    static StateOfPerson<IRI> person1State1;
    static StateOfFunctionalSystem<IRI> system1State1;
    static StateOfPerson<IRI> person2State1;
    static StateOfFunctionalSystem<IRI> system2State1;
    static StateOfPerson<IRI> person1State2;
    static StateOfPerson<IRI> person2State2;
    static StateOfPerson<IRI> person2State3;
    static StateOfPerson<IRI> person3State1;

    /**
     * Create some Associations for the test.
     *
     * @param db A {@link MagmaCoreDatabase}.
     */
    static void createAssociationPattern(final MagmaCoreDatabase db) {
        // Create PossibleWorlds IRI.
        possibleWorldIri = new IRI(TEST_BASE, UID.uid());

        // Create KindOfAssociation objects
        userAssociationKindIri = new IRI(TEST_BASE, "userOfSystemKindOfAssociation");
        userAssociationKind = RdfClassServices.createKindOfAssociation(userAssociationKindIri);
        userAssociationKind.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ASSOCIATION);
        userAssociationKind.addValue(HQDM.ENTITY_NAME, "userOfSystemKindOfAssociation");

        final IRI managerKindIri = new IRI(TEST_BASE, "managerKindOfAssociation");
        final KindOfAssociation<IRI> managerKind = RdfClassServices.createKindOfAssociation(managerKindIri);
        managerKind.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ASSOCIATION);
        managerKind.addValue(HQDM.ENTITY_NAME, "managerKindOfAssociation");

        // Create Roles
        userRoleIri = new IRI(TEST_BASE, "userRole");
        userRole = RdfClassServices.createRole(userRoleIri);
        userRole.addValue(RDFS.RDF_TYPE, HQDM.ROLE);
        userRole.addValue(HQDM.ENTITY_NAME, "userRole");
        userRole.addValue(HQDM.PART_OF_BY_CLASS_, userAssociationKindIri);

        systemRoleIri = new IRI(TEST_BASE, "systemRole");
        systemRole = RdfClassServices.createRole(systemRoleIri);
        systemRole.addValue(RDFS.RDF_TYPE, HQDM.ROLE);
        systemRole.addValue(HQDM.ENTITY_NAME, "systemRole");
        systemRole.addValue(HQDM.PART_OF_BY_CLASS_, userAssociationKindIri);

        final IRI managerRoleIri = new IRI(TEST_BASE, "managerRole");
        final Role<IRI> managerRole = RdfClassServices.createRole(managerRoleIri);
        managerRole.addValue(RDFS.RDF_TYPE, HQDM.ROLE);
        managerRole.addValue(HQDM.ENTITY_NAME, "managerRole");
        managerRole.addValue(HQDM.PART_OF_BY_CLASS_, managerKindIri);

        final IRI workerRoleIri = new IRI(TEST_BASE, "workerRole");
        final Role<IRI> workerRole = RdfClassServices.createRole(workerRoleIri);
        workerRole.addValue(RDFS.RDF_TYPE, HQDM.ROLE);
        workerRole.addValue(HQDM.ENTITY_NAME, "workerRole");
        workerRole.addValue(HQDM.PART_OF_BY_CLASS_, managerKindIri);

        // Create People
        final IRI person1Iri = new IRI(TEST_BASE, "person1");
        person1 = RdfSpatioTemporalExtentServices.createPerson(person1Iri);
        person1.addValue(RDFS.RDF_TYPE, HQDM.PERSON);
        person1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        final IRI person2Iri = new IRI(TEST_BASE, "person2");
        person2 = RdfSpatioTemporalExtentServices.createPerson(person2Iri);
        person2.addValue(RDFS.RDF_TYPE, HQDM.PERSON);
        person2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        final IRI person3Iri = new IRI(TEST_BASE, "person3");
        final Person<IRI> person3 = RdfSpatioTemporalExtentServices.createPerson(person3Iri);
        person3.addValue(RDFS.RDF_TYPE, HQDM.PERSON);
        person3.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        // Create Systems
        final IRI system1Iri = new IRI(TEST_BASE, "system1");
        final IRI system2Iri = new IRI(TEST_BASE, "system2");
        system1 = RdfSpatioTemporalExtentServices.createFunctionalSystem(system1Iri);
        system2 = RdfSpatioTemporalExtentServices.createFunctionalSystem(system2Iri);
        system1.addValue(RDFS.RDF_TYPE, HQDM.FUNCTIONAL_SYSTEM);
        system1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        system2.addValue(RDFS.RDF_TYPE, HQDM.FUNCTIONAL_SYSTEM);
        system2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        // Create Events for the BEGINNING and ENDING of the Associations.
        final PointInTime<IRI> begin = RdfSpatioTemporalExtentServices.createPointInTime(new IRI(TEST_BASE, "begin"));
        final PointInTime<IRI> end = RdfSpatioTemporalExtentServices.createPointInTime(new IRI(TEST_BASE, "end"));

        begin.addValue(RDFS.RDF_TYPE, HQDM.POINT_IN_TIME);
        begin.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        end.addValue(RDFS.RDF_TYPE, HQDM.POINT_IN_TIME);
        end.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        begin.addStringValue(HQDM.ENTITY_NAME, LocalDateTime.now().minusDays(1L).toInstant(ZoneOffset.UTC).toString());
        end.addStringValue(HQDM.ENTITY_NAME, LocalDateTime.now().plusDays(1L).toInstant(ZoneOffset.UTC).toString());

        final IRI beginIri = begin.getId();
        final IRI endIri = end.getId();

        // Create associations of the right Kinds.
        final IRI person1UserOfSystem1Iri = new IRI(TEST_BASE, "person1UserOfSystem1");
        final IRI person2UserOfSystem2Iri = new IRI(TEST_BASE, "person2UserOfSystem2");
        final IRI person1WorkerForPerson2Iri = new IRI(TEST_BASE, "person1WorkerForPerson2");
        final IRI person2WorkerForPerson3Iri = new IRI(TEST_BASE, "person2WorkerForPerson3");

        final Association<IRI> person1UserOfSystem1 = RdfSpatioTemporalExtentServices
                .createAssociation(person1UserOfSystem1Iri);
        final Association<IRI> person2UserOfSystem2 = RdfSpatioTemporalExtentServices
                .createAssociation(person2UserOfSystem2Iri);
        final Association<IRI> person1WorkerForPerson2 = RdfSpatioTemporalExtentServices
                .createAssociation(person1WorkerForPerson2Iri);
        final Association<IRI> person2WorkerForPerson3 = RdfSpatioTemporalExtentServices
                .createAssociation(person2WorkerForPerson3Iri);

        person1UserOfSystem1.addValue(RDFS.RDF_TYPE, HQDM.ASSOCIATION);
        person1UserOfSystem1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        person2UserOfSystem2.addValue(RDFS.RDF_TYPE, HQDM.ASSOCIATION);
        person2UserOfSystem2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        person1WorkerForPerson2.addValue(RDFS.RDF_TYPE, HQDM.ASSOCIATION);
        person1WorkerForPerson2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        person2WorkerForPerson3.addValue(RDFS.RDF_TYPE, HQDM.ASSOCIATION);
        person2WorkerForPerson3.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        person1UserOfSystem1.addValue(HQDM.MEMBER_OF_KIND, userAssociationKindIri);
        person2UserOfSystem2.addValue(HQDM.MEMBER_OF_KIND, userAssociationKindIri);
        person1WorkerForPerson2.addValue(HQDM.MEMBER_OF_KIND, managerKindIri);
        person2WorkerForPerson3.addValue(HQDM.MEMBER_OF_KIND, managerKindIri);

        person1UserOfSystem1.addValue(HQDM.BEGINNING, beginIri);
        person2UserOfSystem2.addValue(HQDM.BEGINNING, beginIri);
        person1WorkerForPerson2.addValue(HQDM.BEGINNING, beginIri);
        person2WorkerForPerson3.addValue(HQDM.BEGINNING, beginIri);

        person1UserOfSystem1.addValue(HQDM.ENDING, endIri);
        person2UserOfSystem2.addValue(HQDM.ENDING, endIri);
        person1WorkerForPerson2.addValue(HQDM.ENDING, endIri);
        person2WorkerForPerson3.addValue(HQDM.ENDING, endIri);

        final IRI person1State1Iri = new IRI(TEST_BASE, "person1State1");
        person1State1 = RdfSpatioTemporalExtentServices.createStateOfPerson(person1State1Iri);
        person1State1.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PERSON);
        person1State1.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        person1State1.addValue(HQDM.TEMPORAL_PART_OF, person1Iri);
        person1State1.addValue(HQDM.MEMBER_OF_KIND, userRoleIri);
        person1State1.addValue(HQDM.PARTICIPANT_IN, person1UserOfSystem1Iri);
        person1State1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        system1State1 = RdfSpatioTemporalExtentServices
                .createStateOfFunctionalSystem(new IRI(TEST_BASE, "system1State1"));
        system1State1.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_FUNCTIONAL_SYSTEM);
        system1State1.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        system1State1.addValue(HQDM.TEMPORAL_PART_OF, system1Iri);
        system1State1.addValue(HQDM.MEMBER_OF_KIND, systemRoleIri);
        system1State1.addValue(HQDM.PARTICIPANT_IN, person1UserOfSystem1Iri);
        system1State1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        final IRI person2State1Iri = new IRI(TEST_BASE, "person2State1");
        person2State1 = RdfSpatioTemporalExtentServices.createStateOfPerson(person2State1Iri);
        person2State1.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PERSON);
        person2State1.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        person2State1.addValue(HQDM.TEMPORAL_PART_OF, person2Iri);
        person2State1.addValue(HQDM.MEMBER_OF_KIND, userRoleIri);
        person2State1.addValue(HQDM.PARTICIPANT_IN, person2UserOfSystem2Iri);
        person2State1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        system2State1 = RdfSpatioTemporalExtentServices
                .createStateOfFunctionalSystem(new IRI(TEST_BASE, "system2State1"));
        system2State1.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_FUNCTIONAL_SYSTEM);
        system2State1.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        system2State1.addValue(HQDM.TEMPORAL_PART_OF, system2Iri);
        system2State1.addValue(HQDM.MEMBER_OF_KIND, systemRoleIri);
        system2State1.addValue(HQDM.PARTICIPANT_IN, person2UserOfSystem2Iri);
        system2State1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        person1State2 = RdfSpatioTemporalExtentServices.createStateOfPerson(new IRI(TEST_BASE, "person1State2"));
        person1State2.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PERSON);
        person1State2.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        person1State2.addValue(HQDM.TEMPORAL_PART_OF, person1Iri);
        person1State2.addValue(HQDM.MEMBER_OF_KIND, workerRoleIri);
        person1State2.addValue(HQDM.PARTICIPANT_IN, person1WorkerForPerson2Iri);
        person1State2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        person2State2 = RdfSpatioTemporalExtentServices.createStateOfPerson(new IRI(TEST_BASE, "person2State2"));
        person2State2.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PERSON);
        person2State2.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        person2State2.addValue(HQDM.TEMPORAL_PART_OF, person2Iri);
        person2State2.addValue(HQDM.MEMBER_OF_KIND, managerRoleIri);
        person2State2.addValue(HQDM.PARTICIPANT_IN, person1WorkerForPerson2Iri);
        person2State2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        person2State3 = RdfSpatioTemporalExtentServices.createStateOfPerson(new IRI(TEST_BASE, "person2State3"));
        person2State3.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PERSON);
        person2State3.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        person2State3.addValue(HQDM.TEMPORAL_PART_OF, person2Iri);
        person2State3.addValue(HQDM.MEMBER_OF_KIND, workerRoleIri);
        person2State3.addValue(HQDM.PARTICIPANT_IN, person2WorkerForPerson3Iri);
        person2State3.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        person3State1 = RdfSpatioTemporalExtentServices.createStateOfPerson(new IRI(TEST_BASE, "person3State1"));
        person3State1.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PERSON);
        person3State1.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        person3State1.addValue(HQDM.TEMPORAL_PART_OF, person3Iri);
        person3State1.addValue(HQDM.MEMBER_OF_KIND, managerRoleIri);
        person3State1.addValue(HQDM.PARTICIPANT_IN, person2WorkerForPerson3Iri);
        person3State1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        // Add signs to name the people, re-using person states for brevity.
        final IRI patternIri = new IRI(TEST_BASE, UID.uid());
        final Pattern<IRI> pattern = RdfClassServices.createPattern(patternIri);
        pattern.addValue(RDFS.RDF_TYPE, HQDM.PATTERN);
        pattern.addValue(HQDM.ENTITY_NAME, "pattern");

        final IRI repByPatternIri = new IRI(TEST_BASE, UID.uid());
        final RepresentationByPattern<IRI> repByPattern = RdfClassServices
                .createRepresentationByPattern(repByPatternIri);
        repByPattern.addValue(RDFS.RDF_TYPE, HQDM.REPRESENTATION_BY_PATTERN);
        repByPattern.addValue(HQDM.CONSISTS_OF_BY_CLASS, patternIri);

        final IRI communityIri = new IRI(TEST_BASE, UID.uid());
        final RecognizingLanguageCommunity<IRI> community = RdfSpatioTemporalExtentServices
                .createRecognizingLanguageCommunity(communityIri);
        community.addValue(RDFS.RDF_TYPE, HQDM.RECOGNIZING_LANGUAGE_COMMUNITY);
        community.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        repByPattern.addValue(HQDM.CONSISTS_OF_IN_MEMBERS, communityIri);

        // Represent person1State1 using sign1
        final IRI sign1Iri = new IRI(TEST_BASE, UID.uid());
        final Sign<IRI> sign1 = RdfSpatioTemporalExtentServices.createSign(sign1Iri);
        sign1.addValue(RDFS.RDF_TYPE, HQDM.SIGN);
        sign1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        sign1.addValue(HQDM.MEMBER_OF_, patternIri);
        sign1.addValue(HQDM.VALUE_, "sign1Value");

        final IRI stateOfSign1Iri = new IRI(TEST_BASE, UID.uid());
        final StateOfSign<IRI> stateOfSign1 = RdfSpatioTemporalExtentServices.createStateOfSign(stateOfSign1Iri);
        stateOfSign1.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_SIGN);
        stateOfSign1.addValue(HQDM.TEMPORAL_PART_OF, sign1Iri);
        stateOfSign1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        final IRI repBySign1Iri = new IRI(TEST_BASE, UID.uid());
        final RepresentationBySign<IRI> repBySign1 = RdfSpatioTemporalExtentServices
                .createRepresentationBySign(repBySign1Iri);
        repBySign1.addValue(RDFS.RDF_TYPE, HQDM.REPRESENTATION_BY_SIGN);
        repBySign1.addValue(HQDM.REPRESENTS, person1State1Iri);
        repBySign1.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        repBySign1.addValue(HQDM.CONSISTS_OF, stateOfSign1Iri);
        repBySign1.addValue(HQDM.MEMBER_OF_, repByPatternIri);
        repBySign1.addValue(HQDM.CONSISTS_OF_, communityIri);
        stateOfSign1.addValue(HQDM.PARTICIPANT_IN, repBySign1Iri);
        community.addValue(HQDM.PARTICIPANT_IN, repBySign1Iri);

        // Represent person2State1 using sign2
        final IRI sign2Iri = new IRI(TEST_BASE, UID.uid());
        final Sign<IRI> sign2 = RdfSpatioTemporalExtentServices.createSign(sign2Iri);
        sign2.addValue(RDFS.RDF_TYPE, HQDM.SIGN);
        sign2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        sign2.addValue(HQDM.MEMBER_OF_, patternIri);
        sign2.addValue(HQDM.VALUE_, "sign2Value");

        final IRI stateOfSign2Iri = new IRI(TEST_BASE, UID.uid());
        final StateOfSign<IRI> stateOfSign2 = RdfSpatioTemporalExtentServices.createStateOfSign(stateOfSign2Iri);
        stateOfSign2.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_SIGN);
        stateOfSign2.addValue(HQDM.TEMPORAL_PART_OF, sign2Iri);
        stateOfSign2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);

        final IRI repBySign2Iri = new IRI(TEST_BASE, UID.uid());
        final RepresentationBySign<IRI> repBySign2 = RdfSpatioTemporalExtentServices
                .createRepresentationBySign(repBySign2Iri);
        repBySign2.addValue(RDFS.RDF_TYPE, HQDM.REPRESENTATION_BY_SIGN);
        repBySign2.addValue(HQDM.REPRESENTS, person2State1Iri);
        repBySign2.addValue(HQDM.PART_OF_POSSIBLE_WORLD, possibleWorldIri);
        repBySign2.addValue(HQDM.CONSISTS_OF, stateOfSign2Iri);
        repBySign2.addValue(HQDM.MEMBER_OF_, repByPatternIri);
        repBySign2.addValue(HQDM.CONSISTS_OF_, communityIri);
        stateOfSign2.addValue(HQDM.PARTICIPANT_IN, repBySign2Iri);
        community.addValue(HQDM.PARTICIPANT_IN, repBySign2Iri);

        // Persist all objects
        db.begin();

        db.create(userAssociationKind);
        db.create(managerKind);
        db.create(userRole);
        db.create(systemRole);
        db.create(managerRole);
        db.create(workerRole);
        db.create(person1);
        db.create(person2);
        db.create(person3);
        db.create(system1);
        db.create(system2);
        db.create(begin);
        db.create(end);
        db.create(person1UserOfSystem1);
        db.create(person2UserOfSystem2);
        db.create(person1WorkerForPerson2);
        db.create(person2WorkerForPerson3);
        db.create(person1State1);
        db.create(person1State2);
        db.create(person2State1);
        db.create(person2State2);
        db.create(person2State3);
        db.create(person3State1);
        db.create(system1State1);
        db.create(system2State1);

        db.create(sign1);
        db.create(stateOfSign1);
        db.create(pattern);
        db.create(community);
        db.create(repByPattern);
        db.create(repBySign1);

        db.create(sign2);
        db.create(stateOfSign2);
        db.create(repBySign2);

        db.commit();
    }
}
