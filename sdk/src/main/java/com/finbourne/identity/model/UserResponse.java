/*
 * FINBOURNE Identity Service API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1646
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
import com.finbourne.identity.model.RoleResponse;
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
 * UserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<RoleResponse> roles = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private Boolean external;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public UserResponse id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The user&#39;s system supplied unique identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The user's system supplied unique identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public UserResponse emailAddress(String emailAddress) {
    this.emailAddress = emailAddress; 
    return this;
  }

   /**
   * The user&#39;s emailAddress address, which must be unique within the system
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "The user's emailAddress address, which must be unique within the system")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public UserResponse login(String login) {
    this.login = login; 
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  public UserResponse firstName(String firstName) {
    this.firstName = firstName; 
    return this;
  }

   /**
   * The user&#39;s first name
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The user's first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserResponse lastName(String lastName) {
    this.lastName = lastName; 
    return this;
  }

   /**
   * The user&#39;s last name
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "The user's last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserResponse roles(List<RoleResponse> roles) {
    this.roles = roles; 
    return this;
  }

  public UserResponse addRolesItem(RoleResponse rolesItem) {
   
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The roles that the user has.
   * @return roles
  **/
  @ApiModelProperty(value = "The roles that the user has.")
  public List<RoleResponse> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleResponse> roles) {
    this.roles = roles;
  }


  public UserResponse type(String type) {
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


  public UserResponse status(String status) {
    this.status = status; 
    return this;
  }

   /**
   * The status of the user
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the user")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public UserResponse external(Boolean external) {
    this.external = external; 
    return this;
  }

   /**
   * Whether or not the user originates from an external identity system
   * @return external
  **/
  @ApiModelProperty(required = true, value = "Whether or not the user originates from an external identity system")
  public Boolean getExternal() {
    return external;
  }

  public void setExternal(Boolean external) {
    this.external = external;
  }


  public UserResponse links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public UserResponse addLinksItem(Link linksItem) {
   
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
    sb.append("class UserResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
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
