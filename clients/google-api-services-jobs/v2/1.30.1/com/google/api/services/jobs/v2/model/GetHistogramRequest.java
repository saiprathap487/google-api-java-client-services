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
 * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single call with both search
 * and histogram.
 *
 * Input only.
 *
 * A request for the `GetHistogram` method.
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
public final class GetHistogramRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Controls whether to broaden the search to avoid too few results for a given query in
   * instances where a search has sparse results. Results from a broadened query is a superset of
   * the results from the original query.
   *
   * Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowBroadening;

  /**
   * Deprecated. Use query instead.
   *
   * Optional.
   *
   * Restrictions on the scope of the histogram.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobFilters filters;

  /**
   * Optional. Query used to search against jobs, such as keyword, location filters, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobQuery query;

  /**
   * Meta information, such as `user_id`, collected from the job searcher or other entity conducting
   * a job search, is used to improve the service's search quality. Users determine identifier
   * values, which must be unique and consist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestMetadata requestMetadata;

  /**
   * Required. A list of facets that specify the histogram data to be calculated against and
   * returned.
   *
   * Histogram response times can be slow, and counts can be approximations. This call may be
   * temporarily or permanently removed prior to the production release of Cloud Talent Solution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> searchTypes;

  /**
   * Optional. Controls whether to broaden the search to avoid too few results for a given query in
   * instances where a search has sparse results. Results from a broadened query is a superset of
   * the results from the original query.
   *
   * Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowBroadening() {
    return allowBroadening;
  }

  /**
   * Optional. Controls whether to broaden the search to avoid too few results for a given query in
   * instances where a search has sparse results. Results from a broadened query is a superset of
   * the results from the original query.
   *
   * Defaults to false.
   * @param allowBroadening allowBroadening or {@code null} for none
   */
  public GetHistogramRequest setAllowBroadening(java.lang.Boolean allowBroadening) {
    this.allowBroadening = allowBroadening;
    return this;
  }

  /**
   * Deprecated. Use query instead.
   *
   * Optional.
   *
   * Restrictions on the scope of the histogram.
   * @return value or {@code null} for none
   */
  public JobFilters getFilters() {
    return filters;
  }

  /**
   * Deprecated. Use query instead.
   *
   * Optional.
   *
   * Restrictions on the scope of the histogram.
   * @param filters filters or {@code null} for none
   */
  public GetHistogramRequest setFilters(JobFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Optional. Query used to search against jobs, such as keyword, location filters, etc.
   * @return value or {@code null} for none
   */
  public JobQuery getQuery() {
    return query;
  }

  /**
   * Optional. Query used to search against jobs, such as keyword, location filters, etc.
   * @param query query or {@code null} for none
   */
  public GetHistogramRequest setQuery(JobQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Meta information, such as `user_id`, collected from the job searcher or other entity conducting
   * a job search, is used to improve the service's search quality. Users determine identifier
   * values, which must be unique and consist.
   * @return value or {@code null} for none
   */
  public RequestMetadata getRequestMetadata() {
    return requestMetadata;
  }

  /**
   * Meta information, such as `user_id`, collected from the job searcher or other entity conducting
   * a job search, is used to improve the service's search quality. Users determine identifier
   * values, which must be unique and consist.
   * @param requestMetadata requestMetadata or {@code null} for none
   */
  public GetHistogramRequest setRequestMetadata(RequestMetadata requestMetadata) {
    this.requestMetadata = requestMetadata;
    return this;
  }

  /**
   * Required. A list of facets that specify the histogram data to be calculated against and
   * returned.
   *
   * Histogram response times can be slow, and counts can be approximations. This call may be
   * temporarily or permanently removed prior to the production release of Cloud Talent Solution.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSearchTypes() {
    return searchTypes;
  }

  /**
   * Required. A list of facets that specify the histogram data to be calculated against and
   * returned.
   *
   * Histogram response times can be slow, and counts can be approximations. This call may be
   * temporarily or permanently removed prior to the production release of Cloud Talent Solution.
   * @param searchTypes searchTypes or {@code null} for none
   */
  public GetHistogramRequest setSearchTypes(java.util.List<java.lang.String> searchTypes) {
    this.searchTypes = searchTypes;
    return this;
  }

  @Override
  public GetHistogramRequest set(String fieldName, Object value) {
    return (GetHistogramRequest) super.set(fieldName, value);
  }

  @Override
  public GetHistogramRequest clone() {
    return (GetHistogramRequest) super.clone();
  }

}
