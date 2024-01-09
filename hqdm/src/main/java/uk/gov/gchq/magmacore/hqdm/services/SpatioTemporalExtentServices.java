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
import uk.gov.gchq.magmacore.hqdm.model.impl.*;
import uk.gov.gchq.magmacore.hqdm.rdf.iri.IRI;

/**
 * Services for creating SpatioTemporalExtent objects.
 */
public class SpatioTemporalExtentServices {

    /**
     * Create a {@link AbstractObject} with an String.
     *
     * @param id ID of the AbstractObject.
     * @return A AbstractObject instance.
     */
    public static AbstractObject createAbstractObject(final IRI id) {
        return new AbstractObjectImpl(id);
    }

    /**
     * Create a {@link AcceptanceOfOffer} with an String.
     *
     * @param id ID of the AcceptanceOfOffer.
     * @return A AcceptanceOfOffer instance.
     */
    public static AcceptanceOfOffer createAcceptanceOfOffer(final IRI id) {
        return new AcceptanceOfOfferImpl(id);
    }

    /**
     * Create a {@link AcceptanceOfOfferForGoods} with an String.
     *
     * @param id ID of the AcceptanceOfOfferForGoods.
     * @return A AcceptanceOfOfferForGoods instance.
     */
    public static AcceptanceOfOfferForGoods createAcceptanceOfOfferForGoods(final IRI id) {
        return new AcceptanceOfOfferForGoodsImpl(id);
    }

    /**
     * Create a {@link Activity} with an String.
     *
     * @param id ID of the Activity.
     * @return A Activity instance.
     */
    public static Activity createActivity(final IRI id) {
        return new ActivityImpl(id);
    }

    /**
     * Create a {@link AgreeContract} with an String.
     *
     * @param id ID of the AgreeContract.
     * @return A AgreeContract instance.
     */
    public static AgreeContract createAgreeContract(final IRI id) {
        return new AgreeContractImpl(id);
    }

    /**
     * Create a {@link AgreementExecution} with an String.
     *
     * @param id ID of the AgreementExecution.
     * @return A AgreementExecution instance.
     */
    public static AgreementExecution createAgreementExecution(final IRI id) {
        return new AgreementExecutionImpl(id);
    }

    /**
     * Create a {@link AgreementProcess} with an String.
     *
     * @param id ID of the AgreementProcess.
     * @return A AgreementProcess instance.
     */
    public static AgreementProcess createAgreementProcess(final IRI id) {
        return new AgreementProcessImpl(id);
    }

    /**
     * Create a {@link AmountOfMoney} with an String.
     *
     * @param id ID of the AmountOfMoney.
     * @return A AmountOfMoney instance.
     */
    public static AmountOfMoney createAmountOfMoney(final IRI id) {
        return new AmountOfMoneyImpl(id);
    }

    /**
     * Create a {@link Asset} with an String.
     *
     * @param id ID of the Asset.
     * @return A Asset instance.
     */
    public static Asset createAsset(final IRI id) {
        return new AssetImpl(id);
    }

    /**
     * Create a {@link Association} with an String.
     *
     * @param id ID of the Association.
     * @return A Association instance.
     */
    public static Association createAssociation(final IRI id) {
        return new AssociationImpl(id);
    }

    /**
     * Create a {@link BeginningOfOwnership} with an String.
     *
     * @param id ID of the BeginningOfOwnership.
     * @return A BeginningOfOwnership instance.
     */
    public static BeginningOfOwnership createBeginningOfOwnership(final IRI id) {
        return new BeginningOfOwnershipImpl(id);
    }

    /**
     * Create a {@link BiologicalObject} with an String.
     *
     * @param id ID of the BiologicalObject.
     * @return A BiologicalObject instance.
     */
    public static BiologicalObject createBiologicalObject(final IRI id) {
        return new BiologicalObjectImpl(id);
    }

    /**
     * Create a {@link BiologicalSystem} with an String.
     *
     * @param id ID of the BiologicalSystem.
     * @return A BiologicalSystem instance.
     */
    public static BiologicalSystem createBiologicalSystem(final IRI id) {
        return new BiologicalSystemImpl(id);
    }

