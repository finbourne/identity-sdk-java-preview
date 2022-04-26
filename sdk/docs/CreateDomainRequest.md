

# CreateDomainRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | The name LUSID domain to create | 
**description** | **String** | Optional. Free text description of the domain. |  [optional]
**companyName** | **String** | The name of the company to which the domain is registered | 
**owner** | [**CreateUserRequest**](CreateUserRequest.md) |  | 
**technicalContact** | [**CreateUserRequest**](CreateUserRequest.md) |  |  [optional]
**billingContact** | [**CreateUserRequest**](CreateUserRequest.md) |  |  [optional]
**signedAgreements** | **List&lt;String&gt;** | Optional. If Terms and Conditions agreements have been signed during the sign up process |  [optional]



