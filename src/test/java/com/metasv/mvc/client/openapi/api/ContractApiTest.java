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

import com.metasv.mvc.client.openapi.ApiException;
import com.metasv.mvc.client.openapi.model.ContractFtBalance;
import com.metasv.mvc.client.openapi.model.ContractFtUtxo;
import com.metasv.mvc.client.openapi.model.ContractNftAddressSummary;
import com.metasv.mvc.client.openapi.model.ContractNftAuctionUtxo;
import com.metasv.mvc.client.openapi.model.ContractNftGenesisSummary;
import com.metasv.mvc.client.openapi.model.ContractNftSellUtxo;
import com.metasv.mvc.client.openapi.model.ContractNftSellV2Utxo;
import com.metasv.mvc.client.openapi.model.ContractNftUtxo;
import com.metasv.mvc.client.openapi.model.ContractUniqueUtxo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractApi
 */
@Ignore
public class ContractApiTest {

    private final ContractApi api = new ContractApi();

    
    /**
     * Get all contract token balances for specific address ignoring all unconfirmed txs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractFtAddressAddressBalanceConfirmedGetTest() throws ApiException {
        String address = null;
        String codeHash = null;
        String genesis = null;
        Long response = api.contractFtAddressAddressBalanceConfirmedGet(address, codeHash, genesis);

        // TODO: test validations
    }
    
    /**
     * Get all contract token balances for specific address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractFtAddressAddressBalanceGetTest() throws ApiException {
        String address = null;
        String codeHash = null;
        String genesis = null;
        List<ContractFtBalance> response = api.contractFtAddressAddressBalanceGet(address, codeHash, genesis);

        // TODO: test validations
    }
    
    /**
     * Get all contract token utxos for specific address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractFtAddressAddressUtxoGetTest() throws ApiException {
        String address = null;
        String codeHash = null;
        String genesis = null;
        String flag = null;
        List<ContractFtUtxo> response = api.contractFtAddressAddressUtxoGet(address, codeHash, genesis, flag);

        // TODO: test validations
    }
    
    /**
     * Get confirmed utxo count for specific nft(ignore all unconfirmed txs).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftAddressAddressCountConfirmedGetTest() throws ApiException {
        String address = null;
        String codeHash = null;
        String genesis = null;
        Integer response = api.contractNftAddressAddressCountConfirmedGet(address, codeHash, genesis);

        // TODO: test validations
    }
    
    /**
     * Get nft summary(NFT count group by genesis) for address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftAddressAddressSummaryGetTest() throws ApiException {
        String address = null;
        List<ContractNftAddressSummary> response = api.contractNftAddressAddressSummaryGet(address);

        // TODO: test validations
    }
    
    /**
     * Get all contract nft token utxos for specific address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftAddressAddressUtxoGetTest() throws ApiException {
        String address = null;
        String codeHash = null;
        String genesis = null;
        Integer limit = null;
        String flag = null;
        List<ContractNftUtxo> response = api.contractNftAddressAddressUtxoGet(address, codeHash, genesis, limit, flag);

        // TODO: test validations
    }
    
    /**
     * Get all contract nft token utxos by codeHash and genesisId.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftAuctionCodeHashCodeHashNftIdNftIdUtxoGetTest() throws ApiException {
        String codeHash = null;
        String nftId = null;
        List<ContractNftAuctionUtxo> response = api.contractNftAuctionCodeHashCodeHashNftIdNftIdUtxoGet(codeHash, nftId);

        // TODO: test validations
    }
    
    /**
     * Get nft summary(count group by address) for specific codeHash and genesisId(result cached for 60s).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftGenesisCodeHashGenesisSummaryGetTest() throws ApiException {
        String codeHash = null;
        String genesis = null;
        List<ContractNftGenesisSummary> response = api.contractNftGenesisCodeHashGenesisSummaryGet(codeHash, genesis);

        // TODO: test validations
    }
    
    /**
     * Get all contract nft token utxos by codeHash and genesisId.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftGenesisCodeHashGenesisUtxoGetTest() throws ApiException {
        String codeHash = null;
        String genesis = null;
        Long tokenIndex = null;
        Long max = null;
        Long min = null;
        List<ContractNftUtxo> response = api.contractNftGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min);

        // TODO: test validations
    }
    
    /**
     * Get all contract sell sell utxos for specific address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftSellAddressAddressUtxoGetTest() throws ApiException {
        String address = null;
        String codeHash = null;
        String genesis = null;
        String flag = null;
        List<ContractNftSellUtxo> response = api.contractNftSellAddressAddressUtxoGet(address, codeHash, genesis, flag);

        // TODO: test validations
    }
    
    /**
     * Get all contract nft token utxos by codeHash and genesisId.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftSellGenesisCodeHashGenesisUtxoGetTest() throws ApiException {
        String codeHash = null;
        String genesis = null;
        Long tokenIndex = null;
        Long max = null;
        Long min = null;
        List<ContractNftSellUtxo> response = api.contractNftSellGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min);

        // TODO: test validations
    }
    
    /**
     * Get all contract sell sell utxos for specific address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftSellV2AddressAddressUtxoGetTest() throws ApiException {
        String address = null;
        String codeHash = null;
        String genesis = null;
        String flag = null;
        List<ContractNftSellV2Utxo> response = api.contractNftSellV2AddressAddressUtxoGet(address, codeHash, genesis, flag);

        // TODO: test validations
    }
    
    /**
     * Get all contract nft token utxos by codeHash and genesisId.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractNftSellV2GenesisCodeHashGenesisUtxoGetTest() throws ApiException {
        String codeHash = null;
        String genesis = null;
        Long tokenIndex = null;
        Long max = null;
        Long min = null;
        List<ContractNftSellV2Utxo> response = api.contractNftSellV2GenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min);

        // TODO: test validations
    }
    
    /**
     * Get contract unique utxos by codeHash and genesisId.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractUniqueGenesisCodeHashGenesisUtxoGetTest() throws ApiException {
        String codeHash = null;
        String genesis = null;
        List<ContractUniqueUtxo> response = api.contractUniqueGenesisCodeHashGenesisUtxoGet(codeHash, genesis);

        // TODO: test validations
    }
    
}