    /**
     * Create a {@link BiologicalSystemComponent} with an String.
     *
     * @param id ID of the BiologicalSystemComponent.
     * @return A BiologicalSystemComponent instance.
     */
    public static BiologicalSystemComponent createBiologicalSystemComponent(final IRI id) {
        return new BiologicalSystemComponentImpl(id);
    }

    /**
     * Create a {@link ContractExecution} with an String.
     *
     * @param id ID of the ContractExecution.
     * @return A ContractExecution instance.
     */
    public static ContractExecution createContractExecution(final IRI id) {
        return new ContractExecutionImpl(id);
    }

    /**
     * Create a {@link ContractProcess} with an String.
     *
     * @param id ID of the ContractProcess.
     * @return A ContractProcess instance.
     */
    public static ContractProcess createContractProcess(final IRI id) {
        return new ContractProcessImpl(id);
    }

    /**
     * Create a {@link Currency} with an String.
     *
     * @param id ID of the Currency.
     * @return A Currency instance.
     */
    public static Currency createCurrency(final IRI id) {
        return new CurrencyImpl(id);
    }

    /**
     * Create a {@link Employee} with an String.
     *
     * @param id ID of the Employee.
     * @return A Employee instance.
     */
    public static Employee createEmployee(final IRI id) {
        return new EmployeeImpl(id);
    }

    /**
     * Create a {@link Employer} with an String.
     *
     * @param id ID of the Employer.
     * @return A Employer instance.
     */
    public static Employer createEmployer(final IRI id) {
        return new EmployerImpl(id);
    }

    /**
     * Create a {@link Employment} with an String.
     *
     * @param id ID of the Employment.
     * @return A Employment instance.
     */
    public static Employment createEmployment(final IRI id) {
        return new EmploymentImpl(id);
    }

    /**
     * Create a {@link EndingOfOwnership} with an String.
     *
     * @param id ID of the EndingOfOwnership.
     * @return A EndingOfOwnership instance.
     */
    public static EndingOfOwnership createEndingOfOwnership(final IRI id) {
        return new EndingOfOwnershipImpl(id);
    }

    /**
     * Create a {@link Event} with an String.
     *
     * @param id ID of the Event.
     * @return A Event instance.
     */
    public static Event createEvent(final IRI id) {
        return new EventImpl(id);
    }

    /**
     * Create a {@link ExchangeOfGoodsAndMoney} with an String.
     *
     * @param id ID of the ExchangeOfGoodsAndMoney.
     * @return A ExchangeOfGoodsAndMoney instance.
     */
    public static ExchangeOfGoodsAndMoney createExchangeOfGoodsAndMoney(final IRI id) {
        return new ExchangeOfGoodsAndMoneyImpl(id);
    }

    /**
     * Create a {@link FunctionalObject} with an String.
     *
     * @param id ID of the FunctionalObject.
     * @return A FunctionalObject instance.
     */
    public static FunctionalObject createFunctionalObject(final IRI id) {
        return new FunctionalObjectImpl(id);
    }

    /**
     * Create a {@link FunctionalSystem} with an String.
     *
     * @param id ID of the FunctionalSystem.
     * @return A FunctionalSystem instance.
     */
    public static FunctionalSystem createFunctionalSystem(final IRI id) {
        return new FunctionalSystemImpl(id);
    }

    /**
     * Create a {@link FunctionalSystemComponent} with an String.
     *
     * @param id ID of the FunctionalSystemComponent.
     * @return A FunctionalSystemComponent instance.
     */
    public static FunctionalSystemComponent createFunctionalSystemComponent(final IRI id) {
        return new FunctionalSystemComponentImpl(id);
    }

    /**
     * Create a {@link IdentificationOfPhysicalQuantity} with an String.
     *
     * @param id ID of the IdentificationOfPhysicalQuantity.
     * @return A IdentificationOfPhysicalQuantity instance.
     */
    public static IdentificationOfPhysicalQuantity createIdentificationOfPhysicalQuantity(final IRI id) {
        return new IdentificationOfPhysicalQuantityImpl(id);
    }

    /**
     * Create a {@link InPlaceBiologicalComponent} with an String.
     *
     * @param id ID of the InPlaceBiologicalComponent.
     * @return A InPlaceBiologicalComponent instance.
     */
    public static InPlaceBiologicalComponent createInPlaceBiologicalComponent(final IRI id) {
        return new InPlaceBiologicalComponentImpl(id);
    }

