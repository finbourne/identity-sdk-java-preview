/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1598
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.identity.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.identity.model.Link;
import com.finbourne.identity.model.SupportAccessExpiry;
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
 * AuthenticationInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthenticationInformation {
  public static final String SERIALIZED_NAME_ISSUER_URL = "issuerUrl";
  @SerializedName(SERIALIZED_NAME_ISSUER_URL)
  private String issuerUrl;

  public static final String SERIALIZED_NAME_SAML_IDENTITY_PROVIDER_ID = "samlIdentityProviderId";
  @SerializedName(SERIALIZED_NAME_SAML_IDENTITY_PROVIDER_ID)
  private String samlIdentityProviderId;

  public static final String SERIALIZED_NAME_SUPPORT = "support";
  @SerializedName(SERIALIZED_NAME_SUPPORT)
  private SupportAccessExpiry support;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public AuthenticationInformation issuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl; 
    return this;
  }

   /**
   * Get issuerUrl
   * @return issuerUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIssuerUrl() {
    return issuerUrl;
  }

  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }


  public AuthenticationInformation samlIdentityProviderId(String samlIdentityProviderId) {
    this.samlIdentityProviderId = samlIdentityProviderId; 
    return this;
  }

   /**
   * Get samlIdentityProviderId
   * @return samlIdentityProviderId
  **/
  @ApiModelProperty(value = "")
  public String getSamlIdentityProviderId() {
    return samlIdentityProviderId;
  }

  public void setSamlIdentityProviderId(String samlIdentityProviderId) {
    this.samlIdentityProviderId = samlIdentityProviderId;
  }


  public AuthenticationInformation support(SupportAccessExpiry support) {
    this.support = support; 
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @ApiModelProperty(value = "")
  public SupportAccessExpiry getSupport() {
    return support;
  }

  public void setSupport(SupportAccessExpiry support) {
    this.support = support;
  }


  public AuthenticationInformation links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public AuthenticationInformation addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
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
    sb.append("class AuthenticationInformation {\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    samlIdentityProviderId: ").append(toIndentedString(samlIdentityProviderId)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
