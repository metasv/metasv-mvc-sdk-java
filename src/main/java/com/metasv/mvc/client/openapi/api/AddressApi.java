package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.ApiClient;

import com.metasv.mvc.client.openapi.model.AddressBalance;
import com.metasv.mvc.client.openapi.model.AddressTx;
import com.metasv.mvc.client.openapi.model.AddressUtxo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T11:49:07.594678+09:00[Asia/Tokyo]")
public class AddressApi {
    private ApiClient apiClient;

    public AddressApi() {
        this(new ApiClient());
    }

    @Autowired
    public AddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get address balance by specific address.
     * 
     * <p><b>200</b> - Get address detail success.
     * @param address the requested address
     * @return AddressBalance
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AddressBalance> addressAddressBalanceGet(String address) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling addressAddressBalanceGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

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

        ParameterizedTypeReference<AddressBalance> localVarReturnType = new ParameterizedTypeReference<AddressBalance>() {};
        return apiClient.invokeAPI("/address/{address}/balance", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get address history by specific address(recent 10 days available).
     * 
     * <p><b>200</b> - Get address transaction history success.
     * @param address the requested address
     * @param flag The last id of the last query(Paging flag)
     * @param confirmed (default true) fetch confirmed tx, fetch unconfirmed tx if false
     * @return List&lt;AddressTx&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<AddressTx> addressAddressTxGet(String address, String flag, Boolean confirmed) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling addressAddressTxGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flag", flag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "confirmed", confirmed));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AddressTx> localVarReturnType = new ParameterizedTypeReference<AddressTx>() {};
        return apiClient.invokeFluxAPI("/address/{address}/tx", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get address utxos by specific address(100 per page).
     * 
     * <p><b>200</b> - Get address utxos success.
     * @param address the requested address
     * @param flag The last id of the last query(Paging flag)
     * @return List&lt;AddressUtxo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<AddressUtxo> addressAddressUtxoGet(String address, String flag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling addressAddressUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flag", flag));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AddressUtxo> localVarReturnType = new ParameterizedTypeReference<AddressUtxo>() {};
        return apiClient.invokeFluxAPI("/address/{address}/utxo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
