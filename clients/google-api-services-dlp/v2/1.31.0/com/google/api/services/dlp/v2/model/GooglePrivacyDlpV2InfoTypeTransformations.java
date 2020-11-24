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

package com.google.api.services.dlp.v2.model;

/**
 * A type of transformation that will scan unstructured text and apply various
 * `PrimitiveTransformation`s to each finding, where the transformation is applied to only values
 * that were identified as a specific info_type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2InfoTypeTransformations extends com.google.api.client.json.GenericJson {

  /**
   * Required. Transformation for each infoType. Cannot specify more than one for a given infoType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2InfoTypeTransformation> transformations;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2InfoTypeTransformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2InfoTypeTransformation.class);
  }

  /**
   * Required. Transformation for each infoType. Cannot specify more than one for a given infoType.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2InfoTypeTransformation> getTransformations() {
    return transformations;
  }

  /**
   * Required. Transformation for each infoType. Cannot specify more than one for a given infoType.
   * @param transformations transformations or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoTypeTransformations setTransformations(java.util.List<GooglePrivacyDlpV2InfoTypeTransformation> transformations) {
    this.transformations = transformations;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2InfoTypeTransformations set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2InfoTypeTransformations) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2InfoTypeTransformations clone() {
    return (GooglePrivacyDlpV2InfoTypeTransformations) super.clone();
  }

}
