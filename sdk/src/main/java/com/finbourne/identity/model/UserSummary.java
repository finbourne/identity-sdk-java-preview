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
import com.finbourne.identity.model.Link;
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
 * Lightweight view of an user details
 */
@ApiModel(description = "Lightweight view of an user details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserSummary {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SECOND_EMAIL = "secondEmail";
  @SerializedName(SERIALIZED_NAME_SECOND_EMAIL)
  private String secondEmail;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public UserSummary id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The user id
   * @return id
  **/
  @ApiModelProperty(value = "The user id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public UserSummary login(String login) {
    this.login = login; 
    return this;
  }

   /**
   * The user login
   * @return login
  **/
  @ApiModelProperty(value = "The user login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  public UserSummary email(String email) {
    this.email = email; 
    return this;
  }

   /**
   * The email address registered for that user
   * @return email
  **/
  @ApiModelProperty(value = "The email address registered for that user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public UserSummary secondEmail(String secondEmail) {
    this.secondEmail = secondEmail; 
    return this;
  }

   /**
   * Get secondEmail
   * @return secondEmail
  **/
  @ApiModelProperty(value = "")
  public String getSecondEmail() {
    return secondEmail;
  }

  public void setSecondEmail(String secondEmail) {
    this.secondEmail = secondEmail;
  }


  public UserSummary firstName(String firstName) {
    this.firstName = firstName; 
    return this;
  }

   /**
   * User&#39;s first name
   * @return firstName
  **/
  @ApiModelProperty(value = "User's first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserSummary lastName(String lastName) {
    this.lastName = lastName; 
    return this;
  }

   /**
   * User&#39;s last name
   * @return lastName
  **/
  @ApiModelProperty(value = "User's last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserSummary type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * User&#39;s type (Personal, Service...)
   * @return type
  **/
  @ApiModelProperty(value = "User's type (Personal, Service...)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public UserSummary links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public UserSummary addLinksItem(Link linksItem) {
   
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
    sb.append("class UserSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    secondEmail: ").append(toIndentedString(secondEmail)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
