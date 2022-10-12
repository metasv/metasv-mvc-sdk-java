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
 * Utxo belongs to the specified xpub
 */
@ApiModel(description = "Utxo belongs to the specified xpub")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-12T19:14:49.325014+09:00[Asia/Tokyo]")
public class XpubUtxo {
  public static final String SERIALIZED_NAME_XPUB = "xpub";
  @SerializedName(SERIALIZED_NAME_XPUB)
  private String xpub;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "addressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private Integer addressType;

  public static final String SERIALIZED_NAME_ADDRESS_INDEX = "addressIndex";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INDEX)
  private Integer addressIndex;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TX_INDEX = "txIndex";
  @SerializedName(SERIALIZED_NAME_TX_INDEX)
  private Integer txIndex;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private Long flag;


  public XpubUtxo xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * xpub of the utxo
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "xpub of the utxo")

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubUtxo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address string of this utxo
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address string of this utxo")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public XpubUtxo addressType(Integer addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Address type, 0 for receive address, 1 for change address. path is {{addressType}}/{{addressIndex}}
   * @return addressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address type, 0 for receive address, 1 for change address. path is {{addressType}}/{{addressIndex}}")

  public Integer getAddressType() {
    return addressType;
  }


  public void setAddressType(Integer addressType) {
    this.addressType = addressType;
  }


  public XpubUtxo addressIndex(Integer addressIndex) {
    
    this.addressIndex = addressIndex;
    return this;
  }

   /**
   * Address index. Address path in the xpub is {{addressType}}/{{addressIndex}}
   * @return addressIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address index. Address path in the xpub is {{addressType}}/{{addressIndex}}")

  public Integer getAddressIndex() {
    return addressIndex;
  }


  public void setAddressIndex(Integer addressIndex) {
    this.addressIndex = addressIndex;
  }


  public XpubUtxo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Txid for this utxo.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Txid for this utxo.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public XpubUtxo txIndex(Integer txIndex) {
    
    this.txIndex = txIndex;
    return this;
  }

   /**
   * Output index for the Utxo.
   * @return txIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output index for the Utxo.")

  public Integer getTxIndex() {
    return txIndex;
  }


  public void setTxIndex(Integer txIndex) {
    this.txIndex = txIndex;
  }


  public XpubUtxo value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * Satoshi value of the utxo.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Satoshi value of the utxo.")

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public XpubUtxo height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of this utxo, -1 for unconfirmed utxo.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of this utxo, -1 for unconfirmed utxo.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public XpubUtxo flag(Long flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * The paging flag of utxo
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The paging flag of utxo")

  public Long getFlag() {
    return flag;
  }


  public void setFlag(Long flag) {
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
    XpubUtxo xpubUtxo = (XpubUtxo) o;
    return Objects.equals(this.xpub, xpubUtxo.xpub) &&
        Objects.equals(this.address, xpubUtxo.address) &&
        Objects.equals(this.addressType, xpubUtxo.addressType) &&
        Objects.equals(this.addressIndex, xpubUtxo.addressIndex) &&
        Objects.equals(this.txid, xpubUtxo.txid) &&
        Objects.equals(this.txIndex, xpubUtxo.txIndex) &&
        Objects.equals(this.value, xpubUtxo.value) &&
        Objects.equals(this.height, xpubUtxo.height) &&
        Objects.equals(this.flag, xpubUtxo.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, address, addressType, addressIndex, txid, txIndex, value, height, flag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubUtxo {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressIndex: ").append(toIndentedString(addressIndex)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txIndex: ").append(toIndentedString(txIndex)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

