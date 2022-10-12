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
 * Tx simple info for block tx list.
 */
@ApiModel(description = "Tx simple info for block tx list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-12T19:14:49.325014+09:00[Asia/Tokyo]")
public class BlockTx {
  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_BLOCK_HASH = "blockHash";
  @SerializedName(SERIALIZED_NAME_BLOCK_HASH)
  private String blockHash;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_INPUT_COUNT = "inputCount";
  @SerializedName(SERIALIZED_NAME_INPUT_COUNT)
  private Integer inputCount;

  public static final String SERIALIZED_NAME_OUTPUT_COUNT = "outputCount";
  @SerializedName(SERIALIZED_NAME_OUTPUT_COUNT)
  private Integer outputCount;

  public static final String SERIALIZED_NAME_LOCK_TIME = "lockTime";
  @SerializedName(SERIALIZED_NAME_LOCK_TIME)
  private Long lockTime;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Long fee;

  public static final String SERIALIZED_NAME_CONFIRMATIONS = "confirmations";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS)
  private Integer confirmations;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;


  public BlockTx txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Transaction hash.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction hash.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public BlockTx height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Block height of this tx.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block height of this tx.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public BlockTx blockHash(String blockHash) {
    
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Hash of the block
   * @return blockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hash of the block")

  public String getBlockHash() {
    return blockHash;
  }


  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }


  public BlockTx size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * transaction size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "transaction size")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public BlockTx inputCount(Integer inputCount) {
    
    this.inputCount = inputCount;
    return this;
  }

   /**
   * Input count in this transaction
   * @return inputCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input count in this transaction")

  public Integer getInputCount() {
    return inputCount;
  }


  public void setInputCount(Integer inputCount) {
    this.inputCount = inputCount;
  }


  public BlockTx outputCount(Integer outputCount) {
    
    this.outputCount = outputCount;
    return this;
  }

   /**
   * Output count in this transaction.
   * @return outputCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output count in this transaction.")

  public Integer getOutputCount() {
    return outputCount;
  }


  public void setOutputCount(Integer outputCount) {
    this.outputCount = outputCount;
  }


  public BlockTx lockTime(Long lockTime) {
    
    this.lockTime = lockTime;
    return this;
  }

   /**
   * Lock time of this transaction
   * @return lockTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lock time of this transaction")

  public Long getLockTime() {
    return lockTime;
  }


  public void setLockTime(Long lockTime) {
    this.lockTime = lockTime;
  }


  public BlockTx fee(Long fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Trasaction fee.
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trasaction fee.")

  public Long getFee() {
    return fee;
  }


  public void setFee(Long fee) {
    this.fee = fee;
  }


  public BlockTx confirmations(Integer confirmations) {
    
    this.confirmations = confirmations;
    return this;
  }

   /**
   * Confirmations of this transaction, -1 if unconfirmed.
   * @return confirmations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confirmations of this transaction, -1 if unconfirmed.")

  public Integer getConfirmations() {
    return confirmations;
  }


  public void setConfirmations(Integer confirmations) {
    this.confirmations = confirmations;
  }


  public BlockTx timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Block timestamp for the transaction, confirmed tx only.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block timestamp for the transaction, confirmed tx only.")

  public Long getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockTx blockTx = (BlockTx) o;
    return Objects.equals(this.txid, blockTx.txid) &&
        Objects.equals(this.height, blockTx.height) &&
        Objects.equals(this.blockHash, blockTx.blockHash) &&
        Objects.equals(this.size, blockTx.size) &&
        Objects.equals(this.inputCount, blockTx.inputCount) &&
        Objects.equals(this.outputCount, blockTx.outputCount) &&
        Objects.equals(this.lockTime, blockTx.lockTime) &&
        Objects.equals(this.fee, blockTx.fee) &&
        Objects.equals(this.confirmations, blockTx.confirmations) &&
        Objects.equals(this.timestamp, blockTx.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, height, blockHash, size, inputCount, outputCount, lockTime, fee, confirmations, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockTx {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    inputCount: ").append(toIndentedString(inputCount)).append("\n");
    sb.append("    outputCount: ").append(toIndentedString(outputCount)).append("\n");
    sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    confirmations: ").append(toIndentedString(confirmations)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
