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


package com.finbourne.identity.api;

import com.finbourne.identity.ApiException;
import com.finbourne.identity.model.CreateRoleRequest;
import com.finbourne.identity.model.LusidProblemDetails;
import com.finbourne.identity.model.LusidValidationProblemDetails;
import com.finbourne.identity.model.ProblemDetails;
import com.finbourne.identity.model.RoleResponse;
import com.finbourne.identity.model.UpdateRoleRequest;
import com.finbourne.identity.model.UserResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
@Ignore
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    
    /**
     * [EARLY ACCESS] AddUserToRole: Add User to Role
     *
     * Adds the User to the specified Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserToRoleTest() throws ApiException {
        String id = null;
        String userId = null;
        api.addUserToRole(id, userId);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] CreateRole: Create Role
     *
     * Creates a new Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        CreateRoleRequest createRoleRequest = null;
        RoleResponse response = api.createRole(createRoleRequest);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] DeleteRole: Delete Role
     *
     * Delete the specified role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        String id = null;
        api.deleteRole(id);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] GetRole: Get Role
     *
     * Get the specified role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoleTest() throws ApiException {
        String id = null;
        RoleResponse response = api.getRole(id);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] ListRoles: List Roles
     *
     * List the available Roles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRolesTest() throws ApiException {
        List<RoleResponse> response = api.listRoles();

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] ListUsersInRole: Get the users in the specified role.
     *
     * List all Users in the specified Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsersInRoleTest() throws ApiException {
        String id = null;
        List<UserResponse> response = api.listUsersInRole(id);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] RemoveUserFromRole: Remove User from Role
     *
     * Removes the User from the specified Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserFromRoleTest() throws ApiException {
        String id = null;
        String userId = null;
        api.removeUserFromRole(id, userId);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] UpdateRole: Update Role
     *
     * Update the specified Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRoleTest() throws ApiException {
        String id = null;
        UpdateRoleRequest updateRoleRequest = null;
        RoleResponse response = api.updateRole(id, updateRoleRequest);

        // TODO: test validations
    }
    
}