    /**
     * Create a {@link Individual} with an String.
     *
     * @param id ID of the Individual.
     * @return A Individual instance.
     */
    public static Individual createIndividual(final IRI id) {
        return new IndividualImpl(id);
    }

    /**
     * Create a {@link InstalledFunctionalSystemComponent} with an String.
     *
     * @param id ID of the InstalledFunctionalSystemComponent.
     * @return A InstalledFunctionalSystemComponent instance.
     */
    public static InstalledFunctionalSystemComponent createInstalledFunctionalSystemComponent(final IRI id) {
        return new InstalledFunctionalSystemComponentImpl(id);
    }

    /**
     * Create a {@link InstalledObject} with an String.
     *
     * @param id ID of the InstalledObject.
     * @return A InstalledObject instance.
     */
    public static InstalledObject createInstalledObject(final IRI id) {
        return new InstalledObjectImpl(id);
    }

    /**
     * Create a {@link IntentionallyConstructedObject} with an String.
     *
     * @param id ID of the IntentionallyConstructedObject.
     * @return A IntentionallyConstructedObject instance.
     */
    public static IntentionallyConstructedObject createIntentionallyConstructedObject(final IRI id) {
        return new IntentionallyConstructedObjectImpl(id);
    }

    /**
     * Create a {@link LanguageCommunity} with an String.
     *
     * @param id ID of the LanguageCommunity.
     * @return A LanguageCommunity instance.
     */
    public static LanguageCommunity createLanguageCommunity(final IRI id) {
        return new LanguageCommunityImpl(id);
    }

    /**
     * Create a {@link MoneyAsset} with an String.
     *
     * @param id ID of the MoneyAsset.
     * @return A MoneyAsset instance.
     */
    public static MoneyAsset createMoneyAsset(final IRI id) {
        return new MoneyAssetImpl(id);
    }

    /**
     * Create a {@link Offer} with an String.
     *
     * @param id ID of the Offer.
     * @return A Offer instance.
     */
    public static Offer createOffer(final IRI id) {
        return new OfferImpl(id);
    }

    /**
     * Create a {@link OfferAndAcceptanceForGoods} with an String.
     *
     * @param id ID of the OfferAndAcceptanceForGoods.
     * @return A OfferAndAcceptanceForGoods instance.
     */
    public static OfferAndAcceptanceForGoods createOfferAndAcceptanceForGoods(final IRI id) {
        return new OfferAndAcceptanceForGoodsImpl(id);
    }

    /**
     * Create a {@link OfferForGoods} with an String.
     *
     * @param id ID of the OfferForGoods.
     * @return A OfferForGoods instance.
     */
    public static OfferForGoods createOfferForGoods(final IRI id) {
        return new OfferForGoodsImpl(id);
    }

    /**
     * Create a {@link Offering} with an String.
     *
     * @param id ID of the Offering.
     * @return A Offering instance.
     */
    public static Offering createOffering(final IRI id) {
        return new OfferingImpl(id);
    }

    /**
     * Create a {@link OrdinaryBiologicalObject} with an String.
     *
     * @param id ID of the OrdinaryBiologicalObject.
     * @return A OrdinaryBiologicalObject instance.
     */
    public static OrdinaryBiologicalObject createOrdinaryBiologicalObject(final IRI id) {
        return new OrdinaryBiologicalObjectImpl(id);
    }

    /**
     * Create a {@link OrdinaryFunctionalObject} with an String.
     *
     * @param id ID of the OrdinaryFunctionalObject.
     * @return A OrdinaryFunctionalObject instance.
     */
    public static OrdinaryFunctionalObject createOrdinaryFunctionalObject(final IRI id) {
        return new OrdinaryFunctionalObjectImpl(id);
    }

    /**
     * Create a {@link OrdinaryPhysicalObject} with an String.
     *
     * @param id ID of the OrdinaryPhysicalObject.
     * @return A OrdinaryPhysicalObject instance.
     */
    public static OrdinaryPhysicalObject createOrdinaryPhysicalObject(final IRI id) {
        return new OrdinaryPhysicalObjectImpl(id);
    }

