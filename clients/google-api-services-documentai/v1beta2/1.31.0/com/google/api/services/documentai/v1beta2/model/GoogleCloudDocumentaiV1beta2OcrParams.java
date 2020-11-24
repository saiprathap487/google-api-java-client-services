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
 * Parameters to control Optical Character Recognition (OCR) behavior.
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
public final class GoogleCloudDocumentaiV1beta2OcrParams extends com.google.api.client.json.GenericJson {

  /**
   * List of languages to use for OCR. In most cases, an empty value yields the best results since
   * it enables automatic language detection. For languages based on the Latin alphabet, setting
   * `language_hints` is not needed. In rare cases, when the language of the text in the image is
   * known, setting a hint will help get better results (although it will be a significant hindrance
   * if the hint is wrong). Document processing returns an error if one or more of the specified
   * languages is not one of the supported languages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> languageHints;

  /**
   * List of languages to use for OCR. In most cases, an empty value yields the best results since
   * it enables automatic language detection. For languages based on the Latin alphabet, setting
   * `language_hints` is not needed. In rare cases, when the language of the text in the image is
   * known, setting a hint will help get better results (although it will be a significant hindrance
   * if the hint is wrong). Document processing returns an error if one or more of the specified
   * languages is not one of the supported languages.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLanguageHints() {
    return languageHints;
  }

  /**
   * List of languages to use for OCR. In most cases, an empty value yields the best results since
   * it enables automatic language detection. For languages based on the Latin alphabet, setting
   * `language_hints` is not needed. In rare cases, when the language of the text in the image is
   * known, setting a hint will help get better results (although it will be a significant hindrance
   * if the hint is wrong). Document processing returns an error if one or more of the specified
   * languages is not one of the supported languages.
   * @param languageHints languageHints or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2OcrParams setLanguageHints(java.util.List<java.lang.String> languageHints) {
    this.languageHints = languageHints;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2OcrParams set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2OcrParams) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2OcrParams clone() {
    return (GoogleCloudDocumentaiV1beta2OcrParams) super.clone();
  }

}
