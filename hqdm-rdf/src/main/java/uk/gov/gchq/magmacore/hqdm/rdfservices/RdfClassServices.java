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

import uk.gov.gchq.magmacore.hqdm.model.*;
import uk.gov.gchq.magmacore.hqdm.model.Class;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.RDFS;
import uk.gov.gchq.magmacore.hqdm.services.ClassServices;

/**
 * Service for creating HQDM Classes.
 */
public class RdfClassServices {
    /**
     * Create a {@link Class} with an IRI.
     *
     * @param id
     *            ID of the Class.
     * @return A Class instance.
     */
    public static Class<IRI> createClass(final IRI id) {
        final Class<IRI> result = ClassServices.createClass(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS);
        return result;
    }

    /**
     * Create a {@link ClassOfAbstractObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfAbstractObject.
     * @return A ClassOfAbstractObject instance.
     */
    public static ClassOfAbstractObject<IRI> createClassOfAbstractObject(final IRI id) {
        final ClassOfAbstractObject<IRI> result = ClassServices.createClassOfAbstractObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_ABSTRACT_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfActivity} with an IRI.
     *
     * @param id
     *            ID of the ClassOfActivity.
     * @return A ClassOfActivity instance.
     */
    public static ClassOfActivity<IRI> createClassOfActivity(final IRI id) {
        final ClassOfActivity<IRI> result = ClassServices.createClassOfActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_ACTIVITY);
        return result;
    }

    /**
     * Create a {@link ClassOfAgreeContract} with an IRI.
     *
     * @param id
     *            ID of the ClassOfAgreeContract.
     * @return A ClassOfAgreeContract instance.
     */
    public static ClassOfAgreeContract<IRI> createClassOfAgreeContract(final IRI id) {
        final ClassOfAgreeContract<IRI> result = ClassServices.createClassOfAgreeContract(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_AGREE_CONTRACT);
        return result;
    }

    /**
     * Create a {@link ClassOfAgreementExecution} with an IRI.
     *
     * @param id
     *            ID of the ClassOfAgreementExecution.
     * @return A ClassOfAgreementExecution instance.
     */
    public static ClassOfAgreementExecution<IRI> createClassOfAgreementExecution(final IRI id) {
        final ClassOfAgreementExecution<IRI> result = ClassServices.createClassOfAgreementExecution(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_AGREEMENT_EXECUTION);
        return result;
    }

    /**
     * Create a {@link ClassOfAgreementProcess} with an IRI.
     *
     * @param id
     *            ID of the ClassOfAgreementProcess.
     * @return A ClassOfAgreementProcess instance.
     */
    public static ClassOfAgreementProcess<IRI> createClassOfAgreementProcess(final IRI id) {
        final ClassOfAgreementProcess<IRI> result = ClassServices.createClassOfAgreementProcess(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_AGREEMENT_PROCESS);
        return result;
    }

    /**
     * Create a {@link ClassOfAmountOfMoney} with an IRI.
     *
     * @param id
     *            ID of the ClassOfAmountOfMoney.
     * @return A ClassOfAmountOfMoney instance.
     */
    public static ClassOfAmountOfMoney<IRI> createClassOfAmountOfMoney(final IRI id) {
        final ClassOfAmountOfMoney<IRI> result = ClassServices.createClassOfAmountOfMoney(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_AMOUNT_OF_MONEY);
        return result;
    }

    /**
     * Create a {@link ClassOfAssociation} with an IRI.
     *
     * @param id
     *            ID of the ClassOfAssociation.
     * @return A ClassOfAssociation instance.
     */
    public static ClassOfAssociation<IRI> createClassOfAssociation(final IRI id) {
        final ClassOfAssociation<IRI> result = ClassServices.createClassOfAssociation(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_ASSOCIATION);
        return result;
    }

    /**
     * Create a {@link ClassOfBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfBiologicalObject.
     * @return A ClassOfBiologicalObject instance.
     */
    public static ClassOfBiologicalObject<IRI> createClassOfBiologicalObject(final IRI id) {
        final ClassOfBiologicalObject<IRI> result = ClassServices.createClassOfBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfBiologicalSystem} with an IRI.
     *
     * @param id
     *            ID of the ClassOfBiologicalSystem.
     * @return A ClassOfBiologicalSystem instance.
     */
    public static ClassOfBiologicalSystem<IRI> createClassOfBiologicalSystem(final IRI id) {
        final ClassOfBiologicalSystem<IRI> result = ClassServices.createClassOfBiologicalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_BIOLOGICAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link ClassOfBiologicalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfBiologicalSystemComponent.
     * @return A ClassOfBiologicalSystemComponent instance.
     */
    public static ClassOfBiologicalSystemComponent<IRI> createClassOfBiologicalSystemComponent(final IRI id) {
        final ClassOfBiologicalSystemComponent<IRI> result = ClassServices.createClassOfBiologicalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_BIOLOGICAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfClass} with an IRI.
     *
     * @param id
     *            ID of the ClassOfClass.
     * @return A ClassOfClass instance.
     */
    public static ClassOfClass<IRI> createClassOfClass(final IRI id) {
        final ClassOfClass<IRI> result = ClassServices.createClassOfClass(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_CLASS);
        return result;
    }

    /**
     * Create a {@link ClassOfClassOfSpatioTemporalExtent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfClassOfSpatioTemporalExtent.
     * @return A ClassOfClassOfSpatioTemporalExtent instance.
     */
    public static ClassOfClassOfSpatioTemporalExtent<IRI> createClassOfClassOfSpatioTemporalExtent(final IRI id) {
        final ClassOfClassOfSpatioTemporalExtent<IRI> result = ClassServices
                .createClassOfClassOfSpatioTemporalExtent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_CLASS_OF_SPATIO_TEMPORAL_EXTENT);
        return result;
    }

    /**
     * Create a {@link ClassOfContractExecution} with an IRI.
     *
     * @param id
     *            ID of the ClassOfContractExecution.
     * @return A ClassOfContractExecution instance.
     */
    public static ClassOfContractExecution<IRI> createClassOfContractExecution(final IRI id) {
        final ClassOfContractExecution<IRI> result = ClassServices.createClassOfContractExecution(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_CONTRACT_EXECUTION);
        return result;
    }

    /**
     * Create a {@link ClassOfContractProcess} with an IRI.
     *
     * @param id
     *            ID of the ClassOfContractProcess.
     * @return A ClassOfContractProcess instance.
     */
    public static ClassOfContractProcess<IRI> createClassOfContractProcess(final IRI id) {
        final ClassOfContractProcess<IRI> result = ClassServices.createClassOfContractProcess(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_CONTRACT_PROCESS);
        return result;
    }

    /**
     * Create a {@link ClassOfEvent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfEvent.
     * @return A ClassOfEvent instance.
     */
    public static ClassOfEvent<IRI> createClassOfEvent(final IRI id) {
        final ClassOfEvent<IRI> result = ClassServices.createClassOfEvent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_EVENT);
        return result;
    }

    /**
     * Create a {@link ClassOfFunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfFunctionalObject.
     * @return A ClassOfFunctionalObject instance.
     */
    public static ClassOfFunctionalObject<IRI> createClassOfFunctionalObject(final IRI id) {
        final ClassOfFunctionalObject<IRI> result = ClassServices.createClassOfFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfFunctionalSystem} with an IRI.
     *
     * @param id
     *            ID of the ClassOfFunctionalSystem.
     * @return A ClassOfFunctionalSystem instance.
     */
    public static ClassOfFunctionalSystem<IRI> createClassOfFunctionalSystem(final IRI id) {
        final ClassOfFunctionalSystem<IRI> result = ClassServices.createClassOfFunctionalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_FUNCTIONAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link ClassOfFunctionalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfFunctionalSystemComponent.
     * @return A ClassOfFunctionalSystemComponent instance.
     */
    public static ClassOfFunctionalSystemComponent<IRI> createClassOfFunctionalSystemComponent(final IRI id) {
        final ClassOfFunctionalSystemComponent<IRI> result = ClassServices.createClassOfFunctionalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_FUNCTIONAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfInPlaceBiologicalComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfInPlaceBiologicalComponent.
     * @return A ClassOfInPlaceBiologicalComponent instance.
     */
    public static ClassOfInPlaceBiologicalComponent<IRI> createClassOfInPlaceBiologicalComponent(final IRI id) {
        final ClassOfInPlaceBiologicalComponent<IRI> result = ClassServices.createClassOfInPlaceBiologicalComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_IN_PLACE_BIOLOGICAL_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfIndividual} with an IRI.
     *
     * @param id
     *            ID of the ClassOfIndividual.
     * @return A ClassOfIndividual instance.
     */
    public static ClassOfIndividual<IRI> createClassOfIndividual(final IRI id) {
        final ClassOfIndividual<IRI> result = ClassServices.createClassOfIndividual(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_INDIVIDUAL);
        return result;
    }

    /**
     * Create a {@link ClassOfInstalledFunctionalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfInstalledFunctionalSystemComponent.
     * @return A ClassOfInstalledFunctionalSystemComponent instance.
     */
    public static ClassOfInstalledFunctionalSystemComponent<IRI> createClassOfInstalledFunctionalSystemComponent(
            final IRI id) {
        final ClassOfInstalledFunctionalSystemComponent<IRI> result = ClassServices

                .createClassOfInstalledFunctionalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfInstalledObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfInstalledObject.
     * @return A ClassOfInstalledObject instance.
     */
    public static ClassOfInstalledObject<IRI> createClassOfInstalledObject(final IRI id) {
        final ClassOfInstalledObject<IRI> result = ClassServices.createClassOfInstalledObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_INSTALLED_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfIntentionallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfIntentionallyConstructedObject.
     * @return A ClassOfIntentionallyConstructedObject instance.
     */
    public static ClassOfIntentionallyConstructedObject<IRI> createClassOfIntentionallyConstructedObject(final IRI id) {
        final ClassOfIntentionallyConstructedObject<IRI> result = ClassServices
                .createClassOfIntentionallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_INTENTIONALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfOffer} with an IRI.
     *
     * @param id
     *            ID of the ClassOfOffer.
     * @return A ClassOfOffer instance.
     */
    public static ClassOfOffer<IRI> createClassOfOffer(final IRI id) {
        final ClassOfOffer<IRI> result = ClassServices.createClassOfOffer(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_OFFER);
        return result;
    }

    /**
     * Create a {@link ClassOfOrdinaryBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfOrdinaryBiologicalObject.
     * @return A ClassOfOrdinaryBiologicalObject instance.
     */
    public static ClassOfOrdinaryBiologicalObject<IRI> createClassOfOrdinaryBiologicalObject(final IRI id) {
        final ClassOfOrdinaryBiologicalObject<IRI> result = ClassServices.createClassOfOrdinaryBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_ORDINARY_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfOrdinaryFunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfOrdinaryFunctionalObject.
     * @return A ClassOfOrdinaryFunctionalObject instance.
     */
    public static ClassOfOrdinaryFunctionalObject<IRI> createClassOfOrdinaryFunctionalObject(final IRI id) {
        final ClassOfOrdinaryFunctionalObject<IRI> result = ClassServices.createClassOfOrdinaryFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_ORDINARY_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfOrdinaryPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfOrdinaryPhysicalObject.
     * @return A ClassOfOrdinaryPhysicalObject instance.
     */
    public static ClassOfOrdinaryPhysicalObject<IRI> createClassOfOrdinaryPhysicalObject(final IRI id) {
        final ClassOfOrdinaryPhysicalObject<IRI> result = ClassServices.createClassOfOrdinaryPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_ORDINARY_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfOrganization} with an IRI.
     *
     * @param id
     *            ID of the ClassOfOrganization.
     * @return A ClassOfOrganization instance.
     */
    public static ClassOfOrganization<IRI> createClassOfOrganization(final IRI id) {
        final ClassOfOrganization<IRI> result = ClassServices.createClassOfOrganization(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_ORGANIZATION);
        return result;
    }

    /**
     * Create a {@link ClassOfOrganizationComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfOrganizationComponent.
     * @return A ClassOfOrganizationComponent instance.
     */
    public static ClassOfOrganizationComponent<IRI> createClassOfOrganizationComponent(final IRI id) {
        final ClassOfOrganizationComponent<IRI> result = ClassServices.createClassOfOrganizationComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_ORGANIZATION_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfParticipant} with an IRI.
     *
     * @param id
     *            ID of the ClassOfParticipant.
     * @return A ClassOfParticipant instance.
     */
    public static ClassOfParticipant<IRI> createClassOfParticipant(final IRI id) {
        final ClassOfParticipant<IRI> result = ClassServices.createClassOfParticipant(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_PARTICIPANT);
        return result;
    }

    /**
     * Create a {@link ClassOfParty} with an IRI.
     *
     * @param id
     *            ID of the ClassOfParty.
     * @return A ClassOfParty instance.
     */
    public static ClassOfParty<IRI> createClassOfParty(final IRI id) {
        final ClassOfParty<IRI> result = ClassServices.createClassOfParty(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_PARTY);
        return result;
    }

    /**
     * Create a {@link ClassOfPeriodOfTime} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPeriodOfTime.
     * @return A ClassOfPeriodOfTime instance.
     */
    public static ClassOfPeriodOfTime<IRI> createClassOfPeriodOfTime(final IRI id) {
        final ClassOfPeriodOfTime<IRI> result = ClassServices.createClassOfPeriodOfTime(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_PERIOD_OF_TIME);
        return result;
    }

    /**
     * Create a {@link ClassOfPerson} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPerson.
     * @return A ClassOfPerson instance.
     */
    public static ClassOfPerson<IRI> createClassOfPerson(final IRI id) {
        final ClassOfPerson<IRI> result = ClassServices.createClassOfPerson(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_PERSON);
        return result;
    }

    /**
     * Create a {@link ClassOfPersonInPosition} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPersonInPosition.
     * @return A ClassOfPersonInPosition instance.
     */
    public static ClassOfPersonInPosition<IRI> createClassOfPersonInPosition(final IRI id) {
        final ClassOfPersonInPosition<IRI> result = ClassServices.createClassOfPersonInPosition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_PERSON_IN_POSITION);
        return result;
    }

    /**
     * Create a {@link ClassOfPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPhysicalObject.
     * @return A ClassOfPhysicalObject instance.
     */
    public static ClassOfPhysicalObject<IRI> createClassOfPhysicalObject(final IRI id) {
        final ClassOfPhysicalObject<IRI> result = ClassServices.createClassOfPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfPhysicalProperty} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPhysicalProperty.
     * @return A ClassOfPhysicalProperty instance.
     */
    public static ClassOfPhysicalProperty<IRI> createClassOfPhysicalProperty(final IRI id) {
        final ClassOfPhysicalProperty<IRI> result = ClassServices.createClassOfPhysicalProperty(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_PHYSICAL_PROPERTY);
        return result;
    }

    /**
     * Create a {@link ClassOfPhysicalQuantity} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPhysicalQuantity.
     * @return A ClassOfPhysicalQuantity instance.
     */
    public static ClassOfPhysicalQuantity<IRI> createClassOfPhysicalQuantity(final IRI id) {
        final ClassOfPhysicalQuantity<IRI> result = ClassServices.createClassOfPhysicalQuantity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_PHYSICAL_QUANTITY);
        return result;
    }

    /**
     * Create a {@link ClassOfPointInTime} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPointInTime.
     * @return A ClassOfPointInTime instance.
     */
    public static ClassOfPointInTime<IRI> createClassOfPointInTime(final IRI id) {
        final ClassOfPointInTime<IRI> result = ClassServices.createClassOfPointInTime(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_POINT_IN_TIME);
        return result;
    }

    /**
     * Create a {@link ClassOfPosition} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPosition.
     * @return A ClassOfPosition instance.
     */
    public static ClassOfPosition<IRI> createClassOfPosition(final IRI id) {
        final ClassOfPosition<IRI> result = ClassServices.createClassOfPosition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_POSITION);
        return result;
    }

    /**
     * Create a {@link ClassOfPossibleWorld} with an IRI.
     *
     * @param id
     *            ID of the ClassOfPossibleWorld.
     * @return A ClassOfPossibleWorld instance.
     */
    public static ClassOfPossibleWorld<IRI> createClassOfPossibleWorld(final IRI id) {
        final ClassOfPossibleWorld<IRI> result = ClassServices.createClassOfPossibleWorld(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_POSSIBLE_WORLD);
        return result;
    }

    /**
     * Create a {@link ClassOfReachingAgreement} with an IRI.
     *
     * @param id
     *            ID of the ClassOfReachingAgreement.
     * @return A ClassOfReachingAgreement instance.
     */
    public static ClassOfReachingAgreement<IRI> createClassOfReachingAgreement(final IRI id) {
        final ClassOfReachingAgreement<IRI> result = ClassServices.createClassOfReachingAgreement(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_REACHING_AGREEMENT);
        return result;
    }

    /**
     * Create a {@link ClassOfRelationship} with an IRI.
     *
     * @param id
     *            ID of the ClassOfRelationship.
     * @return A ClassOfRelationship instance.
     */
    public static ClassOfRelationship<IRI> createClassOfRelationship(final IRI id) {
        final ClassOfRelationship<IRI> result = ClassServices.createClassOfRelationship(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_RELATIONSHIP);
        return result;
    }

    /**
     * Create a {@link ClassOfRepresentation} with an IRI.
     *
     * @param id
     *            ID of the ClassOfRepresentation.
     * @return A ClassOfRepresentation instance.
     */
    public static ClassOfRepresentation<IRI> createClassOfRepresentation(final IRI id) {
        final ClassOfRepresentation<IRI> result = ClassServices.createClassOfRepresentation(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_REPRESENTATION);
        return result;
    }

    /**
     * Create a {@link ClassOfSalesProductInstance} with an IRI.
     *
     * @param id
     *            ID of the ClassOfSalesProductInstance.
     * @return A ClassOfSalesProductInstance instance.
     */
    public static ClassOfSalesProductInstance<IRI> createClassOfSalesProductInstance(final IRI id) {
        final ClassOfSalesProductInstance<IRI> result = ClassServices.createClassOfSalesProductInstance(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_SALES_PRODUCT_INSTANCE);
        return result;
    }

    /**
     * Create a {@link ClassOfSign} with an IRI.
     *
     * @param id
     *            ID of the ClassOfSign.
     * @return A ClassOfSign instance.
     */
    public static ClassOfSign<IRI> createClassOfSign(final IRI id) {
        final ClassOfSign<IRI> result = ClassServices.createClassOfSign(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_SIGN);
        return result;
    }

    /**
     * Create a {@link ClassOfSociallyConstructedActivity} with an IRI.
     *
     * @param id
     *            ID of the ClassOfSociallyConstructedActivity.
     * @return A ClassOfSociallyConstructedActivity instance.
     */
    public static ClassOfSociallyConstructedActivity<IRI> createClassOfSociallyConstructedActivity(final IRI id) {
        final ClassOfSociallyConstructedActivity<IRI> result = ClassServices
                .createClassOfSociallyConstructedActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_SOCIALLY_CONSTRUCTED_ACTIVITY);
        return result;
    }

    /**
     * Create a {@link ClassOfSociallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfSociallyConstructedObject.
     * @return A ClassOfSociallyConstructedObject instance.
     */
    public static ClassOfSociallyConstructedObject<IRI> createClassOfSociallyConstructedObject(final IRI id) {
        final ClassOfSociallyConstructedObject<IRI> result = ClassServices.createClassOfSociallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_SOCIALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfSpatioTemporalExtent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfSpatioTemporalExtent.
     * @return A ClassOfSpatioTemporalExtent instance.
     */
    public static ClassOfSpatioTemporalExtent<IRI> createClassOfSpatioTemporalExtent(final IRI id) {
        final ClassOfSpatioTemporalExtent<IRI> result = ClassServices.createClassOfSpatioTemporalExtent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_SPATIO_TEMPORAL_EXTENT);
        return result;
    }

    /**
     * Create a {@link ClassOfState} with an IRI.
     *
     * @param id
     *            ID of the ClassOfState.
     * @return A ClassOfState instance.
     */
    public static ClassOfState<IRI> createClassOfState(final IRI id) {
        final ClassOfState<IRI> result = ClassServices.createClassOfState(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfActivity} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfActivity.
     * @return A ClassOfStateOfActivity instance.
     */
    public static ClassOfStateOfActivity<IRI> createClassOfStateOfActivity(final IRI id) {
        final ClassOfStateOfActivity<IRI> result = ClassServices.createClassOfStateOfActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_ACTIVITY);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfAmountOfMoney} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfAmountOfMoney.
     * @return A ClassOfStateOfAmountOfMoney instance.
     */
    public static ClassOfStateOfAmountOfMoney<IRI> createClassOfStateOfAmountOfMoney(final IRI id) {
        final ClassOfStateOfAmountOfMoney<IRI> result = ClassServices.createClassOfStateOfAmountOfMoney(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_AMOUNT_OF_MONEY);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfAssociation} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfAssociation.
     * @return A ClassOfStateOfAssociation instance.
     */
    public static ClassOfStateOfAssociation<IRI> createClassOfStateOfAssociation(final IRI id) {
        final ClassOfStateOfAssociation<IRI> result = ClassServices.createClassOfStateOfAssociation(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_ASSOCIATION);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfBiologicalObject.
     * @return A ClassOfStateOfBiologicalObject instance.
     */
    public static ClassOfStateOfBiologicalObject<IRI> createClassOfStateOfBiologicalObject(final IRI id) {
        final ClassOfStateOfBiologicalObject<IRI> result = ClassServices.createClassOfStateOfBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfBiologicalSystem} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfBiologicalSystem.
     * @return A ClassOfStateOfBiologicalSystem instance.
     */
    public static ClassOfStateOfBiologicalSystem<IRI> createClassOfStateOfBiologicalSystem(final IRI id) {
        final ClassOfStateOfBiologicalSystem<IRI> result = ClassServices.createClassOfStateOfBiologicalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_BIOLOGICAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfBiologicalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfBiologicalSystemComponent.
     * @return A ClassOfStateOfBiologicalSystemComponent instance.
     */
    public static ClassOfStateOfBiologicalSystemComponent<IRI> createClassOfStateOfBiologicalSystemComponent(
            final IRI id) {
        final ClassOfStateOfBiologicalSystemComponent<IRI> result = ClassServices
                .createClassOfStateOfBiologicalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_BIOLOGICAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfFunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfFunctionalObject.
     * @return A ClassOfStateOfFunctionalObject instance.
     */
    public static ClassOfStateOfFunctionalObject<IRI> createClassOfStateOfFunctionalObject(final IRI id) {
        final ClassOfStateOfFunctionalObject<IRI> result = ClassServices.createClassOfStateOfFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfFunctionalSystem} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfFunctionalSystem.
     * @return A ClassOfStateOfFunctionalSystem instance.
     */
    public static ClassOfStateOfFunctionalSystem<IRI> createClassOfStateOfFunctionalSystem(final IRI id) {
        final ClassOfStateOfFunctionalSystem<IRI> result = ClassServices.createClassOfStateOfFunctionalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_SYSTEM);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfFunctionalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfFunctionalSystemComponent.
     * @return A ClassOfStateOfFunctionalSystemComponent instance.
     */

    public static ClassOfStateOfFunctionalSystemComponent<IRI> createClassOfStateOfFunctionalSystemComponent(
            final IRI id) {
        final ClassOfStateOfFunctionalSystemComponent<IRI> result = ClassServices
                .createClassOfStateOfFunctionalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_FUNCTIONAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfIntentionallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfIntentionallyConstructedObject.
     * @return A ClassOfStateOfIntentionallyConstructedObject instance.
     */

    public static ClassOfStateOfIntentionallyConstructedObject<IRI> createClassOfStateOfIntentionallyConstructedObject(
            final IRI id) {
        final ClassOfStateOfIntentionallyConstructedObject<IRI> result = ClassServices
                .createClassOfStateOfIntentionallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE,
                HQDM.CLASS_OF_STATE_OF_INTENTIONALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfOrdinaryBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfOrdinaryBiologicalObject.
     * @return A ClassOfStateOfOrdinaryBiologicalObject instance.
     */
    public static ClassOfStateOfOrdinaryBiologicalObject<IRI> createClassOfStateOfOrdinaryBiologicalObject(
            final IRI id) {
        final ClassOfStateOfOrdinaryBiologicalObject<IRI> result = ClassServices
                .createClassOfStateOfOrdinaryBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_ORDINARY_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfOrdinaryFunctionalObject} with an Stri ng.
     *
     * @param id
     *            ID of the ClassOfStateOfOrdinaryFunctionalObject.
     * @return A ClassOfStateOfOrdinaryFunctionalObject instance.
     */
    public static ClassOfStateOfOrdinaryFunctionalObject<IRI> createClassOfStateOfOrdinaryFunctionalObject(
            final IRI id) {
        final ClassOfStateOfOrdinaryFunctionalObject<IRI> result = ClassServices
                .createClassOfStateOfOrdinaryFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_ORDINARY_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfOrdinaryPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfOrdinaryPhysicalObject.
     * @return A ClassOfStateOfOrdinaryPhysicalObject instance.
     */
    public static ClassOfStateOfOrdinaryPhysicalObject<IRI> createClassOfStateOfOrdinaryPhysicalObject(final IRI id) {
        final ClassOfStateOfOrdinaryPhysicalObject<IRI> result = ClassServices
                .createClassOfStateOfOrdinaryPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_ORDINARY_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfOrganization} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfOrganization.
     * @return A ClassOfStateOfOrganization instance.
     */
    public static ClassOfStateOfOrganization<IRI> createClassOfStateOfOrganization(final IRI id) {
        final ClassOfStateOfOrganization<IRI> result = ClassServices.createClassOfStateOfOrganization(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_ORGANIZATION);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfOrganizationComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfOrganizationComponent.
     * @return A ClassOfStateOfOrganizationComponent instance.
     */
    public static ClassOfStateOfOrganizationComponent<IRI> createClassOfStateOfOrganizationComponent(final IRI id) {
        final ClassOfStateOfOrganizationComponent<IRI> result = ClassServices
                .createClassOfStateOfOrganizationComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_ORGANIZATION_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfParty} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfParty.
     * @return A ClassOfStateOfParty instance.
     */
    public static ClassOfStateOfParty<IRI> createClassOfStateOfParty(final IRI id) {
        final ClassOfStateOfParty<IRI> result = ClassServices.createClassOfStateOfParty(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_PARTY);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfPerson} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfPerson.
     * @return A ClassOfStateOfPerson instance.
     */
    public static ClassOfStateOfPerson<IRI> createClassOfStateOfPerson(final IRI id) {
        final ClassOfStateOfPerson<IRI> result = ClassServices.createClassOfStateOfPerson(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_PERSON);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfPhysicalObject.
     * @return A ClassOfStateOfPhysicalObject instance.
     */
    public static ClassOfStateOfPhysicalObject<IRI> createClassOfStateOfPhysicalObject(final IRI id) {
        final ClassOfStateOfPhysicalObject<IRI> result = ClassServices.createClassOfStateOfPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfPosition} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfPosition.
     * @return A ClassOfStateOfPosition instance.
     */
    public static ClassOfStateOfPosition<IRI> createClassOfStateOfPosition(final IRI id) {
        final ClassOfStateOfPosition<IRI> result = ClassServices.createClassOfStateOfPosition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_POSITION);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfSalesProductInstance} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfSalesProductInstance.
     * @return A ClassOfStateOfSalesProductInstance instance.
     */
    public static ClassOfStateOfSalesProductInstance<IRI> createClassOfStateOfSalesProductInstance(final IRI id) {
        final ClassOfStateOfSalesProductInstance<IRI> result = ClassServices
                .createClassOfStateOfSalesProductInstance(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_SALES_PRODUCT_INSTANCE);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfSign} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfSign.
     * @return A ClassOfStateOfSign instance.
     */
    public static ClassOfStateOfSign<IRI> createClassOfStateOfSign(final IRI id) {
        final ClassOfStateOfSign<IRI> result = ClassServices.createClassOfStateOfSign(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_SIGN);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfSociallyConstructedActivity} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfSociallyConstructedActivity.
     * @return A ClassOfStateOfSociallyConstructedActivity instance.
     */
    public static ClassOfStateOfSociallyConstructedActivity<IRI> createClassOfStateOfSociallyConstructedActivity(
            final IRI id) {
        final ClassOfStateOfSociallyConstructedActivity<IRI> result = ClassServices
                .createClassOfStateOfSociallyConstructedActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_SOCIALLY_CONSTRUCTED_ACTIVITY);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfSociallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfSociallyConstructedObject.
     * @return A ClassOfStateOfSociallyConstructedObject instance.
     */
    public static ClassOfStateOfSociallyConstructedObject<IRI> createClassOfStateOfSociallyConstructedObject(
            final IRI id) {
        final ClassOfStateOfSociallyConstructedObject<IRI> result = ClassServices
                .createClassOfStateOfSociallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_SOCIALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfSystem} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfSystem.
     * @return A ClassOfStateOfSystem instance.
     */
    public static ClassOfStateOfSystem<IRI> createClassOfStateOfSystem(final IRI id) {
        final ClassOfStateOfSystem<IRI> result = ClassServices.createClassOfStateOfSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_SYSTEM);
        return result;
    }

    /**
     * Create a {@link ClassOfStateOfSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfStateOfSystemComponent.
     * @return A ClassOfStateOfSystemComponent instance.
     */
    public static ClassOfStateOfSystemComponent<IRI> createClassOfStateOfSystemComponent(final IRI id) {
        final ClassOfStateOfSystemComponent<IRI> result = ClassServices.createClassOfStateOfSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_STATE_OF_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ClassOfSystem} with an IRI.
     *
     * @param id
     *            ID of the ClassOfSystem.
     * @return A ClassOfSystem instance.
     */
    public static ClassOfSystem<IRI> createClassOfSystem(final IRI id) {
        final ClassOfSystem<IRI> result = ClassServices.createClassOfSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_SYSTEM);
        return result;
    }

    /**
     * Create a {@link ClassOfSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the ClassOfSystemComponent.
     * @return A ClassOfSystemComponent instance.
     */
    public static ClassOfSystemComponent<IRI> createClassOfSystemComponent(final IRI id) {
        final ClassOfSystemComponent<IRI> result = ClassServices.createClassOfSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CLASS_OF_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link Definition} with an IRI.
     *
     * @param id
     *            ID of the Definition.
     * @return A Definition instance.
     */
    public static Definition<IRI> createDefinition(final IRI id) {
        final Definition<IRI> result = ClassServices.createDefinition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.DEFINITION);
        return result;
    }

    /**
     * Create a {@link Description} with an IRI.
     *
     * @param id
     *            ID of the Description.
     * @return A Description instance.
     */
    public static Description<IRI> createDescription(final IRI id) {
        final Description<IRI> result = ClassServices.createDescription(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.DESCRIPTION);
        return result;
    }

    /**
     * Create a {@link EnumeratedClass} with an IRI.
     *
     * @param id
     *            ID of the EnumeratedClass.
     * @return A EnumeratedClass instance.
     */
    public static EnumeratedClass<IRI> createEnumeratedClass(final IRI id) {
        final EnumeratedClass<IRI> result = ClassServices.createEnumeratedClass(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ENUMERATED_CLASS);
        return result;
    }

    /**
     * Create a {@link KindOfActivity} with an IRI.
     *
     * @param id
     *            ID of the KindOfActivity.
     * @return A KindOfActivity instance.
     */
    public static KindOfActivity<IRI> createKindOfActivity(final IRI id) {
        final KindOfActivity<IRI> result = ClassServices.createKindOfActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ACTIVITY);
        return result;
    }

    /**
     * Create a {@link KindOfAssociation} with an IRI.
     *
     * @param id
     *            ID of the KindOfAssociation.
     * @return A KindOfAssociation instance.
     */
    public static KindOfAssociation<IRI> createKindOfAssociation(final IRI id) {
        final KindOfAssociation<IRI> result = ClassServices.createKindOfAssociation(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ASSOCIATION);
        return result;
    }

    /**
     * Create a {@link KindOfBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the KindOfBiologicalObject.
     * @return A KindOfBiologicalObject instance.
     */
    public static KindOfBiologicalObject<IRI> createKindOfBiologicalObject(final IRI id) {
        final KindOfBiologicalObject<IRI> result = ClassServices.createKindOfBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link KindOfBiologicalSystem} with an IRI.
     *
     * @param id
     *            ID of the KindOfBiologicalSystem.
     * @return A KindOfBiologicalSystem instance.
     */
    public static KindOfBiologicalSystem<IRI> createKindOfBiologicalSystem(final IRI id) {
        final KindOfBiologicalSystem<IRI> result = ClassServices.createKindOfBiologicalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_BIOLOGICAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link KindOfBiologicalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the KindOfBiologicalSystemComponent.
     * @return A KindOfBiologicalSystemComponent instance.
     */
    public static KindOfBiologicalSystemComponent<IRI> createKindOfBiologicalSystemComponent(final IRI id) {
        final KindOfBiologicalSystemComponent<IRI> result = ClassServices.createKindOfBiologicalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_BIOLOGICAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link KindOfFunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the KindOfFunctionalObject.
     * @return A KindOfFunctionalObject instance.
     */
    public static KindOfFunctionalObject<IRI> createKindOfFunctionalObject(final IRI id) {
        final KindOfFunctionalObject<IRI> result = ClassServices.createKindOfFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link KindOfFunctionalSystem} with an IRI.
     *
     * @param id
     *            ID of the KindOfFunctionalSystem.
     * @return A KindOfFunctionalSystem instance.
     */
    public static KindOfFunctionalSystem<IRI> createKindOfFunctionalSystem(final IRI id) {
        final KindOfFunctionalSystem<IRI> result = ClassServices.createKindOfFunctionalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_FUNCTIONAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link KindOfFunctionalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the KindOfFunctionalSystemComponent.
     * @return A KindOfFunctionalSystemComponent instance.
     */
    public static KindOfFunctionalSystemComponent<IRI> createKindOfFunctionalSystemComponent(final IRI id) {
        final KindOfFunctionalSystemComponent<IRI> result = ClassServices.createKindOfFunctionalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_FUNCTIONAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link KindOfIndividual} with an IRI.
     *
     * @param id
     *            ID of the KindOfIndividual.
     * @return A KindOfIndividual instance.
     */
    public static KindOfIndividual<IRI> createKindOfIndividual(final IRI id) {
        final KindOfIndividual<IRI> result = ClassServices.createKindOfIndividual(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_INDIVIDUAL);
        return result;

    }

    /**
     * Create a {@link KindOfIntentionallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the KindOfIntentionallyConstructedObject.
     * @return A KindOfIntentionallyConstructedObject instance.
     */
    public static KindOfIntentionallyConstructedObject<IRI> createKindOfIntentionallyConstructedObject(final IRI id) {
        final KindOfIntentionallyConstructedObject<IRI> result = ClassServices
                .createKindOfIntentionallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_INTENTIONALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link KindOfOrdinaryBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the KindOfOrdinaryBiologicalObject.
     * @return A KindOfOrdinaryBiologicalObject instance.
     */
    public static KindOfOrdinaryBiologicalObject<IRI> createKindOfOrdinaryBiologicalObject(final IRI id) {
        final KindOfOrdinaryBiologicalObject<IRI> result = ClassServices.createKindOfOrdinaryBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ORDINARY_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link KindOfOrdinaryFunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the KindOfOrdinaryFunctionalObject.
     * @return A KindOfOrdinaryFunctionalObject instance.
     */
    public static KindOfOrdinaryFunctionalObject<IRI> createKindOfOrdinaryFunctionalObject(final IRI id) {
        final KindOfOrdinaryFunctionalObject<IRI> result = ClassServices.createKindOfOrdinaryFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ORDINARY_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link KindOfOrdinaryPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the KindOfOrdinaryPhysicalObject.
     * @return A KindOfOrdinaryPhysicalObject instance.
     */
    public static KindOfOrdinaryPhysicalObject<IRI> createKindOfOrdinaryPhysicalObject(final IRI id) {
        final KindOfOrdinaryPhysicalObject<IRI> result = ClassServices.createKindOfOrdinaryPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ORDINARY_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link KindOfOrganization} with an IRI.
     *
     * @param id
     *            ID of the KindOfOrganization.
     * @return A KindOfOrganization instance.
     */
    public static KindOfOrganization<IRI> createKindOfOrganization(final IRI id) {
        final KindOfOrganization<IRI> result = ClassServices.createKindOfOrganization(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ORGANIZATION);
        return result;
    }

    /**
     * Create a {@link KindOfOrganizationComponent} with an IRI.
     *
     * @param id
     *            ID of the KindOfOrganizationComponent.
     * @return A KindOfOrganizationComponent instance.
     */
    public static KindOfOrganizationComponent<IRI> createKindOfOrganizationComponent(final IRI id) {
        final KindOfOrganizationComponent<IRI> result = ClassServices.createKindOfOrganizationComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_ORGANIZATION_COMPONENT);
        return result;
    }

    /**
     * Create a {@link KindOfParty} with an IRI.
     *
     * @param id
     *            ID of the KindOfParty.
     * @return A KindOfParty instance.
     */
    public static KindOfParty<IRI> createKindOfParty(final IRI id) {
        final KindOfParty<IRI> result = ClassServices.createKindOfParty(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_PARTY);
        return result;
    }

    /**
     * Create a {@link KindOfPerson} with an IRI.
     *
     * @param id
     *            ID of the KindOfPerson.
     * @return A KindOfPerson instance.
     */
    public static KindOfPerson<IRI> createKindOfPerson(final IRI id) {
        final KindOfPerson<IRI> result = ClassServices.createKindOfPerson(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_PERSON);
        return result;
    }

    /**
     * Create a {@link KindOfPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the KindOfPhysicalObject.
     * @return A KindOfPhysicalObject instance.
     */
    public static KindOfPhysicalObject<IRI> createKindOfPhysicalObject(final IRI id) {
        final KindOfPhysicalObject<IRI> result = ClassServices.createKindOfPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link KindOfPhysicalProperty} with an IRI.
     *
     * @param id
     *            ID of the KindOfPhysicalProperty.
     * @return A KindOfPhysicalProperty instance.
     */
    public static KindOfPhysicalProperty<IRI> createKindOfPhysicalProperty(final IRI id) {
        final KindOfPhysicalProperty<IRI> result = ClassServices.createKindOfPhysicalProperty(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_PHYSICAL_PROPERTY);
        return result;
    }

    /**
     * Create a {@link KindOfPhysicalQuantity} with an IRI.
     *
     * @param id
     *            ID of the KindOfPhysicalQuantity.
     * @return A KindOfPhysicalQuantity instance.
     */
    public static KindOfPhysicalQuantity<IRI> createKindOfPhysicalQuantity(final IRI id) {
        final KindOfPhysicalQuantity<IRI> result = ClassServices.createKindOfPhysicalQuantity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_PHYSICAL_QUANTITY);
        return result;
    }

    /**
     * Create a {@link KindOfPosition} with an IRI.
     *
     * @param id
     *            ID of the KindOfPosition.
     * @return A KindOfPosition instance.
     */
    public static KindOfPosition<IRI> createKindOfPosition(final IRI id) {
        final KindOfPosition<IRI> result = ClassServices.createKindOfPosition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_POSITION);
        return result;
    }

    /**
     * Create a {@link KindOfRelationshipWithRestriction} with an IRI.
     *
     * @param id
     *            ID of the KindOfRelationshipWithRestriction.
     * @return A KindOfRelationshipWithRestriction instance.
     */
    public static KindOfRelationshipWithRestriction<IRI> createKindOfRelationshipWithRestriction(final IRI id) {
        final KindOfRelationshipWithRestriction<IRI> result = ClassServices.createKindOfRelationshipWithRestriction(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_RELATIONSHIP_WITH_RESTRICTION);
        return result;
    }

    /**
     * Create a {@link KindOfRelationshipWithSignature} with an IRI.
     *
     * @param id
     *            ID of the KindOfRelationshipWithSignature.
     * @return A KindOfRelationshipWithSignature instance.
     */
    public static KindOfRelationshipWithSignature<IRI> createKindOfRelationshipWithSignature(final IRI id) {
        final KindOfRelationshipWithSignature<IRI> result = ClassServices.createKindOfRelationshipWithSignature(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_RELATIONSHIP_WITH_SIGNATURE);
        return result;
    }

    /**
     * Create a {@link KindOfSociallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the KindOfSociallyConstructedObject.
     * @return A KindOfSociallyConstructedObject instance.
     */
    public static KindOfSociallyConstructedObject<IRI> createKindOfSociallyConstructedObject(final IRI id) {
        final KindOfSociallyConstructedObject<IRI> result = ClassServices.createKindOfSociallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_SOCIALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link KindOfSystem} with an IRI.
     *
     * @param id
     *            ID of the KindOfSystem.
     * @return A KindOfSystem instance.
     */
    public static KindOfSystem<IRI> createKindOfSystem(final IRI id) {
        final KindOfSystem<IRI> result = ClassServices.createKindOfSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_SYSTEM);
        return result;
    }

    /**
     * Create a {@link KindOfSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the KindOfSystemComponent.
     * @return A KindOfSystemComponent instance.
     */
    public static KindOfSystemComponent<IRI> createKindOfSystemComponent(final IRI id) {
        final KindOfSystemComponent<IRI> result = ClassServices.createKindOfSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.KIND_OF_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link Identification} with an IRI.
     *
     * @param id
     *            ID of the Identification.
     * @return A Identification instance.
     */
    public static Identification<IRI> createIdentification(final IRI id) {
        final Identification<IRI> result = ClassServices.createIdentification(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.IDENTIFICATION);
        return result;
    }

    /**
     * Create a {@link Pattern} with an IRI.
     *
     * @param id
     *            ID of the Pattern.
     * @return A Pattern instance.
     */
    public static Pattern<IRI> createPattern(final IRI id) {
        final Pattern<IRI> result = ClassServices.createPattern(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PATTERN);
        return result;
    }

    /**
     * Create a {@link RepresentationByPattern} with an IRI.
     *
     * @param id
     *            ID of the RepresentationByPattern.
     * @return A RepresentationByPattern instance.
     */
    public static RepresentationByPattern<IRI> createRepresentationByPattern(final IRI id) {
        final RepresentationByPattern<IRI> result = ClassServices.createRepresentationByPattern(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.REPRESENTATION_BY_PATTERN);
        return result;
    }

    /**
     * Create a {@link Role} with an IRI.
     *
     * @param id
     *            ID of the Role.
     * @return A Role instance.
     */
    public static Role<IRI> createRole(final IRI id) {
        final Role<IRI> result = ClassServices.createRole(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ROLE);
        return result;
    }
}
