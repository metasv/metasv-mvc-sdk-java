/*
 * MetaSV for MVC API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 3.0.7
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
import com.metasv.mvc.client.openapi.model.InvalidBroadCast;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Batch broadcast result
 */
@ApiModel(description = "Batch broadcast result")
@JsonPropertyOrder({
  BatchBroadcastResult.JSON_PROPERTY_KNOWN,
  BatchBroadcastResult.JSON_PROPERTY_EVICTED,
  BatchBroadcastResult.JSON_PROPERTY_INVALID
})
@JsonTypeName("BatchBroadcastResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T16:52:15.815523+09:00[Asia/Tokyo]")
public class BatchBroadcastResult {
  public static final String JSON_PROPERTY_KNOWN = "known";
  private List<String> known = null;

  public static final String JSON_PROPERTY_EVICTED = "evicted";
  private List<String> evicted = null;

  public static final String JSON_PROPERTY_INVALID = "invalid";
  private List<InvalidBroadCast> invalid = null;


  public BatchBroadcastResult known(List<String> known) {
    
    this.known = known;
    return this;
  }

  public BatchBroadcastResult addKnownItem(String knownItem) {
    if (this.known == null) {
      this.known = new ArrayList<>();
    }
    this.known.add(knownItem);
    return this;
  }

   /**
   * Already known transactions detected during processing (if there are any)
   * @return known
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Already known transactions detected during processing (if there are any)")
  @JsonProperty(JSON_PROPERTY_KNOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKnown() {
    return known;
  }


  public void setKnown(List<String> known) {
    this.known = known;
  }


  public BatchBroadcastResult evicted(List<String> evicted) {
    
    this.evicted = evicted;
    return this;
  }

  public BatchBroadcastResult addEvictedItem(String evictedItem) {
    if (this.evicted == null) {
      this.evicted = new ArrayList<>();
    }
    this.evicted.add(evictedItem);
    return this;
  }

   /**
   * Transactions accepted by the mempool and then evicted due to insufficient fee (if there are any)
   * @return evicted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transactions accepted by the mempool and then evicted due to insufficient fee (if there are any)")
  @JsonProperty(JSON_PROPERTY_EVICTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEvicted() {
    return evicted;
  }


  public void setEvicted(List<String> evicted) {
    this.evicted = evicted;
  }


  public BatchBroadcastResult invalid(List<InvalidBroadCast> invalid) {
    
    this.invalid = invalid;
    return this;
  }

  public BatchBroadcastResult addInvalidItem(InvalidBroadCast invalidItem) {
    if (this.invalid == null) {
      this.invalid = new ArrayList<>();
    }
    this.invalid.add(invalidItem);
    return this;
  }

   /**
   * Transactions that failed to be accepted by the mempool (if there are any)
   * @return invalid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transactions that failed to be accepted by the mempool (if there are any)")
  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvalidBroadCast> getInvalid() {
    return invalid;
  }


  public void setInvalid(List<InvalidBroadCast> invalid) {
    this.invalid = invalid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchBroadcastResult batchBroadcastResult = (BatchBroadcastResult) o;
    return Objects.equals(this.known, batchBroadcastResult.known) &&
        Objects.equals(this.evicted, batchBroadcastResult.evicted) &&
        Objects.equals(this.invalid, batchBroadcastResult.invalid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(known, evicted, invalid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchBroadcastResult {\n");
    sb.append("    known: ").append(toIndentedString(known)).append("\n");
    sb.append("    evicted: ").append(toIndentedString(evicted)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
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
