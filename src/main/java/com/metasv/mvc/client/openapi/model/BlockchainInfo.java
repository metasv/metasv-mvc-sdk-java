/*
 * MetaSV for MVC API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 3.0.1
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
 * BlockchainInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:23:45.479431+09:00[Asia/Tokyo]")
public class BlockchainInfo {
  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private String chain;

  public static final String SERIALIZED_NAME_BLOCKS = "blocks";
  @SerializedName(SERIALIZED_NAME_BLOCKS)
  private Integer blocks;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Integer headers;

  public static final String SERIALIZED_NAME_BEST_BLOCK_HASH = "bestBlockHash";
  @SerializedName(SERIALIZED_NAME_BEST_BLOCK_HASH)
  private String bestBlockHash;

  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_MEDIAN_TIME = "medianTime";
  @SerializedName(SERIALIZED_NAME_MEDIAN_TIME)
  private Long medianTime;

  public static final String SERIALIZED_NAME_CHAINWORK = "chainwork";
  @SerializedName(SERIALIZED_NAME_CHAINWORK)
  private String chainwork;

  public static final String SERIALIZED_NAME_NETWORK_HASH_PER_SECOND = "networkHashPerSecond";
  @SerializedName(SERIALIZED_NAME_NETWORK_HASH_PER_SECOND)
  private String networkHashPerSecond;

  public static final String SERIALIZED_NAME_MEMPOOL_TX_COUNT = "mempoolTxCount";
  @SerializedName(SERIALIZED_NAME_MEMPOOL_TX_COUNT)
  private Integer mempoolTxCount;

  public static final String SERIALIZED_NAME_MEMPOOL_USAGE = "mempoolUsage";
  @SerializedName(SERIALIZED_NAME_MEMPOOL_USAGE)
  private Long mempoolUsage;

  public static final String SERIALIZED_NAME_ESTIMATED_BLOCK_SIZE = "estimatedBlockSize";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_BLOCK_SIZE)
  private Long estimatedBlockSize;


  public BlockchainInfo chain(String chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * mainnet or testnet
   * @return chain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mainnet or testnet")

  public String getChain() {
    return chain;
  }


  public void setChain(String chain) {
    this.chain = chain;
  }


  public BlockchainInfo blocks(Integer blocks) {
    
    this.blocks = blocks;
    return this;
  }

   /**
   * current block count
   * @return blocks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current block count")

  public Integer getBlocks() {
    return blocks;
  }


  public void setBlocks(Integer blocks) {
    this.blocks = blocks;
  }


  public BlockchainInfo headers(Integer headers) {
    
    this.headers = headers;
    return this;
  }

   /**
   * current block header count
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current block header count")

  public Integer getHeaders() {
    return headers;
  }


  public void setHeaders(Integer headers) {
    this.headers = headers;
  }


  public BlockchainInfo bestBlockHash(String bestBlockHash) {
    
    this.bestBlockHash = bestBlockHash;
    return this;
  }

   /**
   * current highest blockhash
   * @return bestBlockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current highest blockhash")

  public String getBestBlockHash() {
    return bestBlockHash;
  }


  public void setBestBlockHash(String bestBlockHash) {
    this.bestBlockHash = bestBlockHash;
  }


  public BlockchainInfo difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * decimal string for current difficulty
   * @return difficulty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "decimal string for current difficulty")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public BlockchainInfo medianTime(Long medianTime) {
    
    this.medianTime = medianTime;
    return this;
  }

   /**
   * current median time
   * @return medianTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current median time")

  public Long getMedianTime() {
    return medianTime;
  }


  public void setMedianTime(Long medianTime) {
    this.medianTime = medianTime;
  }


  public BlockchainInfo chainwork(String chainwork) {
    
    this.chainwork = chainwork;
    return this;
  }

   /**
   * current pow
   * @return chainwork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current pow")

  public String getChainwork() {
    return chainwork;
  }


  public void setChainwork(String chainwork) {
    this.chainwork = chainwork;
  }


  public BlockchainInfo networkHashPerSecond(String networkHashPerSecond) {
    
    this.networkHashPerSecond = networkHashPerSecond;
    return this;
  }

   /**
   * estimated current network hash rate.
   * @return networkHashPerSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "estimated current network hash rate.")

  public String getNetworkHashPerSecond() {
    return networkHashPerSecond;
  }


  public void setNetworkHashPerSecond(String networkHashPerSecond) {
    this.networkHashPerSecond = networkHashPerSecond;
  }


  public BlockchainInfo mempoolTxCount(Integer mempoolTxCount) {
    
    this.mempoolTxCount = mempoolTxCount;
    return this;
  }

   /**
   * current mempool transaction count.
   * @return mempoolTxCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current mempool transaction count.")

  public Integer getMempoolTxCount() {
    return mempoolTxCount;
  }


  public void setMempoolTxCount(Integer mempoolTxCount) {
    this.mempoolTxCount = mempoolTxCount;
  }


  public BlockchainInfo mempoolUsage(Long mempoolUsage) {
    
    this.mempoolUsage = mempoolUsage;
    return this;
  }

   /**
   * current mempool usage.
   * @return mempoolUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current mempool usage.")

  public Long getMempoolUsage() {
    return mempoolUsage;
  }


  public void setMempoolUsage(Long mempoolUsage) {
    this.mempoolUsage = mempoolUsage;
  }


  public BlockchainInfo estimatedBlockSize(Long estimatedBlockSize) {
    
    this.estimatedBlockSize = estimatedBlockSize;
    return this;
  }

   /**
   * next estimated block size.
   * @return estimatedBlockSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "next estimated block size.")

  public Long getEstimatedBlockSize() {
    return estimatedBlockSize;
  }


  public void setEstimatedBlockSize(Long estimatedBlockSize) {
    this.estimatedBlockSize = estimatedBlockSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockchainInfo blockchainInfo = (BlockchainInfo) o;
    return Objects.equals(this.chain, blockchainInfo.chain) &&
        Objects.equals(this.blocks, blockchainInfo.blocks) &&
        Objects.equals(this.headers, blockchainInfo.headers) &&
        Objects.equals(this.bestBlockHash, blockchainInfo.bestBlockHash) &&
        Objects.equals(this.difficulty, blockchainInfo.difficulty) &&
        Objects.equals(this.medianTime, blockchainInfo.medianTime) &&
        Objects.equals(this.chainwork, blockchainInfo.chainwork) &&
        Objects.equals(this.networkHashPerSecond, blockchainInfo.networkHashPerSecond) &&
        Objects.equals(this.mempoolTxCount, blockchainInfo.mempoolTxCount) &&
        Objects.equals(this.mempoolUsage, blockchainInfo.mempoolUsage) &&
        Objects.equals(this.estimatedBlockSize, blockchainInfo.estimatedBlockSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chain, blocks, headers, bestBlockHash, difficulty, medianTime, chainwork, networkHashPerSecond, mempoolTxCount, mempoolUsage, estimatedBlockSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockchainInfo {\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    bestBlockHash: ").append(toIndentedString(bestBlockHash)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    medianTime: ").append(toIndentedString(medianTime)).append("\n");
    sb.append("    chainwork: ").append(toIndentedString(chainwork)).append("\n");
    sb.append("    networkHashPerSecond: ").append(toIndentedString(networkHashPerSecond)).append("\n");
    sb.append("    mempoolTxCount: ").append(toIndentedString(mempoolTxCount)).append("\n");
    sb.append("    mempoolUsage: ").append(toIndentedString(mempoolUsage)).append("\n");
    sb.append("    estimatedBlockSize: ").append(toIndentedString(estimatedBlockSize)).append("\n");
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

