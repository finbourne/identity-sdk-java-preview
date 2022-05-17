/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1652
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.identity.api;

import com.finbourne.identity.ApiCallback;
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.ApiResponse;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.Pair;
import com.finbourne.identity.ProgressRequestBody;
import com.finbourne.identity.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.identity.model.AuthenticationInformation;
import com.finbourne.identity.model.LusidProblemDetails;
import com.finbourne.identity.model.LusidValidationProblemDetails;
import com.finbourne.identity.model.SupportAccessRequest;
import com.finbourne.identity.model.SupportAccessResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationApi {
    private ApiClient localVarApiClient;
    public AuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAuthenticationInformation
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get authentication information </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAuthenticationInformationCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/authentication/information";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1652");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAuthenticationInformationValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAuthenticationInformationCall(_callback);
        return localVarCall;

    }

    /**
     * GetAuthenticationInformation: Gets AuthenticationInformation
     * Get the AuthenticationInformation associated with the current domain. This includes all the  necessary information to login to this domain.
     * @return AuthenticationInformation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get authentication information </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public AuthenticationInformation getAuthenticationInformation() throws ApiException {
        ApiResponse<AuthenticationInformation> localVarResp = getAuthenticationInformationWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * GetAuthenticationInformation: Gets AuthenticationInformation
     * Get the AuthenticationInformation associated with the current domain. This includes all the  necessary information to login to this domain.
     * @return ApiResponse&lt;AuthenticationInformation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get authentication information </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AuthenticationInformation> getAuthenticationInformationWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAuthenticationInformationValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AuthenticationInformation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetAuthenticationInformation: Gets AuthenticationInformation (asynchronously)
     * Get the AuthenticationInformation associated with the current domain. This includes all the  necessary information to login to this domain.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get authentication information </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAuthenticationInformationAsync(final ApiCallback<AuthenticationInformation> _callback) throws ApiException {
        okhttp3.Call localVarCall = getAuthenticationInformationValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AuthenticationInformation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSupportAccessHistory
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get support access history </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSupportAccessHistoryCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/authentication/support";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1652");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSupportAccessHistoryValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSupportAccessHistoryCall(_callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetSupportAccessHistory: Get the history of all support access granted and any information pertaining to their termination
     * The active and inactive support requests will be returned, inactive support requests will have information pertaining to their termination  including obfuscated userIds of those who created and terminated the request
     * @return List&lt;SupportAccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get support access history </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public List<SupportAccessResponse> getSupportAccessHistory() throws ApiException {
        ApiResponse<List<SupportAccessResponse>> localVarResp = getSupportAccessHistoryWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetSupportAccessHistory: Get the history of all support access granted and any information pertaining to their termination
     * The active and inactive support requests will be returned, inactive support requests will have information pertaining to their termination  including obfuscated userIds of those who created and terminated the request
     * @return ApiResponse&lt;List&lt;SupportAccessResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get support access history </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<SupportAccessResponse>> getSupportAccessHistoryWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSupportAccessHistoryValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<SupportAccessResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetSupportAccessHistory: Get the history of all support access granted and any information pertaining to their termination (asynchronously)
     * The active and inactive support requests will be returned, inactive support requests will have information pertaining to their termination  including obfuscated userIds of those who created and terminated the request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get support access history </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSupportAccessHistoryAsync(final ApiCallback<List<SupportAccessResponse>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getSupportAccessHistoryValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<SupportAccessResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for grantSupportAccess
     * @param supportAccessRequest Request detailing the duration and reasons for supplying support access (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Grant Support Access </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call grantSupportAccessCall(SupportAccessRequest supportAccessRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = supportAccessRequest;

        // create path and map variables
        String localVarPath = "/api/authentication/support";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1652");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call grantSupportAccessValidateBeforeCall(SupportAccessRequest supportAccessRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'supportAccessRequest' is set
        if (supportAccessRequest == null) {
            throw new ApiException("Missing the required parameter 'supportAccessRequest' when calling grantSupportAccess(Async)");
        }
        

        okhttp3.Call localVarCall = grantSupportAccessCall(supportAccessRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GrantSupportAccess: Grants FINBOURNE support access to your account
     * Granting support access will allow FINBOURNE employees full access to your data with the express intent to investigate support issues  You can revoke this (and all) access at any time using the InvalidateSupportAccess endpoint.
     * @param supportAccessRequest Request detailing the duration and reasons for supplying support access (required)
     * @return SupportAccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Grant Support Access </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public SupportAccessResponse grantSupportAccess(SupportAccessRequest supportAccessRequest) throws ApiException {
        ApiResponse<SupportAccessResponse> localVarResp = grantSupportAccessWithHttpInfo(supportAccessRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GrantSupportAccess: Grants FINBOURNE support access to your account
     * Granting support access will allow FINBOURNE employees full access to your data with the express intent to investigate support issues  You can revoke this (and all) access at any time using the InvalidateSupportAccess endpoint.
     * @param supportAccessRequest Request detailing the duration and reasons for supplying support access (required)
     * @return ApiResponse&lt;SupportAccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Grant Support Access </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SupportAccessResponse> grantSupportAccessWithHttpInfo(SupportAccessRequest supportAccessRequest) throws ApiException {
        okhttp3.Call localVarCall = grantSupportAccessValidateBeforeCall(supportAccessRequest, null);
        Type localVarReturnType = new TypeToken<SupportAccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GrantSupportAccess: Grants FINBOURNE support access to your account (asynchronously)
     * Granting support access will allow FINBOURNE employees full access to your data with the express intent to investigate support issues  You can revoke this (and all) access at any time using the InvalidateSupportAccess endpoint.
     * @param supportAccessRequest Request detailing the duration and reasons for supplying support access (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Grant Support Access </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call grantSupportAccessAsync(SupportAccessRequest supportAccessRequest, final ApiCallback<SupportAccessResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = grantSupportAccessValidateBeforeCall(supportAccessRequest, _callback);
        Type localVarReturnType = new TypeToken<SupportAccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for invalidateSupportAccess
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invalidate all currently active support requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invalidateSupportAccessCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/authentication/support";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1652");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call invalidateSupportAccessValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = invalidateSupportAccessCall(_callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] InvalidateSupportAccess: Revoke any FINBOURNE support access to your account
     * This will result in a loss of access to your data for all FINBOURNE support agents
     * @return List&lt;SupportAccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invalidate all currently active support requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public List<SupportAccessResponse> invalidateSupportAccess() throws ApiException {
        ApiResponse<List<SupportAccessResponse>> localVarResp = invalidateSupportAccessWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] InvalidateSupportAccess: Revoke any FINBOURNE support access to your account
     * This will result in a loss of access to your data for all FINBOURNE support agents
     * @return ApiResponse&lt;List&lt;SupportAccessResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invalidate all currently active support requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<SupportAccessResponse>> invalidateSupportAccessWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = invalidateSupportAccessValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<SupportAccessResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] InvalidateSupportAccess: Revoke any FINBOURNE support access to your account (asynchronously)
     * This will result in a loss of access to your data for all FINBOURNE support agents
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invalidate all currently active support requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invalidateSupportAccessAsync(final ApiCallback<List<SupportAccessResponse>> _callback) throws ApiException {
        okhttp3.Call localVarCall = invalidateSupportAccessValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<SupportAccessResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
