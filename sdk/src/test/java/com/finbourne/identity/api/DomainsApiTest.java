/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1598
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.identity.api;

import com.finbourne.identity.ApiException;
import com.finbourne.identity.model.AgreementResponse;
import com.finbourne.identity.model.CreateDomainRequest;
import com.finbourne.identity.model.DomainResponse;
import com.finbourne.identity.model.LusidProblemDetails;
import com.finbourne.identity.model.LusidValidationProblemDetails;
import com.finbourne.identity.model.ProblemDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DomainsApi
 */
@Ignore
public class DomainsApiTest {

    private final DomainsApi api = new DomainsApi();

    
    /**
     * CreateDomain: Create Domain
     *
     * Creates a Domain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDomainTest() throws ApiException {
        String code = null;
        CreateDomainRequest createDomainRequest = null;
        DomainResponse response = api.createDomain(code, createDomainRequest);

        // TODO: test validations
    }
    
    /**
     * GetAgreement: Get Agreement
     *
     * Check whether the domain has signed a specific agreement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgreementTest() throws ApiException {
        String agreement = null;
        Boolean response = api.getAgreement(agreement);

        // TODO: test validations
    }
    
    /**
     * GetMyDomain: Get current Domain
     *
     * Gets the Domain of the requesting User
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMyDomainTest() throws ApiException {
        DomainResponse response = api.getMyDomain();

        // TODO: test validations
    }
    
    /**
     * ListAgreements: List Agreements
     *
     * Lists the signed agreements for the current domain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAgreementsTest() throws ApiException {
        Map<String, AgreementResponse> response = api.listAgreements();

        // TODO: test validations
    }
    
    /**
     * SignAgreement: Sign Agreement
     *
     * Signs a specified agreement. Only the owner of a domain can sign an agreement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void signAgreementTest() throws ApiException {
        String agreement = null;
        AgreementResponse response = api.signAgreement(agreement);

        // TODO: test validations
    }
    
}
