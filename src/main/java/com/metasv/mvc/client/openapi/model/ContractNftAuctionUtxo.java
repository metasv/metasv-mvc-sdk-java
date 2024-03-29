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
 * Contract nft auction Utxo belongs to the specified address
 */
@ApiModel(description = "Contract nft auction Utxo belongs to the specified address")
@JsonPropertyOrder({
  ContractNftAuctionUtxo.JSON_PROPERTY_ADDRESS,
  ContractNftAuctionUtxo.JSON_PROPERTY_TXID,
  ContractNftAuctionUtxo.JSON_PROPERTY_TX_INDEX,
  ContractNftAuctionUtxo.JSON_PROPERTY_BID_MVC_PRICE,
  ContractNftAuctionUtxo.JSON_PROPERTY_BID_TIMESTAMP,
  ContractNftAuctionUtxo.JSON_PROPERTY_BIDDER_ADDRESS_PKH,
  ContractNftAuctionUtxo.JSON_PROPERTY_CODE_HASH,
  ContractNftAuctionUtxo.JSON_PROPERTY_GENESIS,
  ContractNftAuctionUtxo.JSON_PROPERTY_END_TIMESTAMP,
  ContractNftAuctionUtxo.JSON_PROPERTY_FEE_ADDRESS_PKH,
  ContractNftAuctionUtxo.JSON_PROPERTY_FEE_AMOUNT,
  ContractNftAuctionUtxo.JSON_PROPERTY_FEE_RATE,
  ContractNftAuctionUtxo.JSON_PROPERTY_HEIGHT,
  ContractNftAuctionUtxo.JSON_PROPERTY_NFT_CODE_HASH,
  ContractNftAuctionUtxo.JSON_PROPERTY_NFT_ID,
  ContractNftAuctionUtxo.JSON_PROPERTY_SENDER_ADDRESS_PKH,
  ContractNftAuctionUtxo.JSON_PROPERTY_SENSIBLE_ID,
  ContractNftAuctionUtxo.JSON_PROPERTY_START_MVC_PRICE,
  ContractNftAuctionUtxo.JSON_PROPERTY_SATOSHI,
  ContractNftAuctionUtxo.JSON_PROPERTY_SATOSHI_STRING,
  ContractNftAuctionUtxo.JSON_PROPERTY_CONTRACT_ADDRESS,
  ContractNftAuctionUtxo.JSON_PROPERTY_IS_READY,
  ContractNftAuctionUtxo.JSON_PROPERTY_FLAG
})
@JsonTypeName("ContractNftAuctionUtxo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-16T17:24:50.047362+09:00[Asia/Tokyo]")
public class ContractNftAuctionUtxo {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_TX_INDEX = "txIndex";
  private Integer txIndex;

  public static final String JSON_PROPERTY_BID_MVC_PRICE = "bidMvcPrice";
  private Long bidMvcPrice;

  public static final String JSON_PROPERTY_BID_TIMESTAMP = "bidTimestamp";
  private Long bidTimestamp;

  public static final String JSON_PROPERTY_BIDDER_ADDRESS_PKH = "bidderAddressPkh";
  private String bidderAddressPkh;

  public static final String JSON_PROPERTY_CODE_HASH = "codeHash";
  private String codeHash;

  public static final String JSON_PROPERTY_GENESIS = "genesis";
  private String genesis;

  public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
  private Long endTimestamp;

  public static final String JSON_PROPERTY_FEE_ADDRESS_PKH = "feeAddressPkh";
  private String feeAddressPkh;

  public static final String JSON_PROPERTY_FEE_AMOUNT = "feeAmount";
  private Long feeAmount;

  public static final String JSON_PROPERTY_FEE_RATE = "feeRate";
  private Integer feeRate;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_NFT_CODE_HASH = "nftCodeHash";
  private String nftCodeHash;

  public static final String JSON_PROPERTY_NFT_ID = "nftId";
  private String nftId;

  public static final String JSON_PROPERTY_SENDER_ADDRESS_PKH = "senderAddressPkh";
  private String senderAddressPkh;

  public static final String JSON_PROPERTY_SENSIBLE_ID = "sensibleId";
  private String sensibleId;

  public static final String JSON_PROPERTY_START_MVC_PRICE = "startMvcPrice";
  private Long startMvcPrice;

  public static final String JSON_PROPERTY_SATOSHI = "satoshi";
  private Long satoshi;

  public static final String JSON_PROPERTY_SATOSHI_STRING = "satoshiString";
  private String satoshiString;

  public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contractAddress";
  private String contractAddress;

  public static final String JSON_PROPERTY_IS_READY = "isReady";
  private Boolean isReady;

  public static final String JSON_PROPERTY_FLAG = "flag";
  private String flag;


