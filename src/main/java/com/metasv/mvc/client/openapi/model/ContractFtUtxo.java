/*
 * MicrovisionChain API Document
 * API definition for MicrovisionChain provided apis
 *
 * The version of the OpenAPI document: 3.0.8
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contract fungible token Utxo belongs to the specified address
 */
@ApiModel(description = "Contract fungible token Utxo belongs to the specified address")
@JsonPropertyOrder({
  ContractFtUtxo.JSON_PROPERTY_ADDRESS,
  ContractFtUtxo.JSON_PROPERTY_CODE_HASH,
  ContractFtUtxo.JSON_PROPERTY_GENESIS,
  ContractFtUtxo.JSON_PROPERTY_NAME,
  ContractFtUtxo.JSON_PROPERTY_SYMBOL,
  ContractFtUtxo.JSON_PROPERTY_SENSIBLE_ID,
  ContractFtUtxo.JSON_PROPERTY_DECIMAL,
  ContractFtUtxo.JSON_PROPERTY_TXID,
  ContractFtUtxo.JSON_PROPERTY_TX_INDEX,
  ContractFtUtxo.JSON_PROPERTY_VALUE,
  ContractFtUtxo.JSON_PROPERTY_VALUE_STRING,
  ContractFtUtxo.JSON_PROPERTY_SATOSHI,
  ContractFtUtxo.JSON_PROPERTY_SATOSHI_STRING,
  ContractFtUtxo.JSON_PROPERTY_HEIGHT,
  ContractFtUtxo.JSON_PROPERTY_FLAG
})
@JsonTypeName("ContractFtUtxo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T17:24:50.047362+09:00[Asia/Tokyo]")
public class ContractFtUtxo {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_CODE_HASH = "codeHash";
  private String codeHash;

  public static final String JSON_PROPERTY_GENESIS = "genesis";
  private String genesis;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_SENSIBLE_ID = "sensibleId";
  private String sensibleId;

  public static final String JSON_PROPERTY_DECIMAL = "decimal";
  private Integer decimal;

  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_TX_INDEX = "txIndex";
  private Integer txIndex;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public static final String JSON_PROPERTY_VALUE_STRING = "valueString";
  private String valueString;

  public static final String JSON_PROPERTY_SATOSHI = "satoshi";
  private Long satoshi;

  public static final String JSON_PROPERTY_SATOSHI_STRING = "satoshiString";
  private String satoshiString;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_FLAG = "flag";
  private String flag;


  public ContractFtUtxo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address string of this utxo
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address string of this utxo")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ContractFtUtxo codeHash(String codeHash) {
    
