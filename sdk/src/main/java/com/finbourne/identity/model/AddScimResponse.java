/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1885
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
import java.net.URI;

/**
 * AddScimResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddScimResponse {
  public static final String SERIALIZED_NAME_BASE_URL = "baseUrl";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  private URI baseUrl;

  public static final String SERIALIZED_NAME_API_TOKEN = "apiToken";
  @SerializedName(SERIALIZED_NAME_API_TOKEN)
  private String apiToken;


  public AddScimResponse baseUrl(URI baseUrl) {
    this.baseUrl = baseUrl; 
    return this;
  }

   /**
   * Get baseUrl
   * @return baseUrl
  **/
  @ApiModelProperty(value = "")
  public URI getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(URI baseUrl) {
    this.baseUrl = baseUrl;
  }


  public AddScimResponse apiToken(String apiToken) {
    this.apiToken = apiToken; 
    return this;
  }

   /**
   * Get apiToken
   * @return apiToken
  **/
  @ApiModelProperty(value = "")
  public String getApiToken() {
    return apiToken;
  }

  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
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
    sb.append("class AddScimResponse {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
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
