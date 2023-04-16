# AddressApi

All URIs are relative to *https://testnet.mvcapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressAddressBalanceGet**](AddressApi.md#addressAddressBalanceGet) | **GET** /address/{address}/balance | Get address balance by specific address.
[**addressAddressTxGet**](AddressApi.md#addressAddressTxGet) | **GET** /address/{address}/tx | Get address history by specific address(recent 10 days available).
[**addressAddressUtxoGet**](AddressApi.md#addressAddressUtxoGet) | **GET** /address/{address}/utxo | Get address utxos by specific address(100 per page).



## addressAddressBalanceGet

> AddressBalance addressAddressBalanceGet(address)

Get address balance by specific address.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressApi apiInstance = new AddressApi(defaultClient);
        String address = "address_example"; // String | the requested address
        try {
            AddressBalance result = apiInstance.addressAddressBalanceGet(address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressAddressBalanceGet");
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
 **address** | **String**| the requested address |

### Return type

[**AddressBalance**](AddressBalance.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get address detail success. |  -  |


## addressAddressTxGet

> List&lt;AddressTx&gt; addressAddressTxGet(address, flag, confirmed)

Get address history by specific address(recent 10 days available).

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressApi apiInstance = new AddressApi(defaultClient);
        String address = "address_example"; // String | the requested address
        String flag = "flag_example"; // String | The last id of the last query(Paging flag)
        Boolean confirmed = true; // Boolean | (default true) fetch confirmed tx, fetch unconfirmed tx if false
        try {
            List<AddressTx> result = apiInstance.addressAddressTxGet(address, flag, confirmed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressAddressTxGet");
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
 **address** | **String**| the requested address |
 **flag** | **String**| The last id of the last query(Paging flag) | [optional]
 **confirmed** | **Boolean**| (default true) fetch confirmed tx, fetch unconfirmed tx if false | [optional]

### Return type

[**List&lt;AddressTx&gt;**](AddressTx.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get address transaction history success. |  -  |


## addressAddressUtxoGet

> List&lt;AddressUtxo&gt; addressAddressUtxoGet(address, flag)

Get address utxos by specific address(100 per page).

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressApi apiInstance = new AddressApi(defaultClient);
        String address = "address_example"; // String | the requested address
        String flag = "flag_example"; // String | The last id of the last query(Paging flag)
        try {
            List<AddressUtxo> result = apiInstance.addressAddressUtxoGet(address, flag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressAddressUtxoGet");
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
 **address** | **String**| the requested address |
 **flag** | **String**| The last id of the last query(Paging flag) | [optional]

### Return type

[**List&lt;AddressUtxo&gt;**](AddressUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get address utxos success. |  -  |