    this.codeHash = codeHash;
    return this;
  }

   /**
   * Codehash of this utxo.
   * @return codeHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Codehash of this utxo.")
  @JsonProperty(JSON_PROPERTY_CODE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodeHash() {
    return codeHash;
  }


  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }


  public ContractFtUtxo genesis(String genesis) {
    
    this.genesis = genesis;
    return this;
  }

   /**
   * Genesis of this utxo.
   * @return genesis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Genesis of this utxo.")
  @JsonProperty(JSON_PROPERTY_GENESIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGenesis() {
    return genesis;
  }


  public void setGenesis(String genesis) {
    this.genesis = genesis;
  }


  public ContractFtUtxo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the token.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the token.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ContractFtUtxo symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol of the token.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Symbol of the token.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ContractFtUtxo sensibleId(String sensibleId) {
    
    this.sensibleId = sensibleId;
    return this;
  }

   /**
   * SensibleId of the token
   * @return sensibleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SensibleId of the token")
  @JsonProperty(JSON_PROPERTY_SENSIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSensibleId() {
    return sensibleId;
  }


  public void setSensibleId(String sensibleId) {
    this.sensibleId = sensibleId;
  }


  public ContractFtUtxo decimal(Integer decimal) {
    
    this.decimal = decimal;
    return this;
  }

   /**
   * The decimal position.
   * @return decimal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The decimal position.")
  @JsonProperty(JSON_PROPERTY_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDecimal() {
    return decimal;
  }


  public void setDecimal(Integer decimal) {
    this.decimal = decimal;
  }


  public ContractFtUtxo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Txid for this utxo.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Txid for this utxo.")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public ContractFtUtxo txIndex(Integer txIndex) {
    
    this.txIndex = txIndex;
    return this;
  }

   /**
   * Output index for the Utxo.
   * @return txIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output index for the Utxo.")
  @JsonProperty(JSON_PROPERTY_TX_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTxIndex() {
    return txIndex;
  }


  public void setTxIndex(Integer txIndex) {
    this.txIndex = txIndex;
  }


  public ContractFtUtxo value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * Token value of the utxo(Irrelavant to satoshi value).
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token value of the utxo(Irrelavant to satoshi value).")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public ContractFtUtxo valueString(String valueString) {
    
    this.valueString = valueString;
    return this;
  }

   /**
   * Token value of the utxo(In string format)
   * @return valueString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token value of the utxo(In string format)")
  @JsonProperty(JSON_PROPERTY_VALUE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueString() {
    return valueString;
  }


  public void setValueString(String valueString) {
    this.valueString = valueString;
  }


  public ContractFtUtxo satoshi(Long satoshi) {
    
    this.satoshi = satoshi;
    return this;
  }

   /**
   * Mvc value of the utxo(Irrelavant to token value)
   * @return satoshi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mvc value of the utxo(Irrelavant to token value)")
  @JsonProperty(JSON_PROPERTY_SATOSHI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSatoshi() {
    return satoshi;
  }


  public void setSatoshi(Long satoshi) {
    this.satoshi = satoshi;
  }


  public ContractFtUtxo satoshiString(String satoshiString) {
    
    this.satoshiString = satoshiString;
    return this;
  }

   /**
   * Mvc value of the utxo(In string format)
   * @return satoshiString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mvc value of the utxo(In string format)")
  @JsonProperty(JSON_PROPERTY_SATOSHI_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSatoshiString() {
    return satoshiString;
  }


  public void setSatoshiString(String satoshiString) {
    this.satoshiString = satoshiString;
  }


  public ContractFtUtxo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of this utxo, -1 for unconfirmed utxo.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of this utxo, -1 for unconfirmed utxo.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public ContractFtUtxo flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * Flag used for paging
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag used for paging")
  @JsonProperty(JSON_PROPERTY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
    ContractFtUtxo contractFtUtxo = (ContractFtUtxo) o;
    return Objects.equals(this.address, contractFtUtxo.address) &&
        Objects.equals(this.codeHash, contractFtUtxo.codeHash) &&
        Objects.equals(this.genesis, contractFtUtxo.genesis) &&
        Objects.equals(this.name, contractFtUtxo.name) &&
        Objects.equals(this.symbol, contractFtUtxo.symbol) &&
        Objects.equals(this.sensibleId, contractFtUtxo.sensibleId) &&
        Objects.equals(this.decimal, contractFtUtxo.decimal) &&
        Objects.equals(this.txid, contractFtUtxo.txid) &&
        Objects.equals(this.txIndex, contractFtUtxo.txIndex) &&
        Objects.equals(this.value, contractFtUtxo.value) &&
        Objects.equals(this.valueString, contractFtUtxo.valueString) &&
        Objects.equals(this.satoshi, contractFtUtxo.satoshi) &&
        Objects.equals(this.satoshiString, contractFtUtxo.satoshiString) &&
        Objects.equals(this.height, contractFtUtxo.height) &&
        Objects.equals(this.flag, contractFtUtxo.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, codeHash, genesis, name, symbol, sensibleId, decimal, txid, txIndex, value, valueString, satoshi, satoshiString, height, flag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractFtUtxo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    genesis: ").append(toIndentedString(genesis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    sensibleId: ").append(toIndentedString(sensibleId)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txIndex: ").append(toIndentedString(txIndex)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueString: ").append(toIndentedString(valueString)).append("\n");
    sb.append("    satoshi: ").append(toIndentedString(satoshi)).append("\n");
    sb.append("    satoshiString: ").append(toIndentedString(satoshiString)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

