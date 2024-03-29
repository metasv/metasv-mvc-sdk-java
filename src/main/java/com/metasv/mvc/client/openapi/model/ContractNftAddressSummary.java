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
 * Get nft summary(count group by genesis) for specific address.
 */
@ApiModel(description = "Get nft summary(count group by genesis) for specific address.")
@JsonPropertyOrder({
  ContractNftAddressSummary.JSON_PROPERTY_CODE_HASH,
  ContractNftAddressSummary.JSON_PROPERTY_GENESIS,
  ContractNftAddressSummary.JSON_PROPERTY_SENSIBLE_ID,
  ContractNftAddressSummary.JSON_PROPERTY_META_TXID,
  ContractNftAddressSummary.JSON_PROPERTY_META_OUTPUT_INDEX,
  ContractNftAddressSummary.JSON_PROPERTY_TOKEN_SUPPLY,
  ContractNftAddressSummary.JSON_PROPERTY_COUNT
})
@JsonTypeName("ContractNftAddressSummary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T17:24:50.047362+09:00[Asia/Tokyo]")
public class ContractNftAddressSummary {
  public static final String JSON_PROPERTY_CODE_HASH = "codeHash";
  private String codeHash;

  public static final String JSON_PROPERTY_GENESIS = "genesis";
  private String genesis;

  public static final String JSON_PROPERTY_SENSIBLE_ID = "sensibleId";
  private String sensibleId;

  public static final String JSON_PROPERTY_META_TXID = "metaTxid";
  private String metaTxid;

  public static final String JSON_PROPERTY_META_OUTPUT_INDEX = "metaOutputIndex";
  private Integer metaOutputIndex;

  public static final String JSON_PROPERTY_TOKEN_SUPPLY = "tokenSupply";
  private Long tokenSupply;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;


  public ContractNftAddressSummary codeHash(String codeHash) {
    
    this.codeHash = codeHash;
    return this;
  }

   /**
   * Codehash of this NFT series.
   * @return codeHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Codehash of this NFT series.")
  @JsonProperty(JSON_PROPERTY_CODE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodeHash() {
    return codeHash;
  }


  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }


  public ContractNftAddressSummary genesis(String genesis) {
    
    this.genesis = genesis;
    return this;
  }

   /**
   * Genesis of this NFT series..
   * @return genesis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Genesis of this NFT series..")
  @JsonProperty(JSON_PROPERTY_GENESIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGenesis() {
    return genesis;
  }


  public void setGenesis(String genesis) {
    this.genesis = genesis;
  }


  public ContractNftAddressSummary sensibleId(String sensibleId) {
    
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


  public ContractNftAddressSummary metaTxid(String metaTxid) {
    
    this.metaTxid = metaTxid;
    return this;
  }

   /**
   * The metanet tx describing the nft.
   * @return metaTxid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metanet tx describing the nft.")
  @JsonProperty(JSON_PROPERTY_META_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetaTxid() {
    return metaTxid;
  }


  public void setMetaTxid(String metaTxid) {
    this.metaTxid = metaTxid;
  }


  public ContractNftAddressSummary metaOutputIndex(Integer metaOutputIndex) {
    
    this.metaOutputIndex = metaOutputIndex;
    return this;
  }

   /**
   * Symbol of the token.
   * @return metaOutputIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Symbol of the token.")
  @JsonProperty(JSON_PROPERTY_META_OUTPUT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMetaOutputIndex() {
    return metaOutputIndex;
  }


  public void setMetaOutputIndex(Integer metaOutputIndex) {
    this.metaOutputIndex = metaOutputIndex;
  }


  public ContractNftAddressSummary tokenSupply(Long tokenSupply) {
    
    this.tokenSupply = tokenSupply;
    return this;
  }

   /**
   * The total supply of this NFT.
   * @return tokenSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total supply of this NFT.")
  @JsonProperty(JSON_PROPERTY_TOKEN_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTokenSupply() {
    return tokenSupply;
  }


  public void setTokenSupply(Long tokenSupply) {
    this.tokenSupply = tokenSupply;
  }


  public ContractNftAddressSummary count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The count of this nft that the address owns.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of this nft that the address owns.")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractNftAddressSummary contractNftAddressSummary = (ContractNftAddressSummary) o;
    return Objects.equals(this.codeHash, contractNftAddressSummary.codeHash) &&
        Objects.equals(this.genesis, contractNftAddressSummary.genesis) &&
        Objects.equals(this.sensibleId, contractNftAddressSummary.sensibleId) &&
        Objects.equals(this.metaTxid, contractNftAddressSummary.metaTxid) &&
        Objects.equals(this.metaOutputIndex, contractNftAddressSummary.metaOutputIndex) &&
        Objects.equals(this.tokenSupply, contractNftAddressSummary.tokenSupply) &&
        Objects.equals(this.count, contractNftAddressSummary.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeHash, genesis, sensibleId, metaTxid, metaOutputIndex, tokenSupply, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractNftAddressSummary {\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    genesis: ").append(toIndentedString(genesis)).append("\n");
    sb.append("    sensibleId: ").append(toIndentedString(sensibleId)).append("\n");
    sb.append("    metaTxid: ").append(toIndentedString(metaTxid)).append("\n");
    sb.append("    metaOutputIndex: ").append(toIndentedString(metaOutputIndex)).append("\n");
    sb.append("    tokenSupply: ").append(toIndentedString(tokenSupply)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

