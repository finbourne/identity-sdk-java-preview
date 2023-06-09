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
import com.finbourne.identity.model.RoleId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RoleResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private RoleId roleId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public RoleResponse id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The role&#39;s system supplied unique identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The role's system supplied unique identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RoleResponse roleId(RoleId roleId) {
    this.roleId = roleId; 
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(required = true, value = "")
  public RoleId getRoleId() {
    return roleId;
  }

  public void setRoleId(RoleId roleId) {
    this.roleId = roleId;
  }


  public RoleResponse source(String source) {
    this.source = source; 
    return this;
  }

   /**
   * The source of the role
   * @return source
  **/
  @ApiModelProperty(required = true, value = "The source of the role")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public RoleResponse name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The role name, which must be unique within the system.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The role name, which must be unique within the system.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public RoleResponse description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The description for this role
   * @return description
  **/
  @ApiModelProperty(value = "The description for this role")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
    sb.append("class RoleResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