    /**
     * Create a {@link Organization} with an String.
     *
     * @param id ID of the Organization.
     * @return A Organization instance.
     */
    public static Organization createOrganization(final IRI id) {
        return new OrganizationImpl(id);
    }

    /**
     * Create a {@link OrganizationComponent} with an String.
     *
     * @param id ID of the OrganizationComponent.
     * @return A OrganizationComponent instance.
     */
    public static OrganizationComponent createOrganizationComponent(final IRI id) {
        return new OrganizationComponentImpl(id);
    }

    /**
     * Create a {@link Owner} with an String.
     *
     * @param id ID of the Owner.
     * @return A Owner instance.
     */
    public static Owner createOwner(final IRI id) {
        return new OwnerImpl(id);
    }

    /**
     * Create a {@link Ownership} with an String.
     *
     * @param id ID of the Ownership.
     * @return A Ownership instance.
     */
    public static Ownership createOwnership(final IRI id) {
        return new OwnershipImpl(id);
    }

    /**
     * Create a {@link Participant} with an String.
     *
     * @param id ID of the Participant.
     * @return A Participant instance.
     */
    public static Participant createParticipant(final IRI id) {
        return new ParticipantImpl(id);
    }

    /**
     * Create a {@link ParticipantInActivityOrAssociation} with an String.
     *
     * @param id ID of the ParticipantInActivityOrAssociation.
     * @return A ParticipantInActivityOrAssociation instance.
     */
    public static ParticipantInActivityOrAssociation createParticipantInActivityOrAssociation(final IRI id) {
        return new ParticipantInActivityOrAssociationImpl(id);
    }

    /**
     * Create a {@link Party} with an String.
     *
     * @param id ID of the Party.
     * @return A Party instance.
     */
    public static Party createParty(final IRI id) {
        return new PartyImpl(id);
    }

    /**
     * Create a {@link PeriodOfTime} with an String.
     *
     * @param id ID of the PeriodOfTime.
     * @return A PeriodOfTime instance.
     */
    public static PeriodOfTime createPeriodOfTime(final IRI id) {
        return new PeriodOfTimeImpl(id);
    }

    /**
     * Create a {@link Person} with an String.
     *
     * @param id ID of the Person.
     * @return A Person instance.
     */
    public static Person createPerson(final IRI id) {
        return new PersonImpl(id);
    }

    /**
     * Create a {@link PersonInPosition} with an String.
     *
     * @param id ID of the PersonInPosition.
     * @return A PersonInPosition instance.
     */
    public static PersonInPosition createPersonInPosition(final IRI id) {
        return new PersonInPositionImpl(id);
    }

    /**
     * Create a {@link PhysicalObject} with an String.
     *
     * @param id ID of the PhysicalObject.
     * @return A PhysicalObject instance.
     */
    public static PhysicalObject createPhysicalObject(final IRI id) {
        return new PhysicalObjectImpl(id);
    }

    /**
     * Create a {@link PhysicalProperty} with an String.
     *
     * @param id ID of the PhysicalProperty.
     * @return A PhysicalProperty instance.
     */
    public static PhysicalProperty createPhysicalProperty(final IRI id) {
        return new PhysicalPropertyImpl(id);
    }

    /**
     * Create a {@link PhysicalPropertyRange} with an String.
     *
     * @param id ID of the PhysicalPropertyRange.
     * @return A PhysicalPropertyRange instance.
     */
    public static PhysicalPropertyRange createPhysicalPropertyRange(final IRI id) {
        return new PhysicalPropertyRangeImpl(id);
    }

    /**
     * Create a {@link PhysicalQuantity} with an String.
     *
     * @param id ID of the PhysicalQuantity.
     * @return A PhysicalQuantity instance.
     */
    public static PhysicalQuantity createPhysicalQuantity(final IRI id) {
        return new PhysicalQuantityImpl(id);
    }

    /**
     * Create a {@link PhysicalQuantityRange} with an String.
     *
     * @param id ID of the PhysicalQuantityRange.
     * @return A PhysicalQuantityRange instance.
     */
    public static PhysicalQuantityRange createPhysicalQuantityRange(final IRI id) {
        return new PhysicalQuantityRangeImpl(id);
    }

