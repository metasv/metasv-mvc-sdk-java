package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.ApiClient;

import com.metasv.mvc.client.openapi.model.ContractFtAddressTx;
import com.metasv.mvc.client.openapi.model.ContractFtBalance;
import com.metasv.mvc.client.openapi.model.ContractFtUtxo;
import com.metasv.mvc.client.openapi.model.ContractNftAddressSummary;
import com.metasv.mvc.client.openapi.model.ContractNftGenesisSummary;
import com.metasv.mvc.client.openapi.model.ContractNftSellUtxo;
import com.metasv.mvc.client.openapi.model.ContractNftUtxo;
import com.metasv.mvc.client.openapi.model.ContractUniqueUtxo;
import com.metasv.mvc.client.openapi.model.ErrorResponse;

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
public class ContractApi {
    private ApiClient apiClient;

    public ContractApi() {
        this(new ApiClient());
    }

    @Autowired
    public ContractApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all contract token balances for specific address ignoring all unconfirmed txs.
     * 
     * <p><b>200</b> - Get contract ft balances succes（ingore unconfirmed txs）.
     * <p><b>401</b> - Access token is missing or invalid
     * @param address the requested address
     * @param codeHash Filter by contract code hash
     * @param genesis Filter by contract genesis
     * @return Long
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Long> contractFtAddressAddressBalanceConfirmedGet(String address, String codeHash, String genesis) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling contractFtAddressAddressBalanceConfirmedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'codeHash' is set
        if (codeHash == null) {
            throw new WebClientResponseException("Missing the required parameter 'codeHash' when calling contractFtAddressAddressBalanceConfirmedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'genesis' is set
        if (genesis == null) {
            throw new WebClientResponseException("Missing the required parameter 'genesis' when calling contractFtAddressAddressBalanceConfirmedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "codeHash", codeHash));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "genesis", genesis));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return apiClient.invokeAPI("/contract/ft/address/{address}/balance/confirmed", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all contract token balances for specific address.
     * 
     * <p><b>200</b> - Get contract ft balances success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param address the requested address
     * @param codeHash Filter by contract code hash
     * @param genesis Filter by contract genesis
     * @return List&lt;ContractFtBalance&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractFtBalance> contractFtAddressAddressBalanceGet(String address, String codeHash, String genesis) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling contractFtAddressAddressBalanceGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "codeHash", codeHash));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "genesis", genesis));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ContractFtBalance> localVarReturnType = new ParameterizedTypeReference<ContractFtBalance>() {};
        return apiClient.invokeFluxAPI("/contract/ft/address/{address}/balance", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all contract token balances for specific address.
     * 
     * <p><b>200</b> - Get contract ft history success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param address the requested address
     * @param codeHash Filter by contract code hash
     * @param genesis Filter by contract genesis
     * @param flag The last id of the last query(Paging flag)
     * @return List&lt;ContractFtAddressTx&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractFtAddressTx> contractFtAddressAddressCodeHashGenesisTxGet(String address, String codeHash, String genesis, String flag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling contractFtAddressAddressCodeHashGenesisTxGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'codeHash' is set
        if (codeHash == null) {
            throw new WebClientResponseException("Missing the required parameter 'codeHash' when calling contractFtAddressAddressCodeHashGenesisTxGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'genesis' is set
        if (genesis == null) {
            throw new WebClientResponseException("Missing the required parameter 'genesis' when calling contractFtAddressAddressCodeHashGenesisTxGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);
        pathParams.put("codeHash", codeHash);
        pathParams.put("genesis", genesis);

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

        ParameterizedTypeReference<ContractFtAddressTx> localVarReturnType = new ParameterizedTypeReference<ContractFtAddressTx>() {};
        return apiClient.invokeFluxAPI("/contract/ft/address/{address}/{codeHash}/{genesis}/tx", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all contract token utxos for specific address.
     * 
     * <p><b>200</b> - Get contract ft utxo success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param address the requested address
     * @param codeHash Filter by contract code hash
     * @param genesis Filter by contract genesis
     * @param flag The flag of the last query Item(Paging flag)
     * @return List&lt;ContractFtUtxo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractFtUtxo> contractFtAddressAddressUtxoGet(String address, String codeHash, String genesis, String flag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling contractFtAddressAddressUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "codeHash", codeHash));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "genesis", genesis));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flag", flag));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ContractFtUtxo> localVarReturnType = new ParameterizedTypeReference<ContractFtUtxo>() {};
        return apiClient.invokeFluxAPI("/contract/ft/address/{address}/utxo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get confirmed utxo count for specific nft(ignore all unconfirmed txs).
     * 
     * <p><b>200</b> - Get contract nft utxo success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param address the requested address
     * @param codeHash Filter by contract code hash
     * @param genesis Filter by contract genesis
     * @return Integer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Integer> contractNftAddressAddressCountConfirmedGet(String address, String codeHash, String genesis) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling contractNftAddressAddressCountConfirmedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'codeHash' is set
        if (codeHash == null) {
            throw new WebClientResponseException("Missing the required parameter 'codeHash' when calling contractNftAddressAddressCountConfirmedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'genesis' is set
        if (genesis == null) {
            throw new WebClientResponseException("Missing the required parameter 'genesis' when calling contractNftAddressAddressCountConfirmedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "codeHash", codeHash));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "genesis", genesis));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/contract/nft/address/{address}/count/confirmed", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get nft summary(NFT count group by genesis) for address.
     * 
     * <p><b>200</b> - Get contract nft utxo success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param address the requested address
     * @return List&lt;ContractNftAddressSummary&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractNftAddressSummary> contractNftAddressAddressSummaryGet(String address) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling contractNftAddressAddressSummaryGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ContractNftAddressSummary> localVarReturnType = new ParameterizedTypeReference<ContractNftAddressSummary>() {};
        return apiClient.invokeFluxAPI("/contract/nft/address/{address}/summary", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all contract nft token utxos for specific address.
     * 
     * <p><b>200</b> - Get contract nft utxo success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param address the requested address
     * @param codeHash Filter by contract code hash
     * @param genesis Filter by contract genesis
     * @param limit Limit the return count(no more than 300)
     * @param flag The flag of the last query Item(Paging flag)
     * @return List&lt;ContractNftUtxo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractNftUtxo> contractNftAddressAddressUtxoGet(String address, String codeHash, String genesis, Integer limit, String flag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling contractNftAddressAddressUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "codeHash", codeHash));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "genesis", genesis));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flag", flag));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ContractNftUtxo> localVarReturnType = new ParameterizedTypeReference<ContractNftUtxo>() {};
        return apiClient.invokeFluxAPI("/contract/nft/address/{address}/utxo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get nft summary(count group by address) for specific codeHash and genesisId(result cached for 60s).
     * 
     * <p><b>200</b> - Get contract nft utxo success(result cached for 60s)..
     * <p><b>401</b> - Access token is missing or invalid
     * @param codeHash Code hash of the token.
     * @param genesis Contract genesis
     * @return List&lt;ContractNftGenesisSummary&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractNftGenesisSummary> contractNftGenesisCodeHashGenesisSummaryGet(String codeHash, String genesis) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'codeHash' is set
        if (codeHash == null) {
            throw new WebClientResponseException("Missing the required parameter 'codeHash' when calling contractNftGenesisCodeHashGenesisSummaryGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'genesis' is set
        if (genesis == null) {
            throw new WebClientResponseException("Missing the required parameter 'genesis' when calling contractNftGenesisCodeHashGenesisSummaryGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("codeHash", codeHash);
        pathParams.put("genesis", genesis);

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

        ParameterizedTypeReference<ContractNftGenesisSummary> localVarReturnType = new ParameterizedTypeReference<ContractNftGenesisSummary>() {};
        return apiClient.invokeFluxAPI("/contract/nft/genesis/{codeHash}/{genesis}/summary", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all contract nft token utxos by codeHash and genesisId.
     * 
     * <p><b>200</b> - Get contract nft utxo success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param codeHash Code hash of the token.
     * @param genesis Contract genesis
     * @param tokenIndex Find exact token Index.
     * @param max Token index not bigger than this(include this).
     * @param min Token index not less than this(include this).
     * @return List&lt;ContractNftUtxo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractNftUtxo> contractNftGenesisCodeHashGenesisUtxoGet(String codeHash, String genesis, Long tokenIndex, Long max, Long min) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'codeHash' is set
        if (codeHash == null) {
            throw new WebClientResponseException("Missing the required parameter 'codeHash' when calling contractNftGenesisCodeHashGenesisUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'genesis' is set
        if (genesis == null) {
            throw new WebClientResponseException("Missing the required parameter 'genesis' when calling contractNftGenesisCodeHashGenesisUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("codeHash", codeHash);
        pathParams.put("genesis", genesis);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tokenIndex", tokenIndex));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "min", min));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ContractNftUtxo> localVarReturnType = new ParameterizedTypeReference<ContractNftUtxo>() {};
        return apiClient.invokeFluxAPI("/contract/nft/genesis/{codeHash}/{genesis}/utxo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all contract sell sell utxos for specific address.
     * 
     * <p><b>200</b> - Get contract nft sell utxo success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param address Owner address.
     * @param codeHash Filter by contract code hash
     * @param genesis Filter by contract genesis
     * @param flag The flag of the last query Item(Paging flag)
     * @return List&lt;ContractNftSellUtxo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractNftSellUtxo> contractNftSellAddressAddressUtxoGet(String address, String codeHash, String genesis, String flag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new WebClientResponseException("Missing the required parameter 'address' when calling contractNftSellAddressAddressUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("address", address);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "codeHash", codeHash));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "genesis", genesis));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "flag", flag));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ContractNftSellUtxo> localVarReturnType = new ParameterizedTypeReference<ContractNftSellUtxo>() {};
        return apiClient.invokeFluxAPI("/contract/nft/sell/address/{address}/utxo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all contract nft token utxos by codeHash and genesisId.
     * 
     * <p><b>200</b> - Get contract nft sell utxo success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param codeHash Code hash of the token.
     * @param genesis Contract genesis
     * @param tokenIndex Find exact token Index.
     * @param max Token index not bigger than this(include this).
     * @param min Token index not less than this(include this).
     * @return List&lt;ContractNftSellUtxo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractNftSellUtxo> contractNftSellGenesisCodeHashGenesisUtxoGet(String codeHash, String genesis, Long tokenIndex, Long max, Long min) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'codeHash' is set
        if (codeHash == null) {
            throw new WebClientResponseException("Missing the required parameter 'codeHash' when calling contractNftSellGenesisCodeHashGenesisUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'genesis' is set
        if (genesis == null) {
            throw new WebClientResponseException("Missing the required parameter 'genesis' when calling contractNftSellGenesisCodeHashGenesisUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("codeHash", codeHash);
        pathParams.put("genesis", genesis);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tokenIndex", tokenIndex));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "min", min));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ContractNftSellUtxo> localVarReturnType = new ParameterizedTypeReference<ContractNftSellUtxo>() {};
        return apiClient.invokeFluxAPI("/contract/nft/sell/genesis/{codeHash}/{genesis}/utxo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get contract unique utxos by codeHash and genesisId.
     * 
     * <p><b>200</b> - Get contract unique utxo success.
     * <p><b>401</b> - Access token is missing or invalid
     * @param codeHash Code hash of the token.
     * @param genesis Contract genesis
     * @return List&lt;ContractUniqueUtxo&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<ContractUniqueUtxo> contractUniqueGenesisCodeHashGenesisUtxoGet(String codeHash, String genesis) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'codeHash' is set
        if (codeHash == null) {
            throw new WebClientResponseException("Missing the required parameter 'codeHash' when calling contractUniqueGenesisCodeHashGenesisUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'genesis' is set
        if (genesis == null) {
            throw new WebClientResponseException("Missing the required parameter 'genesis' when calling contractUniqueGenesisCodeHashGenesisUtxoGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("codeHash", codeHash);
        pathParams.put("genesis", genesis);

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

        ParameterizedTypeReference<ContractUniqueUtxo> localVarReturnType = new ParameterizedTypeReference<ContractUniqueUtxo>() {};
        return apiClient.invokeFluxAPI("/contract/unique/genesis/{codeHash}/{genesis}/utxo", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
