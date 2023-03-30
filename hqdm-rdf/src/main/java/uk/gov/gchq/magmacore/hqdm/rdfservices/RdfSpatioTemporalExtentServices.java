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
import uk.gov.gchq.magmacore.hqdm.rdf.iri.HQDM;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.RDFS;
import uk.gov.gchq.magmacore.hqdm.services.SpatioTemporalExtentServices;

/**
 * Services for creating SpatioTemporalExtent objects.
 */
public class RdfSpatioTemporalExtentServices {

    /**
     * Create a {@link AbstractObject} with an IRI.
     *
     * @param id
     *            ID of the AbstractObject.
     * @return A AbstractObject instance.
     */
    public static AbstractObject<IRI> createAbstractObject(final IRI id) {
        final AbstractObject<IRI> result = SpatioTemporalExtentServices.createAbstractObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ABSTRACT_OBJECT);
        return result;
    }

    /**
     * Create a {@link AcceptanceOfOffer} with an IRI.
     *
     * @param id
     *            ID of the AcceptanceOfOffer.
     * @return A AcceptanceOfOffer instance.
     */
    public static AcceptanceOfOffer<IRI> createAcceptanceOfOffer(final IRI id) {
        final AcceptanceOfOffer<IRI> result = SpatioTemporalExtentServices.createAcceptanceOfOffer(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ACCEPTANCE_OF_OFFER);
        return result;
    }

    /**
     * Create a {@link AcceptanceOfOfferForGoods} with an IRI.
     *
     * @param id
     *            ID of the AcceptanceOfOfferForGoods.
     * @return A AcceptanceOfOfferForGoods instance.
     */
    public static AcceptanceOfOfferForGoods<IRI> createAcceptanceOfOfferForGoods(final IRI id) {
        final AcceptanceOfOfferForGoods<IRI> result = SpatioTemporalExtentServices.createAcceptanceOfOfferForGoods(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ACCEPTANCE_OF_OFFER_FOR_GOODS);
        return result;
    }

    /**
     * Create a {@link Activity} with an IRI.
     *
     * @param id
     *            ID of the Activity.
     * @return A Activity instance.
     */
    public static Activity<IRI> createActivity(final IRI id) {
        final Activity<IRI> result = SpatioTemporalExtentServices.createActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ACTIVITY);
        return result;
    }

    /**
     * Create a {@link AgreeContract} with an IRI.
     *
     * @param id
     *            ID of the AgreeContract.
     * @return A AgreeContract instance.
     */
    public static AgreeContract<IRI> createAgreeContract(final IRI id) {
        final AgreeContract<IRI> result = SpatioTemporalExtentServices.createAgreeContract(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.AGREE_CONTRACT);
        return result;
    }

    /**
     * Create a {@link AgreementExecution} with an IRI.
     *
     * @param id
     *            ID of the AgreementExecution.
     * @return A AgreementExecution instance.
     */
    public static AgreementExecution<IRI> createAgreementExecution(final IRI id) {
        final AgreementExecution<IRI> result = SpatioTemporalExtentServices.createAgreementExecution(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.AGREEMENT_EXECUTION);
        return result;
    }

    /**
     * Create a {@link AgreementProcess} with an IRI.
     *
     * @param id
     *            ID of the AgreementProcess.
     * @return A AgreementProcess instance.
     */
    public static AgreementProcess<IRI> createAgreementProcess(final IRI id) {
        final AgreementProcess<IRI> result = SpatioTemporalExtentServices.createAgreementProcess(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.AGREEMENT_PROCESS);
        return result;
    }

    /**
     * Create a {@link AmountOfMoney} with an IRI.
     *
     * @param id
     *            ID of the AmountOfMoney.
     * @return A AmountOfMoney instance.
     */
    public static AmountOfMoney<IRI> createAmountOfMoney(final IRI id) {
        final AmountOfMoney<IRI> result = SpatioTemporalExtentServices.createAmountOfMoney(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.AMOUNT_OF_MONEY);
        return result;
    }

    /**
     * Create a {@link Asset} with an IRI.
     *
     * @param id
     *            ID of the Asset.
     * @return A Asset instance.
     */
    public static Asset<IRI> createAsset(final IRI id) {
        final Asset<IRI> result = SpatioTemporalExtentServices.createAsset(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ASSET);
        return result;
    }

    /**
     * Create a {@link Association} with an IRI.
     *
     * @param id
     *            ID of the Association.
     * @return A Association instance.
     */
    public static Association<IRI> createAssociation(final IRI id) {
        final Association<IRI> result = SpatioTemporalExtentServices.createAssociation(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ASSOCIATION);
        return result;
    }

    /**
     * Create a {@link BeginningOfOwnership} with an IRI.
     *
     * @param id
     *            ID of the BeginningOfOwnership.
     * @return A BeginningOfOwnership instance.
     */
    public static BeginningOfOwnership<IRI> createBeginningOfOwnership(final IRI id) {
        final BeginningOfOwnership<IRI> result = SpatioTemporalExtentServices.createBeginningOfOwnership(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.BEGINNING_OF_OWNERSHIP);
        return result;
    }

    /**
     * Create a {@link BiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the BiologicalObject.
     * @return A BiologicalObject instance.
     */
    public static BiologicalObject<IRI> createBiologicalObject(final IRI id) {
        final BiologicalObject<IRI> result = SpatioTemporalExtentServices.createBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link BiologicalSystem} with an IRI.
     *
     * @param id
     *            ID of the BiologicalSystem.
     * @return A BiologicalSystem instance.
     */
    public static BiologicalSystem<IRI> createBiologicalSystem(final IRI id) {
        final BiologicalSystem<IRI> result = SpatioTemporalExtentServices.createBiologicalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.BIOLOGICAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link BiologicalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the BiologicalSystemComponent.
     * @return A BiologicalSystemComponent instance.
     */
    public static BiologicalSystemComponent<IRI> createBiologicalSystemComponent(final IRI id) {
        final BiologicalSystemComponent<IRI> result = SpatioTemporalExtentServices.createBiologicalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.BIOLOGICAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link ContractExecution} with an IRI.
     *
     * @param id
     *            ID of the ContractExecution.
     * @return A ContractExecution instance.
     */
    public static ContractExecution<IRI> createContractExecution(final IRI id) {
        final ContractExecution<IRI> result = SpatioTemporalExtentServices.createContractExecution(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CONTRACT_EXECUTION);
        return result;
    }

    /**
     * Create a {@link ContractProcess} with an IRI.
     *
     * @param id
     *            ID of the ContractProcess.
     * @return A ContractProcess instance.
     */
    public static ContractProcess<IRI> createContractProcess(final IRI id) {
        final ContractProcess<IRI> result = SpatioTemporalExtentServices.createContractProcess(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CONTRACT_PROCESS);
        return result;
    }

    /**
     * Create a {@link Currency} with an IRI.
     *
     * @param id
     *            ID of the Currency.
     * @return A Currency instance.
     */
    public static Currency<IRI> createCurrency(final IRI id) {
        final Currency<IRI> result = SpatioTemporalExtentServices.createCurrency(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.CURRENCY);
        return result;
    }

    /**
     * Create a {@link Employee} with an IRI.
     *
     * @param id
     *            ID of the Employee.
     * @return A Employee instance.
     */
    public static Employee<IRI> createEmployee(final IRI id) {
        final Employee<IRI> result = SpatioTemporalExtentServices.createEmployee(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.EMPLOYEE);
        return result;
    }

    /**
     * Create a {@link Employer} with an IRI.
     *
     * @param id
     *            ID of the Employer.
     * @return A Employer instance.
     */
    public static Employer<IRI> createEmployer(final IRI id) {
        final Employer<IRI> result = SpatioTemporalExtentServices.createEmployer(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.EMPLOYER);
        return result;
    }

    /**
     * Create a {@link Employment} with an IRI.
     *
     * @param id
     *            ID of the Employment.
     * @return A Employment instance.
     */
    public static Employment<IRI> createEmployment(final IRI id) {
        final Employment<IRI> result = SpatioTemporalExtentServices.createEmployment(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.EMPLOYMENT);
        return result;
    }

    /**
     * Create a {@link EndingOfOwnership} with an IRI.
     *
     * @param id
     *            ID of the EndingOfOwnership.
     * @return A EndingOfOwnership instance.
     */
    public static EndingOfOwnership<IRI> createEndingOfOwnership(final IRI id) {
        final EndingOfOwnership<IRI> result = SpatioTemporalExtentServices.createEndingOfOwnership(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ENDING_OF_OWNERSHIP);
        return result;
    }

    /**
     * Create a {@link Event} with an IRI.
     *
     * @param id
     *            ID of the Event.
     * @return A Event instance.
     */
    public static Event<IRI> createEvent(final IRI id) {
        final Event<IRI> result = SpatioTemporalExtentServices.createEvent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.EVENT);
        return result;
    }

    /**
     * Create a {@link ExchangeOfGoodsAndMoney} with an IRI.
     *
     * @param id
     *            ID of the ExchangeOfGoodsAndMoney.
     * @return A ExchangeOfGoodsAndMoney instance.
     */
    public static ExchangeOfGoodsAndMoney<IRI> createExchangeOfGoodsAndMoney(final IRI id) {
        final ExchangeOfGoodsAndMoney<IRI> result = SpatioTemporalExtentServices.createExchangeOfGoodsAndMoney(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.EXCHANGE_OF_GOODS_AND_MONEY);
        return result;
    }

    /**
     * Create a {@link FunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the FunctionalObject.
     * @return A FunctionalObject instance.
     */
    public static FunctionalObject<IRI> createFunctionalObject(final IRI id) {
        final FunctionalObject<IRI> result = SpatioTemporalExtentServices.createFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link FunctionalSystem} with an IRI.
     *
     * @param id
     *            ID of the FunctionalSystem.
     * @return A FunctionalSystem instance.
     */
    public static FunctionalSystem<IRI> createFunctionalSystem(final IRI id) {
        final FunctionalSystem<IRI> result = SpatioTemporalExtentServices.createFunctionalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.FUNCTIONAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link FunctionalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the FunctionalSystemComponent.
     * @return A FunctionalSystemComponent instance.
     */
    public static FunctionalSystemComponent<IRI> createFunctionalSystemComponent(final IRI id) {
        final FunctionalSystemComponent<IRI> result = SpatioTemporalExtentServices.createFunctionalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.FUNCTIONAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link IdentificationOfPhysicalQuantity} with an IRI.
     *
     * @param id
     *            ID of the IdentificationOfPhysicalQuantity.
     * @return A IdentificationOfPhysicalQuantity instance.
     */
    public static IdentificationOfPhysicalQuantity<IRI> createIdentificationOfPhysicalQuantity(final IRI id) {
        final IdentificationOfPhysicalQuantity<IRI> result = SpatioTemporalExtentServices
                .createIdentificationOfPhysicalQuantity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.IDENTIFICATION_OF_PHYSICAL_QUANTITY);
        return result;
    }

    /**
     * Create a {@link InPlaceBiologicalComponent} with an IRI.
     *
     * @param id
     *            ID of the InPlaceBiologicalComponent.
     * @return A InPlaceBiologicalComponent instance.
     */
    public static InPlaceBiologicalComponent<IRI> createInPlaceBiologicalComponent(final IRI id) {
        final InPlaceBiologicalComponent<IRI> result = SpatioTemporalExtentServices
                .createInPlaceBiologicalComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.IN_PLACE_BIOLOGICAL_COMPONENT);
        return result;
    }

    /**
     * Create a {@link Individual} with an IRI.
     *
     * @param id
     *            ID of the Individual.
     * @return A Individual instance.
     */
    public static Individual<IRI> createIndividual(final IRI id) {
        final Individual<IRI> result = SpatioTemporalExtentServices.createIndividual(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.INDIVIDUAL);
        return result;
    }

    /**
     * Create a {@link InstalledFunctionalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the InstalledFunctionalSystemComponent.
     * @return A InstalledFunctionalSystemComponent instance.
     */
    public static InstalledFunctionalSystemComponent<IRI> createInstalledFunctionalSystemComponent(final IRI id) {
        final InstalledFunctionalSystemComponent<IRI> result = SpatioTemporalExtentServices
                .createInstalledFunctionalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link InstalledObject} with an IRI.
     *
     * @param id
     *            ID of the InstalledObject.
     * @return A InstalledObject instance.
     */
    public static InstalledObject<IRI> createInstalledObject(final IRI id) {
        final InstalledObject<IRI> result = SpatioTemporalExtentServices.createInstalledObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.INSTALLED_OBJECT);
        return result;
    }

    /**
     * Create a {@link IntentionallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the IntentionallyConstructedObject.
     * @return A IntentionallyConstructedObject instance.
     */
    public static IntentionallyConstructedObject<IRI> createIntentionallyConstructedObject(final IRI id) {
        final IntentionallyConstructedObject<IRI> result = SpatioTemporalExtentServices
                .createIntentionallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.INTENTIONALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link LanguageCommunity} with an IRI.
     *
     * @param id
     *            ID of the LanguageCommunity.
     * @return A LanguageCommunity instance.
     */
    public static LanguageCommunity<IRI> createLanguageCommunity(final IRI id) {
        final LanguageCommunity<IRI> result = SpatioTemporalExtentServices.createLanguageCommunity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.LANGUAGE_COMMUNITY);
        return result;
    }

    /**
     * Create a {@link MoneyAsset} with an IRI.
     *
     * @param id
     *            ID of the MoneyAsset.
     * @return A MoneyAsset instance.
     */
    public static MoneyAsset<IRI> createMoneyAsset(final IRI id) {
        final MoneyAsset<IRI> result = SpatioTemporalExtentServices.createMoneyAsset(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.MONEY_ASSET);
        return result;
    }

    /**
     * Create a {@link Offer} with an IRI.
     *
     * @param id
     *            ID of the Offer.
     * @return A Offer instance.
     */
    public static Offer<IRI> createOffer(final IRI id) {
        final Offer<IRI> result = SpatioTemporalExtentServices.createOffer(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.OFFER);
        return result;
    }

    /**
     * Create a {@link OfferAndAcceptanceForGoods} with an IRI.
     *
     * @param id
     *            ID of the OfferAndAcceptanceForGoods.
     * @return A OfferAndAcceptanceForGoods instance.
     */
    public static OfferAndAcceptanceForGoods<IRI> createOfferAndAcceptanceForGoods(final IRI id) {
        final OfferAndAcceptanceForGoods<IRI> result = SpatioTemporalExtentServices
                .createOfferAndAcceptanceForGoods(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.OFFER_AND_ACCEPTANCE_FOR_GOODS);
        return result;
    }

    /**
     * Create a {@link OfferForGoods} with an IRI.
     *
     * @param id
     *            ID of the OfferForGoods.
     * @return A OfferForGoods instance.
     */
    public static OfferForGoods<IRI> createOfferForGoods(final IRI id) {
        final OfferForGoods<IRI> result = SpatioTemporalExtentServices.createOfferForGoods(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.OFFER_FOR_GOODS);
        return result;
    }

    /**
     * Create a {@link Offering} with an IRI.
     *
     * @param id
     *            ID of the Offering.
     * @return A Offering instance.
     */
    public static Offering<IRI> createOffering(final IRI id) {
        final Offering<IRI> result = SpatioTemporalExtentServices.createOffering(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.OFFERING);
        return result;
    }

    /**
     * Create a {@link OrdinaryBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the OrdinaryBiologicalObject.
     * @return A OrdinaryBiologicalObject instance.
     */
    public static OrdinaryBiologicalObject<IRI> createOrdinaryBiologicalObject(final IRI id) {
        final OrdinaryBiologicalObject<IRI> result = SpatioTemporalExtentServices.createOrdinaryBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ORDINARY_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link OrdinaryFunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the OrdinaryFunctionalObject.
     * @return A OrdinaryFunctionalObject instance.
     */
    public static OrdinaryFunctionalObject<IRI> createOrdinaryFunctionalObject(final IRI id) {
        final OrdinaryFunctionalObject<IRI> result = SpatioTemporalExtentServices.createOrdinaryFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ORDINARY_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link OrdinaryPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the OrdinaryPhysicalObject.
     * @return A OrdinaryPhysicalObject instance.
     */
    public static OrdinaryPhysicalObject<IRI> createOrdinaryPhysicalObject(final IRI id) {
        final OrdinaryPhysicalObject<IRI> result = SpatioTemporalExtentServices.createOrdinaryPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ORDINARY_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link Organization} with an IRI.
     *
     * @param id
     *            ID of the Organization.
     * @return A Organization instance.
     */
    public static Organization<IRI> createOrganization(final IRI id) {
        final Organization<IRI> result = SpatioTemporalExtentServices.createOrganization(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ORGANIZATION);
        return result;
    }

    /**
     * Create a {@link OrganizationComponent} with an IRI.
     *
     * @param id
     *            ID of the OrganizationComponent.
     * @return A OrganizationComponent instance.
     */
    public static OrganizationComponent<IRI> createOrganizationComponent(final IRI id) {
        final OrganizationComponent<IRI> result = SpatioTemporalExtentServices.createOrganizationComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.ORGANIZATION_COMPONENT);
        return result;
    }

    /**
     * Create a {@link Owner} with an IRI.
     *
     * @param id
     *            ID of the Owner.
     * @return A Owner instance.
     */
    public static Owner<IRI> createOwner(final IRI id) {
        final Owner<IRI> result = SpatioTemporalExtentServices.createOwner(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.OWNER);
        return result;
    }

    /**
     * Create a {@link Ownership} with an IRI.
     *
     * @param id
     *            ID of the Ownership.
     * @return A Ownership instance.
     */
    public static Ownership<IRI> createOwnership(final IRI id) {
        final Ownership<IRI> result = SpatioTemporalExtentServices.createOwnership(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.OWNERSHIP);
        return result;
    }

    /**
     * Create a {@link Participant} with an IRI.
     *
     * @param id
     *            ID of the Participant.
     * @return A Participant instance.
     */
    public static Participant<IRI> createParticipant(final IRI id) {
        final Participant<IRI> result = SpatioTemporalExtentServices.createParticipant(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT);
        return result;
    }

    /**
     * Create a {@link ParticipantInActivityOrAssociation} with an IRI.
     *
     * @param id
     *            ID of the ParticipantInActivityOrAssociation.
     * @return A ParticipantInActivityOrAssociation instance.
     */
    public static ParticipantInActivityOrAssociation<IRI> createParticipantInActivityOrAssociation(final IRI id) {
        final ParticipantInActivityOrAssociation<IRI> result = SpatioTemporalExtentServices
                .createParticipantInActivityOrAssociation(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PARTICIPANT_IN_ACTIVITY_OR_ASSOCIATION);
        return result;
    }

    /**
     * Create a {@link Party} with an IRI.
     *
     * @param id
     *            ID of the Party.
     * @return A Party instance.
     */
    public static Party<IRI> createParty(final IRI id) {
        final Party<IRI> result = SpatioTemporalExtentServices.createParty(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PARTY);
        return result;
    }

    /**
     * Create a {@link PeriodOfTime} with an IRI.
     *
     * @param id
     *            ID of the PeriodOfTime.
     * @return A PeriodOfTime instance.
     */
    public static PeriodOfTime<IRI> createPeriodOfTime(final IRI id) {
        final PeriodOfTime<IRI> result = SpatioTemporalExtentServices.createPeriodOfTime(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PERIOD_OF_TIME);
        return result;
    }

    /**
     * Create a {@link Person} with an IRI.
     *
     * @param id
     *            ID of the Person.
     * @return A Person instance.
     */
    public static Person<IRI> createPerson(final IRI id) {
        final Person<IRI> result = SpatioTemporalExtentServices.createPerson(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PERSON);
        return result;
    }

    /**
     * Create a {@link PersonInPosition} with an IRI.
     *
     * @param id
     *            ID of the PersonInPosition.
     * @return A PersonInPosition instance.
     */
    public static PersonInPosition<IRI> createPersonInPosition(final IRI id) {
        final PersonInPosition<IRI> result = SpatioTemporalExtentServices.createPersonInPosition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PERSON_IN_POSITION);
        return result;
    }

    /**
     * Create a {@link PhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the PhysicalObject.
     * @return A PhysicalObject instance.
     */
    public static PhysicalObject<IRI> createPhysicalObject(final IRI id) {
        final PhysicalObject<IRI> result = SpatioTemporalExtentServices.createPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link PhysicalProperty} with an IRI.
     *
     * @param id
     *            ID of the PhysicalProperty.
     * @return A PhysicalProperty instance.
     */
    public static PhysicalProperty<IRI> createPhysicalProperty(final IRI id) {
        final PhysicalProperty<IRI> result = SpatioTemporalExtentServices.createPhysicalProperty(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PHYSICAL_PROPERTY);
        return result;
    }

    /**
     * Create a {@link PhysicalPropertyRange} with an IRI.
     *
     * @param id
     *            ID of the PhysicalPropertyRange.
     * @return A PhysicalPropertyRange instance.
     */
    public static PhysicalPropertyRange<IRI> createPhysicalPropertyRange(final IRI id) {
        final PhysicalPropertyRange<IRI> result = SpatioTemporalExtentServices.createPhysicalPropertyRange(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PHYSICAL_PROPERTY_RANGE);
        return result;
    }

    /**
     * Create a {@link PhysicalQuantity} with an IRI.
     *
     * @param id
     *            ID of the PhysicalQuantity.
     * @return A PhysicalQuantity instance.
     */
    public static PhysicalQuantity<IRI> createPhysicalQuantity(final IRI id) {
        final PhysicalQuantity<IRI> result = SpatioTemporalExtentServices.createPhysicalQuantity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PHYSICAL_QUANTITY);
        return result;
    }

    /**
     * Create a {@link PhysicalQuantityRange} with an IRI.
     *
     * @param id
     *            ID of the PhysicalQuantityRange.
     * @return A PhysicalQuantityRange instance.
     */
    public static PhysicalQuantityRange<IRI> createPhysicalQuantityRange(final IRI id) {
        final PhysicalQuantityRange<IRI> result = SpatioTemporalExtentServices.createPhysicalQuantityRange(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PHYSICAL_QUANTITY_RANGE);
        return result;
    }

    /**
     * Create a {@link Plan} with an IRI.
     *
     * @param id
     *            ID of the Plan.
     * @return A Plan instance.
     */
    public static Plan<IRI> createPlan(final IRI id) {
        final Plan<IRI> result = SpatioTemporalExtentServices.createPlan(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PLAN);
        return result;
    }

    /**
     * Create a {@link PointInTime} with an IRI.
     *
     * @param id
     *            ID of the PointInTime.
     * @return A PointInTime instance.
     */
    public static PointInTime<IRI> createPointInTime(final IRI id) {
        final PointInTime<IRI> result = SpatioTemporalExtentServices.createPointInTime(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.POINT_IN_TIME);
        return result;
    }

    /**
     * Create a {@link Position} with an IRI.
     *
     * @param id
     *            ID of the Position.
     * @return A Position instance.
     */
    public static Position<IRI> createPosition(final IRI id) {
        final Position<IRI> result = SpatioTemporalExtentServices.createPosition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.POSITION);
        return result;
    }

    /**
     * Create a {@link PossibleWorld} with an IRI.
     *
     * @param id
     *            ID of the PossibleWorld.
     * @return A PossibleWorld instance.
     */
    public static PossibleWorld<IRI> createPossibleWorld(final IRI id) {
        final PossibleWorld<IRI> result = SpatioTemporalExtentServices.createPossibleWorld(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.POSSIBLE_WORLD);
        return result;
    }

    /**
     * Create a {@link Price} with an IRI.
     *
     * @param id
     *            ID of the Price.
     * @return A Price instance.
     */
    public static Price<IRI> createPrice(final IRI id) {
        final Price<IRI> result = SpatioTemporalExtentServices.createPrice(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PRICE);
        return result;
    }

    /**
     * Create a {@link ProductBrand} with an IRI.
     *
     * @param id
     *            ID of the ProductBrand.
     * @return A ProductBrand instance.
     */
    public static ProductBrand<IRI> createProductBrand(final IRI id) {
        final ProductBrand<IRI> result = SpatioTemporalExtentServices.createProductBrand(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PRODUCT_BRAND);
        return result;
    }

    /**
     * Create a {@link ProductOffering} with an IRI.
     *
     * @param id
     *            ID of the ProductOffering.
     * @return A ProductOffering instance.
     */
    public static ProductOffering<IRI> createProductOffering(final IRI id) {
        final ProductOffering<IRI> result = SpatioTemporalExtentServices.createProductOffering(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.PRODUCT_OFFERING);
        return result;
    }

    /**
     * Create a {@link ReachingAgreement} with an IRI.
     *
     * @param id
     *            ID of the ReachingAgreement.
     * @return A ReachingAgreement instance.
     */
    public static ReachingAgreement<IRI> createReachingAgreement(final IRI id) {
        final ReachingAgreement<IRI> result = SpatioTemporalExtentServices.createReachingAgreement(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.REACHING_AGREEMENT);
        return result;
    }

    /**
     * Create a {@link RecognizingLanguageCommunity} with an IRI.
     *
     * @param id
     *            ID of the RecognizingLanguageCommunity.
     * @return A RecognizingLanguageCommunity instance.
     */
    public static RecognizingLanguageCommunity<IRI> createRecognizingLanguageCommunity(final IRI id) {
        final RecognizingLanguageCommunity<IRI> result = SpatioTemporalExtentServices
                .createRecognizingLanguageCommunity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.RECOGNIZING_LANGUAGE_COMMUNITY);
        return result;
    }

    /**
     * Create a {@link RepresentationBySign} with an IRI.
     *
     * @param id
     *            ID of the RepresentationBySign.
     * @return A RepresentationBySign instance.
     */
    public static RepresentationBySign<IRI> createRepresentationBySign(final IRI id) {
        final RepresentationBySign<IRI> result = SpatioTemporalExtentServices.createRepresentationBySign(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.REPRESENTATION_BY_SIGN);
        return result;
    }

    /**
     * Create a {@link Requirement} with an IRI.
     *
     * @param id
     *            ID of the Requirement.
     * @return A Requirement instance.
     */
    public static Requirement<IRI> createRequirement(final IRI id) {
        final Requirement<IRI> result = SpatioTemporalExtentServices.createRequirement(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.REQUIREMENT);
        return result;
    }

    /**
     * Create a {@link RequirementSpecification} with an IRI.
     *
     * @param id
     *            ID of the RequirementSpecification.
     * @return A RequirementSpecification instance.
     */
    public static RequirementSpecification<IRI> createRequirementSpecification(final IRI id) {
        final RequirementSpecification<IRI> result = SpatioTemporalExtentServices.createRequirementSpecification(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.REQUIREMENT_SPECIFICATION);
        return result;
    }

    /**
     * Create a {@link SaleOfGoods} with an IRI.
     *
     * @param id
     *            ID of the SaleOfGoods.
     * @return A SaleOfGoods instance.
     */
    public static SaleOfGoods<IRI> createSaleOfGoods(final IRI id) {
        final SaleOfGoods<IRI> result = SpatioTemporalExtentServices.createSaleOfGoods(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SALE_OF_GOODS);
        return result;
    }

    /**
     * Create a {@link SalesProduct} with an IRI.
     *
     * @param id
     *            ID of the SalesProduct.
     * @return A SalesProduct instance.
     */
    public static SalesProduct<IRI> createSalesProduct(final IRI id) {
        final SalesProduct<IRI> result = SpatioTemporalExtentServices.createSalesProduct(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SALES_PRODUCT);
        return result;
    }

    /**
     * Create a {@link SalesProductInstance} with an IRI.
     *
     * @param id
     *            ID of the SalesProductInstance.
     * @return A SalesProductInstance instance.
     */
    public static SalesProductInstance<IRI> createSalesProductInstance(final IRI id) {
        final SalesProductInstance<IRI> result = SpatioTemporalExtentServices.createSalesProductInstance(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SALES_PRODUCT_INSTANCE);
        return result;
    }

    /**
     * Create a {@link SalesProductVersion} with an IRI.
     *
     * @param id
     *            ID of the SalesProductVersion.
     * @return A SalesProductVersion instance.
     */
    public static SalesProductVersion<IRI> createSalesProductVersion(final IRI id) {
        final SalesProductVersion<IRI> result = SpatioTemporalExtentServices.createSalesProductVersion(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SALES_PRODUCT_VERSION);
        return result;
    }

    /**
     * Create a {@link Sign} with an IRI.
     *
     * @param id
     *            ID of the Sign.
     * @return A Sign instance.
     */
    public static Sign<IRI> createSign(final IRI id) {
        final Sign<IRI> result = SpatioTemporalExtentServices.createSign(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SIGN);
        return result;
    }

    /**
     * Create a {@link SociallyConstructedActivity} with an IRI.
     *
     * @param id
     *            ID of the SociallyConstructedActivity.
     * @return A SociallyConstructedActivity instance.
     */
    public static SociallyConstructedActivity<IRI> createSociallyConstructedActivity(final IRI id) {
        final SociallyConstructedActivity<IRI> result = SpatioTemporalExtentServices
                .createSociallyConstructedActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SOCIALLY_CONSTRUCTED_ACTIVITY);
        return result;
    }

    /**
     * Create a {@link SociallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the SociallyConstructedObject.
     * @return A SociallyConstructedObject instance.
     */
    public static SociallyConstructedObject<IRI> createSociallyConstructedObject(final IRI id) {
        final SociallyConstructedObject<IRI> result = SpatioTemporalExtentServices.createSociallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SOCIALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link SpatioTemporalExtent} with an IRI.
     *
     * @param id
     *            ID of the SpatioTemporalExtent.
     * @return A SpatioTemporalExtent instance.
     */
    public static SpatioTemporalExtent<IRI> createSpatioTemporalExtent(final IRI id) {
        final SpatioTemporalExtent<IRI> result = SpatioTemporalExtentServices.createSpatioTemporalExtent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SPATIO_TEMPORAL_EXTENT);
        return result;
    }

    /**
     * Create a {@link State} with an IRI.
     *
     * @param id
     *            ID of the State.
     * @return A State instance.
     */
    public static State<IRI> createState(final IRI id) {
        final State<IRI> result = SpatioTemporalExtentServices.createState(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE);
        return result;
    }

    /**
     * Create a {@link StateOfActivity} with an IRI.
     *
     * @param id
     *            ID of the StateOfActivity.
     * @return A StateOfActivity instance.
     */
    public static StateOfActivity<IRI> createStateOfActivity(final IRI id) {
        final StateOfActivity<IRI> result = SpatioTemporalExtentServices.createStateOfActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_ACTIVITY);
        return result;
    }

    /**
     * Create a {@link StateOfAmountOfMoney} with an IRI.
     *
     * @param id
     *            ID of the StateOfAmountOfMoney.
     * @return A StateOfAmountOfMoney instance.
     */
    public static StateOfAmountOfMoney<IRI> createStateOfAmountOfMoney(final IRI id) {
        final StateOfAmountOfMoney<IRI> result = SpatioTemporalExtentServices.createStateOfAmountOfMoney(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_AMOUNT_OF_MONEY);
        return result;
    }

    /**
     * Create a {@link StateOfAssociation} with an IRI.
     *
     * @param id
     *            ID of the StateOfAssociation.
     * @return A StateOfAssociation instance.
     */
    public static StateOfAssociation<IRI> createStateOfAssociation(final IRI id) {
        final StateOfAssociation<IRI> result = SpatioTemporalExtentServices.createStateOfAssociation(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_ASSOCIATION);
        return result;
    }

    /**
     * Create a {@link StateOfBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the StateOfBiologicalObject.
     * @return A StateOfBiologicalObject instance.
     */
    public static StateOfBiologicalObject<IRI> createStateOfBiologicalObject(final IRI id) {
        final StateOfBiologicalObject<IRI> result = SpatioTemporalExtentServices.createStateOfBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link StateOfBiologicalSystem} with an IRI.
     *
     * @param id
     *            ID of the StateOfBiologicalSystem.
     * @return A StateOfBiologicalSystem instance.
     */
    public static StateOfBiologicalSystem<IRI> createStateOfBiologicalSystem(final IRI id) {
        final StateOfBiologicalSystem<IRI> result = SpatioTemporalExtentServices.createStateOfBiologicalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_BIOLOGICAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link StateOfBiologicalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the StateOfBiologicalSystemComponent.
     * @return A StateOfBiologicalSystemComponent instance.
     */
    public static StateOfBiologicalSystemComponent<IRI> createStateOfBiologicalSystemComponent(final IRI id) {
        final StateOfBiologicalSystemComponent<IRI> result = SpatioTemporalExtentServices
                .createStateOfBiologicalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_BIOLOGICAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link StateOfFunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the StateOfFunctionalObject.
     * @return A StateOfFunctionalObject instance.
     */
    public static StateOfFunctionalObject<IRI> createStateOfFunctionalObject(final IRI id) {
        final StateOfFunctionalObject<IRI> result = SpatioTemporalExtentServices.createStateOfFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link StateOfFunctionalSystem} with an IRI.
     *
     * @param id
     *            ID of the StateOfFunctionalSystem.
     * @return A StateOfFunctionalSystem instance.
     */
    public static StateOfFunctionalSystem<IRI> createStateOfFunctionalSystem(final IRI id) {
        final StateOfFunctionalSystem<IRI> result = SpatioTemporalExtentServices.createStateOfFunctionalSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_FUNCTIONAL_SYSTEM);
        return result;
    }

    /**
     * Create a {@link StateOfFunctionalSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the StateOfFunctionalSystemComponent.
     * @return A StateOfFunctionalSystemComponent instance.
     */
    public static StateOfFunctionalSystemComponent<IRI> createStateOfFunctionalSystemComponent(final IRI id) {
        final StateOfFunctionalSystemComponent<IRI> result = SpatioTemporalExtentServices
                .createStateOfFunctionalSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_FUNCTIONAL_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link StateOfIntentionallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the StateOfIntentionallyConstructedObject.
     * @return A StateOfIntentionallyConstructedObject instance.
     */
    public static StateOfIntentionallyConstructedObject<IRI> createStateOfIntentionallyConstructedObject(final IRI id) {
        final StateOfIntentionallyConstructedObject<IRI> result = SpatioTemporalExtentServices
                .createStateOfIntentionallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_INTENTIONALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link StateOfLanguageCommunity} with an IRI.
     *
     * @param id
     *            ID of the StateOfLanguageCommunity.
     * @return A StateOfLanguageCommunity instance.
     */
    public static StateOfLanguageCommunity<IRI> createStateOfLanguageCommunity(final IRI id) {
        final StateOfLanguageCommunity<IRI> result = SpatioTemporalExtentServices.createStateOfLanguageCommunity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_LANGUAGE_COMMUNITY);
        return result;
    }

    /**
     * Create a {@link StateOfOrdinaryBiologicalObject} with an IRI.
     *
     * @param id
     *            ID of the StateOfOrdinaryBiologicalObject.
     * @return A StateOfOrdinaryBiologicalObject instance.
     */
    public static StateOfOrdinaryBiologicalObject<IRI> createStateOfOrdinaryBiologicalObject(final IRI id) {
        final StateOfOrdinaryBiologicalObject<IRI> result = SpatioTemporalExtentServices
                .createStateOfOrdinaryBiologicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_ORDINARY_BIOLOGICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link StateOfOrdinaryFunctionalObject} with an IRI.
     *
     * @param id
     *            ID of the StateOfOrdinaryFunctionalObject.
     * @return A StateOfOrdinaryFunctionalObject instance.
     */
    public static StateOfOrdinaryFunctionalObject<IRI> createStateOfOrdinaryFunctionalObject(final IRI id) {
        final StateOfOrdinaryFunctionalObject<IRI> result = SpatioTemporalExtentServices
                .createStateOfOrdinaryFunctionalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_ORDINARY_FUNCTIONAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link StateOfOrdinaryPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the StateOfOrdinaryPhysicalObject.
     * @return A StateOfOrdinaryPhysicalObject instance.
     */
    public static StateOfOrdinaryPhysicalObject<IRI> createStateOfOrdinaryPhysicalObject(final IRI id) {
        final StateOfOrdinaryPhysicalObject<IRI> result = SpatioTemporalExtentServices
                .createStateOfOrdinaryPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_ORDINARY_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link StateOfOrganization} with an IRI.
     *
     * @param id
     *            ID of the StateOfOrganization.
     * @return A StateOfOrganization instance.
     */
    public static StateOfOrganization<IRI> createStateOfOrganization(final IRI id) {
        final StateOfOrganization<IRI> result = SpatioTemporalExtentServices.createStateOfOrganization(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_ORGANIZATION);
        return result;
    }

    /**
     * Create a {@link StateOfOrganizationComponent} with an IRI.
     *
     * @param id
     *            ID of the StateOfOrganizationComponent.
     * @return A StateOfOrganizationComponent instance.
     */
    public static StateOfOrganizationComponent<IRI> createStateOfOrganizationComponent(final IRI id) {
        final StateOfOrganizationComponent<IRI> result = SpatioTemporalExtentServices
                .createStateOfOrganizationComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_ORGANIZATION_COMPONENT);
        return result;
    }

    /**
     * Create a {@link StateOfParty} with an IRI.
     *
     * @param id
     *            ID of the StateOfParty.
     * @return A StateOfParty instance.
     */
    public static StateOfParty<IRI> createStateOfParty(final IRI id) {
        final StateOfParty<IRI> result = SpatioTemporalExtentServices.createStateOfParty(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PARTY);
        return result;
    }

    /**
     * Create a {@link StateOfPerson} with an IRI.
     *
     * @param id
     *            ID of the StateOfPerson.
     * @return A StateOfPerson instance.
     */
    public static StateOfPerson<IRI> createStateOfPerson(final IRI id) {
        final StateOfPerson<IRI> result = SpatioTemporalExtentServices.createStateOfPerson(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PERSON);
        return result;
    }

    /**
     * Create a {@link StateOfPhysicalObject} with an IRI.
     *
     * @param id
     *            ID of the StateOfPhysicalObject.
     * @return A StateOfPhysicalObject instance.
     */
    public static StateOfPhysicalObject<IRI> createStateOfPhysicalObject(final IRI id) {
        final StateOfPhysicalObject<IRI> result = SpatioTemporalExtentServices.createStateOfPhysicalObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_PHYSICAL_OBJECT);
        return result;
    }

    /**
     * Create a {@link StateOfPosition} with an IRI.
     *
     * @param id
     *            ID of the StateOfPosition.
     * @return A StateOfPosition instance.
     */
    public static StateOfPosition<IRI> createStateOfPosition(final IRI id) {
        final StateOfPosition<IRI> result = SpatioTemporalExtentServices.createStateOfPosition(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_POSITION);
        return result;
    }

    /**
     * Create a {@link StateOfSalesProductInstance} with an IRI.
     *
     * @param id
     *            ID of the StateOfSalesProductInstance.
     * @return A StateOfSalesProductInstance instance.
     */
    public static StateOfSalesProductInstance<IRI> createStateOfSalesProductInstance(final IRI id) {
        final StateOfSalesProductInstance<IRI> result = SpatioTemporalExtentServices
                .createStateOfSalesProductInstance(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_SALES_PRODUCT_INSTANCE);
        return result;
    }

    /**
     * Create a {@link StateOfSign} with an IRI.
     *
     * @param id
     *            ID of the StateOfSign.
     * @return A StateOfSign instance.
     */
    public static StateOfSign<IRI> createStateOfSign(final IRI id) {
        final StateOfSign<IRI> result = SpatioTemporalExtentServices.createStateOfSign(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_SIGN);
        return result;
    }

    /**
     * Create a {@link StateOfSociallyConstructedActivity} with an IRI.
     *
     * @param id
     *            ID of the StateOfSociallyConstructedActivity.
     * @return A StateOfSociallyConstructedActivity instance.
     */
    public static StateOfSociallyConstructedActivity<IRI> createStateOfSociallyConstructedActivity(final IRI id) {
        final StateOfSociallyConstructedActivity<IRI> result = SpatioTemporalExtentServices
                .createStateOfSociallyConstructedActivity(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_SOCIALLY_CONSTRUCTED_ACTIVITY);
        return result;
    }

    /**
     * Create a {@link StateOfSociallyConstructedObject} with an IRI.
     *
     * @param id
     *            ID of the StateOfSociallyConstructedObject.
     * @return A StateOfSociallyConstructedObject instance.
     */
    public static StateOfSociallyConstructedObject<IRI> createStateOfSociallyConstructedObject(final IRI id) {
        final StateOfSociallyConstructedObject<IRI> result = SpatioTemporalExtentServices
                .createStateOfSociallyConstructedObject(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_SOCIALLY_CONSTRUCTED_OBJECT);
        return result;
    }

    /**
     * Create a {@link StateOfSystem} with an IRI.
     *
     * @param id
     *            ID of the StateOfSystem.
     * @return A StateOfSystem instance.
     */
    public static StateOfSystem<IRI> createStateOfSystem(final IRI id) {
        final StateOfSystem<IRI> result = SpatioTemporalExtentServices.createStateOfSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_SYSTEM);
        return result;
    }

    /**
     * Create a {@link StateOfSystemComponent} with an IRI.
     *
     * @param id
     *            ID of the StateOfSystemComponent.
     * @return A StateOfSystemComponent instance.
     */
    public static StateOfSystemComponent<IRI> createStateOfSystemComponent(final IRI id) {
        final StateOfSystemComponent<IRI> result = SpatioTemporalExtentServices.createStateOfSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.STATE_OF_SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link uk.gov.gchq.magmacore.hqdm.model.System} with an IRI.
     *
     * @param id
     *            ID of the System.
     * @return A System instance.
     */
    public static uk.gov.gchq.magmacore.hqdm.model.System<IRI> createSystem(final IRI id) {
        final uk.gov.gchq.magmacore.hqdm.model.System<IRI> result = SpatioTemporalExtentServices.createSystem(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SYSTEM);
        return result;
    }

    /**
     * Create a {@link SystemComponent} with an IRI.
     *
     * @param id
     *            ID of the SystemComponent.
     * @return A SystemComponent instance.
     */
    public static SystemComponent<IRI> createSystemComponent(final IRI id) {
        final SystemComponent<IRI> result = SpatioTemporalExtentServices.createSystemComponent(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.SYSTEM_COMPONENT);
        return result;
    }

    /**
     * Create a {@link Thing} with an IRI.
     *
     * @param id
     *            ID of the Thing.
     * @return A Thing instance.
     */
    public static Thing<IRI> createThing(final IRI id) {
        final Thing<IRI> result = SpatioTemporalExtentServices.createThing(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.THING);
        return result;
    }

    /**
     * Create a {@link TransferOfOwnership} with an IRI.
     *
     * @param id
     *            ID of the TransferOfOwnership.
     * @return A TransferOfOwnership instance.
     */
    public static TransferOfOwnership<IRI> createTransferOfOwnership(final IRI id) {
        final TransferOfOwnership<IRI> result = SpatioTemporalExtentServices.createTransferOfOwnership(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.TRANSFER_OF_OWNERSHIP);
        return result;
    }

    /**
     * Create a {@link TransferOfOwnershipOfMoney} with an IRI.
     *
     * @param id
     *            ID of the TransferOfOwnershipOfMoney.
     * @return A TransferOfOwnershipOfMoney instance.
     */
    public static TransferOfOwnershipOfMoney<IRI> createTransferOfOwnershipOfMoney(final IRI id) {
        final TransferOfOwnershipOfMoney<IRI> result = SpatioTemporalExtentServices
                .createTransferOfOwnershipOfMoney(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.TRANSFER_OF_OWNERSHIP_OF_MONEY);
        return result;
    }

    /**
     * Create a {@link Transferee} with an IRI.
     *
     * @param id
     *            ID of the Transferee.
     * @return A Transferee instance.
     */
    public static Transferee<IRI> createTransferee(final IRI id) {
        final Transferee<IRI> result = SpatioTemporalExtentServices.createTransferee(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.TRANSFEREE);
        return result;
    }

    /**
     * Create a {@link Transferor} with an IRI.
     *
     * @param id
     *            ID of the Transferor.
     * @return A Transferor instance.
     */
    public static Transferor<IRI> createTransferor(final IRI id) {
        final Transferor<IRI> result = SpatioTemporalExtentServices.createTransferor(id);
        result.addValue(RDFS.RDF_TYPE, HQDM.TRANSFEROR);
        return result;
    }
}
