package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.ApiClient;

import com.metasv.mvc.client.openapi.model.OutputInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T17:24:50.047362+09:00[Asia/Tokyo]")
public class OutpointApi {
    private ApiClient apiClient;

    public OutpointApi() {
        this(new ApiClient());
    }

    @Autowired
    public OutpointApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get tx output(outpoint for vin) spent status.
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     * <p><b>200</b> - Get outpoint success.
     * @param txid The txid of the output
     * @param index The index of the output in the tx.
     * @return OutputInfo
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OutputInfo> outpointTxidIndexGet(String txid, Integer index) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new WebClientResponseException("Missing the required parameter 'txid' when calling outpointTxidIndexGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new WebClientResponseException("Missing the required parameter 'index' when calling outpointTxidIndexGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("txid", txid);
        pathParams.put("index", index);

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

        ParameterizedTypeReference<OutputInfo> localVarReturnType = new ParameterizedTypeReference<OutputInfo>() {};
        return apiClient.invokeAPI("/outpoint/{txid}/{index}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
