# DomainsApi

All URIs are relative to *https://www.lusid.com/identity*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomain**](DomainsApi.md#createDomain) | **POST** /api/domains | CreateDomain: Create Domain
[**getAgreement**](DomainsApi.md#getAgreement) | **HEAD** /api/domains/me/agreements/{agreement} | GetAgreement: Get Agreement
[**getMyDomain**](DomainsApi.md#getMyDomain) | **GET** /api/domains/me | GetMyDomain: Get current Domain
[**listAgreements**](DomainsApi.md#listAgreements) | **GET** /api/domains/me/agreements | ListAgreements: List Agreements
[**signAgreement**](DomainsApi.md#signAgreement) | **PUT** /api/domains/me/agreements/{agreement} | SignAgreement: Sign Agreement


<a name="createDomain"></a>
# **createDomain**
> DomainResponse createDomain(code, createDomainRequest)

CreateDomain: Create Domain

Creates a Domain

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.DomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DomainsApi apiInstance = new DomainsApi(defaultClient);
    String code = "code_example"; // String | The verification code necessary to create domains
    CreateDomainRequest createDomainRequest = new CreateDomainRequest(); // CreateDomainRequest | The definition of the domain
    try {
      DomainResponse result = apiInstance.createDomain(code, createDomainRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#createDomain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The verification code necessary to create domains |
 **createDomainRequest** | [**CreateDomainRequest**](CreateDomainRequest.md)| The definition of the domain |

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The created domain |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getAgreement"></a>
# **getAgreement**
> getAgreement(agreement)

GetAgreement: Get Agreement

Check whether the domain has signed a specific agreement

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.DomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DomainsApi apiInstance = new DomainsApi(defaultClient);
    String agreement = "agreement_example"; // String | Name of the agreement
    try {
      apiInstance.getAgreement(agreement);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agreement** | **String**| Name of the agreement |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The agreement is not signed |  -  |
**200** | The agreement is signed |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getMyDomain"></a>
# **getMyDomain**
> DomainResponse getMyDomain()

GetMyDomain: Get current Domain

Gets the Domain of the requesting User

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.DomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DomainsApi apiInstance = new DomainsApi(defaultClient);
    try {
      DomainResponse result = apiInstance.getMyDomain();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getMyDomain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The current domain |  -  |
**0** | Error response |  -  |

<a name="listAgreements"></a>
# **listAgreements**
> Map&lt;String, AgreementResponse&gt; listAgreements()

ListAgreements: List Agreements

Lists the signed agreements for the current domain

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.DomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DomainsApi apiInstance = new DomainsApi(defaultClient);
    try {
      Map<String, AgreementResponse> result = apiInstance.listAgreements();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#listAgreements");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, AgreementResponse&gt;**](AgreementResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List the signed agreements for the current domain |  -  |
**0** | Error response |  -  |

<a name="signAgreement"></a>
# **signAgreement**
> AgreementResponse signAgreement(agreement)

SignAgreement: Sign Agreement

Signs a specified agreement. Only the owner of a domain can sign an agreement

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.DomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DomainsApi apiInstance = new DomainsApi(defaultClient);
    String agreement = "agreement_example"; // String | Name of the agreement being signed
    try {
      AgreementResponse result = apiInstance.signAgreement(agreement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#signAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agreement** | **String**| Name of the agreement being signed |

### Return type

[**AgreementResponse**](AgreementResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Signs a specified agreement |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

