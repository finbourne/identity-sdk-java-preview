# TokensApi

All URIs are relative to *https://www.lusid.com/identity*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invalidateToken**](TokensApi.md#invalidateToken) | **DELETE** /api/tokens | [EARLY ACCESS] InvalidateToken: Invalidate current JWT token (sign out)


<a name="invalidateToken"></a>
# **invalidateToken**
> invalidateToken()

[EARLY ACCESS] InvalidateToken: Invalidate current JWT token (sign out)

Log the current user out of all Finbourne platforms by invalidating the current token

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    try {
      apiInstance.invalidateToken();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#invalidateToken");
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

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**0** | Error response |  -  |

