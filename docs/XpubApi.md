# XpubApi

All URIs are relative to *https://api-mvc-testnet.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**xpubLiteXpubAddressAddressGet**](XpubApi.md#xpubLiteXpubAddressAddressGet) | **GET** /xpubLite/{xpub}/address/{address} | Get xpub address type and index. Only index under /0/70 /1/30 is valid. Otherwise not found.
[**xpubLiteXpubBalanceGet**](XpubApi.md#xpubLiteXpubBalanceGet) | **GET** /xpubLite/{xpub}/balance | Get xpub balances including confirmed and unconfirmed.
[**xpubLiteXpubUtxoGet**](XpubApi.md#xpubLiteXpubUtxoGet) | **GET** /xpubLite/{xpub}/utxo | Get xpub utxos by specific xpub(300 per page).



## xpubLiteXpubAddressAddressGet

> XpubAddress xpubLiteXpubAddressAddressGet(xpub, address)

Get xpub address type and index. Only index under /0/70 /1/30 is valid. Otherwise not found.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.XpubApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-mvc-testnet.metasv.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        XpubApi apiInstance = new XpubApi(defaultClient);
        String xpub = "xpub_example"; // String | the requested xpub
        String address = "address_example"; // String | the requested address
        try {
            XpubAddress result = apiInstance.xpubLiteXpubAddressAddressGet(xpub, address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XpubApi#xpubLiteXpubAddressAddressGet");
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
 **xpub** | **String**| the requested xpub |
 **address** | **String**| the requested address |

### Return type

[**XpubAddress**](XpubAddress.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get xpub address success. |  -  |
| **401** | Access token is missing or invalid |  -  |
| **404** | Address not found in the xpub. |  -  |


## xpubLiteXpubBalanceGet

> XpubLiteBalance xpubLiteXpubBalanceGet(xpub)

Get xpub balances including confirmed and unconfirmed.

This api returns confirmed balance(same as address balance), not sumed utxos.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.XpubApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-mvc-testnet.metasv.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        XpubApi apiInstance = new XpubApi(defaultClient);
        String xpub = "xpub_example"; // String | the xpub to search
        try {
            XpubLiteBalance result = apiInstance.xpubLiteXpubBalanceGet(xpub);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XpubApi#xpubLiteXpubBalanceGet");
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
 **xpub** | **String**| the xpub to search |

### Return type

[**XpubLiteBalance**](XpubLiteBalance.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get xpub balance success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## xpubLiteXpubUtxoGet

> List&lt;XpubUtxo&gt; xpubLiteXpubUtxoGet(xpub, limit)

Get xpub utxos by specific xpub(300 per page).

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.XpubApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-mvc-testnet.metasv.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        XpubApi apiInstance = new XpubApi(defaultClient);
        String xpub = "xpub_example"; // String | the requested xpub
        Integer limit = 56; // Integer | The max items returned in this query(default 300), not bigger than 5000.
        try {
            List<XpubUtxo> result = apiInstance.xpubLiteXpubUtxoGet(xpub, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XpubApi#xpubLiteXpubUtxoGet");
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
 **xpub** | **String**| the requested xpub |
 **limit** | **Integer**| The max items returned in this query(default 300), not bigger than 5000. | [optional]

### Return type

[**List&lt;XpubUtxo&gt;**](XpubUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get xpub utxos success. |  -  |
| **401** | Access token is missing or invalid |  -  |

