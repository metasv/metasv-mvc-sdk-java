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
 * Get summary(count group by address) for specific genesis.
 */
@ApiModel(description = "Get summary(count group by address) for specific genesis.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-12T19:14:49.325014+09:00[Asia/Tokyo]")
public class ContractNftGenesisSummary {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

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

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;


  public ContractNftGenesisSummary address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Owner address.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Owner address.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ContractNftGenesisSummary sensibleId(String sensibleId) {
    
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


  public ContractNftGenesisSummary metaTxid(String metaTxid) {
    
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


  public ContractNftGenesisSummary metaOutputIndex(Integer metaOutputIndex) {
    
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


  public ContractNftGenesisSummary tokenSupply(Long tokenSupply) {
    
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


  public ContractNftGenesisSummary count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The count of this nft that the address owns.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of this nft that the address owns.")

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
    ContractNftGenesisSummary contractNftGenesisSummary = (ContractNftGenesisSummary) o;
    return Objects.equals(this.address, contractNftGenesisSummary.address) &&
        Objects.equals(this.sensibleId, contractNftGenesisSummary.sensibleId) &&
        Objects.equals(this.metaTxid, contractNftGenesisSummary.metaTxid) &&
        Objects.equals(this.metaOutputIndex, contractNftGenesisSummary.metaOutputIndex) &&
        Objects.equals(this.tokenSupply, contractNftGenesisSummary.tokenSupply) &&
        Objects.equals(this.count, contractNftGenesisSummary.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, sensibleId, metaTxid, metaOutputIndex, tokenSupply, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractNftGenesisSummary {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