    /**
     * Create a {@link Plan} with an String.
     *
     * @param id ID of the Plan.
     * @return A Plan instance.
     */
    public static Plan createPlan(final IRI id) {
        return new PlanImpl(id);
    }

    /**
     * Create a {@link PointInTime} with an String.
     *
     * @param id ID of the PointInTime.
     * @return A PointInTime instance.
     */
    public static PointInTime createPointInTime(final IRI id) {
        return new PointInTimeImpl(id);
    }

    /**
     * Create a {@link Position} with an String.
     *
     * @param id ID of the Position.
     * @return A Position instance.
     */
    public static Position createPosition(final IRI id) {
        return new PositionImpl(id);
    }

    /**
     * Create a {@link PossibleWorld} with an String.
     *
     * @param id ID of the PossibleWorld.
     * @return A PossibleWorld instance.
     */
    public static PossibleWorld createPossibleWorld(final IRI id) {
        return new PossibleWorldImpl(id);
    }

    /**
     * Create a {@link Price} with an String.
     *
     * @param id ID of the Price.
     * @return A Price instance.
     */
    public static Price createPrice(final IRI id) {
        return new PriceImpl(id);
    }

    /**
     * Create a {@link ProductBrand} with an String.
     *
     * @param id ID of the ProductBrand.
     * @return A ProductBrand instance.
     */
    public static ProductBrand createProductBrand(final IRI id) {
        return new ProductBrandImpl(id);
    }

    /**
     * Create a {@link ProductOffering} with an String.
     *
     * @param id ID of the ProductOffering.
     * @return A ProductOffering instance.
     */
    public static ProductOffering createProductOffering(final IRI id) {
        return new ProductOfferingImpl(id);
    }

    /**
     * Create a {@link ReachingAgreement} with an String.
     *
     * @param id ID of the ReachingAgreement.
     * @return A ReachingAgreement instance.
     */
    public static ReachingAgreement createReachingAgreement(final IRI id) {
        return new ReachingAgreementImpl(id);
    }

    /**
     * Create a {@link RecognizingLanguageCommunity} with an String.
     *
     * @param id ID of the RecognizingLanguageCommunity.
     * @return A RecognizingLanguageCommunity instance.
     */
    public static RecognizingLanguageCommunity createRecognizingLanguageCommunity(final IRI id) {
        return new RecognizingLanguageCommunityImpl(id);
    }

    /**
     * Create a {@link RepresentationBySign} with an String.
     *
     * @param id ID of the RepresentationBySign.
     * @return A RepresentationBySign instance.
     */
    public static RepresentationBySign createRepresentationBySign(final IRI id) {
        return new RepresentationBySignImpl(id);
    }

    /**
     * Create a {@link Requirement} with an String.
     *
     * @param id ID of the Requirement.
     * @return A Requirement instance.
     */
    public static Requirement createRequirement(final IRI id) {
        return new RequirementImpl(id);
    }

    /**
     * Create a {@link RequirementSpecification} with an String.
     *
     * @param id ID of the RequirementSpecification.
     * @return A RequirementSpecification instance.
     */
    public static RequirementSpecification createRequirementSpecification(final IRI id) {
        return new RequirementSpecificationImpl(id);
    }

    /**
     * Create a {@link SaleOfGoods} with an String.
     *
     * @param id ID of the SaleOfGoods.
     * @return A SaleOfGoods instance.
     */
    public static SaleOfGoods createSaleOfGoods(final IRI id) {
        return new SaleOfGoodsImpl(id);
    }

    /**
     * Create a {@link SalesProduct} with an String.
     *
     * @param id ID of the SalesProduct.
     * @return A SalesProduct instance.
     */
    public static SalesProduct createSalesProduct(final IRI id) {
        return new SalesProductImpl(id);
    }

    /**
     * Create a {@link SalesProductInstance} with an String.
     *
     * @param id ID of the SalesProductInstance.
     * @return A SalesProductInstance instance.
     */
    public static SalesProductInstance createSalesProductInstance(final IRI id) {
        return new SalesProductInstanceImpl(id);
    }

