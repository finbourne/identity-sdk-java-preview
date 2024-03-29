# AuthenticationApi

All URIs are relative to *https://www.lusid.com/identity*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthenticationInformation**](AuthenticationApi.md#getAuthenticationInformation) | **GET** /api/authentication/information | GetAuthenticationInformation: Gets AuthenticationInformation
[**getSupportAccessHistory**](AuthenticationApi.md#getSupportAccessHistory) | **GET** /api/authentication/support | [EARLY ACCESS] GetSupportAccessHistory: Get the history of all support access granted and any information pertaining to their termination
[**getSupportRoles**](AuthenticationApi.md#getSupportRoles) | **GET** /api/authentication/support-roles | [EARLY ACCESS] GetSupportRoles: Get mapping of support roles, the internal representation to a human friendly representation
[**grantSupportAccess**](AuthenticationApi.md#grantSupportAccess) | **POST** /api/authentication/support | [EARLY ACCESS] GrantSupportAccess: Grants FINBOURNE support access to your account
[**invalidateSupportAccess**](AuthenticationApi.md#invalidateSupportAccess) | **DELETE** /api/authentication/support | [EARLY ACCESS] InvalidateSupportAccess: Revoke any FINBOURNE support access to your account


<a name="getAuthenticationInformation"></a>
# **getAuthenticationInformation**
> AuthenticationInformation getAuthenticationInformation()

GetAuthenticationInformation: Gets AuthenticationInformation

Get the AuthenticationInformation associated with the current domain. This includes all the  necessary information to login to this domain.

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      AuthenticationInformation result = apiInstance.getAuthenticationInformation();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getAuthenticationInformation");
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

[**AuthenticationInformation**](AuthenticationInformation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get authentication information |  -  |
**0** | Error response |  -  |

<a name="getSupportAccessHistory"></a>
# **getSupportAccessHistory**
> List&lt;SupportAccessResponse&gt; getSupportAccessHistory()

[EARLY ACCESS] GetSupportAccessHistory: Get the history of all support access granted and any information pertaining to their termination

The active and inactive support requests will be returned, inactive support requests will have information pertaining to their termination  including obfuscated userIds of those who created and terminated the request

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      List<SupportAccessResponse> result = apiInstance.getSupportAccessHistory();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getSupportAccessHistory");
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

[**List&lt;SupportAccessResponse&gt;**](SupportAccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get support access history |  -  |
**0** | Error response |  -  |

<a name="getSupportRoles"></a>
# **getSupportRoles**
> SupportRolesResponse getSupportRoles()

[EARLY ACCESS] GetSupportRoles: Get mapping of support roles, the internal representation to a human friendly representation

Get mapping of support roles, the internal representation to a human friendly representation

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      SupportRolesResponse result = apiInstance.getSupportRoles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getSupportRoles");
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

[**SupportRolesResponse**](SupportRolesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get support roles |  -  |
**0** | Error response |  -  |

<a name="grantSupportAccess"></a>
# **grantSupportAccess**
> SupportAccessResponse grantSupportAccess(supportAccessRequest)

[EARLY ACCESS] GrantSupportAccess: Grants FINBOURNE support access to your account

Granting support access will allow FINBOURNE employees full access to your data with the express intent to investigate support issues  You can revoke this (and all) access at any time using the InvalidateSupportAccess endpoint.

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    SupportAccessRequest supportAccessRequest = new SupportAccessRequest(); // SupportAccessRequest | Request detailing the duration and reasons for supplying support access
    try {
      SupportAccessResponse result = apiInstance.grantSupportAccess(supportAccessRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#grantSupportAccess");
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
 **supportAccessRequest** | [**SupportAccessRequest**](SupportAccessRequest.md)| Request detailing the duration and reasons for supplying support access |

### Return type

[**SupportAccessResponse**](SupportAccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Grant Support Access |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="invalidateSupportAccess"></a>
# **invalidateSupportAccess**
> List&lt;SupportAccessResponse&gt; invalidateSupportAccess()

[EARLY ACCESS] InvalidateSupportAccess: Revoke any FINBOURNE support access to your account

This will result in a loss of access to your data for all FINBOURNE support agents

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      List<SupportAccessResponse> result = apiInstance.invalidateSupportAccess();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#invalidateSupportAccess");
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

[**List&lt;SupportAccessResponse&gt;**](SupportAccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invalidate all currently active support requests |  -  |
**0** | Error response |  -  |

