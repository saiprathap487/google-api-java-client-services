/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudasset.v1p5beta1.model;

/**
 * An allowed method or permission of a service specified in ApiOperation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1MethodSelector extends com.google.api.client.json.GenericJson {

  /**
   * Value for `method` should be a valid method name for the corresponding `service_name` in
   * ApiOperation. If `*` used as value for `method`, then ALL methods and permissions are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * Value for `permission` should be a valid Cloud IAM permission for the corresponding
   * `service_name` in ApiOperation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permission;

  /**
   * Value for `method` should be a valid method name for the corresponding `service_name` in
   * ApiOperation. If `*` used as value for `method`, then ALL methods and permissions are allowed.
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * Value for `method` should be a valid method name for the corresponding `service_name` in
   * ApiOperation. If `*` used as value for `method`, then ALL methods and permissions are allowed.
   * @param method method or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1MethodSelector setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  /**
   * Value for `permission` should be a valid Cloud IAM permission for the corresponding
   * `service_name` in ApiOperation.
   * @return value or {@code null} for none
   */
  public java.lang.String getPermission() {
    return permission;
  }

  /**
   * Value for `permission` should be a valid Cloud IAM permission for the corresponding
   * `service_name` in ApiOperation.
   * @param permission permission or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1MethodSelector setPermission(java.lang.String permission) {
    this.permission = permission;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1MethodSelector set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1MethodSelector) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1MethodSelector clone() {
    return (GoogleIdentityAccesscontextmanagerV1MethodSelector) super.clone();
  }

}
