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
 * Timestamped successful response to grant access to your account
 */
@ApiModel(description = "Timestamped successful response to grant access to your account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SupportAccessResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private OffsetDateTime expiry;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_TERMINATED = "terminated";
  @SerializedName(SERIALIZED_NAME_TERMINATED)
  private Boolean terminated;

  public static final String SERIALIZED_NAME_TERMINATED_AT = "terminatedAt";
  @SerializedName(SERIALIZED_NAME_TERMINATED_AT)
  private OffsetDateTime terminatedAt;

  public static final String SERIALIZED_NAME_TERMINATED_BY = "terminatedBy";
  @SerializedName(SERIALIZED_NAME_TERMINATED_BY)
  private String terminatedBy;


  public SupportAccessResponse id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * ID of the support access request
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of the support access request")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public SupportAccessResponse duration(String duration) {
    this.duration = duration; 
    return this;
  }

   /**
   * The duration for which access is requested (in any ISO-8601 format)
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The duration for which access is requested (in any ISO-8601 format)")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public SupportAccessResponse description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The description of why the support access has been granted (i.e. support ticket numbers)
   * @return description
  **/
  @ApiModelProperty(value = "The description of why the support access has been granted (i.e. support ticket numbers)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public SupportAccessResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt; 
    return this;
  }

   /**
   * DateTimeOffset at which the access was granted
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "DateTimeOffset at which the access was granted")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SupportAccessResponse expiry(OffsetDateTime expiry) {
    this.expiry = expiry; 
    return this;
  }

   /**
   * DateTimeOffset at which the access will be revoked
   * @return expiry
  **/
  @ApiModelProperty(required = true, value = "DateTimeOffset at which the access will be revoked")
  public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }


  public SupportAccessResponse createdBy(String createdBy) {
    this.createdBy = createdBy; 
    return this;
  }

   /**
   * Obfuscated UserId of the user who granted the support access
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "Obfuscated UserId of the user who granted the support access")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public SupportAccessResponse terminated(Boolean terminated) {
    this.terminated = terminated; 
    return this;
  }

   /**
   * Whether or not that access has been invalidated
   * @return terminated
  **/
  @ApiModelProperty(value = "Whether or not that access has been invalidated")
  public Boolean getTerminated() {
    return terminated;
  }

  public void setTerminated(Boolean terminated) {
    this.terminated = terminated;
  }


  public SupportAccessResponse terminatedAt(OffsetDateTime terminatedAt) {
    this.terminatedAt = terminatedAt; 
    return this;
  }

   /**
   * DateTimeOffset at which the access was invalidated
   * @return terminatedAt
  **/
  @ApiModelProperty(value = "DateTimeOffset at which the access was invalidated")
  public OffsetDateTime getTerminatedAt() {
    return terminatedAt;
  }

  public void setTerminatedAt(OffsetDateTime terminatedAt) {
    this.terminatedAt = terminatedAt;
  }


  public SupportAccessResponse terminatedBy(String terminatedBy) {
    this.terminatedBy = terminatedBy; 
    return this;
  }

   /**
   * Obfuscated UserId of the user who revoked the access
   * @return terminatedBy
  **/
  @ApiModelProperty(value = "Obfuscated UserId of the user who revoked the access")
  public String getTerminatedBy() {
    return terminatedBy;
  }

  public void setTerminatedBy(String terminatedBy) {
    this.terminatedBy = terminatedBy;
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
    sb.append("class SupportAccessResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
    sb.append("    terminatedAt: ").append(toIndentedString(terminatedAt)).append("\n");
    sb.append("    terminatedBy: ").append(toIndentedString(terminatedBy)).append("\n");
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