    /**
     * Create a {@link SalesProductVersion} with an String.
     *
     * @param id ID of the SalesProductVersion.
     * @return A SalesProductVersion instance.
     */
    public static SalesProductVersion createSalesProductVersion(final IRI id) {
        return new SalesProductVersionImpl(id);
    }

    /**
     * Create a {@link Sign} with an String.
     *
     * @param id ID of the Sign.
     * @return A Sign instance.
     */
    public static Sign createSign(final IRI id) {
        return new SignImpl(id);
    }

    /**
     * Create a {@link SociallyConstructedActivity} with an String.
     *
     * @param id ID of the SociallyConstructedActivity.
     * @return A SociallyConstructedActivity instance.
     */
    public static SociallyConstructedActivity createSociallyConstructedActivity(final IRI id) {
        return new SociallyConstructedActivityImpl(id);
    }

    /**
     * Create a {@link SociallyConstructedObject} with an String.
     *
     * @param id ID of the SociallyConstructedObject.
     * @return A SociallyConstructedObject instance.
     */
    public static SociallyConstructedObject createSociallyConstructedObject(final IRI id) {
        return new SociallyConstructedObjectImpl(id);
    }

    /**
     * Create a {@link SpatioTemporalExtent} with an String.
     *
     * @param id ID of the SpatioTemporalExtent.
     * @return A SpatioTemporalExtent instance.
     */
    public static SpatioTemporalExtent createSpatioTemporalExtent(final IRI id) {
        return new SpatioTemporalExtentImpl(id);
    }

    /**
     * Create a {@link State} with an String.
     *
     * @param id ID of the State.
     * @return A State instance.
     */
    public static State createState(final IRI id) {
        return new StateImpl(id);
    }

    /**
     * Create a {@link StateOfActivity} with an String.
     *
     * @param id ID of the StateOfActivity.
     * @return A StateOfActivity instance.
     */
    public static StateOfActivity createStateOfActivity(final IRI id) {
        return new StateOfActivityImpl(id);
    }

    /**
     * Create a {@link StateOfAmountOfMoney} with an String.
     *
     * @param id ID of the StateOfAmountOfMoney.
     * @return A StateOfAmountOfMoney instance.
     */
    public static StateOfAmountOfMoney createStateOfAmountOfMoney(final IRI id) {
        return new StateOfAmountOfMoneyImpl(id);
    }

    /**
     * Create a {@link StateOfAssociation} with an String.
     *
     * @param id ID of the StateOfAssociation.
     * @return A StateOfAssociation instance.
     */
    public static StateOfAssociation createStateOfAssociation(final IRI id) {
        return new StateOfAssociationImpl(id);
    }

    /**
     * Create a {@link StateOfBiologicalObject} with an String.
     *
     * @param id ID of the StateOfBiologicalObject.
     * @return A StateOfBiologicalObject instance.
     */
    public static StateOfBiologicalObject createStateOfBiologicalObject(final IRI id) {
        return new StateOfBiologicalObjectImpl(id);
    }

    /**
     * Create a {@link StateOfBiologicalSystem} with an String.
     *
     * @param id ID of the StateOfBiologicalSystem.
     * @return A StateOfBiologicalSystem instance.
     */
    public static StateOfBiologicalSystem createStateOfBiologicalSystem(final IRI id) {
        return new StateOfBiologicalSystemImpl(id);
    }

    /**
     * Create a {@link StateOfBiologicalSystemComponent} with an String.
     *
     * @param id ID of the StateOfBiologicalSystemComponent.
     * @return A StateOfBiologicalSystemComponent instance.
     */
    public static StateOfBiologicalSystemComponent createStateOfBiologicalSystemComponent(final IRI id) {
        return new StateOfBiologicalSystemComponentImpl(id);
    }

    /**
     * Create a {@link StateOfFunctionalObject} with an String.
     *
     * @param id ID of the StateOfFunctionalObject.
     * @return A StateOfFunctionalObject instance.
     */
    public static StateOfFunctionalObject createStateOfFunctionalObject(final IRI id) {
        return new StateOfFunctionalObjectImpl(id);
    }

    /**
     * Create a {@link StateOfFunctionalSystem} with an String.
     *
     * @param id ID of the StateOfFunctionalSystem.
     * @return A StateOfFunctionalSystem instance.
     */
    public static StateOfFunctionalSystem createStateOfFunctionalSystem(final IRI id) {
        return new StateOfFunctionalSystemImpl(id);
    }

