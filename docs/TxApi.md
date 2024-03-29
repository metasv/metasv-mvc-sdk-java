# TxApi

All URIs are relative to *https://testnet.mvcapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**txBroadcastBatchPost**](TxApi.md#txBroadcastBatchPost) | **POST** /tx/broadcast/batch | Broadcast a batch of tx to metasv fullnode. This endpoint use rpc sendrawtransactions.
[**txBroadcastPost**](TxApi.md#txBroadcastPost) | **POST** /tx/broadcast | Broadcast tx to metasv fullnode.
[**txTxidGet**](TxApi.md#txTxidGet) | **GET** /tx/{txid} | Get transaction detail by specific txid.
[**txTxidRawGet**](TxApi.md#txTxidRawGet) | **GET** /tx/{txid}/raw | Get transaction raw hex by specific txid.
[**txTxidSeenGet**](TxApi.md#txTxidSeenGet) | **GET** /tx/{txid}/seen | Whether MetaSV have seen this tx before. This is a fast approach to know if the tx exist or not.
[**vinTxidDetailGet**](TxApi.md#vinTxidDetailGet) | **GET** /vin/{txid}/detail | Get all output point of vins in the tx with detailed output script.



## txBroadcastBatchPost

> BatchBroadcastResult txBroadcastBatchPost(txRaw)

Broadcast a batch of tx to metasv fullnode. This endpoint use rpc sendrawtransactions.

This api will broadcast to metasv fullnode directly.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.TxApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TxApi apiInstance = new TxApi(defaultClient);
        List<TxRaw> txRaw = Arrays.asList(); // List<TxRaw> | 
        try {
            BatchBroadcastResult result = apiInstance.txBroadcastBatchPost(txRaw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TxApi#txBroadcastBatchPost");
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
 **txRaw** | [**List&lt;TxRaw&gt;**](TxRaw.md)|  | [optional]

### Return type

[**BatchBroadcastResult**](BatchBroadcastResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Broadcast result list, txid returned with the original order |  -  |


## txBroadcastPost

> BroadcastResult txBroadcastPost(txRaw)

Broadcast tx to metasv fullnode.

This api will broadcast to metasv fullnode directly. This endpoint use rpc sendrawtransaction.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.TxApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TxApi apiInstance = new TxApi(defaultClient);
        TxRaw txRaw = new TxRaw(); // TxRaw | 
        try {
            BroadcastResult result = apiInstance.txBroadcastPost(txRaw);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TxApi#txBroadcastPost");
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
 **txRaw** | [**TxRaw**](TxRaw.md)|  | [optional]

### Return type

[**BroadcastResult**](BroadcastResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Broadcast success, txid returned |  -  |
| **403** | Broadcast Failed |  -  |


## txTxidGet

> TxDetail txTxidGet(txid, showScript)

Get transaction detail by specific txid.

This api is parsed from raw hex, you can use /tx/{txid}/raw to parse tx by yourself, If you want detail input info, use &#39;/vin/{txid}&#39; to get detailed input info including address and value.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.TxApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TxApi apiInstance = new TxApi(defaultClient);
        String txid = "txid_example"; // String | the request ID to search, txhash
        Boolean showScript = true; // Boolean | Return source script code or not (default false).
        try {
            TxDetail result = apiInstance.txTxidGet(txid, showScript);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TxApi#txTxidGet");
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
 **txid** | **String**| the request ID to search, txhash |
 **showScript** | **Boolean**| Return source script code or not (default false). | [optional]

### Return type

[**TxDetail**](TxDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get transaction detail success. |  -  |
| **404** | Transaction not found |  -  |


## txTxidRawGet

> TxRaw txTxidRawGet(txid)

Get transaction raw hex by specific txid.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.TxApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TxApi apiInstance = new TxApi(defaultClient);
        String txid = "txid_example"; // String | the request ID to search, txhash
        try {
            TxRaw result = apiInstance.txTxidRawGet(txid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TxApi#txTxidRawGet");
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
 **txid** | **String**| the request ID to search, txhash |

### Return type

[**TxRaw**](TxRaw.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get transaction raw hex success. |  -  |
| **404** | Transaction not found |  -  |


## txTxidSeenGet

> Boolean txTxidSeenGet(txid)

Whether MetaSV have seen this tx before. This is a fast approach to know if the tx exist or not.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.TxApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TxApi apiInstance = new TxApi(defaultClient);
        String txid = "txid_example"; // String | the request ID to search, txhash
        try {
            Boolean result = apiInstance.txTxidSeenGet(txid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TxApi#txTxidSeenGet");
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
 **txid** | **String**| the request ID to search, txhash |

### Return type

**Boolean**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return true if the transaction is found. |  -  |
| **404** | Transaction not found. |  -  |


## vinTxidDetailGet

> List&lt;OutputInfoDetail&gt; vinTxidDetailGet(txid)

Get all output point of vins in the tx with detailed output script.

Search output points by spent txid. Use this api to get detailed inputs for the tx.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.TxApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TxApi apiInstance = new TxApi(defaultClient);
        String txid = "txid_example"; // String | The txid of the vins
        try {
            List<OutputInfoDetail> result = apiInstance.vinTxidDetailGet(txid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TxApi#vinTxidDetailGet");
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
 **txid** | **String**| The txid of the vins |

### Return type

[**List&lt;OutputInfoDetail&gt;**](OutputInfoDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get vin list success. |  -  |
| **401** | Access token is missing or invalid |  -  |

