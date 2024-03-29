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
 * BlockchainInfo
 */
@JsonPropertyOrder({
  BlockchainInfo.JSON_PROPERTY_CHAIN,
  BlockchainInfo.JSON_PROPERTY_BLOCKS,
  BlockchainInfo.JSON_PROPERTY_HEADERS,
  BlockchainInfo.JSON_PROPERTY_BEST_BLOCK_HASH,
  BlockchainInfo.JSON_PROPERTY_DIFFICULTY,
  BlockchainInfo.JSON_PROPERTY_MEDIAN_TIME,
  BlockchainInfo.JSON_PROPERTY_CHAINWORK,
  BlockchainInfo.JSON_PROPERTY_NETWORK_HASH_PER_SECOND,
  BlockchainInfo.JSON_PROPERTY_MEMPOOL_TX_COUNT,
  BlockchainInfo.JSON_PROPERTY_MEMPOOL_USAGE,
  BlockchainInfo.JSON_PROPERTY_ESTIMATED_BLOCK_SIZE
})
@JsonTypeName("BlockchainInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T17:24:50.047362+09:00[Asia/Tokyo]")
public class BlockchainInfo {
  public static final String JSON_PROPERTY_CHAIN = "chain";
  private String chain;

  public static final String JSON_PROPERTY_BLOCKS = "blocks";
  private Integer blocks;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Integer headers;

  public static final String JSON_PROPERTY_BEST_BLOCK_HASH = "bestBlockHash";
  private String bestBlockHash;

  public static final String JSON_PROPERTY_DIFFICULTY = "difficulty";
  private String difficulty;

  public static final String JSON_PROPERTY_MEDIAN_TIME = "medianTime";
  private Long medianTime;

  public static final String JSON_PROPERTY_CHAINWORK = "chainwork";
  private String chainwork;

  public static final String JSON_PROPERTY_NETWORK_HASH_PER_SECOND = "networkHashPerSecond";
  private String networkHashPerSecond;

  public static final String JSON_PROPERTY_MEMPOOL_TX_COUNT = "mempoolTxCount";
  private Integer mempoolTxCount;

  public static final String JSON_PROPERTY_MEMPOOL_USAGE = "mempoolUsage";
  private Long mempoolUsage;

  public static final String JSON_PROPERTY_ESTIMATED_BLOCK_SIZE = "estimatedBlockSize";
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
  @JsonProperty(JSON_PROPERTY_CHAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_BLOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_BEST_BLOCK_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_DIFFICULTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_MEDIAN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_CHAINWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_NETWORK_HASH_PER_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_MEMPOOL_TX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_MEMPOOL_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_ESTIMATED_BLOCK_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