    /**
     * Create a {@link StateOfFunctionalSystemComponent} with an String.
     *
     * @param id ID of the StateOfFunctionalSystemComponent.
     * @return A StateOfFunctionalSystemComponent instance.
     */
    public static StateOfFunctionalSystemComponent createStateOfFunctionalSystemComponent(final IRI id) {
        return new StateOfFunctionalSystemComponentImpl(id);
    }

    /**
     * Create a {@link StateOfIntentionallyConstructedObject} with an String.
     *
     * @param id ID of the StateOfIntentionallyConstructedObject.
     * @return A StateOfIntentionallyConstructedObject instance.
     */
    public static StateOfIntentionallyConstructedObject createStateOfIntentionallyConstructedObject(final IRI id) {
        return new StateOfIntentionallyConstructedObjectImpl(id);
    }

    /**
     * Create a {@link StateOfLanguageCommunity} with an String.
     *
     * @param id ID of the StateOfLanguageCommunity.
     * @return A StateOfLanguageCommunity instance.
     */
    public static StateOfLanguageCommunity createStateOfLanguageCommunity(final IRI id) {
        return new StateOfLanguageCommunityImpl(id);
    }

    /**
     * Create a {@link StateOfOrdinaryBiologicalObject} with an String.
     *
     * @param id ID of the StateOfOrdinaryBiologicalObject.
     * @return A StateOfOrdinaryBiologicalObject instance.
     */
    public static StateOfOrdinaryBiologicalObject createStateOfOrdinaryBiologicalObject(final IRI id) {
        return new StateOfOrdinaryBiologicalObjectImpl(id);
    }

    /**
     * Create a {@link StateOfOrdinaryFunctionalObject} with an String.
     *
     * @param id ID of the StateOfOrdinaryFunctionalObject.
     * @return A StateOfOrdinaryFunctionalObject instance.
     */
    public static StateOfOrdinaryFunctionalObject createStateOfOrdinaryFunctionalObject(final IRI id) {
        return new StateOfOrdinaryFunctionalObjectImpl(id);
    }

    /**
     * Create a {@link StateOfOrdinaryPhysicalObject} with an String.
     *
     * @param id ID of the StateOfOrdinaryPhysicalObject.
     * @return A StateOfOrdinaryPhysicalObject instance.
     */
    public static StateOfOrdinaryPhysicalObject createStateOfOrdinaryPhysicalObject(final IRI id) {
        return new StateOfOrdinaryPhysicalObjectImpl(id);
    }

    /**
     * Create a {@link StateOfOrganization} with an String.
     *
     * @param id ID of the StateOfOrganization.
     * @return A StateOfOrganization instance.
     */
    public static StateOfOrganization createStateOfOrganization(final IRI id) {
        return new StateOfOrganizationImpl(id);
    }

    /**
     * Create a {@link StateOfOrganizationComponent} with an String.
     *
     * @param id ID of the StateOfOrganizationComponent.
     * @return A StateOfOrganizationComponent instance.
     */
    public static StateOfOrganizationComponent createStateOfOrganizationComponent(final IRI id) {
        return new StateOfOrganizationComponentImpl(id);
    }

    /**
     * Create a {@link StateOfParty} with an String.
     *
     * @param id ID of the StateOfParty.
     * @return A StateOfParty instance.
     */
    public static StateOfParty createStateOfParty(final IRI id) {
        return new StateOfPartyImpl(id);
    }

    /**
     * Create a {@link StateOfPerson} with an String.
     *
     * @param id ID of the StateOfPerson.
     * @return A StateOfPerson instance.
     */
    public static StateOfPerson createStateOfPerson(final IRI id) {
        return new StateOfPersonImpl(id);
    }

    /**
     * Create a {@link StateOfPhysicalObject} with an String.
     *
     * @param id ID of the StateOfPhysicalObject.
     * @return A StateOfPhysicalObject instance.
     */
    public static StateOfPhysicalObject createStateOfPhysicalObject(final IRI id) {
        return new StateOfPhysicalObjectImpl(id);
    }

