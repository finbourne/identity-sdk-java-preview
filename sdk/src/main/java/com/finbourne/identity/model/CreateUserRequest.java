/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1636
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.identity.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.identity.model.RoleId;
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
 * Details necessary for creating a new user
 */
@ApiModel(description = "Details necessary for creating a new user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateUserRequest {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<RoleId> roles = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public CreateUserRequest firstName(String firstName) {
    this.firstName = firstName; 
    return this;
  }

   /**
   * The first name of the user
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The first name of the user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CreateUserRequest lastName(String lastName) {
    this.lastName = lastName; 
    return this;
  }

   /**
   * The last name of the user
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "The last name of the user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CreateUserRequest emailAddress(String emailAddress) {
    this.emailAddress = emailAddress; 
    return this;
  }

   /**
   * The user&#39;s email address - to which the account validation email will be sent. For user accounts  this should exactly match the Login.
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "The user's email address - to which the account validation email will be sent. For user accounts  this should exactly match the Login.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public CreateUserRequest login(String login) {
    this.login = login; 
    return this;
  }

   /**
   * The user&#39;s login username, in the form of an email address, which must be unique within the system.  For user accounts this should exactly match the user&#39;s email address.
   * @return login
  **/
  @ApiModelProperty(required = true, value = "The user's login username, in the form of an email address, which must be unique within the system.  For user accounts this should exactly match the user's email address.")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  public CreateUserRequest roles(List<RoleId> roles) {
    this.roles = roles; 
    return this;
  }

  public CreateUserRequest addRolesItem(RoleId rolesItem) {
   
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Optional. Any known roles the user should be created with.
   * @return roles
  **/
  @ApiModelProperty(value = "Optional. Any known roles the user should be created with.")
  public List<RoleId> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleId> roles) {
    this.roles = roles;
  }


  public CreateUserRequest type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * The type of user (e.g. Personal or Service)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of user (e.g. Personal or Service)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
    sb.append("class CreateUserRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
