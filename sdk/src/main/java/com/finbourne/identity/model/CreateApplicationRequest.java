/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1634
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
import java.util.ArrayList;
import java.util.List;

/**
 * A request to create an application for authenticating the source of token requests
 */
@ApiModel(description = "A request to create an application for authenticating the source of token requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateApplicationRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirectUris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  private List<String> redirectUris = null;

  public static final String SERIALIZED_NAME_POST_LOGOUT_REDIRECT_URIS = "postLogoutRedirectUris";
  @SerializedName(SERIALIZED_NAME_POST_LOGOUT_REDIRECT_URIS)
  private List<String> postLogoutRedirectUris = null;


  public CreateApplicationRequest displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The Display Name of the application
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The Display Name of the application")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateApplicationRequest clientId(String clientId) {
    this.clientId = clientId; 
    return this;
  }

   /**
   * The OpenID Connect ClientId of the application
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "The OpenID Connect ClientId of the application")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public CreateApplicationRequest type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * The Type of the application. This must be either Native or Web
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The Type of the application. This must be either Native or Web")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public CreateApplicationRequest redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris; 
    return this;
  }

  public CreateApplicationRequest addRedirectUrisItem(String redirectUrisItem) {
   
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * A web application&#39;s acceptable list of post-login redirect URIs
   * @return redirectUris
  **/
  @ApiModelProperty(value = "A web application's acceptable list of post-login redirect URIs")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }


  public CreateApplicationRequest postLogoutRedirectUris(List<String> postLogoutRedirectUris) {
    this.postLogoutRedirectUris = postLogoutRedirectUris; 
    return this;
  }

  public CreateApplicationRequest addPostLogoutRedirectUrisItem(String postLogoutRedirectUrisItem) {
   
    if (this.postLogoutRedirectUris == null) {
      this.postLogoutRedirectUris = new ArrayList<>();
    }
    this.postLogoutRedirectUris.add(postLogoutRedirectUrisItem);
    return this;
  }

   /**
   * A web application&#39;s acceptable list of post-logout redirect URIs
   * @return postLogoutRedirectUris
  **/
  @ApiModelProperty(value = "A web application's acceptable list of post-logout redirect URIs")
  public List<String> getPostLogoutRedirectUris() {
    return postLogoutRedirectUris;
  }

  public void setPostLogoutRedirectUris(List<String> postLogoutRedirectUris) {
    this.postLogoutRedirectUris = postLogoutRedirectUris;
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
    sb.append("class CreateApplicationRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    postLogoutRedirectUris: ").append(toIndentedString(postLogoutRedirectUris)).append("\n");
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
