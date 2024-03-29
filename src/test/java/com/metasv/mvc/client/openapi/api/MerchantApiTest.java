/*
 * MetaSV for MVC API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 3.0.4
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.model.AddressUtxo;
import com.metasv.mvc.client.openapi.model.UtxoPickRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantApi
 */
@Ignore
public class MerchantApiTest {

    private final MerchantApi api = new MerchantApi();

    
    /**
     * Pick utxos by addresses and amount.
     *
     * Selects a set of Utxos with total value higher than the given amount from a given address list . In case of HD wallets, multiple addresses can be specified.
     */
    @Test
    public void merchantUtxoPostTest()  {
        UtxoPickRequest utxoPickRequest = null;
        List<AddressUtxo> response = api.merchantUtxoPost(utxoPickRequest).collectList().block();

        // TODO: test validations
    }
    
}
