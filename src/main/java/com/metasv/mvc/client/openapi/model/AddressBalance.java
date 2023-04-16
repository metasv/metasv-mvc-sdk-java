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
 * The current balance for a particular address
 */
@ApiModel(description = "The current balance for a particular address")
@JsonPropertyOrder({
  AddressBalance.JSON_PROPERTY_ADDRESS,
  AddressBalance.JSON_PROPERTY_CONFIRMED,
  AddressBalance.JSON_PROPERTY_UNCONFIRMED
})
@JsonTypeName("AddressBalance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T17:24:50.047362+09:00[Asia/Tokyo]")
public class AddressBalance {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_CONFIRMED = "confirmed";
  private Long confirmed;

  public static final String JSON_PROPERTY_UNCONFIRMED = "unconfirmed";
  private Long unconfirmed;


  public AddressBalance address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * current address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current address")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressBalance confirmed(Long confirmed) {
    
    this.confirmed = confirmed;
    return this;
  }

   /**
   * confirmed balance
   * @return confirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "confirmed balance")
  @JsonProperty(JSON_PROPERTY_CONFIRMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConfirmed() {
    return confirmed;
  }


  public void setConfirmed(Long confirmed) {
    this.confirmed = confirmed;
  }


  public AddressBalance unconfirmed(Long unconfirmed) {
    
    this.unconfirmed = unconfirmed;
    return this;
  }

   /**
   * unconfirmed balance
   * @return unconfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unconfirmed balance")
  @JsonProperty(JSON_PROPERTY_UNCONFIRMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUnconfirmed() {
    return unconfirmed;
  }


  public void setUnconfirmed(Long unconfirmed) {
    this.unconfirmed = unconfirmed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressBalance addressBalance = (AddressBalance) o;
    return Objects.equals(this.address, addressBalance.address) &&
        Objects.equals(this.confirmed, addressBalance.confirmed) &&
        Objects.equals(this.unconfirmed, addressBalance.unconfirmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, confirmed, unconfirmed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressBalance {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    unconfirmed: ").append(toIndentedString(unconfirmed)).append("\n");
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

