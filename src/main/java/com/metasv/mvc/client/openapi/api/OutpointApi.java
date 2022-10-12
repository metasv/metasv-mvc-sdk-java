/*
 * MetaSV API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.ApiCallback;
import com.metasv.mvc.client.openapi.ApiClient;
import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.ApiResponse;
import com.metasv.mvc.client.openapi.Configuration;
import com.metasv.mvc.client.openapi.Pair;
import com.metasv.mvc.client.openapi.ProgressRequestBody;
import com.metasv.mvc.client.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.metasv.mvc.client.openapi.model.OutputInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutpointApi {
    private ApiClient localVarApiClient;

    public OutpointApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OutpointApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for outpointTxidIndexGet
     * @param txid The txid of the output (required)
     * @param index The index of the output in the tx. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get outpoint success. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call outpointTxidIndexGetCall(String txid, Integer index, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/outpoint/{txid}/{index}"
            .replaceAll("\\{" + "txid" + "\\}", localVarApiClient.escapeString(txid.toString()))
            .replaceAll("\\{" + "index" + "\\}", localVarApiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call outpointTxidIndexGetValidateBeforeCall(String txid, Integer index, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new ApiException("Missing the required parameter 'txid' when calling outpointTxidIndexGet(Async)");
        }
        
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling outpointTxidIndexGet(Async)");
        }
        

        okhttp3.Call localVarCall = outpointTxidIndexGetCall(txid, index, _callback);
        return localVarCall;

    }

    /**
     * Get tx output(outpoint for vin) spent status.
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     * @param txid The txid of the output (required)
     * @param index The index of the output in the tx. (required)
     * @return OutputInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get outpoint success. </td><td>  -  </td></tr>
     </table>
     */
    public OutputInfo outpointTxidIndexGet(String txid, Integer index) throws ApiException {
        ApiResponse<OutputInfo> localVarResp = outpointTxidIndexGetWithHttpInfo(txid, index);
        return localVarResp.getData();
    }

    /**
     * Get tx output(outpoint for vin) spent status.
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     * @param txid The txid of the output (required)
     * @param index The index of the output in the tx. (required)
     * @return ApiResponse&lt;OutputInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get outpoint success. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OutputInfo> outpointTxidIndexGetWithHttpInfo(String txid, Integer index) throws ApiException {
        okhttp3.Call localVarCall = outpointTxidIndexGetValidateBeforeCall(txid, index, null);
        Type localVarReturnType = new TypeToken<OutputInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get tx output(outpoint for vin) spent status. (asynchronously)
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     * @param txid The txid of the output (required)
     * @param index The index of the output in the tx. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get outpoint success. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call outpointTxidIndexGetAsync(String txid, Integer index, final ApiCallback<OutputInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = outpointTxidIndexGetValidateBeforeCall(txid, index, _callback);
        Type localVarReturnType = new TypeToken<OutputInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
