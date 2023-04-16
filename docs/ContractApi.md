# ContractApi

All URIs are relative to *https://testnet.mvcapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contractFtAddressAddressBalanceConfirmedGet**](ContractApi.md#contractFtAddressAddressBalanceConfirmedGet) | **GET** /contract/ft/address/{address}/balance/confirmed | Get all contract token balances for specific address ignoring all unconfirmed txs.
[**contractFtAddressAddressBalanceGet**](ContractApi.md#contractFtAddressAddressBalanceGet) | **GET** /contract/ft/address/{address}/balance | Get all contract token balances for specific address.
[**contractFtAddressAddressCodeHashGenesisTxGet**](ContractApi.md#contractFtAddressAddressCodeHashGenesisTxGet) | **GET** /contract/ft/address/{address}/{codeHash}/{genesis}/tx | Get all contract token balances for specific address.
[**contractFtAddressAddressUtxoGet**](ContractApi.md#contractFtAddressAddressUtxoGet) | **GET** /contract/ft/address/{address}/utxo | Get all contract token utxos for specific address.
[**contractNftAddressAddressCountConfirmedGet**](ContractApi.md#contractNftAddressAddressCountConfirmedGet) | **GET** /contract/nft/address/{address}/count/confirmed | Get confirmed utxo count for specific nft(ignore all unconfirmed txs).
[**contractNftAddressAddressSummaryGet**](ContractApi.md#contractNftAddressAddressSummaryGet) | **GET** /contract/nft/address/{address}/summary | Get nft summary(NFT count group by genesis) for address.
[**contractNftAddressAddressUtxoGet**](ContractApi.md#contractNftAddressAddressUtxoGet) | **GET** /contract/nft/address/{address}/utxo | Get all contract nft token utxos for specific address.
[**contractNftGenesisCodeHashGenesisSummaryGet**](ContractApi.md#contractNftGenesisCodeHashGenesisSummaryGet) | **GET** /contract/nft/genesis/{codeHash}/{genesis}/summary | Get nft summary(count group by address) for specific codeHash and genesisId(result cached for 60s).
[**contractNftGenesisCodeHashGenesisUtxoGet**](ContractApi.md#contractNftGenesisCodeHashGenesisUtxoGet) | **GET** /contract/nft/genesis/{codeHash}/{genesis}/utxo | Get all contract nft token utxos by codeHash and genesisId.
[**contractNftSellAddressAddressUtxoGet**](ContractApi.md#contractNftSellAddressAddressUtxoGet) | **GET** /contract/nft/sell/address/{address}/utxo | Get all contract sell sell utxos for specific address.
[**contractNftSellGenesisCodeHashGenesisUtxoGet**](ContractApi.md#contractNftSellGenesisCodeHashGenesisUtxoGet) | **GET** /contract/nft/sell/genesis/{codeHash}/{genesis}/utxo | Get all contract nft token utxos by codeHash and genesisId.
[**contractUniqueGenesisCodeHashGenesisUtxoGet**](ContractApi.md#contractUniqueGenesisCodeHashGenesisUtxoGet) | **GET** /contract/unique/genesis/{codeHash}/{genesis}/utxo | Get contract unique utxos by codeHash and genesisId.



## contractFtAddressAddressBalanceConfirmedGet

> Long contractFtAddressAddressBalanceConfirmedGet(address, codeHash, genesis)

Get all contract token balances for specific address ignoring all unconfirmed txs.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String address = "address_example"; // String | the requested address
        String codeHash = "codeHash_example"; // String | Filter by contract code hash
        String genesis = "genesis_example"; // String | Filter by contract genesis
        try {
            Long result = apiInstance.contractFtAddressAddressBalanceConfirmedGet(address, codeHash, genesis);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractFtAddressAddressBalanceConfirmedGet");
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
 **codeHash** | **String**| Filter by contract code hash |
 **genesis** | **String**| Filter by contract genesis |

### Return type

**Long**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract ft balances succes（ingore unconfirmed txs）. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractFtAddressAddressBalanceGet

> List&lt;ContractFtBalance&gt; contractFtAddressAddressBalanceGet(address, codeHash, genesis)

Get all contract token balances for specific address.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String address = "address_example"; // String | the requested address
        String codeHash = "codeHash_example"; // String | Filter by contract code hash
        String genesis = "genesis_example"; // String | Filter by contract genesis
        try {
            List<ContractFtBalance> result = apiInstance.contractFtAddressAddressBalanceGet(address, codeHash, genesis);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractFtAddressAddressBalanceGet");
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
 **codeHash** | **String**| Filter by contract code hash | [optional]
 **genesis** | **String**| Filter by contract genesis | [optional]

### Return type

[**List&lt;ContractFtBalance&gt;**](ContractFtBalance.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract ft balances success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractFtAddressAddressCodeHashGenesisTxGet

> List&lt;ContractFtAddressTx&gt; contractFtAddressAddressCodeHashGenesisTxGet(address, codeHash, genesis, flag)

Get all contract token balances for specific address.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String address = "address_example"; // String | the requested address
        String codeHash = "codeHash_example"; // String | Filter by contract code hash
        String genesis = "genesis_example"; // String | Filter by contract genesis
        String flag = "flag_example"; // String | The last id of the last query(Paging flag)
        try {
            List<ContractFtAddressTx> result = apiInstance.contractFtAddressAddressCodeHashGenesisTxGet(address, codeHash, genesis, flag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractFtAddressAddressCodeHashGenesisTxGet");
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
 **codeHash** | **String**| Filter by contract code hash |
 **genesis** | **String**| Filter by contract genesis |
 **flag** | **String**| The last id of the last query(Paging flag) | [optional]

### Return type

[**List&lt;ContractFtAddressTx&gt;**](ContractFtAddressTx.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract ft history success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractFtAddressAddressUtxoGet

> List&lt;ContractFtUtxo&gt; contractFtAddressAddressUtxoGet(address, codeHash, genesis, flag)

Get all contract token utxos for specific address.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String address = "address_example"; // String | the requested address
        String codeHash = "codeHash_example"; // String | Filter by contract code hash
        String genesis = "genesis_example"; // String | Filter by contract genesis
        String flag = "flag_example"; // String | The flag of the last query Item(Paging flag)
        try {
            List<ContractFtUtxo> result = apiInstance.contractFtAddressAddressUtxoGet(address, codeHash, genesis, flag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractFtAddressAddressUtxoGet");
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
 **codeHash** | **String**| Filter by contract code hash | [optional]
 **genesis** | **String**| Filter by contract genesis | [optional]
 **flag** | **String**| The flag of the last query Item(Paging flag) | [optional]

### Return type

[**List&lt;ContractFtUtxo&gt;**](ContractFtUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract ft utxo success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractNftAddressAddressCountConfirmedGet

> Integer contractNftAddressAddressCountConfirmedGet(address, codeHash, genesis)

Get confirmed utxo count for specific nft(ignore all unconfirmed txs).

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String address = "address_example"; // String | the requested address
        String codeHash = "codeHash_example"; // String | Filter by contract code hash
        String genesis = "genesis_example"; // String | Filter by contract genesis
        try {
            Integer result = apiInstance.contractNftAddressAddressCountConfirmedGet(address, codeHash, genesis);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractNftAddressAddressCountConfirmedGet");
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
 **codeHash** | **String**| Filter by contract code hash |
 **genesis** | **String**| Filter by contract genesis |

### Return type

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract nft utxo success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractNftAddressAddressSummaryGet

> List&lt;ContractNftAddressSummary&gt; contractNftAddressAddressSummaryGet(address)

Get nft summary(NFT count group by genesis) for address.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String address = "address_example"; // String | the requested address
        try {
            List<ContractNftAddressSummary> result = apiInstance.contractNftAddressAddressSummaryGet(address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractNftAddressAddressSummaryGet");
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

[**List&lt;ContractNftAddressSummary&gt;**](ContractNftAddressSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract nft utxo success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractNftAddressAddressUtxoGet

> List&lt;ContractNftUtxo&gt; contractNftAddressAddressUtxoGet(address, codeHash, genesis, limit, flag)

Get all contract nft token utxos for specific address.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String address = "address_example"; // String | the requested address
        String codeHash = "codeHash_example"; // String | Filter by contract code hash
        String genesis = "genesis_example"; // String | Filter by contract genesis
        Integer limit = 56; // Integer | Limit the return count(no more than 300)
        String flag = "flag_example"; // String | The flag of the last query Item(Paging flag)
        try {
            List<ContractNftUtxo> result = apiInstance.contractNftAddressAddressUtxoGet(address, codeHash, genesis, limit, flag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractNftAddressAddressUtxoGet");
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
 **codeHash** | **String**| Filter by contract code hash | [optional]
 **genesis** | **String**| Filter by contract genesis | [optional]
 **limit** | **Integer**| Limit the return count(no more than 300) | [optional]
 **flag** | **String**| The flag of the last query Item(Paging flag) | [optional]

### Return type

[**List&lt;ContractNftUtxo&gt;**](ContractNftUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract nft utxo success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractNftGenesisCodeHashGenesisSummaryGet

> List&lt;ContractNftGenesisSummary&gt; contractNftGenesisCodeHashGenesisSummaryGet(codeHash, genesis)

Get nft summary(count group by address) for specific codeHash and genesisId(result cached for 60s).

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String codeHash = "codeHash_example"; // String | Code hash of the token.
        String genesis = "genesis_example"; // String | Contract genesis
        try {
            List<ContractNftGenesisSummary> result = apiInstance.contractNftGenesisCodeHashGenesisSummaryGet(codeHash, genesis);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractNftGenesisCodeHashGenesisSummaryGet");
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
 **codeHash** | **String**| Code hash of the token. |
 **genesis** | **String**| Contract genesis |

### Return type

[**List&lt;ContractNftGenesisSummary&gt;**](ContractNftGenesisSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract nft utxo success(result cached for 60s).. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractNftGenesisCodeHashGenesisUtxoGet

> List&lt;ContractNftUtxo&gt; contractNftGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min)

Get all contract nft token utxos by codeHash and genesisId.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String codeHash = "codeHash_example"; // String | Code hash of the token.
        String genesis = "genesis_example"; // String | Contract genesis
        Long tokenIndex = 56L; // Long | Find exact token Index.
        Long max = 56L; // Long | Token index not bigger than this(include this).
        Long min = 56L; // Long | Token index not less than this(include this).
        try {
            List<ContractNftUtxo> result = apiInstance.contractNftGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractNftGenesisCodeHashGenesisUtxoGet");
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
 **codeHash** | **String**| Code hash of the token. |
 **genesis** | **String**| Contract genesis |
 **tokenIndex** | **Long**| Find exact token Index. | [optional]
 **max** | **Long**| Token index not bigger than this(include this). | [optional]
 **min** | **Long**| Token index not less than this(include this). | [optional]

### Return type

[**List&lt;ContractNftUtxo&gt;**](ContractNftUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract nft utxo success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractNftSellAddressAddressUtxoGet

> List&lt;ContractNftSellUtxo&gt; contractNftSellAddressAddressUtxoGet(address, codeHash, genesis, flag)

Get all contract sell sell utxos for specific address.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String address = "address_example"; // String | Owner address.
        String codeHash = "codeHash_example"; // String | Filter by contract code hash
        String genesis = "genesis_example"; // String | Filter by contract genesis
        String flag = "flag_example"; // String | The flag of the last query Item(Paging flag)
        try {
            List<ContractNftSellUtxo> result = apiInstance.contractNftSellAddressAddressUtxoGet(address, codeHash, genesis, flag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractNftSellAddressAddressUtxoGet");
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
 **address** | **String**| Owner address. |
 **codeHash** | **String**| Filter by contract code hash | [optional]
 **genesis** | **String**| Filter by contract genesis | [optional]
 **flag** | **String**| The flag of the last query Item(Paging flag) | [optional]

### Return type

[**List&lt;ContractNftSellUtxo&gt;**](ContractNftSellUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract nft sell utxo success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractNftSellGenesisCodeHashGenesisUtxoGet

> List&lt;ContractNftSellUtxo&gt; contractNftSellGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min)

Get all contract nft token utxos by codeHash and genesisId.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String codeHash = "codeHash_example"; // String | Code hash of the token.
        String genesis = "genesis_example"; // String | Contract genesis
        Long tokenIndex = 56L; // Long | Find exact token Index.
        Long max = 56L; // Long | Token index not bigger than this(include this).
        Long min = 56L; // Long | Token index not less than this(include this).
        try {
            List<ContractNftSellUtxo> result = apiInstance.contractNftSellGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractNftSellGenesisCodeHashGenesisUtxoGet");
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
 **codeHash** | **String**| Code hash of the token. |
 **genesis** | **String**| Contract genesis |
 **tokenIndex** | **Long**| Find exact token Index. | [optional]
 **max** | **Long**| Token index not bigger than this(include this). | [optional]
 **min** | **Long**| Token index not less than this(include this). | [optional]

### Return type

[**List&lt;ContractNftSellUtxo&gt;**](ContractNftSellUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract nft sell utxo success. |  -  |
| **401** | Access token is missing or invalid |  -  |


## contractUniqueGenesisCodeHashGenesisUtxoGet

> List&lt;ContractUniqueUtxo&gt; contractUniqueGenesisCodeHashGenesisUtxoGet(codeHash, genesis)

Get contract unique utxos by codeHash and genesisId.

### Example

```java
// Import classes:
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.auth.*;
import com.metasv.mvc.client.openapi.models.*;
import com.metasv.mvc.client.openapi.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String codeHash = "codeHash_example"; // String | Code hash of the token.
        String genesis = "genesis_example"; // String | Contract genesis
        try {
            List<ContractUniqueUtxo> result = apiInstance.contractUniqueGenesisCodeHashGenesisUtxoGet(codeHash, genesis);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractUniqueGenesisCodeHashGenesisUtxoGet");
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
 **codeHash** | **String**| Code hash of the token. |
 **genesis** | **String**| Contract genesis |

### Return type

[**List&lt;ContractUniqueUtxo&gt;**](ContractUniqueUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get contract unique utxo success. |  -  |
| **401** | Access token is missing or invalid |  -  |

