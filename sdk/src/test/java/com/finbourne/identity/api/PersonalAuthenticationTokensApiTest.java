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
import com.finbourne.identity.model.ApiKey;
import com.finbourne.identity.model.CreateApiKey;
import com.finbourne.identity.model.CreatedApiKey;
import com.finbourne.identity.model.LusidProblemDetails;
import com.finbourne.identity.model.LusidValidationProblemDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonalAuthenticationTokensApi
 */
@Ignore
public class PersonalAuthenticationTokensApiTest {

    private final PersonalAuthenticationTokensApi api = new PersonalAuthenticationTokensApi();

    
    /**
     * [EARLY ACCESS] CreateApiKey: Create a Personal Access Token
     *
     * Generates a Personal Access Token and returns the new key and its associated metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createApiKeyTest() throws ApiException {
        CreateApiKey createApiKey = null;
        CreatedApiKey response = api.createApiKey(createApiKey);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] DeleteApiKey: Invalidate a Personal Access Token
     *
     * Immediately invalidates the specified Personal Access Token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteApiKeyTest() throws ApiException {
        String id = null;
        ApiKey response = api.deleteApiKey(id);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] ListOwnApiKeys: Gets the meta data for all of the user&#39;s existing Personal Access Tokens.
     *
     * Gets the meta data for all of the user&#39;s Personal Access Tokens that have not been deleted. They may be  invalid due to the deactivation date having passed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOwnApiKeysTest() throws ApiException {
        List<ApiKey> response = api.listOwnApiKeys();

        // TODO: test validations
    }
    
}
