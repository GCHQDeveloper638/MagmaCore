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

package uk.gov.gchq.magmacore.hqdm.services;

import uk.gov.gchq.magmacore.hqdm.model.*;
import uk.gov.gchq.magmacore.hqdm.model.Class;
import uk.gov.gchq.magmacore.hqdm.model.impl.*;

/**
 * Service for creating HQDM Classes.
 */
public class ClassServices {
    /**
     * Create a {@link Class} with a T.
     *
     * @param id
     *            ID of the Class.
     * @return A Class instance.
     */
    public static <T> Class<T> createClass(final T id) {
        return new ClassImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfAbstractObject} with a T.
     *
     * @param id
     *            ID of the ClassOfAbstractObject.
     * @return A ClassOfAbstractObject instance.
     */
    public static <T> ClassOfAbstractObject<T> createClassOfAbstractObject(final T id) {
        return new ClassOfAbstractObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfActivity} with a T.
     *
     * @param id
     *            ID of the ClassOfActivity.
     * @return A ClassOfActivity instance.
     */
    public static <T> ClassOfActivity<T> createClassOfActivity(final T id) {
        return new ClassOfActivityImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfAgreeContract} with a T.
     *
     * @param id
     *            ID of the ClassOfAgreeContract.
     * @return A ClassOfAgreeContract instance.
     */
    public static <T> ClassOfAgreeContract<T> createClassOfAgreeContract(final T id) {
        return new ClassOfAgreeContractImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfAgreementExecution} with a T.
     *
     * @param id
     *            ID of the ClassOfAgreementExecution.
     * @return A ClassOfAgreementExecution instance.
     */
    public static <T> ClassOfAgreementExecution<T> createClassOfAgreementExecution(final T id) {
        return new ClassOfAgreementExecutionImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfAgreementProcess} with a T.
     *
     * @param id
     *            ID of the ClassOfAgreementProcess.
     * @return A ClassOfAgreementProcess instance.
     */
    public static <T> ClassOfAgreementProcess<T> createClassOfAgreementProcess(final T id) {
        return new ClassOfAgreementProcessImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfAmountOfMoney} with a T.
     *
     * @param id
     *            ID of the ClassOfAmountOfMoney.
     * @return A ClassOfAmountOfMoney instance.
     */
    public static <T> ClassOfAmountOfMoney<T> createClassOfAmountOfMoney(final T id) {
        return new ClassOfAmountOfMoneyImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfAssociation} with a T.
     *
     * @param id
     *            ID of the ClassOfAssociation.
     * @return A ClassOfAssociation instance.
     */
    public static <T> ClassOfAssociation<T> createClassOfAssociation(final T id) {
        return new ClassOfAssociationImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfBiologicalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfBiologicalObject.
     * @return A ClassOfBiologicalObject instance.
     */
    public static <T> ClassOfBiologicalObject<T> createClassOfBiologicalObject(final T id) {
        return new ClassOfBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfBiologicalSystem} with a T.
     *
     * @param id
     *            ID of the ClassOfBiologicalSystem.
     * @return A ClassOfBiologicalSystem instance.
     */
    public static <T> ClassOfBiologicalSystem<T> createClassOfBiologicalSystem(final T id) {
        return new ClassOfBiologicalSystemImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfBiologicalSystemComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfBiologicalSystemComponent.
     * @return A ClassOfBiologicalSystemComponent instance.
     */
    public static <T> ClassOfBiologicalSystemComponent<T> createClassOfBiologicalSystemComponent(final T id) {
        return new ClassOfBiologicalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfClass} with a T.
     *
     * @param id
     *            ID of the ClassOfClass.
     * @return A ClassOfClass instance.
     */
    public static <T> ClassOfClass<T> createClassOfClass(final T id) {
        return new ClassOfClassImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfClassOfSpatioTemporalExtent} with a T.
     *
     * @param id
     *            ID of the ClassOfClassOfSpatioTemporalExtent.
     * @return A ClassOfClassOfSpatioTemporalExtent instance.
     */
    public static <T> ClassOfClassOfSpatioTemporalExtent<T> createClassOfClassOfSpatioTemporalExtent(final T id) {
        return new ClassOfClassOfSpatioTemporalExtentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfContractExecution} with a T.
     *
     * @param id
     *            ID of the ClassOfContractExecution.
     * @return A ClassOfContractExecution instance.
     */
    public static <T> ClassOfContractExecution<T> createClassOfContractExecution(final T id) {
        return new ClassOfContractExecutionImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfContractProcess} with a T.
     *
     * @param id
     *            ID of the ClassOfContractProcess.
     * @return A ClassOfContractProcess instance.
     */
    public static <T> ClassOfContractProcess<T> createClassOfContractProcess(final T id) {
        return new ClassOfContractProcessImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfEvent} with a T.
     *
     * @param id
     *            ID of the ClassOfEvent.
     * @return A ClassOfEvent instance.
     */
    public static <T> ClassOfEvent<T> createClassOfEvent(final T id) {
        return new ClassOfEventImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfFunctionalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfFunctionalObject.
     * @return A ClassOfFunctionalObject instance.
     */
    public static <T> ClassOfFunctionalObject<T> createClassOfFunctionalObject(final T id) {
        return new ClassOfFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfFunctionalSystem} with a T.
     *
     * @param id
     *            ID of the ClassOfFunctionalSystem.
     * @return A ClassOfFunctionalSystem instance.
     */
    public static <T> ClassOfFunctionalSystem<T> createClassOfFunctionalSystem(final T id) {
        return new ClassOfFunctionalSystemImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfFunctionalSystemComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfFunctionalSystemComponent.
     * @return A ClassOfFunctionalSystemComponent instance.
     */
    public static <T> ClassOfFunctionalSystemComponent<T> createClassOfFunctionalSystemComponent(final T id) {
        return new ClassOfFunctionalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfInPlaceBiologicalComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfInPlaceBiologicalComponent.
     * @return A ClassOfInPlaceBiologicalComponent instance.
     */
    public static <T> ClassOfInPlaceBiologicalComponent<T> createClassOfInPlaceBiologicalComponent(final T id) {
        return new ClassOfInPlaceBiologicalComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfIndividual} with a T.
     *
     * @param id
     *            ID of the ClassOfIndividual.
     * @return A ClassOfIndividual instance.
     */
    public static <T> ClassOfIndividual<T> createClassOfIndividual(final T id) {
        return new ClassOfIndividualImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfInstalledFunctionalSystemComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfInstalledFunctionalSystemComponent.
     * @return A ClassOfInstalledFunctionalSystemComponent instance.
     */
    public static <T> ClassOfInstalledFunctionalSystemComponent<T> createClassOfInstalledFunctionalSystemComponent(
            final T id) {
        return new ClassOfInstalledFunctionalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfInstalledObject} with a T.
     *
     * @param id
     *            ID of the ClassOfInstalledObject.
     * @return A ClassOfInstalledObject instance.
     */
    public static <T> ClassOfInstalledObject<T> createClassOfInstalledObject(final T id) {
        return new ClassOfInstalledObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfIntentionallyConstructedObject} with a T.
     *
     * @param id
     *            ID of the ClassOfIntentionallyConstructedObject.
     * @return A ClassOfIntentionallyConstructedObject instance.
     */
    public static <T> ClassOfIntentionallyConstructedObject<T> createClassOfIntentionallyConstructedObject(final T id) {
        return new ClassOfIntentionallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfOffer} with a T.
     *
     * @param id
     *            ID of the ClassOfOffer.
     * @return A ClassOfOffer instance.
     */
    public static <T> ClassOfOffer<T> createClassOfOffer(final T id) {
        return new ClassOfOfferImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfOrdinaryBiologicalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfOrdinaryBiologicalObject.
     * @return A ClassOfOrdinaryBiologicalObject instance.
     */
    public static <T> ClassOfOrdinaryBiologicalObject<T> createClassOfOrdinaryBiologicalObject(final T id) {
        return new ClassOfOrdinaryBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfOrdinaryFunctionalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfOrdinaryFunctionalObject.
     * @return A ClassOfOrdinaryFunctionalObject instance.
     */
    public static <T> ClassOfOrdinaryFunctionalObject<T> createClassOfOrdinaryFunctionalObject(final T id) {
        return new ClassOfOrdinaryFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfOrdinaryPhysicalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfOrdinaryPhysicalObject.
     * @return A ClassOfOrdinaryPhysicalObject instance.
     */
    public static <T> ClassOfOrdinaryPhysicalObject<T> createClassOfOrdinaryPhysicalObject(final T id) {
        return new ClassOfOrdinaryPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfOrganization} with a T.
     *
     * @param id
     *            ID of the ClassOfOrganization.
     * @return A ClassOfOrganization instance.
     */
    public static <T> ClassOfOrganization<T> createClassOfOrganization(final T id) {
        return new ClassOfOrganizationImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfOrganizationComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfOrganizationComponent.
     * @return A ClassOfOrganizationComponent instance.
     */
    public static <T> ClassOfOrganizationComponent<T> createClassOfOrganizationComponent(final T id) {
        return new ClassOfOrganizationComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfParticipant} with a T.
     *
     * @param id
     *            ID of the ClassOfParticipant.
     * @return A ClassOfParticipant instance.
     */
    public static <T> ClassOfParticipant<T> createClassOfParticipant(final T id) {
        return new ClassOfParticipantImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfParty} with a T.
     *
     * @param id
     *            ID of the ClassOfParty.
     * @return A ClassOfParty instance.
     */
    public static <T> ClassOfParty<T> createClassOfParty(final T id) {
        return new ClassOfPartyImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPeriodOfTime} with a T.
     *
     * @param id
     *            ID of the ClassOfPeriodOfTime.
     * @return A ClassOfPeriodOfTime instance.
     */
    public static <T> ClassOfPeriodOfTime<T> createClassOfPeriodOfTime(final T id) {
        return new ClassOfPeriodOfTimeImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPerson} with a T.
     *
     * @param id
     *            ID of the ClassOfPerson.
     * @return A ClassOfPerson instance.
     */
    public static <T> ClassOfPerson<T> createClassOfPerson(final T id) {
        return new ClassOfPersonImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPersonInPosition} with a T.
     *
     * @param id
     *            ID of the ClassOfPersonInPosition.
     * @return A ClassOfPersonInPosition instance.
     */
    public static <T> ClassOfPersonInPosition<T> createClassOfPersonInPosition(final T id) {
        return new ClassOfPersonInPositionImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPhysicalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfPhysicalObject.
     * @return A ClassOfPhysicalObject instance.
     */
    public static <T> ClassOfPhysicalObject<T> createClassOfPhysicalObject(final T id) {
        return new ClassOfPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPhysicalProperty} with a T.
     *
     * @param id
     *            ID of the ClassOfPhysicalProperty.
     * @return A ClassOfPhysicalProperty instance.
     */
    public static <T> ClassOfPhysicalProperty<T> createClassOfPhysicalProperty(final T id) {
        return new ClassOfPhysicalPropertyImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPhysicalQuantity} with a T.
     *
     * @param id
     *            ID of the ClassOfPhysicalQuantity.
     * @return A ClassOfPhysicalQuantity instance.
     */
    public static <T> ClassOfPhysicalQuantity<T> createClassOfPhysicalQuantity(final T id) {
        return new ClassOfPhysicalQuantityImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPointInTime} with a T.
     *
     * @param id
     *            ID of the ClassOfPointInTime.
     * @return A ClassOfPointInTime instance.
     */
    public static <T> ClassOfPointInTime<T> createClassOfPointInTime(final T id) {
        return new ClassOfPointInTimeImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPosition} with a T.
     *
     * @param id
     *            ID of the ClassOfPosition.
     * @return A ClassOfPosition instance.
     */
    public static <T> ClassOfPosition<T> createClassOfPosition(final T id) {
        return new ClassOfPositionImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfPossibleWorld} with a T.
     *
     * @param id
     *            ID of the ClassOfPossibleWorld.
     * @return A ClassOfPossibleWorld instance.
     */
    public static <T> ClassOfPossibleWorld<T> createClassOfPossibleWorld(final T id) {
        return new ClassOfPossibleWorldImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfReachingAgreement} with a T.
     *
     * @param id
     *            ID of the ClassOfReachingAgreement.
     * @return A ClassOfReachingAgreement instance.
     */
    public static <T> ClassOfReachingAgreement<T> createClassOfReachingAgreement(final T id) {
        return new ClassOfReachingAgreementImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfRelationship} with a T.
     *
     * @param id
     *            ID of the ClassOfRelationship.
     * @return A ClassOfRelationship instance.
     */
    public static <T> ClassOfRelationship<T> createClassOfRelationship(final T id) {
        return new ClassOfRelationshipImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfRepresentation} with a T.
     *
     * @param id
     *            ID of the ClassOfRepresentation.
     * @return A ClassOfRepresentation instance.
     */
    public static <T> ClassOfRepresentation<T> createClassOfRepresentation(final T id) {
        return new ClassOfRepresentationImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfSalesProductInstance} with a T.
     *
     * @param id
     *            ID of the ClassOfSalesProductInstance.
     * @return A ClassOfSalesProductInstance instance.
     */
    public static <T> ClassOfSalesProductInstance<T> createClassOfSalesProductInstance(final T id) {
        return new ClassOfSalesProductInstanceImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfSign} with a T.
     *
     * @param id
     *            ID of the ClassOfSign.
     * @return A ClassOfSign instance.
     */
    public static <T> ClassOfSign<T> createClassOfSign(final T id) {
        return new ClassOfSignImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfSociallyConstructedActivity} with a T.
     *
     * @param id
     *            ID of the ClassOfSociallyConstructedActivity.
     * @return A ClassOfSociallyConstructedActivity instance.
     */
    public static <T> ClassOfSociallyConstructedActivity<T> createClassOfSociallyConstructedActivity(final T id) {
        return new ClassOfSociallyConstructedActivityImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfSociallyConstructedObject} with a T.
     *
     * @param id
     *            ID of the ClassOfSociallyConstructedObject.
     * @return A ClassOfSociallyConstructedObject instance.
     */
    public static <T> ClassOfSociallyConstructedObject<T> createClassOfSociallyConstructedObject(final T id) {
        return new ClassOfSociallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfSpatioTemporalExtent} with a T.
     *
     * @param id
     *            ID of the ClassOfSpatioTemporalExtent.
     * @return A ClassOfSpatioTemporalExtent instance.
     */
    public static <T> ClassOfSpatioTemporalExtent<T> createClassOfSpatioTemporalExtent(final T id) {
        return new ClassOfSpatioTemporalExtentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfState} with a T.
     *
     * @param id
     *            ID of the ClassOfState.
     * @return A ClassOfState instance.
     */
    public static <T> ClassOfState<T> createClassOfState(final T id) {
        return new ClassOfStateImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfActivity} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfActivity.
     * @return A ClassOfStateOfActivity instance.
     */
    public static <T> ClassOfStateOfActivity<T> createClassOfStateOfActivity(final T id) {
        return new ClassOfStateOfActivityImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfAmountOfMoney} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfAmountOfMoney.
     * @return A ClassOfStateOfAmountOfMoney instance.
     */
    public static <T> ClassOfStateOfAmountOfMoney<T> createClassOfStateOfAmountOfMoney(final T id) {
        return new ClassOfStateOfAmountOfMoneyImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfAssociation} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfAssociation.
     * @return A ClassOfStateOfAssociation instance.
     */
    public static <T> ClassOfStateOfAssociation<T> createClassOfStateOfAssociation(final T id) {
        return new ClassOfStateOfAssociationImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfBiologicalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfBiologicalObject.
     * @return A ClassOfStateOfBiologicalObject instance.
     */
    public static <T> ClassOfStateOfBiologicalObject<T> createClassOfStateOfBiologicalObject(final T id) {
        return new ClassOfStateOfBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfBiologicalSystem} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfBiologicalSystem.
     * @return A ClassOfStateOfBiologicalSystem instance.
     */
    public static <T> ClassOfStateOfBiologicalSystem<T> createClassOfStateOfBiologicalSystem(final T id) {
        return new ClassOfStateOfBiologicalSystemImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfBiologicalSystemComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfBiologicalSystemComponent.
     * @return A ClassOfStateOfBiologicalSystemComponent instance.
     */
    public static <T> ClassOfStateOfBiologicalSystemComponent<T> createClassOfStateOfBiologicalSystemComponent(
            final T id) {
        return new ClassOfStateOfBiologicalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfFunctionalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfFunctionalObject.
     * @return A ClassOfStateOfFunctionalObject instance.
     */
    public static <T> ClassOfStateOfFunctionalObject<T> createClassOfStateOfFunctionalObject(final T id) {
        return new ClassOfStateOfFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfFunctionalSystem} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfFunctionalSystem.
     * @return A ClassOfStateOfFunctionalSystem instance.
     */
    public static <T> ClassOfStateOfFunctionalSystem<T> createClassOfStateOfFunctionalSystem(final T id) {
        return new ClassOfStateOfFunctionalSystemImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfFunctionalSystemComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfFunctionalSystemComponent.
     * @return A ClassOfStateOfFunctionalSystemComponent instance.
     */
    public static <T> ClassOfStateOfFunctionalSystemComponent<T> createClassOfStateOfFunctionalSystemComponent(
            final T id) {
        return new ClassOfStateOfFunctionalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfIntentionallyConstructedObject} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfIntentionallyConstructedObject.
     * @return A ClassOfStateOfIntentionallyConstructedObject instance.
     */
    public static <T> ClassOfStateOfIntentionallyConstructedObject<T> 
        createClassOfStateOfIntentionallyConstructedObject(
            final T id) {
        return new ClassOfStateOfIntentionallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfOrdinaryBiologicalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfOrdinaryBiologicalObject.
     * @return A ClassOfStateOfOrdinaryBiologicalObject instance.
     */
    public static <T> ClassOfStateOfOrdinaryBiologicalObject<T> createClassOfStateOfOrdinaryBiologicalObject(
            final T id) {
        return new ClassOfStateOfOrdinaryBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfOrdinaryFunctionalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfOrdinaryFunctionalObject.
     * @return A ClassOfStateOfOrdinaryFunctionalObject instance.
     */
    public static <T> ClassOfStateOfOrdinaryFunctionalObject<T> createClassOfStateOfOrdinaryFunctionalObject(
            final T id) {
        return new ClassOfStateOfOrdinaryFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfOrdinaryPhysicalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfOrdinaryPhysicalObject.
     * @return A ClassOfStateOfOrdinaryPhysicalObject instance.
     */
    public static <T> ClassOfStateOfOrdinaryPhysicalObject<T> createClassOfStateOfOrdinaryPhysicalObject(final T id) {
        return new ClassOfStateOfOrdinaryPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfOrganization} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfOrganization.
     * @return A ClassOfStateOfOrganization instance.
     */
    public static <T> ClassOfStateOfOrganization<T> createClassOfStateOfOrganization(final T id) {
        return new ClassOfStateOfOrganizationImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfOrganizationComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfOrganizationComponent.
     * @return A ClassOfStateOfOrganizationComponent instance.
     */
    public static <T> ClassOfStateOfOrganizationComponent<T> createClassOfStateOfOrganizationComponent(final T id) {
        return new ClassOfStateOfOrganizationComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfParty} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfParty.
     * @return A ClassOfStateOfParty instance.
     */
    public static <T> ClassOfStateOfParty<T> createClassOfStateOfParty(final T id) {
        return new ClassOfStateOfPartyImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfPerson} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfPerson.
     * @return A ClassOfStateOfPerson instance.
     */
    public static <T> ClassOfStateOfPerson<T> createClassOfStateOfPerson(final T id) {
        return new ClassOfStateOfPersonImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfPhysicalObject} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfPhysicalObject.
     * @return A ClassOfStateOfPhysicalObject instance.
     */
    public static <T> ClassOfStateOfPhysicalObject<T> createClassOfStateOfPhysicalObject(final T id) {
        return new ClassOfStateOfPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfPosition} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfPosition.
     * @return A ClassOfStateOfPosition instance.
     */
    public static <T> ClassOfStateOfPosition<T> createClassOfStateOfPosition(final T id) {
        return new ClassOfStateOfPositionImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfSalesProductInstance} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfSalesProductInstance.
     * @return A ClassOfStateOfSalesProductInstance instance.
     */
    public static <T> ClassOfStateOfSalesProductInstance<T> createClassOfStateOfSalesProductInstance(final T id) {
        return new ClassOfStateOfSalesProductInstanceImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfSign} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfSign.
     * @return A ClassOfStateOfSign instance.
     */
    public static <T> ClassOfStateOfSign<T> createClassOfStateOfSign(final T id) {
        return new ClassOfStateOfSignImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfSociallyConstructedActivity} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfSociallyConstructedActivity.
     * @return A ClassOfStateOfSociallyConstructedActivity instance.
     */
    public static <T> ClassOfStateOfSociallyConstructedActivity<T> createClassOfStateOfSociallyConstructedActivity(
            final T id) {
        return new ClassOfStateOfSociallyConstructedActivityImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfSociallyConstructedObject} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfSociallyConstructedObject.
     * @return A ClassOfStateOfSociallyConstructedObject instance.
     */
    public static <T> ClassOfStateOfSociallyConstructedObject<T> createClassOfStateOfSociallyConstructedObject(
            final T id) {
        return new ClassOfStateOfSociallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfSystem} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfSystem.
     * @return A ClassOfStateOfSystem instance.
     */
    public static <T> ClassOfStateOfSystem<T> createClassOfStateOfSystem(final T id) {
        return new ClassOfStateOfSystemImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfStateOfSystemComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfStateOfSystemComponent.
     * @return A ClassOfStateOfSystemComponent instance.
     */
    public static <T> ClassOfStateOfSystemComponent<T> createClassOfStateOfSystemComponent(final T id) {
        return new ClassOfStateOfSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfSystem} with a T.
     *
     * @param id
     *            ID of the ClassOfSystem.
     * @return A ClassOfSystem instance.
     */
    public static <T> ClassOfSystem<T> createClassOfSystem(final T id) {
        return new ClassOfSystemImpl<T>(id);
    }

    /**
     * Create a {@link ClassOfSystemComponent} with a T.
     *
     * @param id
     *            ID of the ClassOfSystemComponent.
     * @return A ClassOfSystemComponent instance.
     */
    public static <T> ClassOfSystemComponent<T> createClassOfSystemComponent(final T id) {
        return new ClassOfSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link Definition} with a T.
     *
     * @param id
     *            ID of the Definition.
     * @return A Definition instance.
     */
    public static <T> Definition<T> createDefinition(final T id) {
        return new DefinitionImpl<T>(id);
    }

    /**
     * Create a {@link Description} with a T.
     *
     * @param id
     *            ID of the Description.
     * @return A Description instance.
     */
    public static <T> Description<T> createDescription(final T id) {
        return new DescriptionImpl<T>(id);
    }

    /**
     * Create a {@link EnumeratedClass} with a T.
     *
     * @param id
     *            ID of the EnumeratedClass.
     * @return A EnumeratedClass instance.
     */
    public static <T> EnumeratedClass<T> createEnumeratedClass(final T id) {
        return new EnumeratedClassImpl<T>(id);
    }

    /**
     * Create a {@link KindOfActivity} with a T.
     *
     * @param id
     *            ID of the KindOfActivity.
     * @return A KindOfActivity instance.
     */
    public static <T> KindOfActivity<T> createKindOfActivity(final T id) {
        return new KindOfActivityImpl<T>(id);
    }

    /**
     * Create a {@link KindOfAssociation} with a T.
     *
     * @param id
     *            ID of the KindOfAssociation.
     * @return A KindOfAssociation instance.
     */
    public static <T> KindOfAssociation<T> createKindOfAssociation(final T id) {
        return new KindOfAssociationImpl<T>(id);
    }

    /**
     * Create a {@link KindOfBiologicalObject} with a T.
     *
     * @param id
     *            ID of the KindOfBiologicalObject.
     * @return A KindOfBiologicalObject instance.
     */
    public static <T> KindOfBiologicalObject<T> createKindOfBiologicalObject(final T id) {
        return new KindOfBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link KindOfBiologicalSystem} with a T.
     *
     * @param id
     *            ID of the KindOfBiologicalSystem.
     * @return A KindOfBiologicalSystem instance.
     */
    public static <T> KindOfBiologicalSystem<T> createKindOfBiologicalSystem(final T id) {
        return new KindOfBiologicalSystemImpl<T>(id);
    }

    /**
     * Create a {@link KindOfBiologicalSystemComponent} with a T.
     *
     * @param id
     *            ID of the KindOfBiologicalSystemComponent.
     * @return A KindOfBiologicalSystemComponent instance.
     */
    public static <T> KindOfBiologicalSystemComponent<T> createKindOfBiologicalSystemComponent(final T id) {
        return new KindOfBiologicalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link KindOfFunctionalObject} with a T.
     *
     * @param id
     *            ID of the KindOfFunctionalObject.
     * @return A KindOfFunctionalObject instance.
     */
    public static <T> KindOfFunctionalObject<T> createKindOfFunctionalObject(final T id) {
        return new KindOfFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link KindOfFunctionalSystem} with a T.
     *
     * @param id
     *            ID of the KindOfFunctionalSystem.
     * @return A KindOfFunctionalSystem instance.
     */
    public static <T> KindOfFunctionalSystem<T> createKindOfFunctionalSystem(final T id) {
        return new KindOfFunctionalSystemImpl<T>(id);
    }

    /**
     * Create a {@link KindOfFunctionalSystemComponent} with a T.
     *
     * @param id
     *            ID of the KindOfFunctionalSystemComponent.
     * @return A KindOfFunctionalSystemComponent instance.
     */
    public static <T> KindOfFunctionalSystemComponent<T> createKindOfFunctionalSystemComponent(final T id) {
        return new KindOfFunctionalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link KindOfIndividual} with a T.
     *
     * @param id
     *            ID of the KindOfIndividual.
     * @return A KindOfIndividual instance.
     */
    public static <T> KindOfIndividual<T> createKindOfIndividual(final T id) {
        return new KindOfIndividualImpl<T>(id);
    }

    /**
     * Create a {@link KindOfIntentionallyConstructedObject} with a T.
     *
     * @param id
     *            ID of the KindOfIntentionallyConstructedObject.
     * @return A KindOfIntentionallyConstructedObject instance.
     */
    public static <T> KindOfIntentionallyConstructedObject<T> createKindOfIntentionallyConstructedObject(final T id) {
        return new KindOfIntentionallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link KindOfOrdinaryBiologicalObject} with a T.
     *
     * @param id
     *            ID of the KindOfOrdinaryBiologicalObject.
     * @return A KindOfOrdinaryBiologicalObject instance.
     */
    public static <T> KindOfOrdinaryBiologicalObject<T> createKindOfOrdinaryBiologicalObject(final T id) {
        return new KindOfOrdinaryBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link KindOfOrdinaryFunctionalObject} with a T.
     *
     * @param id
     *            ID of the KindOfOrdinaryFunctionalObject.
     * @return A KindOfOrdinaryFunctionalObject instance.
     */
    public static <T> KindOfOrdinaryFunctionalObject<T> createKindOfOrdinaryFunctionalObject(final T id) {
        return new KindOfOrdinaryFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link KindOfOrdinaryPhysicalObject} with a T.
     *
     * @param id
     *            ID of the KindOfOrdinaryPhysicalObject.
     * @return A KindOfOrdinaryPhysicalObject instance.
     */
    public static <T> KindOfOrdinaryPhysicalObject<T> createKindOfOrdinaryPhysicalObject(final T id) {
        return new KindOfOrdinaryPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link KindOfOrganization} with a T.
     *
     * @param id
     *            ID of the KindOfOrganization.
     * @return A KindOfOrganization instance.
     */
    public static <T> KindOfOrganization<T> createKindOfOrganization(final T id) {
        return new KindOfOrganizationImpl<T>(id);
    }

    /**
     * Create a {@link KindOfOrganizationComponent} with a T.
     *
     * @param id
     *            ID of the KindOfOrganizationComponent.
     * @return A KindOfOrganizationComponent instance.
     */
    public static <T> KindOfOrganizationComponent<T> createKindOfOrganizationComponent(final T id) {
        return new KindOfOrganizationComponentImpl<T>(id);
    }

    /**
     * Create a {@link KindOfParty} with a T.
     *
     * @param id
     *            ID of the KindOfParty.
     * @return A KindOfParty instance.
     */
    public static <T> KindOfParty<T> createKindOfParty(final T id) {
        return new KindOfPartyImpl<T>(id);
    }

    /**
     * Create a {@link KindOfPerson} with a T.
     *
     * @param id
     *            ID of the KindOfPerson.
     * @return A KindOfPerson instance.
     */
    public static <T> KindOfPerson<T> createKindOfPerson(final T id) {
        return new KindOfPersonImpl<T>(id);
    }

    /**
     * Create a {@link KindOfPhysicalObject} with a T.
     *
     * @param id
     *            ID of the KindOfPhysicalObject.
     * @return A KindOfPhysicalObject instance.
     */
    public static <T> KindOfPhysicalObject<T> createKindOfPhysicalObject(final T id) {
        return new KindOfPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link KindOfPhysicalProperty} with a T.
     *
     * @param id
     *            ID of the KindOfPhysicalProperty.
     * @return A KindOfPhysicalProperty instance.
     */
    public static <T> KindOfPhysicalProperty<T> createKindOfPhysicalProperty(final T id) {
        return new KindOfPhysicalPropertyImpl<T>(id);
    }

    /**
     * Create a {@link KindOfPhysicalQuantity} with a T.
     *
     * @param id
     *            ID of the KindOfPhysicalQuantity.
     * @return A KindOfPhysicalQuantity instance.
     */
    public static <T> KindOfPhysicalQuantity<T> createKindOfPhysicalQuantity(final T id) {
        return new KindOfPhysicalQuantityImpl<T>(id);
    }

    /**
     * Create a {@link KindOfPosition} with a T.
     *
     * @param id
     *            ID of the KindOfPosition.
     * @return A KindOfPosition instance.
     */
    public static <T> KindOfPosition<T> createKindOfPosition(final T id) {
        return new KindOfPositionImpl<T>(id);
    }

    /**
     * Create a {@link KindOfRelationshipWithRestriction} with a T.
     *
     * @param id
     *            ID of the KindOfRelationshipWithRestriction.
     * @return A KindOfRelationshipWithRestriction instance.
     */
    public static <T> KindOfRelationshipWithRestriction<T> createKindOfRelationshipWithRestriction(final T id) {
        return new KindOfRelationshipWithRestrictionImpl<T>(id);
    }

    /**
     * Create a {@link KindOfRelationshipWithSignature} with a T.
     *
     * @param id
     *            ID of the KindOfRelationshipWithSignature.
     * @return A KindOfRelationshipWithSignature instance.
     */
    public static <T> KindOfRelationshipWithSignature<T> createKindOfRelationshipWithSignature(final T id) {
        return new KindOfRelationshipWithSignatureImpl<T>(id);
    }

    /**
     * Create a {@link KindOfSociallyConstructedObject} with a T.
     *
     * @param id
     *            ID of the KindOfSociallyConstructedObject.
     * @return A KindOfSociallyConstructedObject instance.
     */
    public static <T> KindOfSociallyConstructedObject<T> createKindOfSociallyConstructedObject(final T id) {
        return new KindOfSociallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link KindOfSystem} with a T.
     *
     * @param id
     *            ID of the KindOfSystem.
     * @return A KindOfSystem instance.
     */
    public static <T> KindOfSystem<T> createKindOfSystem(final T id) {
        return new KindOfSystemImpl<T>(id);
    }

    /**
     * Create a {@link KindOfSystemComponent} with a T.
     *
     * @param id
     *            ID of the KindOfSystemComponent.
     * @return A KindOfSystemComponent instance.
     */
    public static <T> KindOfSystemComponent<T> createKindOfSystemComponent(final T id) {
        return new KindOfSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link Identification} with a T.
     *
     * @param id
     *            ID of the Identification.
     * @return A Identification instance.
     */
    public static <T> Identification<T> createIdentification(final T id) {
        return new IdentificationImpl<T>(id);
    }

    /**
     * Create a {@link Pattern} with a T.
     *
     * @param id
     *            ID of the Pattern.
     * @return A Pattern instance.
     */
    public static <T> Pattern<T> createPattern(final T id) {
        return new PatternImpl<T>(id);
    }

    /**
     * Create a {@link RepresentationByPattern} with a T.
     *
     * @param id
     *            ID of the RepresentationByPattern.
     * @return A RepresentationByPattern instance.
     */
    public static <T> RepresentationByPattern<T> createRepresentationByPattern(final T id) {
        return new RepresentationByPatternImpl<T>(id);
    }

    /**
     * Create a {@link Role} with a T.
     *
     * @param id
     *            ID of the Role.
     * @return A Role instance.
     */
    public static <T> Role<T> createRole(final T id) {
        return new RoleImpl<T>(id);
    }
}
