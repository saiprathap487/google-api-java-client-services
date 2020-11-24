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
 * A value of a field, including its frequency.
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
public final class GooglePrivacyDlpV2ValueFrequency extends com.google.api.client.json.GenericJson {

  /**
   * How many times the value is contained in the field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * A value contained in the field in question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Value value;

  /**
   * How many times the value is contained in the field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * How many times the value is contained in the field.
   * @param count count or {@code null} for none
   */
  public GooglePrivacyDlpV2ValueFrequency setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * A value contained in the field in question.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Value getValue() {
    return value;
  }

  /**
   * A value contained in the field in question.
   * @param value value or {@code null} for none
   */
  public GooglePrivacyDlpV2ValueFrequency setValue(GooglePrivacyDlpV2Value value) {
    this.value = value;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2ValueFrequency set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2ValueFrequency) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2ValueFrequency clone() {
    return (GooglePrivacyDlpV2ValueFrequency) super.clone();
  }

}
