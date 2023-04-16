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
 * Request object to register(or delete) a new client public key.
 */
@ApiModel(description = "Request object to register(or delete) a new client public key.")
@JsonPropertyOrder({
  ClientPubkeyRequest.JSON_PROPERTY_PUBKEY
})
@JsonTypeName("ClientPubkeyRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T17:24:50.047362+09:00[Asia/Tokyo]")
public class ClientPubkeyRequest {
  public static final String JSON_PROPERTY_PUBKEY = "pubkey";
  private String pubkey;


  public ClientPubkeyRequest pubkey(String pubkey) {
    
    this.pubkey = pubkey;
    return this;
  }

   /**
   * The hex format public key to register. (i.e. 02fd17dd0c52e54e5eed4ebe1e75df5e48df422f81c26520d44380bef1691fdd98)
   * @return pubkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hex format public key to register. (i.e. 02fd17dd0c52e54e5eed4ebe1e75df5e48df422f81c26520d44380bef1691fdd98)")
  @JsonProperty(JSON_PROPERTY_PUBKEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPubkey() {
    return pubkey;
  }


  public void setPubkey(String pubkey) {
    this.pubkey = pubkey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientPubkeyRequest clientPubkeyRequest = (ClientPubkeyRequest) o;
    return Objects.equals(this.pubkey, clientPubkeyRequest.pubkey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pubkey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientPubkeyRequest {\n");
    sb.append("    pubkey: ").append(toIndentedString(pubkey)).append("\n");
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

