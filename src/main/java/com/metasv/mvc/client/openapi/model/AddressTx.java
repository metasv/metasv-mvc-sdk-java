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
 * Transaction history of the address.
 */
@ApiModel(description = "Transaction history of the address.")
@JsonPropertyOrder({
  AddressTx.JSON_PROPERTY_FLAG,
  AddressTx.JSON_PROPERTY_ADDRESS,
  AddressTx.JSON_PROPERTY_TIME,
  AddressTx.JSON_PROPERTY_HEIGHT,
  AddressTx.JSON_PROPERTY_INCOME,
  AddressTx.JSON_PROPERTY_OUTCOME,
  AddressTx.JSON_PROPERTY_TXID
})
@JsonTypeName("AddressTx")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T17:24:50.047362+09:00[Asia/Tokyo]")
public class AddressTx {
  public static final String JSON_PROPERTY_FLAG = "flag";
  private String flag;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_INCOME = "income";
  private Long income;

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private Long outcome;

  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;


  public AddressTx flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * Paging flag
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paging flag")
  @JsonProperty(JSON_PROPERTY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlag() {
    return flag;
  }


  public void setFlag(String flag) {
    this.flag = flag;
  }


  public AddressTx address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The address of the record
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address of the record")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressTx time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * timestamp of the tx
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "timestamp of the tx")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTime() {
    return time;
  }


  public void setTime(Long time) {
    this.time = time;
  }


  public AddressTx height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * Block Height of the tx, -1 if not confirmed
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block Height of the tx, -1 if not confirmed")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public AddressTx income(Long income) {
    
    this.income = income;
    return this;
  }

   /**
   * total income of the address from this tx
   * @return income
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total income of the address from this tx")
  @JsonProperty(JSON_PROPERTY_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIncome() {
    return income;
  }


  public void setIncome(Long income) {
    this.income = income;
  }


  public AddressTx outcome(Long outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * total outcome of the address from this tx
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total outcome of the address from this tx")
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOutcome() {
    return outcome;
  }


  public void setOutcome(Long outcome) {
    this.outcome = outcome;
  }


  public AddressTx txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * txid of this record
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid of this record")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTx addressTx = (AddressTx) o;
    return Objects.equals(this.flag, addressTx.flag) &&
        Objects.equals(this.address, addressTx.address) &&
        Objects.equals(this.time, addressTx.time) &&
        Objects.equals(this.height, addressTx.height) &&
        Objects.equals(this.income, addressTx.income) &&
        Objects.equals(this.outcome, addressTx.outcome) &&
        Objects.equals(this.txid, addressTx.txid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, address, time, height, income, outcome, txid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTx {\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
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