  public ContractNftAuctionUtxo address(String address) {
    
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


  public ContractNftAuctionUtxo txid(String txid) {
    
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


  public ContractNftAuctionUtxo txIndex(Integer txIndex) {
    
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


  public ContractNftAuctionUtxo bidMvcPrice(Long bidMvcPrice) {
    
    this.bidMvcPrice = bidMvcPrice;
    return this;
  }

   /**
   * bidMvcPrice
   * @return bidMvcPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "bidMvcPrice")
  @JsonProperty(JSON_PROPERTY_BID_MVC_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBidMvcPrice() {
    return bidMvcPrice;
  }


  public void setBidMvcPrice(Long bidMvcPrice) {
    this.bidMvcPrice = bidMvcPrice;
  }


  public ContractNftAuctionUtxo bidTimestamp(Long bidTimestamp) {
    
    this.bidTimestamp = bidTimestamp;
    return this;
  }

   /**
   * bidTimestamp
   * @return bidTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "bidTimestamp")
  @JsonProperty(JSON_PROPERTY_BID_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBidTimestamp() {
    return bidTimestamp;
  }


  public void setBidTimestamp(Long bidTimestamp) {
    this.bidTimestamp = bidTimestamp;
  }


  public ContractNftAuctionUtxo bidderAddressPkh(String bidderAddressPkh) {
    
    this.bidderAddressPkh = bidderAddressPkh;
    return this;
  }

   /**
   * bidderAddressPkh
   * @return bidderAddressPkh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "bidderAddressPkh")
  @JsonProperty(JSON_PROPERTY_BIDDER_ADDRESS_PKH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBidderAddressPkh() {
    return bidderAddressPkh;
  }


  public void setBidderAddressPkh(String bidderAddressPkh) {
    this.bidderAddressPkh = bidderAddressPkh;
  }


  public ContractNftAuctionUtxo codeHash(String codeHash) {
    
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


  public ContractNftAuctionUtxo genesis(String genesis) {
    
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


  public ContractNftAuctionUtxo endTimestamp(Long endTimestamp) {
    
    this.endTimestamp = endTimestamp;
    return this;
  }

   /**
   * endTimestamp
   * @return endTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "endTimestamp")
  @JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndTimestamp() {
    return endTimestamp;
  }


  public void setEndTimestamp(Long endTimestamp) {
    this.endTimestamp = endTimestamp;
  }


  public ContractNftAuctionUtxo feeAddressPkh(String feeAddressPkh) {
    
    this.feeAddressPkh = feeAddressPkh;
    return this;
  }

   /**
   * feeAddressPkh
   * @return feeAddressPkh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "feeAddressPkh")
  @JsonProperty(JSON_PROPERTY_FEE_ADDRESS_PKH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeeAddressPkh() {
    return feeAddressPkh;
  }


  public void setFeeAddressPkh(String feeAddressPkh) {
    this.feeAddressPkh = feeAddressPkh;
  }


  public ContractNftAuctionUtxo feeAmount(Long feeAmount) {
    
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * feeAmount
   * @return feeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "feeAmount")
  @JsonProperty(JSON_PROPERTY_FEE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeeAmount() {
    return feeAmount;
  }


  public void setFeeAmount(Long feeAmount) {
    this.feeAmount = feeAmount;
  }


  public ContractNftAuctionUtxo feeRate(Integer feeRate) {
    
    this.feeRate = feeRate;
    return this;
  }

   /**
   * feeRate
   * @return feeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "feeRate")
  @JsonProperty(JSON_PROPERTY_FEE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFeeRate() {
    return feeRate;
  }


  public void setFeeRate(Integer feeRate) {
    this.feeRate = feeRate;
  }


  public ContractNftAuctionUtxo height(Long height) {
    
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


  public ContractNftAuctionUtxo nftCodeHash(String nftCodeHash) {
    
    this.nftCodeHash = nftCodeHash;
    return this;
  }

   /**
   * nftCodeHash
   * @return nftCodeHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "nftCodeHash")
  @JsonProperty(JSON_PROPERTY_NFT_CODE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNftCodeHash() {
    return nftCodeHash;
  }


  public void setNftCodeHash(String nftCodeHash) {
    this.nftCodeHash = nftCodeHash;
  }


  public ContractNftAuctionUtxo nftId(String nftId) {
    
    this.nftId = nftId;
    return this;
  }

   /**
   * nftId of the auctioning fnt
   * @return nftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "nftId of the auctioning fnt")
  @JsonProperty(JSON_PROPERTY_NFT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNftId() {
    return nftId;
  }


  public void setNftId(String nftId) {
    this.nftId = nftId;
  }


  public ContractNftAuctionUtxo senderAddressPkh(String senderAddressPkh) {
    
    this.senderAddressPkh = senderAddressPkh;
    return this;
  }

   /**
   * senderAddressPkh
   * @return senderAddressPkh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "senderAddressPkh")
  @JsonProperty(JSON_PROPERTY_SENDER_ADDRESS_PKH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSenderAddressPkh() {
    return senderAddressPkh;
  }


  public void setSenderAddressPkh(String senderAddressPkh) {
    this.senderAddressPkh = senderAddressPkh;
  }


  public ContractNftAuctionUtxo sensibleId(String sensibleId) {
    
    this.sensibleId = sensibleId;
    return this;
  }

   /**
   * SensibleId of the utxo
   * @return sensibleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SensibleId of the utxo")
  @JsonProperty(JSON_PROPERTY_SENSIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSensibleId() {
    return sensibleId;
  }


  public void setSensibleId(String sensibleId) {
    this.sensibleId = sensibleId;
  }


  public ContractNftAuctionUtxo startMvcPrice(Long startMvcPrice) {
    
    this.startMvcPrice = startMvcPrice;
    return this;
  }

   /**
   * startMvcPrice
   * @return startMvcPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "startMvcPrice")
  @JsonProperty(JSON_PROPERTY_START_MVC_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartMvcPrice() {
    return startMvcPrice;
  }


  public void setStartMvcPrice(Long startMvcPrice) {
    this.startMvcPrice = startMvcPrice;
  }


  public ContractNftAuctionUtxo satoshi(Long satoshi) {
    
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


  public ContractNftAuctionUtxo satoshiString(String satoshiString) {
    
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


  public ContractNftAuctionUtxo contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * The hash160 of the script(p2ch address)
   * @return contractAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hash160 of the script(p2ch address)")
  @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public ContractNftAuctionUtxo isReady(Boolean isReady) {
    
    this.isReady = isReady;
    return this;
  }

   /**
   * this the nft send to this contract address
   * @return isReady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "this the nft send to this contract address")
  @JsonProperty(JSON_PROPERTY_IS_READY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReady() {
    return isReady;
  }


  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }


  public ContractNftAuctionUtxo flag(String flag) {
    
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
    ContractNftAuctionUtxo contractNftAuctionUtxo = (ContractNftAuctionUtxo) o;
    return Objects.equals(this.address, contractNftAuctionUtxo.address) &&
        Objects.equals(this.txid, contractNftAuctionUtxo.txid) &&
        Objects.equals(this.txIndex, contractNftAuctionUtxo.txIndex) &&
        Objects.equals(this.bidMvcPrice, contractNftAuctionUtxo.bidMvcPrice) &&
        Objects.equals(this.bidTimestamp, contractNftAuctionUtxo.bidTimestamp) &&
        Objects.equals(this.bidderAddressPkh, contractNftAuctionUtxo.bidderAddressPkh) &&
        Objects.equals(this.codeHash, contractNftAuctionUtxo.codeHash) &&
        Objects.equals(this.genesis, contractNftAuctionUtxo.genesis) &&
        Objects.equals(this.endTimestamp, contractNftAuctionUtxo.endTimestamp) &&
        Objects.equals(this.feeAddressPkh, contractNftAuctionUtxo.feeAddressPkh) &&
        Objects.equals(this.feeAmount, contractNftAuctionUtxo.feeAmount) &&
        Objects.equals(this.feeRate, contractNftAuctionUtxo.feeRate) &&
        Objects.equals(this.height, contractNftAuctionUtxo.height) &&
        Objects.equals(this.nftCodeHash, contractNftAuctionUtxo.nftCodeHash) &&
        Objects.equals(this.nftId, contractNftAuctionUtxo.nftId) &&
        Objects.equals(this.senderAddressPkh, contractNftAuctionUtxo.senderAddressPkh) &&
        Objects.equals(this.sensibleId, contractNftAuctionUtxo.sensibleId) &&
        Objects.equals(this.startMvcPrice, contractNftAuctionUtxo.startMvcPrice) &&
        Objects.equals(this.satoshi, contractNftAuctionUtxo.satoshi) &&
        Objects.equals(this.satoshiString, contractNftAuctionUtxo.satoshiString) &&
        Objects.equals(this.contractAddress, contractNftAuctionUtxo.contractAddress) &&
        Objects.equals(this.isReady, contractNftAuctionUtxo.isReady) &&
        Objects.equals(this.flag, contractNftAuctionUtxo.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, txid, txIndex, bidMvcPrice, bidTimestamp, bidderAddressPkh, codeHash, genesis, endTimestamp, feeAddressPkh, feeAmount, feeRate, height, nftCodeHash, nftId, senderAddressPkh, sensibleId, startMvcPrice, satoshi, satoshiString, contractAddress, isReady, flag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractNftAuctionUtxo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txIndex: ").append(toIndentedString(txIndex)).append("\n");
    sb.append("    bidMvcPrice: ").append(toIndentedString(bidMvcPrice)).append("\n");
    sb.append("    bidTimestamp: ").append(toIndentedString(bidTimestamp)).append("\n");
    sb.append("    bidderAddressPkh: ").append(toIndentedString(bidderAddressPkh)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    genesis: ").append(toIndentedString(genesis)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    feeAddressPkh: ").append(toIndentedString(feeAddressPkh)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    nftCodeHash: ").append(toIndentedString(nftCodeHash)).append("\n");
    sb.append("    nftId: ").append(toIndentedString(nftId)).append("\n");
    sb.append("    senderAddressPkh: ").append(toIndentedString(senderAddressPkh)).append("\n");
    sb.append("    sensibleId: ").append(toIndentedString(sensibleId)).append("\n");
    sb.append("    startMvcPrice: ").append(toIndentedString(startMvcPrice)).append("\n");
    sb.append("    satoshi: ").append(toIndentedString(satoshi)).append("\n");
    sb.append("    satoshiString: ").append(toIndentedString(satoshiString)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
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

