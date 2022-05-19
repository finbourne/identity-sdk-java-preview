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
import com.finbourne.identity.model.DomainId;
import com.finbourne.identity.model.Link;
import com.finbourne.identity.model.UserId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * DomainResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DomainResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private DomainId id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserId owner;

  public static final String SERIALIZED_NAME_BILLING_CONTACT = "billingContact";
  @SerializedName(SERIALIZED_NAME_BILLING_CONTACT)
  private UserId billingContact;

  public static final String SERIALIZED_NAME_TECHNICAL_CONTACT = "technicalContact";
  @SerializedName(SERIALIZED_NAME_TECHNICAL_CONTACT)
  private UserId technicalContact;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public DomainResponse id(DomainId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public DomainId getId() {
    return id;
  }

  public void setId(DomainId id) {
    this.id = id;
  }


  public DomainResponse description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * A description of the domain
   * @return description
  **/
  @ApiModelProperty(value = "A description of the domain")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DomainResponse companyName(String companyName) {
    this.companyName = companyName; 
    return this;
  }

   /**
   * The company name for the domain
   * @return companyName
  **/
  @ApiModelProperty(value = "The company name for the domain")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public DomainResponse owner(UserId owner) {
    this.owner = owner; 
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public UserId getOwner() {
    return owner;
  }

  public void setOwner(UserId owner) {
    this.owner = owner;
  }


  public DomainResponse billingContact(UserId billingContact) {
    this.billingContact = billingContact; 
    return this;
  }

   /**
   * Get billingContact
   * @return billingContact
  **/
  @ApiModelProperty(value = "")
  public UserId getBillingContact() {
    return billingContact;
  }

  public void setBillingContact(UserId billingContact) {
    this.billingContact = billingContact;
  }


  public DomainResponse technicalContact(UserId technicalContact) {
    this.technicalContact = technicalContact; 
    return this;
  }

   /**
   * Get technicalContact
   * @return technicalContact
  **/
  @ApiModelProperty(value = "")
  public UserId getTechnicalContact() {
    return technicalContact;
  }

  public void setTechnicalContact(UserId technicalContact) {
    this.technicalContact = technicalContact;
  }


  public DomainResponse created(OffsetDateTime created) {
    this.created = created; 
    return this;
  }

   /**
   * The
   * @return created
  **/
  @ApiModelProperty(value = "The")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public DomainResponse links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public DomainResponse addLinksItem(Link linksItem) {
   
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
    sb.append("class DomainResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
    sb.append("    technicalContact: ").append(toIndentedString(technicalContact)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
