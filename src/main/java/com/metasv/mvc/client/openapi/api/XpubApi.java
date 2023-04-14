package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.ApiClient;

import com.metasv.mvc.client.openapi.model.ErrorResponse;
import com.metasv.mvc.client.openapi.model.XpubAddress;
import com.metasv.mvc.client.openapi.model.XpubLiteBalance;
import com.metasv.mvc.client.openapi.model.XpubUtxo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-14T23:34:31.785376+09:00[Asia/Tokyo]")
public class XpubApi {
    private ApiClient apiClient;

    public XpubApi() {
        this(new ApiClient());
    }

    @Autowired
    public XpubApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get xpub address type and index. Only index under /0/70 /1/30 is valid. Otherwise not found.
     * 
     * <p><b>200</b> - Get xpub address success.
     * <p><b>401</b> - Access token is missing or invalid
     * <p><b>404</b> - Address not found in the xpub.
     * @param xpub the requested xpub
     * @param address the requested address
     * @return XpubAddress
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XpubAddress> xpubLiteXpubAddressAddressGet(String xpub, String address) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpub' is set
        if (xpub == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpub' when calling xpubLiteXpubAddressAddressGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling xpubLiteXpubAddressAddressGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("xpub", xpub);
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

        ParameterizedTypeReference<XpubAddress> localVarReturnType = new ParameterizedTypeReference<XpubAddress>() {};
        return apiClient.invokeAPI("/xpubLite/{xpub}/address/{address}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get xpub balances including confirmed and unconfirmed.
     * This api returns confirmed balance(same as address balance), not sumed utxos.
     * <p><b>200</b> - Get xpub balance success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param xpub the xpub to search
     * @return XpubLiteBalance
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XpubLiteBalance> xpubLiteXpubBalanceGet(String xpub) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpub' is set
        if (xpub == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpub' when calling xpubLiteXpubBalanceGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("xpub", xpub);

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

        ParameterizedTypeReference<XpubLiteBalance> localVarReturnType = new ParameterizedTypeReference<XpubLiteBalance>() {};
        return apiClient.invokeAPI("/xpubLite/{xpub}/balance", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get xpub utxos by specific xpub(300 per page).
     * 
     * <p><b>200</b> - Get xpub utxos success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param xpub the requested xpub
     * @param limit The max items returned in this query(default 300), not bigger than 5000.
     * @return List&lt;XpubUtxo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<XpubUtxo> xpubLiteXpubUtxoGet(String xpub, Integer limit) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpub' is set
        if (xpub == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpub' when calling xpubLiteXpubUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("xpub", xpub);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<XpubUtxo> localVarReturnType = new ParameterizedTypeReference<XpubUtxo>() {};
        return apiClient.invokeFluxAPI("/xpubLite/{xpub}/utxo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
