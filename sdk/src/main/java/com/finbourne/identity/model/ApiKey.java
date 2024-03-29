/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.2450
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
 * The metadata of an API key
 */
@ApiModel(description = "The metadata of an API key")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiKey {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_DEACTIVATION_DATE = "deactivationDate";
  @SerializedName(SERIALIZED_NAME_DEACTIVATION_DATE)
  private OffsetDateTime deactivationDate;


  public ApiKey id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The unique Id of the API key
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique Id of the API key")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ApiKey displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The display name of the API key
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The display name of the API key")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ApiKey createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate; 
    return this;
  }

   /**
   * The creation date of the API key
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "The creation date of the API key")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public ApiKey deactivationDate(OffsetDateTime deactivationDate) {
    this.deactivationDate = deactivationDate; 
    return this;
  }

   /**
   * The deactivation date of the API key
   * @return deactivationDate
  **/
  @ApiModelProperty(value = "The deactivation date of the API key")
  public OffsetDateTime getDeactivationDate() {
    return deactivationDate;
  }

  public void setDeactivationDate(OffsetDateTime deactivationDate) {
    this.deactivationDate = deactivationDate;
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
    sb.append("class ApiKey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    deactivationDate: ").append(toIndentedString(deactivationDate)).append("\n");
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
