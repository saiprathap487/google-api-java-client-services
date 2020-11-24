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
 * k-anonymity metric, used for analysis of reidentification risk.
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
public final class GooglePrivacyDlpV2KAnonymityConfig extends com.google.api.client.json.GenericJson {

  /**
   * Message indicating that multiple rows might be associated to a single individual. If the same
   * entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the
   * entire collection of tuples as the composite quasi-identifier. This collection is a multiset:
   * the order in which the different tuples appear in the dataset is ignored, but their frequency
   * is taken into account. Important note: a maximum of 1000 rows can be associated to a single
   * entity ID. If more rows are associated with the same entity ID, some might be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2EntityId entityId;

  /**
   * Set of fields to compute k-anonymity over. When multiple fields are specified, they are
   * considered a single composite key. Structs and repeated data types are not supported; however,
   * nested fields are supported so long as they are not structs themselves or nested within a
   * repeated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2FieldId> quasiIds;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2FieldId used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2FieldId.class);
  }

  /**
   * Message indicating that multiple rows might be associated to a single individual. If the same
   * entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the
   * entire collection of tuples as the composite quasi-identifier. This collection is a multiset:
   * the order in which the different tuples appear in the dataset is ignored, but their frequency
   * is taken into account. Important note: a maximum of 1000 rows can be associated to a single
   * entity ID. If more rows are associated with the same entity ID, some might be ignored.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2EntityId getEntityId() {
    return entityId;
  }

  /**
   * Message indicating that multiple rows might be associated to a single individual. If the same
   * entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the
   * entire collection of tuples as the composite quasi-identifier. This collection is a multiset:
   * the order in which the different tuples appear in the dataset is ignored, but their frequency
   * is taken into account. Important note: a maximum of 1000 rows can be associated to a single
   * entity ID. If more rows are associated with the same entity ID, some might be ignored.
   * @param entityId entityId or {@code null} for none
   */
  public GooglePrivacyDlpV2KAnonymityConfig setEntityId(GooglePrivacyDlpV2EntityId entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Set of fields to compute k-anonymity over. When multiple fields are specified, they are
   * considered a single composite key. Structs and repeated data types are not supported; however,
   * nested fields are supported so long as they are not structs themselves or nested within a
   * repeated field.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2FieldId> getQuasiIds() {
    return quasiIds;
  }

  /**
   * Set of fields to compute k-anonymity over. When multiple fields are specified, they are
   * considered a single composite key. Structs and repeated data types are not supported; however,
   * nested fields are supported so long as they are not structs themselves or nested within a
   * repeated field.
   * @param quasiIds quasiIds or {@code null} for none
   */
  public GooglePrivacyDlpV2KAnonymityConfig setQuasiIds(java.util.List<GooglePrivacyDlpV2FieldId> quasiIds) {
    this.quasiIds = quasiIds;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2KAnonymityConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2KAnonymityConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2KAnonymityConfig clone() {
    return (GooglePrivacyDlpV2KAnonymityConfig) super.clone();
  }

}