    /**
     * Create a {@link StateOfPosition} with an String.
     *
     * @param id ID of the StateOfPosition.
     * @return A StateOfPosition instance.
     */
    public static StateOfPosition createStateOfPosition(final IRI id) {
        return new StateOfPositionImpl(id);
    }

    /**
     * Create a {@link StateOfSalesProductInstance} with an String.
     *
     * @param id ID of the StateOfSalesProductInstance.
     * @return A StateOfSalesProductInstance instance.
     */
    public static StateOfSalesProductInstance createStateOfSalesProductInstance(final IRI id) {
        return new StateOfSalesProductInstanceImpl(id);
    }

    /**
     * Create a {@link StateOfSign} with an String.
     *
     * @param id ID of the StateOfSign.
     * @return A StateOfSign instance.
     */
    public static StateOfSign createStateOfSign(final IRI id) {
        return new StateOfSignImpl(id);
    }

    /**
     * Create a {@link StateOfSociallyConstructedActivity} with an String.
     *
     * @param id ID of the StateOfSociallyConstructedActivity.
     * @return A StateOfSociallyConstructedActivity instance.
     */
    public static StateOfSociallyConstructedActivity createStateOfSociallyConstructedActivity(final IRI id) {
        return new StateOfSociallyConstructedActivityImpl(id);
    }

    /**
     * Create a {@link StateOfSociallyConstructedObject} with an String.
     *
     * @param id ID of the StateOfSociallyConstructedObject.
     * @return A StateOfSociallyConstructedObject instance.
     */
    public static StateOfSociallyConstructedObject createStateOfSociallyConstructedObject(final IRI id) {
        return new StateOfSociallyConstructedObjectImpl(id);
    }

    /**
     * Create a {@link StateOfSystem} with an String.
     *
     * @param id ID of the StateOfSystem.
     * @return A StateOfSystem instance.
     */
    public static StateOfSystem createStateOfSystem(final IRI id) {
        return new StateOfSystemImpl(id);
    }

    /**
     * Create a {@link StateOfSystemComponent} with an String.
     *
     * @param id ID of the StateOfSystemComponent.
     * @return A StateOfSystemComponent instance.
     */
    public static StateOfSystemComponent createStateOfSystemComponent(final IRI id) {
        return new StateOfSystemComponentImpl(id);
    }

    /**
     * Create a {@link uk.gov.gchq.magmacore.hqdm.model.System} with an String.
     *
     * @param id ID of the System.
     * @return A System instance.
     */
    public static uk.gov.gchq.magmacore.hqdm.model.System createSystem(final IRI id) {
        return new SystemImpl(id);
    }

    /**
     * Create a {@link SystemComponent} with an String.
     *
     * @param id ID of the SystemComponent.
     * @return A SystemComponent instance.
     */
    public static SystemComponent createSystemComponent(final IRI id) {
        return new SystemComponentImpl(id);
    }

    /**
     * Create a {@link Thing} with an String.
     *
     * @param id ID of the Thing.
     * @return A Thing instance.
     */
    public static Thing createThing(final IRI id) {
        return new ThingImpl(id);
    }

    /**
     * Create a {@link TransferOfOwnership} with an String.
     *
     * @param id ID of the TransferOfOwnership.
     * @return A TransferOfOwnership instance.
     */
    public static TransferOfOwnership createTransferOfOwnership(final IRI id) {
        return new TransferOfOwnershipImpl(id);
    }

    /**
     * Create a {@link TransferOfOwnershipOfMoney} with an String.
     *
     * @param id ID of the TransferOfOwnershipOfMoney.
     * @return A TransferOfOwnershipOfMoney instance.
     */
    public static TransferOfOwnershipOfMoney createTransferOfOwnershipOfMoney(final IRI id) {
        return new TransferOfOwnershipOfMoneyImpl(id);
    }

    /**
     * Create a {@link Transferee} with an String.
     *
     * @param id ID of the Transferee.
     * @return A Transferee instance.
     */
    public static Transferee createTransferee(final IRI id) {
        return new TransfereeImpl(id);
    }

    /**
     * Create a {@link Transferor} with an String.
     *
     * @param id ID of the Transferor.
     * @return A Transferor instance.
     */
    public static Transferor createTransferor(final IRI id) {
        return new TransferorImpl(id);
    }
}
