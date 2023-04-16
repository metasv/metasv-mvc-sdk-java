package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.ApiClient;

import com.metasv.mvc.client.openapi.model.BatchBroadcastResult;
import com.metasv.mvc.client.openapi.model.BroadcastResult;
import com.metasv.mvc.client.openapi.model.ErrorResponse;
import com.metasv.mvc.client.openapi.model.OutputInfoDetail;
import com.metasv.mvc.client.openapi.model.TxDetail;
import com.metasv.mvc.client.openapi.model.TxRaw;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T16:52:15.815523+09:00[Asia/Tokyo]")
public class TxApi {
    private ApiClient apiClient;

    public TxApi() {
        this(new ApiClient());
    }

    @Autowired
    public TxApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Broadcast a batch of tx to metasv fullnode. This endpoint use rpc sendrawtransactions.
     * This api will broadcast to metasv fullnode directly.
     * <p><b>200</b> - Broadcast result list, txid returned with the original order
     * @param txRaw The txRaw parameter
     * @return BatchBroadcastResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BatchBroadcastResult> txBroadcastBatchPost(List<TxRaw> txRaw) throws WebClientResponseException {
        Object postBody = txRaw;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<BatchBroadcastResult> localVarReturnType = new ParameterizedTypeReference<BatchBroadcastResult>() {};
        return apiClient.invokeAPI("/tx/broadcast/batch", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Broadcast tx to metasv fullnode.
     * This api will broadcast to metasv fullnode directly. This endpoint use rpc sendrawtransaction.
     * <p><b>201</b> - Broadcast success, txid returned
     * <p><b>403</b> - Broadcast Failed
     * @param txRaw The txRaw parameter
     * @return BroadcastResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BroadcastResult> txBroadcastPost(TxRaw txRaw) throws WebClientResponseException {
        Object postBody = txRaw;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<BroadcastResult> localVarReturnType = new ParameterizedTypeReference<BroadcastResult>() {};
        return apiClient.invokeAPI("/tx/broadcast", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get transaction detail by specific txid.
     * This api is parsed from raw hex, you can use /tx/{txid}/raw to parse tx by yourself, If you want detail input info, use &#39;/vin/{txid}&#39; to get detailed input info including address and value.
     * <p><b>200</b> - Get transaction detail success.
     * <p><b>404</b> - Transaction not found
     * @param txid the request ID to search, txhash
     * @param showScript Return source script code or not (default false).
     * @return TxDetail
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TxDetail> txTxidGet(String txid, Boolean showScript) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new WebClientResponseException("Missing the required parameter 'txid' when calling txTxidGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("txid", txid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "showScript", showScript));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<TxDetail> localVarReturnType = new ParameterizedTypeReference<TxDetail>() {};
        return apiClient.invokeAPI("/tx/{txid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get transaction raw hex by specific txid.
     * 
     * <p><b>200</b> - Get transaction raw hex success.
     * <p><b>404</b> - Transaction not found
     * @param txid the request ID to search, txhash
     * @return TxRaw
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TxRaw> txTxidRawGet(String txid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new WebClientResponseException("Missing the required parameter 'txid' when calling txTxidRawGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("txid", txid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<TxRaw> localVarReturnType = new ParameterizedTypeReference<TxRaw>() {};
        return apiClient.invokeAPI("/tx/{txid}/raw", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Whether MetaSV have seen this tx before. This is a fast approach to know if the tx exist or not.
     * 
     * <p><b>200</b> - Return true if the transaction is found.
     * <p><b>404</b> - Transaction not found.
     * @param txid the request ID to search, txhash
     * @return Boolean
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Boolean> txTxidSeenGet(String txid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new WebClientResponseException("Missing the required parameter 'txid' when calling txTxidSeenGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("txid", txid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Boolean> localVarReturnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI("/tx/{txid}/seen", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all output point of vins in the tx with detailed output script.
     * Search output points by spent txid. Use this api to get detailed inputs for the tx.
     * <p><b>200</b> - Get vin list success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param txid The txid of the vins
     * @return List&lt;OutputInfoDetail&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<OutputInfoDetail> vinTxidDetailGet(String txid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new WebClientResponseException("Missing the required parameter 'txid' when calling vinTxidDetailGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("txid", txid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<OutputInfoDetail> localVarReturnType = new ParameterizedTypeReference<OutputInfoDetail>() {};
        return apiClient.invokeFluxAPI("/vin/{txid}/detail", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
