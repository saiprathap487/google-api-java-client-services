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

package com.google.api.services.ml.v1.model;

/**
 * Returns service account information associated with a project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1GetConfigResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1Config config;

  /**
   * The service account Cloud ML uses to access resources in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * The project number for `service_account`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long serviceAccountProject;

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1Config getConfig() {
    return config;
  }

  /**
   * @param config config or {@code null} for none
   */
  public GoogleCloudMlV1GetConfigResponse setConfig(GoogleCloudMlV1Config config) {
    this.config = config;
    return this;
  }

  /**
   * The service account Cloud ML uses to access resources in the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The service account Cloud ML uses to access resources in the project.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GoogleCloudMlV1GetConfigResponse setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The project number for `service_account`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getServiceAccountProject() {
    return serviceAccountProject;
  }

  /**
   * The project number for `service_account`.
   * @param serviceAccountProject serviceAccountProject or {@code null} for none
   */
  public GoogleCloudMlV1GetConfigResponse setServiceAccountProject(java.lang.Long serviceAccountProject) {
    this.serviceAccountProject = serviceAccountProject;
    return this;
  }

  @Override
  public GoogleCloudMlV1GetConfigResponse set(String fieldName, Object value) {
    return (GoogleCloudMlV1GetConfigResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1GetConfigResponse clone() {
    return (GoogleCloudMlV1GetConfigResponse) super.clone();
  }

}
