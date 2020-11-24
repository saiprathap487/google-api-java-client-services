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
 * This message is used for text changes aka. OCR corrections.
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
public final class GoogleCloudDocumentaiV1beta1DocumentTextChange extends com.google.api.client.json.GenericJson {

  /**
   * The text that replaces the text identified in the `text_anchor`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String changedText;

  /**
   * The history of this annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta1DocumentProvenance> provenance;

  static {
    // hack to force ProGuard to consider GoogleCloudDocumentaiV1beta1DocumentProvenance used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDocumentaiV1beta1DocumentProvenance.class);
  }

  /**
   * Provenance of the correction. Text anchor indexing into the Document.text. There can only be a
   * single `TextAnchor.text_segments` element. If the start and end index of the text segment are
   * the same, the text change is inserted before that index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta1DocumentTextAnchor textAnchor;

  /**
   * The text that replaces the text identified in the `text_anchor`.
   * @return value or {@code null} for none
   */
  public java.lang.String getChangedText() {
    return changedText;
  }

  /**
   * The text that replaces the text identified in the `text_anchor`.
   * @param changedText changedText or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentTextChange setChangedText(java.lang.String changedText) {
    this.changedText = changedText;
    return this;
  }

  /**
   * The history of this annotation.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta1DocumentProvenance> getProvenance() {
    return provenance;
  }

  /**
   * The history of this annotation.
   * @param provenance provenance or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentTextChange setProvenance(java.util.List<GoogleCloudDocumentaiV1beta1DocumentProvenance> provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * Provenance of the correction. Text anchor indexing into the Document.text. There can only be a
   * single `TextAnchor.text_segments` element. If the start and end index of the text segment are
   * the same, the text change is inserted before that index.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentTextAnchor getTextAnchor() {
    return textAnchor;
  }

  /**
   * Provenance of the correction. Text anchor indexing into the Document.text. There can only be a
   * single `TextAnchor.text_segments` element. If the start and end index of the text segment are
   * the same, the text change is inserted before that index.
   * @param textAnchor textAnchor or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentTextChange setTextAnchor(GoogleCloudDocumentaiV1beta1DocumentTextAnchor textAnchor) {
    this.textAnchor = textAnchor;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta1DocumentTextChange set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta1DocumentTextChange) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta1DocumentTextChange clone() {
    return (GoogleCloudDocumentaiV1beta1DocumentTextChange) super.clone();
  }

}
