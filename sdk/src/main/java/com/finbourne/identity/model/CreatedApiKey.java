/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1656
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
 * A newly created API key
 */
@ApiModel(description = "A newly created API key")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatedApiKey {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

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


  public CreatedApiKey key(String key) {
    this.key = key; 
    return this;
  }

   /**
   * The API Key value
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The API Key value")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public CreatedApiKey id(String id) {
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


  public CreatedApiKey displayName(String displayName) {
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


  public CreatedApiKey createdDate(OffsetDateTime createdDate) {
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


  public CreatedApiKey deactivationDate(OffsetDateTime deactivationDate) {
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
    sb.append("class CreatedApiKey {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
