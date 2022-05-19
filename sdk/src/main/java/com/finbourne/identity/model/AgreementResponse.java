/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1662
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.identity.model;

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
import java.time.OffsetDateTime;

/**
 * Agreement DTO
 */
@ApiModel(description = "Agreement DTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AgreementResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIGNED_BY = "signedBy";
  @SerializedName(SERIALIZED_NAME_SIGNED_BY)
  private String signedBy;

  public static final String SERIALIZED_NAME_SIGNED_AT = "signedAt";
  @SerializedName(SERIALIZED_NAME_SIGNED_AT)
  private OffsetDateTime signedAt;


  public AgreementResponse name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Name of the agreement
   * @return name
  **/
  @ApiModelProperty(value = "Name of the agreement")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AgreementResponse signedBy(String signedBy) {
    this.signedBy = signedBy; 
    return this;
  }

   /**
   * UserID (obfuscated) of the user who signed this agreement
   * @return signedBy
  **/
  @ApiModelProperty(value = "UserID (obfuscated) of the user who signed this agreement")
  public String getSignedBy() {
    return signedBy;
  }

  public void setSignedBy(String signedBy) {
    this.signedBy = signedBy;
  }


  public AgreementResponse signedAt(OffsetDateTime signedAt) {
    this.signedAt = signedAt; 
    return this;
  }

   /**
   * Datetime at which the agreement was signed
   * @return signedAt
  **/
  @ApiModelProperty(value = "Datetime at which the agreement was signed")
  public OffsetDateTime getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(OffsetDateTime signedAt) {
    this.signedAt = signedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signedBy: ").append(toIndentedString(signedBy)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
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
