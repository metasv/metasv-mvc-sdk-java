/*
 * MetaSV API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 2.2.1
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contract nft sell Utxo belongs to the specified address
 */
@ApiModel(description = "Contract nft sell Utxo belongs to the specified address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-15T11:47:39.520276+09:00[Asia/Tokyo]")
public class ContractNftSellUtxo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TX_INDEX = "txIndex";
  @SerializedName(SERIALIZED_NAME_TX_INDEX)
  private Integer txIndex;

  public static final String SERIALIZED_NAME_CODE_HASH = "codeHash";
  @SerializedName(SERIALIZED_NAME_CODE_HASH)
  private String codeHash;

  public static final String SERIALIZED_NAME_GENESIS = "genesis";
  @SerializedName(SERIALIZED_NAME_GENESIS)
  private String genesis;

  public static final String SERIALIZED_NAME_TOKEN_INDEX = "tokenIndex";
  @SerializedName(SERIALIZED_NAME_TOKEN_INDEX)
  private Long tokenIndex;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price;

  public static final String SERIALIZED_NAME_SATOSHI = "satoshi";
  @SerializedName(SERIALIZED_NAME_SATOSHI)
  private Long satoshi;

  public static final String SERIALIZED_NAME_SATOSHI_STRING = "satoshiString";
  @SerializedName(SERIALIZED_NAME_SATOSHI_STRING)
  private String satoshiString;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_IS_READY = "isReady";
  @SerializedName(SERIALIZED_NAME_IS_READY)
  private Boolean isReady;

  public static final String SERIALIZED_NAME_SENSIBLE_ID = "sensibleId";
  @SerializedName(SERIALIZED_NAME_SENSIBLE_ID)
  private String sensibleId;

  public static final String SERIALIZED_NAME_META_TXID = "metaTxid";
  @SerializedName(SERIALIZED_NAME_META_TXID)
  private String metaTxid;

  public static final String SERIALIZED_NAME_META_OUTPUT_INDEX = "metaOutputIndex";
  @SerializedName(SERIALIZED_NAME_META_OUTPUT_INDEX)
  private Integer metaOutputIndex;

  public static final String SERIALIZED_NAME_TOKEN_SUPPLY = "tokenSupply";
  @SerializedName(SERIALIZED_NAME_TOKEN_SUPPLY)
  private Long tokenSupply;

  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private String flag;


  public ContractNftSellUtxo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address string of this utxo
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address string of this utxo")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ContractNftSellUtxo contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Address calculated from contract hash(p2ch).
   * @return contractAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address calculated from contract hash(p2ch).")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public ContractNftSellUtxo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Txid for this utxo.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Txid for this utxo.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public ContractNftSellUtxo txIndex(Integer txIndex) {
    
    this.txIndex = txIndex;
    return this;
  }

   /**
   * Output index for the Utxo.
   * @return txIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output index for the Utxo.")

  public Integer getTxIndex() {
    return txIndex;
  }


  public void setTxIndex(Integer txIndex) {
    this.txIndex = txIndex;
  }


  public ContractNftSellUtxo codeHash(String codeHash) {
    
    this.codeHash = codeHash;
    return this;
  }

   /**
   * Codehash of this utxo.
   * @return codeHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Codehash of this utxo.")

  public String getCodeHash() {
    return codeHash;
  }


  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }


  public ContractNftSellUtxo genesis(String genesis) {
    
    this.genesis = genesis;
    return this;
  }

   /**
   * Genesis of this utxo.
   * @return genesis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Genesis of this utxo.")

  public String getGenesis() {
    return genesis;
  }


  public void setGenesis(String genesis) {
    this.genesis = genesis;
  }


  public ContractNftSellUtxo tokenIndex(Long tokenIndex) {
    
    this.tokenIndex = tokenIndex;
    return this;
  }

   /**
   * The index of this NFT.
   * @return tokenIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of this NFT.")

  public Long getTokenIndex() {
    return tokenIndex;
  }


  public void setTokenIndex(Long tokenIndex) {
    this.tokenIndex = tokenIndex;
  }


  public ContractNftSellUtxo price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * the price of nft.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the price of nft.")

  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    this.price = price;
  }


  public ContractNftSellUtxo satoshi(Long satoshi) {
    
    this.satoshi = satoshi;
    return this;
  }

   /**
   * Mvc value of the utxo(Irrelavant to token value)
   * @return satoshi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mvc value of the utxo(Irrelavant to token value)")

  public Long getSatoshi() {
    return satoshi;
  }


  public void setSatoshi(Long satoshi) {
    this.satoshi = satoshi;
  }


  public ContractNftSellUtxo satoshiString(String satoshiString) {
    
    this.satoshiString = satoshiString;
    return this;
  }

   /**
   * Mvc value of the utxo(In string format)
   * @return satoshiString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mvc value of the utxo(In string format)")

  public String getSatoshiString() {
    return satoshiString;
  }


  public void setSatoshiString(String satoshiString) {
    this.satoshiString = satoshiString;
  }


  public ContractNftSellUtxo height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of this utxo, -1 for unconfirmed utxo.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of this utxo, -1 for unconfirmed utxo.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public ContractNftSellUtxo isReady(Boolean isReady) {
    
    this.isReady = isReady;
    return this;
  }

   /**
   * Is current nft transfered into sell contract, If not ready, the following fields will be null
   * @return isReady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is current nft transfered into sell contract, If not ready, the following fields will be null")

  public Boolean getIsReady() {
    return isReady;
  }


  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }


  public ContractNftSellUtxo sensibleId(String sensibleId) {
    
    this.sensibleId = sensibleId;
    return this;
  }

   /**
   * SensibleId of the token
   * @return sensibleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SensibleId of the token")

  public String getSensibleId() {
    return sensibleId;
  }


  public void setSensibleId(String sensibleId) {
    this.sensibleId = sensibleId;
  }


  public ContractNftSellUtxo metaTxid(String metaTxid) {
    
    this.metaTxid = metaTxid;
    return this;
  }

   /**
   * The metanet tx describing the nft.
   * @return metaTxid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metanet tx describing the nft.")

  public String getMetaTxid() {
    return metaTxid;
  }


  public void setMetaTxid(String metaTxid) {
    this.metaTxid = metaTxid;
  }


  public ContractNftSellUtxo metaOutputIndex(Integer metaOutputIndex) {
    
    this.metaOutputIndex = metaOutputIndex;
    return this;
  }

   /**
   * Symbol of the token.
   * @return metaOutputIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Symbol of the token.")

  public Integer getMetaOutputIndex() {
    return metaOutputIndex;
  }


  public void setMetaOutputIndex(Integer metaOutputIndex) {
    this.metaOutputIndex = metaOutputIndex;
  }


  public ContractNftSellUtxo tokenSupply(Long tokenSupply) {
    
    this.tokenSupply = tokenSupply;
    return this;
  }

   /**
   * The total supply of this NFT.
   * @return tokenSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total supply of this NFT.")

  public Long getTokenSupply() {
    return tokenSupply;
  }


  public void setTokenSupply(Long tokenSupply) {
    this.tokenSupply = tokenSupply;
  }


  public ContractNftSellUtxo flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * Flag used for paging
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag used for paging")

  public String getFlag() {
    return flag;
  }


  public void setFlag(String flag) {
    this.flag = flag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractNftSellUtxo contractNftSellUtxo = (ContractNftSellUtxo) o;
    return Objects.equals(this.address, contractNftSellUtxo.address) &&
        Objects.equals(this.contractAddress, contractNftSellUtxo.contractAddress) &&
        Objects.equals(this.txid, contractNftSellUtxo.txid) &&
        Objects.equals(this.txIndex, contractNftSellUtxo.txIndex) &&
        Objects.equals(this.codeHash, contractNftSellUtxo.codeHash) &&
        Objects.equals(this.genesis, contractNftSellUtxo.genesis) &&
        Objects.equals(this.tokenIndex, contractNftSellUtxo.tokenIndex) &&
        Objects.equals(this.price, contractNftSellUtxo.price) &&
        Objects.equals(this.satoshi, contractNftSellUtxo.satoshi) &&
        Objects.equals(this.satoshiString, contractNftSellUtxo.satoshiString) &&
        Objects.equals(this.height, contractNftSellUtxo.height) &&
        Objects.equals(this.isReady, contractNftSellUtxo.isReady) &&
        Objects.equals(this.sensibleId, contractNftSellUtxo.sensibleId) &&
        Objects.equals(this.metaTxid, contractNftSellUtxo.metaTxid) &&
        Objects.equals(this.metaOutputIndex, contractNftSellUtxo.metaOutputIndex) &&
        Objects.equals(this.tokenSupply, contractNftSellUtxo.tokenSupply) &&
        Objects.equals(this.flag, contractNftSellUtxo.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, contractAddress, txid, txIndex, codeHash, genesis, tokenIndex, price, satoshi, satoshiString, height, isReady, sensibleId, metaTxid, metaOutputIndex, tokenSupply, flag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractNftSellUtxo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txIndex: ").append(toIndentedString(txIndex)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    genesis: ").append(toIndentedString(genesis)).append("\n");
    sb.append("    tokenIndex: ").append(toIndentedString(tokenIndex)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    satoshi: ").append(toIndentedString(satoshi)).append("\n");
    sb.append("    satoshiString: ").append(toIndentedString(satoshiString)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
    sb.append("    sensibleId: ").append(toIndentedString(sensibleId)).append("\n");
    sb.append("    metaTxid: ").append(toIndentedString(metaTxid)).append("\n");
    sb.append("    metaOutputIndex: ").append(toIndentedString(metaOutputIndex)).append("\n");
    sb.append("    tokenSupply: ").append(toIndentedString(tokenSupply)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

