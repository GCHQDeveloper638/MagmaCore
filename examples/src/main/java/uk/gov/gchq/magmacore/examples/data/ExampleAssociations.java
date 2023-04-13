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

package uk.gov.gchq.magmacore.examples.data;

import static uk.gov.gchq.magmacore.examples.util.DemoUtils.USER_BASE;
import static uk.gov.gchq.magmacore.util.UID.uid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import uk.gov.gchq.magmacore.hqdm.model.ClassOfStateOfFunctionalSystem;
import uk.gov.gchq.magmacore.hqdm.model.ClassOfStateOfPerson;
import uk.gov.gchq.magmacore.hqdm.model.Event;
import uk.gov.gchq.magmacore.hqdm.model.FunctionalSystem;
import uk.gov.gchq.magmacore.hqdm.model.KindOfAssociation;
import uk.gov.gchq.magmacore.hqdm.model.Person;
import uk.gov.gchq.magmacore.hqdm.model.PossibleWorld;
import uk.gov.gchq.magmacore.hqdm.model.Role;
import uk.gov.gchq.magmacore.hqdm.model.Thing;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.RDFS;
import uk.gov.gchq.magmacore.service.MagmaCoreService;
import uk.gov.gchq.magmacore.service.transformation.DbChangeSet;
import uk.gov.gchq.magmacore.service.transformation.DbCreateOperation;

/**
 * Example associations.
 */
public class ExampleAssociations {

    /**
     * Create a person-occupies-house association.
     *
     * @param mcService
     *            {@link MagmaCoreService}.
     * @param creates
     *            {@link List} of {@link DbCreateOperation}.
     * @param possibleWorld
     *            A {@link PossibleWorld}.
     * @param person
     *            {@link Person} occupying the house.
     * @param house
     *            The house as a {@link FunctionalSystem} that is occupied.
     * @param beginning
     *            Beginning {@link Event}.
     * @param ending
     *            Ending {@link Event}.
     */
    private static void occupyHouse(final MagmaCoreService mcService, final List<DbCreateOperation> creates,
            final PossibleWorld<IRI> possibleWorld, final Person<IRI> person, final FunctionalSystem<IRI> house,
            final IRI beginning,
            final IRI ending) {

        final Map<String, Thing<IRI>> entities = mcService.findByEntityNameInTransaction(
                List.of("CLASS_OF_STATE_OF_PERSON", "STATE_OF_FUNCTIONAL_SYSTEM_DOMESTIC_PROPERTY",
                        "OCCUPIER_LOCATED_IN_PROPERTY_ROLE", "DOMESTIC_PROPERTY_THAT_IS_OCCUPIED_ROLE",
                        "OCCUPANT_LOCATED_IN_VOLUME_ENCLOSED_BY_PROPERTY_ASSOCIATION"));

        // Find the required classes, kinds, and roles.
        final ClassOfStateOfPerson<IRI> classOfStateOfPerson = (ClassOfStateOfPerson<IRI>) entities
                .get("CLASS_OF_STATE_OF_PERSON");
        final ClassOfStateOfFunctionalSystem<IRI> classOfStateOfFunctionalSystemDomesticProperty = (ClassOfStateOfFunctionalSystem<IRI>) entities
                .get("STATE_OF_FUNCTIONAL_SYSTEM_DOMESTIC_PROPERTY");
        final Role<IRI> occupierOfPropertyRole = (Role<IRI>) entities.get("OCCUPIER_LOCATED_IN_PROPERTY_ROLE");
        final Role<IRI> domesticOccupantInPropertyRole = (Role<IRI>) entities
                .get("DOMESTIC_PROPERTY_THAT_IS_OCCUPIED_ROLE");
        final KindOfAssociation<IRI> occupantInPropertyKindOfAssociation = (KindOfAssociation<IRI>) entities
                .get("OCCUPANT_LOCATED_IN_VOLUME_ENCLOSED_BY_PROPERTY_ASSOCIATION");

        // Create DbCreateOperations to create the objects and their properties.
        final IRI personState = new IRI(USER_BASE, uid());
        final IRI houseState = new IRI(USER_BASE, uid());
        final IRI personParticipant = new IRI(USER_BASE, uid());
        final IRI houseParticipant = new IRI(USER_BASE, uid());
        final IRI houseOccupiedAssociation = new IRI(USER_BASE, uid());

        // Create DbCreateOperations to create the objects and their properties.
        creates.add(new DbCreateOperation(personState, RDFS.RDF_TYPE, HQDM.STATE_OF_PERSON));
        creates.add(new DbCreateOperation(personState, HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getId()));
        creates.add(new DbCreateOperation(personState, HQDM.MEMBER_OF, classOfStateOfPerson.getId()));
        creates.add(new DbCreateOperation(personState, HQDM.TEMPORAL_PART_OF, person.getId()));
        creates.add(new DbCreateOperation(personState, HQDM.BEGINNING, beginning));
        creates.add(new DbCreateOperation(personState, HQDM.ENDING, ending));

        creates.add(new DbCreateOperation(houseState, RDFS.RDF_TYPE, HQDM.STATE_OF_FUNCTIONAL_SYSTEM));
        creates.add(new DbCreateOperation(houseState, HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getId()));
        creates.add(new DbCreateOperation(houseState, HQDM.MEMBER_OF,
                classOfStateOfFunctionalSystemDomesticProperty.getId()));
        creates.add(new DbCreateOperation(houseState, HQDM.TEMPORAL_PART_OF, house.getId()));
        creates.add(new DbCreateOperation(houseState, HQDM.BEGINNING, beginning));
        creates.add(new DbCreateOperation(houseState, HQDM.ENDING, ending));

        creates.add(new DbCreateOperation(personParticipant, RDFS.RDF_TYPE, HQDM.PARTICIPANT));
        creates.add(
                new DbCreateOperation(personParticipant, HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getId()));
        creates.add(
                new DbCreateOperation(personParticipant, HQDM.MEMBER_OF_KIND, occupierOfPropertyRole.getId()));
        creates.add(new DbCreateOperation(personParticipant, HQDM.TEMPORAL_PART_OF, personState));
        creates.add(new DbCreateOperation(personParticipant, HQDM.BEGINNING, beginning));
        creates.add(new DbCreateOperation(personParticipant, HQDM.ENDING, ending));

        creates.add(new DbCreateOperation(houseParticipant, RDFS.RDF_TYPE, HQDM.PARTICIPANT));
        creates.add(
                new DbCreateOperation(houseParticipant, HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getId()));
        creates.add(
                new DbCreateOperation(houseParticipant, HQDM.MEMBER_OF_KIND,
                        domesticOccupantInPropertyRole.getId()));
        creates.add(new DbCreateOperation(houseParticipant, HQDM.TEMPORAL_PART_OF, houseState));
        creates.add(new DbCreateOperation(houseParticipant, HQDM.BEGINNING, beginning));
        creates.add(new DbCreateOperation(houseParticipant, HQDM.ENDING, ending));

        creates.add(new DbCreateOperation(houseOccupiedAssociation, RDFS.RDF_TYPE, HQDM.ASSOCIATION));
        creates.add(
                new DbCreateOperation(houseOccupiedAssociation, HQDM.PART_OF_POSSIBLE_WORLD,
                        possibleWorld.getId()));
        creates.add(new DbCreateOperation(houseOccupiedAssociation, HQDM.MEMBER_OF_KIND,
                occupantInPropertyKindOfAssociation.getId()));
        creates.add(new DbCreateOperation(houseOccupiedAssociation, HQDM.CONSISTS_OF_PARTICIPANT, houseParticipant));
        creates.add(new DbCreateOperation(houseOccupiedAssociation, HQDM.CONSISTS_OF_PARTICIPANT, personParticipant));
        creates.add(new DbCreateOperation(houseOccupiedAssociation, HQDM.BEGINNING, beginning));
        creates.add(new DbCreateOperation(houseOccupiedAssociation, HQDM.ENDING, ending));
    }

