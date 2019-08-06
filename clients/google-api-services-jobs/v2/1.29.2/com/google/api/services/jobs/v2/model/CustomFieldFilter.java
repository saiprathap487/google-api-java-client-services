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

package com.google.api.services.jobs.v2.model;

/**
 * Input only.
 *
 * Custom field filter of the search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomFieldFilter extends com.google.api.client.json.GenericJson {

  /**
   * Required. The query strings for the filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> queries;

  /**
   * Optional. The type of filter. Defaults to FilterType.OR.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required. The query strings for the filter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getQueries() {
    return queries;
  }

  /**
   * Required. The query strings for the filter.
   * @param queries queries or {@code null} for none
   */
  public CustomFieldFilter setQueries(java.util.List<java.lang.String> queries) {
    this.queries = queries;
    return this;
  }

  /**
   * Optional. The type of filter. Defaults to FilterType.OR.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Optional. The type of filter. Defaults to FilterType.OR.
   * @param type type or {@code null} for none
   */
  public CustomFieldFilter setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public CustomFieldFilter set(String fieldName, Object value) {
    return (CustomFieldFilter) super.set(fieldName, value);
  }

  @Override
  public CustomFieldFilter clone() {
    return (CustomFieldFilter) super.clone();
  }

}
