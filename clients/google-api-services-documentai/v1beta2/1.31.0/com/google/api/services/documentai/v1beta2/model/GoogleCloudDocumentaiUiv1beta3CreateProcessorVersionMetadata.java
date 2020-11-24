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

package com.google.api.services.documentai.v1beta2.model;

/**
 * The metadata that represents a processor version being created.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiUiv1beta3CreateProcessorVersionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The creation time of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The state of the current disable processor operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The last update time of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The creation time of the operation.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The creation time of the operation.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3CreateProcessorVersionMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The state of the current disable processor operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the current disable processor operation.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3CreateProcessorVersionMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The last update time of the operation.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The last update time of the operation.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3CreateProcessorVersionMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3CreateProcessorVersionMetadata set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiUiv1beta3CreateProcessorVersionMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3CreateProcessorVersionMetadata clone() {
    return (GoogleCloudDocumentaiUiv1beta3CreateProcessorVersionMetadata) super.clone();
  }

}
