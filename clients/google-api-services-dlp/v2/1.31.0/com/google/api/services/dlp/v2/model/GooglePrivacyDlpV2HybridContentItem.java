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
 * An individual hybrid item to inspect. Will be stored temporarily during processing.
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
public final class GooglePrivacyDlpV2HybridContentItem extends com.google.api.client.json.GenericJson {

  /**
   * Supplementary information that will be added to each finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2HybridFindingDetails findingDetails;

  /**
   * The item to inspect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ContentItem item;

  /**
   * Supplementary information that will be added to each finding.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridFindingDetails getFindingDetails() {
    return findingDetails;
  }

  /**
   * Supplementary information that will be added to each finding.
   * @param findingDetails findingDetails or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridContentItem setFindingDetails(GooglePrivacyDlpV2HybridFindingDetails findingDetails) {
    this.findingDetails = findingDetails;
    return this;
  }

  /**
   * The item to inspect.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ContentItem getItem() {
    return item;
  }

  /**
   * The item to inspect.
   * @param item item or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridContentItem setItem(GooglePrivacyDlpV2ContentItem item) {
    this.item = item;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2HybridContentItem set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2HybridContentItem) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2HybridContentItem clone() {
    return (GooglePrivacyDlpV2HybridContentItem) super.clone();
  }

}
