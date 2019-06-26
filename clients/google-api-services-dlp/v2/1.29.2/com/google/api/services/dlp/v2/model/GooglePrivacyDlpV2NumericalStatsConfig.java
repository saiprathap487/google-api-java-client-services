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
 * Compute numerical stats over an individual column, including min, max, and quantiles.
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
public final class GooglePrivacyDlpV2NumericalStatsConfig extends com.google.api.client.json.GenericJson {

  /**
   * Field to compute numerical stats on. Supported types are integer, float, date, datetime,
   * timestamp, time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FieldId field;

  /**
   * Field to compute numerical stats on. Supported types are integer, float, date, datetime,
   * timestamp, time.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FieldId getField() {
    return field;
  }

  /**
   * Field to compute numerical stats on. Supported types are integer, float, date, datetime,
   * timestamp, time.
   * @param field field or {@code null} for none
   */
  public GooglePrivacyDlpV2NumericalStatsConfig setField(GooglePrivacyDlpV2FieldId field) {
    this.field = field;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2NumericalStatsConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2NumericalStatsConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2NumericalStatsConfig clone() {
    return (GooglePrivacyDlpV2NumericalStatsConfig) super.clone();
  }

}
