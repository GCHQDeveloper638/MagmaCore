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
    public static <T> AbstractObject<T> createAbstractObject(final T id) {
        return new AbstractObjectImpl<T>(id);
    }

    /**
     * Create a {@link AcceptanceOfOffer} with an String.
     *
     * @param id ID of the AcceptanceOfOffer.
     * @return A AcceptanceOfOffer instance.
     */
    public static <T> AcceptanceOfOffer<T> createAcceptanceOfOffer(final T id) {
        return new AcceptanceOfOfferImpl<T>(id);
    }

    /**
     * Create a {@link AcceptanceOfOfferForGoods} with an String.
     *
     * @param id ID of the AcceptanceOfOfferForGoods.
     * @return A AcceptanceOfOfferForGoods instance.
     */
    public static <T> AcceptanceOfOfferForGoods<T> createAcceptanceOfOfferForGoods(final T id) {
        return new AcceptanceOfOfferForGoodsImpl<T>(id);
    }

    /**
     * Create a {@link Activity} with an String.
     *
     * @param id ID of the Activity.
     * @return A Activity instance.
     */
    public static <T> Activity<T> createActivity(final T id) {
        return new ActivityImpl<T>(id);
    }

    /**
     * Create a {@link AgreeContract} with an String.
     *
     * @param id ID of the AgreeContract.
     * @return A AgreeContract instance.
     */
    public static <T> AgreeContract<T> createAgreeContract(final T id) {
        return new AgreeContractImpl<T>(id);
    }

    /**
     * Create a {@link AgreementExecution} with an String.
     *
     * @param id ID of the AgreementExecution.
     * @return A AgreementExecution instance.
     */
    public static <T> AgreementExecution<T> createAgreementExecution(final T id) {
        return new AgreementExecutionImpl<T>(id);
    }

    /**
     * Create a {@link AgreementProcess} with an String.
     *
     * @param id ID of the AgreementProcess.
     * @return A AgreementProcess instance.
     */
    public static <T> AgreementProcess<T> createAgreementProcess(final T id) {
        return new AgreementProcessImpl<T>(id);
    }

    /**
     * Create a {@link AmountOfMoney} with an String.
     *
     * @param id ID of the AmountOfMoney.
     * @return A AmountOfMoney instance.
     */
    public static <T> AmountOfMoney<T> createAmountOfMoney(final T id) {
        return new AmountOfMoneyImpl<T>(id);
    }

    /**
     * Create a {@link Asset} with an String.
     *
     * @param id ID of the Asset.
     * @return A Asset instance.
     */
    public static <T> Asset<T> createAsset(final T id) {
        return new AssetImpl<T>(id);
    }

    /**
     * Create a {@link Association} with an String.
     *
     * @param id ID of the Association.
     * @return A Association instance.
     */
    public static <T> Association<T> createAssociation(final T id) {
        return new AssociationImpl<T>(id);
    }

    /**
     * Create a {@link BeginningOfOwnership} with an String.
     *
     * @param id ID of the BeginningOfOwnership.
     * @return A BeginningOfOwnership instance.
     */
    public static <T> BeginningOfOwnership<T> createBeginningOfOwnership(final T id) {
        return new BeginningOfOwnershipImpl<T>(id);
    }

    /**
     * Create a {@link BiologicalObject} with an String.
     *
     * @param id ID of the BiologicalObject.
     * @return A BiologicalObject instance.
     */
    public static <T> BiologicalObject<T> createBiologicalObject(final T id) {
        return new BiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link BiologicalSystem} with an String.
     *
     * @param id ID of the BiologicalSystem.
     * @return A BiologicalSystem instance.
     */
    public static <T> BiologicalSystem<T> createBiologicalSystem(final T id) {
        return new BiologicalSystemImpl<T>(id);
    }

    /**
     * Create a {@link BiologicalSystemComponent} with an String.
     *
     * @param id ID of the BiologicalSystemComponent.
     * @return A BiologicalSystemComponent instance.
     */
    public static <T> BiologicalSystemComponent<T> createBiologicalSystemComponent(final T id) {
        return new BiologicalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link ContractExecution} with an String.
     *
     * @param id ID of the ContractExecution.
     * @return A ContractExecution instance.
     */
    public static <T> ContractExecution<T> createContractExecution(final T id) {
        return new ContractExecutionImpl<T>(id);
    }

    /**
     * Create a {@link ContractProcess} with an String.
     *
     * @param id ID of the ContractProcess.
     * @return A ContractProcess instance.
     */
    public static <T> ContractProcess<T> createContractProcess(final T id) {
        return new ContractProcessImpl<T>(id);
    }

    /**
     * Create a {@link Currency} with an String.
     *
     * @param id ID of the Currency.
     * @return A Currency instance.
     */
    public static <T> Currency<T> createCurrency(final T id) {
        return new CurrencyImpl<T>(id);
    }

    /**
     * Create a {@link Employee} with an String.
     *
     * @param id ID of the Employee.
     * @return A Employee instance.
     */
    public static <T> Employee<T> createEmployee(final T id) {
        return new EmployeeImpl<T>(id);
    }

    /**
     * Create a {@link Employer} with an String.
     *
     * @param id ID of the Employer.
     * @return A Employer instance.
     */
    public static <T> Employer<T> createEmployer(final T id) {
        return new EmployerImpl<T>(id);
    }

    /**
     * Create a {@link Employment} with an String.
     *
     * @param id ID of the Employment.
     * @return A Employment instance.
     */
    public static <T> Employment<T> createEmployment(final T id) {
        return new EmploymentImpl<T>(id);
    }

    /**
     * Create a {@link EndingOfOwnership} with an String.
     *
     * @param id ID of the EndingOfOwnership.
     * @return A EndingOfOwnership instance.
     */
    public static <T> EndingOfOwnership<T> createEndingOfOwnership(final T id) {
        return new EndingOfOwnershipImpl<T>(id);
    }

    /**
     * Create a {@link Event} with an String.
     *
     * @param id ID of the Event.
     * @return A Event instance.
     */
    public static <T> Event<T> createEvent(final T id) {
        return new EventImpl<T>(id);
    }

    /**
     * Create a {@link ExchangeOfGoodsAndMoney} with an String.
     *
     * @param id ID of the ExchangeOfGoodsAndMoney.
     * @return A ExchangeOfGoodsAndMoney instance.
     */
    public static <T> ExchangeOfGoodsAndMoney<T> createExchangeOfGoodsAndMoney(final T id) {
        return new ExchangeOfGoodsAndMoneyImpl<T>(id);
    }

    /**
     * Create a {@link FunctionalObject} with an String.
     *
     * @param id ID of the FunctionalObject.
     * @return A FunctionalObject instance.
     */
    public static <T> FunctionalObject<T> createFunctionalObject(final T id) {
        return new FunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link FunctionalSystem} with an String.
     *
     * @param id ID of the FunctionalSystem.
     * @return A FunctionalSystem instance.
     */
    public static <T> FunctionalSystem<T> createFunctionalSystem(final T id) {
        return new FunctionalSystemImpl<T>(id);
    }

    /**
     * Create a {@link FunctionalSystemComponent} with an String.
     *
     * @param id ID of the FunctionalSystemComponent.
     * @return A FunctionalSystemComponent instance.
     */
    public static <T> FunctionalSystemComponent<T> createFunctionalSystemComponent(final T id) {
        return new FunctionalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link IdentificationOfPhysicalQuantity} with an String.
     *
     * @param id ID of the IdentificationOfPhysicalQuantity.
     * @return A IdentificationOfPhysicalQuantity instance.
     */
    public static <T> IdentificationOfPhysicalQuantity<T> createIdentificationOfPhysicalQuantity(final T id) {
        return new IdentificationOfPhysicalQuantityImpl<T>(id);
    }

    /**
     * Create a {@link InPlaceBiologicalComponent} with an String.
     *
     * @param id ID of the InPlaceBiologicalComponent.
     * @return A InPlaceBiologicalComponent instance.
     */
    public static <T> InPlaceBiologicalComponent<T> createInPlaceBiologicalComponent(final T id) {
        return new InPlaceBiologicalComponentImpl<T>(id);
    }

    /**
     * Create a {@link Individual} with an String.
     *
     * @param id ID of the Individual.
     * @return A Individual instance.
     */
    public static <T> Individual<T> createIndividual(final T id) {
        return new IndividualImpl<T>(id);
    }

    /**
     * Create a {@link InstalledFunctionalSystemComponent} with an String.
     *
     * @param id ID of the InstalledFunctionalSystemComponent.
     * @return A InstalledFunctionalSystemComponent instance.
     */
    public static <T> InstalledFunctionalSystemComponent<T> createInstalledFunctionalSystemComponent(final T id) {
        return new InstalledFunctionalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link InstalledObject} with an String.
     *
     * @param id ID of the InstalledObject.
     * @return A InstalledObject instance.
     */
    public static <T> InstalledObject<T> createInstalledObject(final T id) {
        return new InstalledObjectImpl<T>(id);
    }

    /**
     * Create a {@link IntentionallyConstructedObject} with an String.
     *
     * @param id ID of the IntentionallyConstructedObject.
     * @return A IntentionallyConstructedObject instance.
     */
    public static <T> IntentionallyConstructedObject<T> createIntentionallyConstructedObject(final T id) {
        return new IntentionallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link LanguageCommunity} with an String.
     *
     * @param id ID of the LanguageCommunity.
     * @return A LanguageCommunity instance.
     */
    public static <T> LanguageCommunity<T> createLanguageCommunity(final T id) {
        return new LanguageCommunityImpl<T>(id);
    }

    /**
     * Create a {@link MoneyAsset} with an String.
     *
     * @param id ID of the MoneyAsset.
     * @return A MoneyAsset instance.
     */
    public static <T> MoneyAsset<T> createMoneyAsset(final T id) {
        return new MoneyAssetImpl<T>(id);
    }

    /**
     * Create a {@link Offer} with an String.
     *
     * @param id ID of the Offer.
     * @return A Offer instance.
     */
    public static <T> Offer<T> createOffer(final T id) {
        return new OfferImpl<T>(id);
    }

    /**
     * Create a {@link OfferAndAcceptanceForGoods} with an String.
     *
     * @param id ID of the OfferAndAcceptanceForGoods.
     * @return A OfferAndAcceptanceForGoods instance.
     */
    public static <T> OfferAndAcceptanceForGoods<T> createOfferAndAcceptanceForGoods(final T id) {
        return new OfferAndAcceptanceForGoodsImpl<T>(id);
    }

    /**
     * Create a {@link OfferForGoods} with an String.
     *
     * @param id ID of the OfferForGoods.
     * @return A OfferForGoods instance.
     */
    public static <T> OfferForGoods<T> createOfferForGoods(final T id) {
        return new OfferForGoodsImpl<T>(id);
    }

    /**
     * Create a {@link Offering} with an String.
     *
     * @param id ID of the Offering.
     * @return A Offering instance.
     */
    public static <T> Offering<T> createOffering(final T id) {
        return new OfferingImpl<T>(id);
    }

    /**
     * Create a {@link OrdinaryBiologicalObject} with an String.
     *
     * @param id ID of the OrdinaryBiologicalObject.
     * @return A OrdinaryBiologicalObject instance.
     */
    public static <T> OrdinaryBiologicalObject<T> createOrdinaryBiologicalObject(final T id) {
        return new OrdinaryBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link OrdinaryFunctionalObject} with an String.
     *
     * @param id ID of the OrdinaryFunctionalObject.
     * @return A OrdinaryFunctionalObject instance.
     */
    public static <T> OrdinaryFunctionalObject<T> createOrdinaryFunctionalObject(final T id) {
        return new OrdinaryFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link OrdinaryPhysicalObject} with an String.
     *
     * @param id ID of the OrdinaryPhysicalObject.
     * @return A OrdinaryPhysicalObject instance.
     */
    public static <T> OrdinaryPhysicalObject<T> createOrdinaryPhysicalObject(final T id) {
        return new OrdinaryPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link Organization} with an String.
     *
     * @param id ID of the Organization.
     * @return A Organization instance.
     */
    public static <T> Organization<T> createOrganization(final T id) {
        return new OrganizationImpl<T>(id);
    }

    /**
     * Create a {@link OrganizationComponent} with an String.
     *
     * @param id ID of the OrganizationComponent.
     * @return A OrganizationComponent instance.
     */
    public static <T> OrganizationComponent<T> createOrganizationComponent(final T id) {
        return new OrganizationComponentImpl<T>(id);
    }

    /**
     * Create a {@link Owner} with an String.
     *
     * @param id ID of the Owner.
     * @return A Owner instance.
     */
    public static <T> Owner<T> createOwner(final T id) {
        return new OwnerImpl<T>(id);
    }

    /**
     * Create a {@link Ownership} with an String.
     *
     * @param id ID of the Ownership.
     * @return A Ownership instance.
     */
    public static <T> Ownership<T> createOwnership(final T id) {
        return new OwnershipImpl<T>(id);
    }

    /**
     * Create a {@link Participant} with an String.
     *
     * @param id ID of the Participant.
     * @return A Participant instance.
     */
    public static <T> Participant<T> createParticipant(final T id) {
        return new ParticipantImpl<T>(id);
    }

    /**
     * Create a {@link ParticipantInActivityOrAssociation} with an String.
     *
     * @param id ID of the ParticipantInActivityOrAssociation.
     * @return A ParticipantInActivityOrAssociation instance.
     */
    public static <T> ParticipantInActivityOrAssociation<T> createParticipantInActivityOrAssociation(final T id) {
        return new ParticipantInActivityOrAssociationImpl<T>(id);
    }

    /**
     * Create a {@link Party} with an String.
     *
     * @param id ID of the Party.
     * @return A Party instance.
     */
    public static <T> Party<T> createParty(final T id) {
        return new PartyImpl<T>(id);
    }

    /**
     * Create a {@link PeriodOfTime} with an String.
     *
     * @param id ID of the PeriodOfTime.
     * @return A PeriodOfTime instance.
     */
    public static <T> PeriodOfTime<T> createPeriodOfTime(final T id) {
        return new PeriodOfTimeImpl<T>(id);
    }

    /**
     * Create a {@link Person} with an String.
     *
     * @param id ID of the Person.
     * @return A Person instance.
     */
    public static <T> Person<T> createPerson(final T id) {
        return new PersonImpl<T>(id);
    }

    /**
     * Create a {@link PersonInPosition} with an String.
     *
     * @param id ID of the PersonInPosition.
     * @return A PersonInPosition instance.
     */
    public static <T> PersonInPosition<T> createPersonInPosition(final T id) {
        return new PersonInPositionImpl<T>(id);
    }

    /**
     * Create a {@link PhysicalObject} with an String.
     *
     * @param id ID of the PhysicalObject.
     * @return A PhysicalObject instance.
     */
    public static <T> PhysicalObject<T> createPhysicalObject(final T id) {
        return new PhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link PhysicalProperty} with an String.
     *
     * @param id ID of the PhysicalProperty.
     * @return A PhysicalProperty instance.
     */
    public static <T> PhysicalProperty<T> createPhysicalProperty(final T id) {
        return new PhysicalPropertyImpl<T>(id);
    }

    /**
     * Create a {@link PhysicalPropertyRange} with an String.
     *
     * @param id ID of the PhysicalPropertyRange.
     * @return A PhysicalPropertyRange instance.
     */
    public static <T> PhysicalPropertyRange<T> createPhysicalPropertyRange(final T id) {
        return new PhysicalPropertyRangeImpl<T>(id);
    }

    /**
     * Create a {@link PhysicalQuantity} with an String.
     *
     * @param id ID of the PhysicalQuantity.
     * @return A PhysicalQuantity instance.
     */
    public static <T> PhysicalQuantity<T> createPhysicalQuantity(final T id) {
        return new PhysicalQuantityImpl<T>(id);
    }

    /**
     * Create a {@link PhysicalQuantityRange} with an String.
     *
     * @param id ID of the PhysicalQuantityRange.
     * @return A PhysicalQuantityRange instance.
     */
    public static <T> PhysicalQuantityRange<T> createPhysicalQuantityRange(final T id) {
        return new PhysicalQuantityRangeImpl<T>(id);
    }

    /**
     * Create a {@link Plan} with an String.
     *
     * @param id ID of the Plan.
     * @return A Plan instance.
     */
    public static <T> Plan<T> createPlan(final T id) {
        return new PlanImpl<T>(id);
    }

    /**
     * Create a {@link PointInTime} with an String.
     *
     * @param id ID of the PointInTime.
     * @return A PointInTime instance.
     */
    public static <T> PointInTime<T> createPointInTime(final T id) {
        return new PointInTimeImpl<T>(id);
    }

    /**
     * Create a {@link Position} with an String.
     *
     * @param id ID of the Position.
     * @return A Position instance.
     */
    public static <T> Position<T> createPosition(final T id) {
        return new PositionImpl<T>(id);
    }

    /**
     * Create a {@link PossibleWorld} with an String.
     *
     * @param id ID of the PossibleWorld.
     * @return A PossibleWorld instance.
     */
    public static <T> PossibleWorld<T> createPossibleWorld(final T id) {
        return new PossibleWorldImpl<T>(id);
    }

    /**
     * Create a {@link Price} with an String.
     *
     * @param id ID of the Price.
     * @return A Price instance.
     */
    public static <T> Price<T> createPrice(final T id) {
        return new PriceImpl<T>(id);
    }

    /**
     * Create a {@link ProductBrand} with an String.
     *
     * @param id ID of the ProductBrand.
     * @return A ProductBrand instance.
     */
    public static <T> ProductBrand<T> createProductBrand(final T id) {
        return new ProductBrandImpl<T>(id);
    }

    /**
     * Create a {@link ProductOffering} with an String.
     *
     * @param id ID of the ProductOffering.
     * @return A ProductOffering instance.
     */
    public static <T> ProductOffering<T> createProductOffering(final T id) {
        return new ProductOfferingImpl<T>(id);
    }

    /**
     * Create a {@link ReachingAgreement} with an String.
     *
     * @param id ID of the ReachingAgreement.
     * @return A ReachingAgreement instance.
     */
    public static <T> ReachingAgreement<T> createReachingAgreement(final T id) {
        return new ReachingAgreementImpl<T>(id);
    }

    /**
     * Create a {@link RecognizingLanguageCommunity} with an String.
     *
     * @param id ID of the RecognizingLanguageCommunity.
     * @return A RecognizingLanguageCommunity instance.
     */
    public static <T> RecognizingLanguageCommunity<T> createRecognizingLanguageCommunity(final T id) {
        return new RecognizingLanguageCommunityImpl<T>(id);
    }

    /**
     * Create a {@link RepresentationBySign} with an String.
     *
     * @param id ID of the RepresentationBySign.
     * @return A RepresentationBySign instance.
     */
    public static <T> RepresentationBySign<T> createRepresentationBySign(final T id) {
        return new RepresentationBySignImpl<T>(id);
    }

    /**
     * Create a {@link Requirement} with an String.
     *
     * @param id ID of the Requirement.
     * @return A Requirement instance.
     */
    public static <T> Requirement<T> createRequirement(final T id) {
        return new RequirementImpl<T>(id);
    }

    /**
     * Create a {@link RequirementSpecification} with an String.
     *
     * @param id ID of the RequirementSpecification.
     * @return A RequirementSpecification instance.
     */
    public static <T> RequirementSpecification<T> createRequirementSpecification(final T id) {
        return new RequirementSpecificationImpl<T>(id);
    }

    /**
     * Create a {@link SaleOfGoods} with an String.
     *
     * @param id ID of the SaleOfGoods.
     * @return A SaleOfGoods instance.
     */
    public static <T> SaleOfGoods<T> createSaleOfGoods(final T id) {
        return new SaleOfGoodsImpl<T>(id);
    }

    /**
     * Create a {@link SalesProduct} with an String.
     *
     * @param id ID of the SalesProduct.
     * @return A SalesProduct instance.
     */
    public static <T> SalesProduct<T> createSalesProduct(final T id) {
        return new SalesProductImpl<T>(id);
    }

    /**
     * Create a {@link SalesProductInstance} with an String.
     *
     * @param id ID of the SalesProductInstance.
     * @return A SalesProductInstance instance.
     */
    public static <T> SalesProductInstance<T> createSalesProductInstance(final T id) {
        return new SalesProductInstanceImpl<T>(id);
    }

    /**
     * Create a {@link SalesProductVersion} with an String.
     *
     * @param id ID of the SalesProductVersion.
     * @return A SalesProductVersion instance.
     */
    public static <T> SalesProductVersion<T> createSalesProductVersion(final T id) {
        return new SalesProductVersionImpl<T>(id);
    }

    /**
     * Create a {@link Sign} with an String.
     *
     * @param id ID of the Sign.
     * @return A Sign instance.
     */
    public static <T> Sign<T> createSign(final T id) {
        return new SignImpl<T>(id);
    }

    /**
     * Create a {@link SociallyConstructedActivity} with an String.
     *
     * @param id ID of the SociallyConstructedActivity.
     * @return A SociallyConstructedActivity instance.
     */
    public static <T> SociallyConstructedActivity<T> createSociallyConstructedActivity(final T id) {
        return new SociallyConstructedActivityImpl<T>(id);
    }

    /**
     * Create a {@link SociallyConstructedObject} with an String.
     *
     * @param id ID of the SociallyConstructedObject.
     * @return A SociallyConstructedObject instance.
     */
    public static <T> SociallyConstructedObject<T> createSociallyConstructedObject(final T id) {
        return new SociallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link SpatioTemporalExtent} with an String.
     *
     * @param id ID of the SpatioTemporalExtent.
     * @return A SpatioTemporalExtent instance.
     */
    public static <T> SpatioTemporalExtent<T> createSpatioTemporalExtent(final T id) {
        return new SpatioTemporalExtentImpl<T>(id);
    }

    /**
     * Create a {@link State} with an String.
     *
     * @param id ID of the State.
     * @return A State instance.
     */
    public static <T> State<T> createState(final T id) {
        return new StateImpl<T>(id);
    }

    /**
     * Create a {@link StateOfActivity} with an String.
     *
     * @param id ID of the StateOfActivity.
     * @return A StateOfActivity instance.
     */
    public static <T> StateOfActivity<T> createStateOfActivity(final T id) {
        return new StateOfActivityImpl<T>(id);
    }

    /**
     * Create a {@link StateOfAmountOfMoney} with an String.
     *
     * @param id ID of the StateOfAmountOfMoney.
     * @return A StateOfAmountOfMoney instance.
     */
    public static <T> StateOfAmountOfMoney<T> createStateOfAmountOfMoney(final T id) {
        return new StateOfAmountOfMoneyImpl<T>(id);
    }

    /**
     * Create a {@link StateOfAssociation} with an String.
     *
     * @param id ID of the StateOfAssociation.
     * @return A StateOfAssociation instance.
     */
    public static <T> StateOfAssociation<T> createStateOfAssociation(final T id) {
        return new StateOfAssociationImpl<T>(id);
    }

    /**
     * Create a {@link StateOfBiologicalObject} with an String.
     *
     * @param id ID of the StateOfBiologicalObject.
     * @return A StateOfBiologicalObject instance.
     */
    public static <T> StateOfBiologicalObject<T> createStateOfBiologicalObject(final T id) {
        return new StateOfBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link StateOfBiologicalSystem} with an String.
     *
     * @param id ID of the StateOfBiologicalSystem.
     * @return A StateOfBiologicalSystem instance.
     */
    public static <T> StateOfBiologicalSystem<T> createStateOfBiologicalSystem(final T id) {
        return new StateOfBiologicalSystemImpl<T>(id);
    }

    /**
     * Create a {@link StateOfBiologicalSystemComponent} with an String.
     *
     * @param id ID of the StateOfBiologicalSystemComponent.
     * @return A StateOfBiologicalSystemComponent instance.
     */
    public static <T> StateOfBiologicalSystemComponent<T> createStateOfBiologicalSystemComponent(final T id) {
        return new StateOfBiologicalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link StateOfFunctionalObject} with an String.
     *
     * @param id ID of the StateOfFunctionalObject.
     * @return A StateOfFunctionalObject instance.
     */
    public static <T> StateOfFunctionalObject<T> createStateOfFunctionalObject(final T id) {
        return new StateOfFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link StateOfFunctionalSystem} with an String.
     *
     * @param id ID of the StateOfFunctionalSystem.
     * @return A StateOfFunctionalSystem instance.
     */
    public static <T> StateOfFunctionalSystem<T> createStateOfFunctionalSystem(final T id) {
        return new StateOfFunctionalSystemImpl<T>(id);
    }

    /**
     * Create a {@link StateOfFunctionalSystemComponent} with an String.
     *
     * @param id ID of the StateOfFunctionalSystemComponent.
     * @return A StateOfFunctionalSystemComponent instance.
     */
    public static <T> StateOfFunctionalSystemComponent<T> createStateOfFunctionalSystemComponent(final T id) {
        return new StateOfFunctionalSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link StateOfIntentionallyConstructedObject} with an String.
     *
     * @param id ID of the StateOfIntentionallyConstructedObject.
     * @return A StateOfIntentionallyConstructedObject instance.
     */
    public static <T> StateOfIntentionallyConstructedObject<T> createStateOfIntentionallyConstructedObject(final T id) {
        return new StateOfIntentionallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link StateOfLanguageCommunity} with an String.
     *
     * @param id ID of the StateOfLanguageCommunity.
     * @return A StateOfLanguageCommunity instance.
     */
    public static <T> StateOfLanguageCommunity<T> createStateOfLanguageCommunity(final T id) {
        return new StateOfLanguageCommunityImpl<T>(id);
    }

    /**
     * Create a {@link StateOfOrdinaryBiologicalObject} with an String.
     *
     * @param id ID of the StateOfOrdinaryBiologicalObject.
     * @return A StateOfOrdinaryBiologicalObject instance.
     */
    public static <T> StateOfOrdinaryBiologicalObject<T> createStateOfOrdinaryBiologicalObject(final T id) {
        return new StateOfOrdinaryBiologicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link StateOfOrdinaryFunctionalObject} with an String.
     *
     * @param id ID of the StateOfOrdinaryFunctionalObject.
     * @return A StateOfOrdinaryFunctionalObject instance.
     */
    public static <T> StateOfOrdinaryFunctionalObject<T> createStateOfOrdinaryFunctionalObject(final T id) {
        return new StateOfOrdinaryFunctionalObjectImpl<T>(id);
    }

    /**
     * Create a {@link StateOfOrdinaryPhysicalObject} with an String.
     *
     * @param id ID of the StateOfOrdinaryPhysicalObject.
     * @return A StateOfOrdinaryPhysicalObject instance.
     */
    public static <T> StateOfOrdinaryPhysicalObject<T> createStateOfOrdinaryPhysicalObject(final T id) {
        return new StateOfOrdinaryPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link StateOfOrganization} with an String.
     *
     * @param id ID of the StateOfOrganization.
     * @return A StateOfOrganization instance.
     */
    public static <T> StateOfOrganization<T> createStateOfOrganization(final T id) {
        return new StateOfOrganizationImpl<T>(id);
    }

    /**
     * Create a {@link StateOfOrganizationComponent} with an String.
     *
     * @param id ID of the StateOfOrganizationComponent.
     * @return A StateOfOrganizationComponent instance.
     */
    public static <T> StateOfOrganizationComponent<T> createStateOfOrganizationComponent(final T id) {
        return new StateOfOrganizationComponentImpl<T>(id);
    }

    /**
     * Create a {@link StateOfParty} with an String.
     *
     * @param id ID of the StateOfParty.
     * @return A StateOfParty instance.
     */
    public static <T> StateOfParty<T> createStateOfParty(final T id) {
        return new StateOfPartyImpl<T>(id);
    }

    /**
     * Create a {@link StateOfPerson} with an String.
     *
     * @param id ID of the StateOfPerson.
     * @return A StateOfPerson instance.
     */
    public static <T> StateOfPerson<T> createStateOfPerson(final T id) {
        return new StateOfPersonImpl<T>(id);
    }

    /**
     * Create a {@link StateOfPhysicalObject} with an String.
     *
     * @param id ID of the StateOfPhysicalObject.
     * @return A StateOfPhysicalObject instance.
     */
    public static <T> StateOfPhysicalObject<T> createStateOfPhysicalObject(final T id) {
        return new StateOfPhysicalObjectImpl<T>(id);
    }

    /**
     * Create a {@link StateOfPosition} with an String.
     *
     * @param id ID of the StateOfPosition.
     * @return A StateOfPosition instance.
     */
    public static <T> StateOfPosition<T> createStateOfPosition(final T id) {
        return new StateOfPositionImpl<T>(id);
    }

    /**
     * Create a {@link StateOfSalesProductInstance} with an String.
     *
     * @param id ID of the StateOfSalesProductInstance.
     * @return A StateOfSalesProductInstance instance.
     */
    public static <T> StateOfSalesProductInstance<T> createStateOfSalesProductInstance(final T id) {
        return new StateOfSalesProductInstanceImpl<T>(id);
    }

    /**
     * Create a {@link StateOfSign} with an String.
     *
     * @param id ID of the StateOfSign.
     * @return A StateOfSign instance.
     */
    public static <T> StateOfSign<T> createStateOfSign(final T id) {
        return new StateOfSignImpl<T>(id);
    }

    /**
     * Create a {@link StateOfSociallyConstructedActivity} with an String.
     *
     * @param id ID of the StateOfSociallyConstructedActivity.
     * @return A StateOfSociallyConstructedActivity instance.
     */
    public static <T> StateOfSociallyConstructedActivity<T> createStateOfSociallyConstructedActivity(final T id) {
        return new StateOfSociallyConstructedActivityImpl<T>(id);
    }

    /**
     * Create a {@link StateOfSociallyConstructedObject} with an String.
     *
     * @param id ID of the StateOfSociallyConstructedObject.
     * @return A StateOfSociallyConstructedObject instance.
     */
    public static <T> StateOfSociallyConstructedObject<T> createStateOfSociallyConstructedObject(final T id) {
        return new StateOfSociallyConstructedObjectImpl<T>(id);
    }

    /**
     * Create a {@link StateOfSystem} with an String.
     *
     * @param id ID of the StateOfSystem.
     * @return A StateOfSystem instance.
     */
    public static <T> StateOfSystem<T> createStateOfSystem(final T id) {
        return new StateOfSystemImpl<T>(id);
    }

    /**
     * Create a {@link StateOfSystemComponent} with an String.
     *
     * @param id ID of the StateOfSystemComponent.
     * @return A StateOfSystemComponent instance.
     */
    public static <T> StateOfSystemComponent<T> createStateOfSystemComponent(final T id) {
        return new StateOfSystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link uk.gov.gchq.magmacore.hqdm.model.System} with an String.
     *
     * @param id ID of the System.
     * @return A System instance.
     */
    public static <T> uk.gov.gchq.magmacore.hqdm.model.System<T> createSystem(final T id) {
        return new SystemImpl<T>(id);
    }

    /**
     * Create a {@link SystemComponent} with an String.
     *
     * @param id ID of the SystemComponent.
     * @return A SystemComponent instance.
     */
    public static <T> SystemComponent<T> createSystemComponent(final T id) {
        return new SystemComponentImpl<T>(id);
    }

    /**
     * Create a {@link Thing} with an String.
     *
     * @param id ID of the Thing.
     * @return A Thing instance.
     */
    public static <T> Thing<T> createThing(final T id) {
        return new ThingImpl<T>(id);
    }

    /**
     * Create a {@link TransferOfOwnership} with an String.
     *
     * @param id ID of the TransferOfOwnership.
     * @return A TransferOfOwnership instance.
     */
    public static <T> TransferOfOwnership<T> createTransferOfOwnership(final T id) {
        return new TransferOfOwnershipImpl<T>(id);
    }

    /**
     * Create a {@link TransferOfOwnershipOfMoney} with an String.
     *
     * @param id ID of the TransferOfOwnershipOfMoney.
     * @return A TransferOfOwnershipOfMoney instance.
     */
    public static <T> TransferOfOwnershipOfMoney<T> createTransferOfOwnershipOfMoney(final T id) {
        return new TransferOfOwnershipOfMoneyImpl<T>(id);
    }

    /**
     * Create a {@link Transferee} with an String.
     *
     * @param id ID of the Transferee.
     * @return A Transferee instance.
     */
    public static <T> Transferee<T> createTransferee(final T id) {
        return new TransfereeImpl<T>(id);
    }

    /**
     * Create a {@link Transferor} with an String.
     *
     * @param id ID of the Transferor.
     * @return A Transferor instance.
     */
    public static <T> Transferor<T> createTransferor(final T id) {
        return new TransferorImpl<T>(id);
    }
}