    /**
     * Add occupancy predicates.
     *
     * @param mcService
     *            {@link MagmaCoreDatabase}
     * @return {@link MagmaCoreDatabase}
     */
    public static DbChangeSet addHouseOccupancies(final MagmaCoreService mcService) {

        final Map<String, Thing<IRI>> entities = mcService
                .findByEntityNameInTransaction(List.of("Example1_World", "PersonB1_Bob", "HouseB"));

        // Use an existing PossibleWorld
        final PossibleWorld<IRI> possibleWorld = (PossibleWorld<IRI>) entities.get("Example1_World");

        // The person occupies the house twice at different times.
        final Person<IRI> person = (Person<IRI>) entities.get("PersonB1_Bob");
        final FunctionalSystem<IRI> house = (FunctionalSystem<IRI>) entities.get("HouseB");

        // Create IRIs for the objects we want to create.
        final IRI event1 = new IRI(USER_BASE, "event1");
        final IRI event2 = new IRI(USER_BASE, "event2");
        final IRI event3 = new IRI(USER_BASE, "event3");
        final IRI event4 = new IRI(USER_BASE, "event4");

        // Create DbCreateOperations to create the objects and their properties.
        final List<DbCreateOperation> creates = new ArrayList<DbCreateOperation>();
        creates.add(new DbCreateOperation(event1, RDFS.RDF_TYPE, HQDM.EVENT));
        creates.add(new DbCreateOperation(event1, HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getId()));
        creates.add(new DbCreateOperation(event1, HQDM.ENTITY_NAME, "2020-08-15T17:50:00"));

        creates.add(new DbCreateOperation(event2, RDFS.RDF_TYPE, HQDM.EVENT));
        creates.add(new DbCreateOperation(event2, HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getId()));
        creates.add(new DbCreateOperation(event2, HQDM.ENTITY_NAME, "2020-08-15T19:21:00"));

        creates.add(new DbCreateOperation(event3, RDFS.RDF_TYPE, HQDM.EVENT));
        creates.add(new DbCreateOperation(event3, HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getId()));
        creates.add(new DbCreateOperation(event3, HQDM.ENTITY_NAME, "2020-08-16T22:33:00"));

        creates.add(new DbCreateOperation(event4, RDFS.RDF_TYPE, HQDM.EVENT));
        creates.add(new DbCreateOperation(event4, HQDM.PART_OF_POSSIBLE_WORLD, possibleWorld.getId()));
        creates.add(new DbCreateOperation(event4, HQDM.ENTITY_NAME, "2020-08-17T10:46:00"));

        // Add more DbCreateOperations to create the required associations.
        occupyHouse(mcService, creates, possibleWorld, person, house, event1, event2);
        occupyHouse(mcService, creates, possibleWorld, person, house, event3, event4);

        // Create and return a new change set.
        return new DbChangeSet(List.of(), creates);
    }
}
